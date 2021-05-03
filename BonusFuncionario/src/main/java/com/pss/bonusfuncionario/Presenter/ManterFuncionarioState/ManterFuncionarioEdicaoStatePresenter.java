/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter.ManterFuncionarioState;

import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.Presenter.Command.ManterFuncionarioEditarCommand;
import com.pss.bonusfuncionario.Presenter.Command.ManterFuncionarioExibirCommand;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioPresenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author tarci
 */
public class ManterFuncionarioEdicaoStatePresenter extends ManterFuncionarioStatePresenter {
    private FuncionarioModel funcionario;

    public ManterFuncionarioEdicaoStatePresenter(ManterFuncionarioPresenter presenter) {
        super(presenter);
        presenter.getView().getBtnSalvar().setEnabled(true);
        presenter.getView().getBtnEditar().setEnabled(false);
        presenter.getView().getBtnExcluir().setEnabled(false);
        presenter.getView().getBtnFechar().setText("Cancelar");
        presenter.getView().getTxtFieldNome().setEditable(true);
        presenter.getView().getTxtFieldSalario().setEditable(true);
        presenter.getView().getTxtFormatedFieldAdmissao().setEditable(true);
        presenter.getView().getTxtFieldFaltas().setEditable(true);
        presenter.getView().getTxtFieldIdade().setEditable(true);
        presenter.getView().getComboBoxBonus().setEnabled(true);
        presenter.getView().getComboBoxCargo().setEnabled(true);
        presenter.getView().getCheckBoxFuncionarioDoMes().setEnabled(true);
        this.funcionario = funcionario;
        this.exibir();
        super.getPresenter().removerListeners();
        this.iniciarListeners();
    }

    @Override
    public void incluir() {
        if (super.getPresenter().verificaCampos()) {
            new ManterFuncionarioEditarCommand().executar(super.getPresenter());
            super.fechar(super.getPresenter().getView());
        } else {
            JOptionPane.showMessageDialog(super.getPresenter().getView(), "Acho que voce esqueceu alguma coisa"
                    + "\n Todos os campos foram preenchidos?");
        }
    }

    public void iniciarListeners() {
        super.getPresenter().getView().getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incluir();
            }
        });
    }

    @Override
    public void exibir() {
        new ManterFuncionarioExibirCommand().executar(super.getPresenter());
    }
}
