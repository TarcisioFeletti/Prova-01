/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter.ManterFuncionarioState;

import com.pss.bonusfuncionario.Presenter.Command.ManterFuncionarioEditarCommand;
import com.pss.bonusfuncionario.Presenter.Command.ManterFuncionarioExibirCommand;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioPresenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tarci
 */
public class ManterFuncionarioEdicaoStatePresenter extends ManterFuncionarioStatePresenter{
    public ManterFuncionarioEdicaoStatePresenter(ManterFuncionarioPresenter presenter){
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
        this.exibir();
        this.iniciarListeners();
    }
    
    @Override
    public void incluir(){
        new ManterFuncionarioEditarCommand().executar(super.getPresenter());
        super.fechar(super.getPresenter().getView());
    }
    
    public void iniciarListeners(){
        super.getPresenter().getView().getBtnSalvar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                incluir();
            }
        });
    }
    
    @Override
    public void exibir(){
        new ManterFuncionarioExibirCommand().executar(super.getPresenter());
    }
}
