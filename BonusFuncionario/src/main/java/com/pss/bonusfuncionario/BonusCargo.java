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
public class BonusCargo implements Bonus{
    private static BonusCargo instancia = null;
    
    private BonusCargo(){
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
    
    public static BonusCargo getInstance(){
        if(instancia == null){
            instancia = new BonusCargo();
        }
        return instancia;
    }
}
