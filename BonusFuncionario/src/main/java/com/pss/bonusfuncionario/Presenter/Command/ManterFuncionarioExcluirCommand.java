/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter.Command;

import com.pss.bonusfuncionario.Collection.FuncionarioCollection;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioPresenter;

/**
 *
 * @author tarci
 */
public class ManterFuncionarioExcluirCommand extends ManterFuncionarioCommand{
    @Override
    public void executar(ManterFuncionarioPresenter presenter){
        FuncionarioCollection.getInstancia().excluir(presenter.getFuncionario().getId());
    }
}
