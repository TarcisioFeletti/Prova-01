/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario;

import java.util.ArrayList;

/**
 *
 * @author tarci
 */
public class ProcessaBonus {
    private ArrayList<Bonus> listaBonus = new ArrayList<>();
    
    ProcessaBonus(){
        listaBonus.add(BonusDistancia.getInstance());
        listaBonus.add(BonusFalta.getInstance());
        listaBonus.add(BonusProdutividade.getInstance());
        listaBonus.add(BonusCargo.getInstance());
    }
    
    public void processar(Funcionario funcionario){
        for(Bonus bonus : listaBonus){
            funcionario.setSalarioFinal(funcionario.getSalarioFinal() + bonus.calcular(funcionario));
        }
    }
}
