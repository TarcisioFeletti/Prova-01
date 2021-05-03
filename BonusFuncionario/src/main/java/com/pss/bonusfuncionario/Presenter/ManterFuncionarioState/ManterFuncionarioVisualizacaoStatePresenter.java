/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter.ManterFuncionarioState;

import com.pss.bonusfuncionario.Presenter.Command.ManterFuncionarioExcluirCommand;
import com.pss.bonusfuncionario.Presenter.Command.ManterFuncionarioExibirCommand;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioPresenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author tarci
 */
public class ManterFuncionarioVisualizacaoStatePresenter extends ManterFuncionarioStatePresenter {

    public ManterFuncionarioVisualizacaoStatePresenter(ManterFuncionarioPresenter presenter) {
        super(presenter);
        presenter.getView().getBtnSalvar().setEnabled(false);
        presenter.getView().getBtnEditar().setEnabled(true);
        presenter.getView().getBtnExcluir().setEnabled(true);
        presenter.getView().getBtnFechar().setText("Fechar");
        presenter.getView().getTxtFieldNome().setEditable(false);
        presenter.getView().getTxtFieldSalario().setEditable(false);
        presenter.getView().getTxtFormatedFieldAdmissao().setEditable(false);
        presenter.getView().getTxtFieldFaltas().setEditable(false);
        presenter.getView().getTxtFieldIdade().setEditable(false);
        presenter.getView().getComboBoxBonus().setEnabled(false);
        presenter.getView().getComboBoxCargo().setEnabled(false);
        presenter.getView().getCheckBoxFuncionarioDoMes().setEnabled(false);
        this.exibir();
        super.getPresenter().removerListeners();
        iniciarListeners();
    }

    @Override
    public void exibir() {
        new ManterFuncionarioExibirCommand().executar(super.getPresenter());
    }

    @Override
    public void editar() {
        JOptionPane.showMessageDialog(super.getPresenter().getView(), "Modo edição ativar!!!");
        super.getPresenter().setEstado(new ManterFuncionarioEdicaoStatePresenter(super.getPresenter()));
    }

    public void iniciarListeners() {
        super.getPresenter().getView().getBtnEditar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editar();
            }
        });

        super.getPresenter().getView().getBtnExcluir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluir();
            }
        });
    }

    @Override
    public void excluir() {
        if (JOptionPane.showConfirmDialog(super.getPresenter().getView(), "Vai me excluir mesmo?") == 0) {
            new ManterFuncionarioExcluirCommand().executar(super.getPresenter());
            super.fechar(super.getPresenter().getView());
        }
    }
}
