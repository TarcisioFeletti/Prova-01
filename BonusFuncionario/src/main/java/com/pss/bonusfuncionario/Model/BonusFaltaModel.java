/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Model;

/**
 *
 * @author tarci
 */
public class BonusFaltaModel implements IBonusPresenter {
    private static BonusFaltaModel instancia = null;
    
    private BonusFaltaModel(){
    }
    
    @Override
    public double calcular(Funcionario funcionario) {
        if (this.aceita(funcionario)) {
            double valorBonus;
            if (funcionario.getNumFaltas() >= 0 && funcionario.getNumFaltas() <= 2) {
                valorBonus = 500;
            } else if (funcionario.getNumFaltas() > 2 && funcionario.getNumFaltas() <= 4) {
                valorBonus = 250;
            } else {
                valorBonus = 100;
            }
            return valorBonus;
        } else {
            return 0;
        }
    }

    @Override
    public boolean aceita(Funcionario funcionario) {
        if (funcionario.getNumFaltas() <= 5) {
            return true;
        } else {
            return false;
        }
    }
    
    public static BonusFaltaModel getInstance(){
        if(instancia == null){
            instancia = new BonusFaltaModel();
        }
        return instancia;
    }
}
