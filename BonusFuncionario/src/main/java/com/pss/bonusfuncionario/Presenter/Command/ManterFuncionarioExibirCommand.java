/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter.Command;

import com.pss.bonusfuncionario.Collection.FuncionarioCollection;
import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioPresenter;

/**
 *
 * @author tarci
 */
public class ManterFuncionarioExibirCommand extends ManterFuncionarioCommand{
    @Override
    public void executar(ManterFuncionarioPresenter presenter){
        FuncionarioModel funcionario = FuncionarioCollection.getInstancia().
                lerFuncionario(presenter.getFuncionario().getId());
        presenter.getView().getComboBoxCargo().setSelectedIndex(indexOfCargo(funcionario.getCargo()));
        presenter.getView().getComboBoxBonus().setSelectedIndex(funcionario.getBonusGeneroso());
        presenter.getView().getTxtFieldNome().setText(funcionario.getNome());
        presenter.getView().getTxtFieldIdade().setText(String.valueOf(funcionario.getIdade()));
        presenter.getView().getTxtFieldSalario().setText(String.valueOf(funcionario.getSalarioBase()));
        presenter.getView().getTxtFieldFaltas().setText(String.valueOf(funcionario.getNumFaltas()));
        presenter.getView().getTxtFormatedFieldAdmissao().setText(String.valueOf(funcionario.getAdmissao()));
        
    }
    
    private int indexOfCargo(String cargo){
        if(cargo.equalsIgnoreCase("Gerente")){
            return 0;
        }else if(cargo.equalsIgnoreCase("Analista de TI")){
            return 1;
        }else if(cargo.equalsIgnoreCase("Supervisor")){
            return 2;
        }else if(cargo.equalsIgnoreCase("Programador")){
            return 3;
        }else if(cargo.equalsIgnoreCase("Trainee")){
            return 4;
        }else if(cargo.equalsIgnoreCase("Assistente")){
            return 5;
        }else{
            return -1;
        }
    }
}
