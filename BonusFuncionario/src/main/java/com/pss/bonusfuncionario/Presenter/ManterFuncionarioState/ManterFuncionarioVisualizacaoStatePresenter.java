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
public class ManterFuncionarioVisualizacaoStatePresenter extends ManterFuncionarioStatePresenter {
    public ManterFuncionarioVisualizacaoStatePresenter(ManterFuncionarioPresenter presenter){
        super(presenter);
        presenter.getView().getBtnSalvar().setEnabled(false);
        presenter.getView().getBtnEditar().setEnabled(true);
        presenter.getView().getBtnExcluir().setEnabled(true);
        presenter.getView().getBtnFechar().setText("Fechar");
        presenter.getView().getTxtFieldNome().setEnabled(false);
        presenter.getView().getTxtFieldSalario().setEnabled(false);
        presenter.getView().getTxtFieldAdmissao().setEnabled(false);
        presenter.getView().getTxtFieldFaltas().setEnabled(false);
        presenter.getView().getTxtFieldIdade().setEnabled(false);
        presenter.getView().getComboBoxBonus().setEnabled(false);
        presenter.getView().getComboBoxCargo().setEnabled(false);
        this.exibir();
    }
    
    @Override
    public void exibir() {
        
    }

    @Override
    public void editar() {
        
        super.getPresenter().setEstado(new ManterFuncionarioEdicaoStatePresenter(super.getPresenter()));
    }

    @Override
    public void excluir() {
        
        super.fechar(super.getPresenter().getView());
    }
}
