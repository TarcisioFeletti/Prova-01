/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Collection.FuncionarioCollection;
import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.View.CalcularSalarioView;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tarci
 */
public class CalcularSalarioPresenter{

    private CalcularSalarioView tela;

    public CalcularSalarioPresenter(JDesktopPane desktop) {
        tela = new CalcularSalarioView();
        desktop.add(tela);
        tela.setVisible(true);
        centralizar(desktop);
        tela.moveToFront();
        iniciarListeners();
    }

    private void iniciarListeners() {
        tela.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tela.doDefaultCloseAction();
            }
        });
        tela.getBtnCalcular().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = tela.getTableCalcularSalarios();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                try {
                    List<FuncionarioModel> funcionarioCollection = new ArrayList<>();
                    for (int i = 0; i < model.getRowCount(); i++) {
                        Vector dadosLinha = model.getDataVector().elementAt(i);
                        FuncionarioModel funcionario = FuncionarioCollection.getInstancia().
                                lerFuncionario(Integer.parseInt(dadosLinha.get(0).toString()));
                        funcionarioCollection.add(funcionario);
                    }
                    if (verificaString(tela.getTxtFormatadoDataDoCalculo().getText())) {
                        LocalDate dataCalculo = LocalDate.of(Integer.parseInt(tela.getTxtFormatadoDataDoCalculo().getText().substring(6, 10)),
                                Integer.parseInt(tela.getTxtFormatadoDataDoCalculo().getText().substring(3, 5)),
                                Integer.parseInt(tela.getTxtFormatadoDataDoCalculo().getText().substring(0, 2)));
                        try {
                            for (FuncionarioModel funcionario : funcionarioCollection) {
                                new ProcessaBonusPresenter().processar(funcionario, dataCalculo);
                            }
                            JOptionPane.showMessageDialog(tela, "Computado capitão!");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(tela, ex.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(tela, "A gente precisa de uma data para calcular o bônus");
                    }
                } catch (IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(tela, "Eu nunca vi calcular bonus sem um funcionário"
                            + "\nPor que não procura um?");
                }

            }
        });
        tela.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (verificaString(tela.getTxtFormatadoData().getText())) {
                    LocalDate dataPesquisa = LocalDate.of(Integer.parseInt(tela.getTxtFormatadoData().getText().substring(6, 10)),
                            Integer.parseInt(tela.getTxtFormatadoData().getText().substring(3, 5)),
                            Integer.parseInt(tela.getTxtFormatadoData().getText().substring(0, 2)));
                    List<FuncionarioModel> funcionarioCollection = FuncionarioCollection.
                            getInstancia().lerFuncionario(dataPesquisa);
                    if (funcionarioCollection.isEmpty()) {
                        JOptionPane.showMessageDialog(tela, "Opa, acho que esse funcionário não está entre nós");
                    } else {
                        JTable table = tela.getTableCalcularSalarios();
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.setNumRows(0);
                        for (FuncionarioModel funcionario : funcionarioCollection) {
                            if (funcionario.getHistoricoBonusCollection().isEmpty()) {
                                model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                                    funcionario.getSalarioBase(), "0", funcionario.getSalarioBase()});
                            } else {
                                model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                                    funcionario.getSalarioBase(), funcionario.getHistoricoBonusCollection().
                                    get(funcionario.getHistoricoBonusCollection().size() - 1).somarValorBonus(),
                                    funcionario.getSalarioFinal()});
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(tela, "Aquele campo para digitar a data"
                            + "\n não está ali à toa");
                }
            }
        });
        tela.getBtnListarTodos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<FuncionarioModel> funcionarioCollection = FuncionarioCollection.
                        getInstancia().getFuncionarioCollection();
                if (funcionarioCollection.isEmpty()) {
                    JOptionPane.showMessageDialog(tela, "Uai voce não adicionou nada na lista");
                } else {
                    JTable table = tela.getTableCalcularSalarios();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setNumRows(0);
                    for (FuncionarioModel funcionario : funcionarioCollection) {
                        if (funcionario.getHistoricoBonusCollection().isEmpty()) {
                            model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                                funcionario.getSalarioBase(), "0", funcionario.getSalarioBase()});
                        } else {
                            model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                                funcionario.getSalarioBase(), funcionario.getHistoricoBonusCollection().
                                get(funcionario.getHistoricoBonusCollection().size() - 1).somarValorBonus(),
                                funcionario.getSalarioFinal()});
                        }
                    }
                }
            }
        });
    }

    private void centralizar(JDesktopPane desktop) {
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width) / 2, (d.height - this.tela.getSize().height) / 2);
    }

    private boolean verificaString(String verifica) {
        if (verifica.substring(6, 10).isBlank() && verifica.substring(3, 5).isBlank() && verifica.substring(0, 2).isBlank()) {
            return false;
        } else {
            return true;
        }
    }
}
