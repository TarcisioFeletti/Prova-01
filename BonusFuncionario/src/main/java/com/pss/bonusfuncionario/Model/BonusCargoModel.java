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
public class BonusCargoModel implements IBonusModel {

    private static BonusCargoModel instancia = null;

    private BonusCargoModel() {
    }

    @Override
    public void calcular(HistoricoDeBonus bonus) {
        if (bonus.getCargo().equalsIgnoreCase("Gerente")) {
            bonus.setPorcentagemBonusCargo(0.15);
            bonus.calcularValorBonusCargo();
        }else if(bonus.getCargo().equalsIgnoreCase("Analista de TI")){
            bonus.setPorcentagemBonusCargo(0.1);
            bonus.calcularValorBonusCargo();
        }else if(bonus.getCargo().equalsIgnoreCase("Supervisor")){
            bonus.setPorcentagemBonusCargo(0.08);
            bonus.calcularValorBonusCargo();
        }else if(bonus.getCargo().equalsIgnoreCase("Programador")){
            bonus.setPorcentagemBonusCargo(0.05);
            bonus.calcularValorBonusCargo();
        }else if(bonus.getCargo().equalsIgnoreCase("Trainee")){
            bonus.setPorcentagemBonusCargo(0.02);
            bonus.calcularValorBonusCargo();
        }else if(bonus.getCargo().equalsIgnoreCase("Assistente")){
            bonus.setPorcentagemBonusCargo(0.01);
            bonus.calcularValorBonusCargo();
        }
    }

    public static BonusCargoModel getInstance() {
        if (instancia == null) {
            instancia = new BonusCargoModel();
        }
        return instancia;
    }
}
