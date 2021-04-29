/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Model.BonusFaltaModel;
import com.pss.bonusfuncionario.Model.BonusProdutividadeModel;
import com.pss.bonusfuncionario.Model.BonusCargoModel;
import com.pss.bonusfuncionario.Model.IBonusPresenter;
import com.pss.bonusfuncionario.Model.BonusDistanciaModel;
import com.pss.bonusfuncionario.Model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author tarci
 */
public class ProcessaBonusPresenter {
    private ArrayList<IBonusPresenter> listaBonus = new ArrayList<>();
    
    public ProcessaBonusPresenter(){
        listaBonus.add(BonusDistanciaModel.getInstance());
        listaBonus.add(BonusFaltaModel.getInstance());
        listaBonus.add(BonusProdutividadeModel.getInstance());
        listaBonus.add(BonusCargoModel.getInstance());
    }
    
    public void processar(Funcionario funcionario){
        for(IBonusPresenter bonus : listaBonus){
            funcionario.setSalarioFinal(funcionario.getSalarioFinal() + bonus.calcular(funcionario));
        }
    }
}
