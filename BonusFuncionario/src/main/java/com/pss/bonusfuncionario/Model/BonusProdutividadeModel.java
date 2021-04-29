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
public class BonusProdutividadeModel implements IBonusPresenter {
    private static BonusProdutividadeModel instancia = null;
    
    private BonusProdutividadeModel(){
    }
    @Override
    public boolean aceita(Funcionario funcionario) {
        return funcionario.getProdutividade() >= 60;
    }
    
    @Override
    public double calcular(Funcionario funcionario){
        if(this.aceita(funcionario)){
            double valorBonus;
            if(funcionario.getProdutividade() <= 70){
                valorBonus = 100;
            }else if(funcionario.getProdutividade() > 70 && funcionario.getProdutividade() < 85){
                valorBonus = 200;
            }else if(funcionario.getProdutividade() > 85 && funcionario.getProdutividade() < 99){
                valorBonus = 400;
            }else{
                valorBonus = 500;
            }
            return valorBonus;
        }else{
            return 0;
        }
    }
    
    public static BonusProdutividadeModel getInstance(){
        if(instancia == null){
            instancia = new BonusProdutividadeModel();
        }
        return instancia;
    }
}
