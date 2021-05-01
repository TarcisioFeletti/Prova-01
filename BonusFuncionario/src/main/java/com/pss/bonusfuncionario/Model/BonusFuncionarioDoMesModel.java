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
public class BonusFuncionarioDoMesModel implements IBonusModel {

    private static BonusFuncionarioDoMesModel instancia = null;

    private BonusFuncionarioDoMesModel() {
    }

    @Override
    public void calcular(HistoricoDeBonus bonus) throws MenorQueZeroException {
        if (bonus.isFuncionarioDoMes()){
            bonus.setPorcentagemBonusFuncionarioDoMes(0.1);
            bonus.calcularValorBonusFuncionarioDoMes();
        }else{
            bonus.setPorcentagemBonusFuncionarioDoMes(0);
            bonus.calcularValorBonusFuncionarioDoMes();
        }
    }

    public static BonusFuncionarioDoMesModel getInstance() {
        if (instancia == null) {
            instancia = new BonusFuncionarioDoMesModel();
        }
        return instancia;
    }
}
