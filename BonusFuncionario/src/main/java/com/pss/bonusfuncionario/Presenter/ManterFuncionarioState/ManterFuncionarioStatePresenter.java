/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter.ManterFuncionarioState;

import com.pss.bonusfuncionario.Presenter.ManterFuncionarioPresenter;
import com.pss.bonusfuncionario.View.ManterFuncionarioView;

/**
 *
 * @author tarci
 */
public abstract class ManterFuncionarioStatePresenter{

    private ManterFuncionarioPresenter presenter;

    public ManterFuncionarioStatePresenter(ManterFuncionarioPresenter presenter) {
        this.presenter = presenter;
    }

    public void incluir(){
        throw new RuntimeException("Não é possivel incluir um registro a partir deste estado");
    }

    public void exibir(){
        throw new RuntimeException("Não é possivel exibir um registro a partir deste estado");
    }

    public void editar(){
        throw new RuntimeException("Não é possivel editar um registro a partir deste estado");
    }

    public void excluir(){
        throw new RuntimeException("Não é possivel excluir um registro a partir deste estado");
    }

    public void fechar(ManterFuncionarioView tela) {
        tela.doDefaultCloseAction();
    }

    public ManterFuncionarioPresenter getPresenter() {
        return presenter;
    }
    
}
