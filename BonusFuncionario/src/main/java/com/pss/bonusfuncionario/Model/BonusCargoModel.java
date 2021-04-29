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
public class BonusCargoModel implements IBonusPresenter{
    private static BonusCargoModel instancia = null;
    
    private BonusCargoModel(){
    }
    
    @Override
    public boolean aceita(Funcionario funcionario){
        return funcionario.getCargo().equalsIgnoreCase("programador") == false;
    }
    
    @Override
    public double calcular(Funcionario funcionario){
        if(this.aceita(funcionario)){
            double valorBonus;
            if(funcionario.getCargo().equalsIgnoreCase("Gerente")){
                valorBonus = 500;
            }else{
                valorBonus = 250;
            }
            return valorBonus;
        }else{
            return 0;
        }
    }
    
    public static BonusCargoModel getInstance(){
        if(instancia == null){
            instancia = new BonusCargoModel();
        }
        return instancia;
    }
}
