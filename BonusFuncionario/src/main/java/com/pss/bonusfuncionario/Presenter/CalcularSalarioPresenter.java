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
import java.time.Month;
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
public class CalcularSalarioPresenter {

    private CalcularSalarioView tela;

    public CalcularSalarioPresenter() {
        tela = new CalcularSalarioView();
    }

    public void iniciarTela(JDesktopPane desktop) {
        desktop.add(tela);
        tela.setVisible(true);
        centralizar(desktop);
        tela.moveToFront();
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
                    Vector dadosLinha = model.getDataVector().elementAt(table.getSelectedRow());
                    FuncionarioModel funcionario = FuncionarioCollection.getInstancia().
                            lerFuncionario(Integer.parseInt(dadosLinha.get(0).toString()));
                    if (!tela.getTxtFormatadoDataDoCalculo().getText().isEmpty()) {
                        LocalDate date = LocalDate.of(Integer.parseInt(tela.getTxtFormatadoDataDoCalculo().getText().substring(6, 10)),
                                Integer.parseInt(tela.getTxtFormatadoDataDoCalculo().getText().substring(3, 5)),
                                Integer.parseInt(tela.getTxtFormatadoDataDoCalculo().getText().substring(0, 2)));
                        try {
                            new ProcessaBonusPresenter().processar(funcionario, date);
                        } catch (RuntimeException rt) {
                            JOptionPane.showMessageDialog(tela, rt.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(tela, "A gente precisa de uma data para calcular o bônus");
                    }
                } catch (IndexOutOfBoundsException ex) {
                    if (table.getRowCount() <= 0) {
                        JOptionPane.showMessageDialog(tela, "Eu nunca vi calcular bonus sem um funcionário"
                                + "\nPor que não procura um?");
                    } else {
                        JOptionPane.showMessageDialog(tela, "Acho que falta alguma coisa! \n Tenta selecionar uma linha");
                    }
                }

            }
        });
        tela.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tela.getTxtFormatadoData().getText().isEmpty()) {
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
                            if (funcionario.getBonusCollection().isEmpty()) {
                                model.addRow(new Object[]{funcionario.getId(),funcionario.getNome(), funcionario.getAdmissao(), 
                                funcionario.getSalarioBase(), "0", funcionario.getSalarioBase()});
                            } else {
                                model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getAdmissao(), 
                                funcionario.getSalarioBase(), funcionario.getBonusCollection().
                                        get(funcionario.getBonusCollection().size()-1).somarValorBonus(), 
                                funcionario.getSalarioFinal()});
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(tela, "É sério? Digita um nome meu consagrado!");
                }
            }
        });
    }

    private void centralizar(JDesktopPane desktop) {
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width) / 2, (d.height - this.tela.getSize().height) / 2);
    }
}
