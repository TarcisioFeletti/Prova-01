/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Collection.FuncionarioCollection;
import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.View.BuscarFuncionarioView;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import javax.swing.JDesktopPane;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tarci
 */
public class BuscarFuncionarioPresenter{

    private BuscarFuncionarioView tela;

    public BuscarFuncionarioPresenter(JDesktopPane desktop) {
        tela = new BuscarFuncionarioView();
        desktop.add(tela);
        tela.setVisible(true);
        centralizar(desktop);
        tela.moveToFront();
        iniciarListeners(desktop);
    }

    private void iniciarListeners(JDesktopPane desktop) {
        tela.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tela.doDefaultCloseAction();
            }
        });
        tela.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                if (!tela.getTxtFieldBuscar().getText().isEmpty()) {
                    List<FuncionarioModel> funcionarioCollection = FuncionarioCollection.
                            getInstancia().lerFuncionario(tela.getTxtFieldBuscar().getText());
                    if (funcionarioCollection.isEmpty()) {
                        JOptionPane.showMessageDialog(tela, "Opa, acho que esse funcionário não está entre nós");
                    } else {
                        JTable table = tela.getTableFuncionarios();
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.setNumRows(0);
                        for (FuncionarioModel funcionario : funcionarioCollection) {
                            if (funcionario.getHistoricoBonusCollection().isEmpty()) {
                                model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                                    funcionario.getSalarioBase(),
                                    "0",
                                    funcionario.getSalarioBase()});
                            } else {
                                model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                                    funcionario.getSalarioBase(),
                                    funcionario.getHistoricoBonusCollection().get(funcionario.getHistoricoBonusCollection().size() - 1).somarValorBonus(),
                                    funcionario.getSalarioFinal()});
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(tela, "É sério? Digita um nome meu consagrado!");
                }
                }catch(IndexOutOfBoundsException ie){
                    JOptionPane.showMessageDialog(tela, ie.getMessage());
                }
            }
        });
        tela.getBtnNovo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ManterFuncionarioPresenter(null, desktop);
            }
        });
        tela.getBtnVerBonus().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = tela.getTableFuncionarios();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                try {
                    Vector dadosLinha = model.getDataVector().elementAt(table.getSelectedRow());
                    FuncionarioModel funcionario = FuncionarioCollection.getInstancia().
                            lerFuncionario(Integer.parseInt(dadosLinha.get(0).toString()));
                    new HistoricoBonusPresenter(funcionario, desktop);
                } catch (IndexOutOfBoundsException ex) {
                    if (table.getRowCount() <= 0) {
                        JOptionPane.showMessageDialog(tela, "Eu só acho que voce precisa de algum "
                                + "\nfuncionário para ver o histórico dele não?");
                    } else {
                        JOptionPane.showMessageDialog(tela, "Acho que falta alguma coisa! \n Tenta selecionar uma linha");
                    }
                }
            }
        });
        tela.getBtnVizualizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = tela.getTableFuncionarios();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                try {
                    Vector dadosLinha = model.getDataVector().elementAt(table.getSelectedRow());
                    FuncionarioModel funcionario = FuncionarioCollection.getInstancia().
                            lerFuncionario(Integer.parseInt(dadosLinha.get(0).toString()));
                    new ManterFuncionarioPresenter(funcionario, desktop);
                } catch (IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(tela, "E o funcionário, eu preciso de um!");
                }

            }
        });
    }

    private void centralizar(JDesktopPane desktop) {
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width) / 2, (d.height - this.tela.getSize().height) / 2);
    }

}
