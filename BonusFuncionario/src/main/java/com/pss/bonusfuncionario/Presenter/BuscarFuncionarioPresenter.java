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
public class BuscarFuncionarioPresenter {

    private BuscarFuncionarioView tela;

    public BuscarFuncionarioPresenter() {
        tela = new BuscarFuncionarioView();
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
        tela.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<FuncionarioModel> funcionarioCollection = FuncionarioCollection.
                        getInstancia().lerFuncionario(tela.getTxtFieldBuscar().getText());
                JTable table = tela.getTableFuncionarios();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                for (FuncionarioModel funcionario : funcionarioCollection) {
                    model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getIdade(),
                        funcionario.getCargo(), funcionario.getSalarioBase()});
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
                new HistoricoBonusPresenter().iniciarDialog(desktop);
            }
        });
        tela.getBtnVizualizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JTable table = tela.getTableFuncionarios();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    Vector dadosLinha = model.getDataVector().elementAt(table.getSelectedRow());
                    FuncionarioModel funcionario = FuncionarioCollection.getInstancia().
                            lerFuncionario(Integer.parseInt(dadosLinha.get(0).toString()));
                    new ManterFuncionarioPresenter(funcionario, desktop);
                } catch (IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                }

            }
        });
    }

    private void centralizar(JDesktopPane desktop) {
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width) / 2, (d.height - this.tela.getSize().height) / 2);
    }

}
