/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario;

/**
 *
 * @author tarci
 */
public class BonusDistancia implements Bonus {
    private static BonusDistancia instancia = null;
    
    private BonusDistancia(){
    }
    
    @Override
    public double calcular(Funcionario funcionario){
        if (this.aceita(funcionario)) {
            double valorBonus;
            if(funcionario.getDistanciaDoTrabalho()<=100){
                valorBonus = 100;
            }else if(funcionario.getDistanciaDoTrabalho()>100 && funcionario.getDistanciaDoTrabalho()<=200){
                valorBonus = 250;
            }else{
                valorBonus = 500;
            }
            return valorBonus;
        } else {
            return 0;
        }
    }
    @Override
    public boolean aceita(Funcionario funcionario){
        if (funcionario.getDistanciaDoTrabalho()>20) {
            return true;
        } else {
            return false;
        }
    }
    
    public static BonusDistancia getInstance(){
        if(instancia == null){
            instancia = new BonusDistancia();
        }
        return instancia;
    }
}
