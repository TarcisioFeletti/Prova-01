/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter.ManterFuncionarioState;

import com.pss.bonusfuncionario.Presenter.ManterFuncionarioPresenter;

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
        presenter.getView().getTxtFieldNome().setEnabled(true);
        presenter.getView().getTxtFieldSalario().setEnabled(true);
        presenter.getView().getTxtFieldAdmissao().setEnabled(true);
        presenter.getView().getTxtFieldFaltas().setEnabled(true);
        presenter.getView().getTxtFieldIdade().setEnabled(true);
        presenter.getView().getComboBoxBonus().setEnabled(true);
        presenter.getView().getComboBoxCargo().setEnabled(true);
        exibir();
    }
    
    @Override
    public void incluir(){
        
        super.fechar(super.getPresenter().getView());
    }
    
    @Override
    public void exibir(){
        
    }
}
