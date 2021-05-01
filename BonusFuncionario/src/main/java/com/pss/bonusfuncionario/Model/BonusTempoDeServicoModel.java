/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Model;

import java.time.temporal.ChronoUnit;

/**
 *
 * @author tarci
 */
public class BonusTempoDeServicoModel implements IBonusModel {
    private static BonusTempoDeServicoModel instancia;
    
    private BonusTempoDeServicoModel(){}
    
    public static BonusTempoDeServicoModel getInstance(){
        if(instancia == null){
            instancia = new BonusTempoDeServicoModel();
        }
        return instancia;
    }
    
    @Override
    public void calcular(HistoricoDeBonus bonus) throws RuntimeException{
        long tempoDeServico = bonus.getAdmissao().until(bonus.getDataDoCalculo(), ChronoUnit.YEARS);
        if(tempoDeServico == 0){
            bonus.setPorcentagemBonusTempoDeServico(0);
            bonus.calcularValorBonusTempoDeServico();
        }else if(tempoDeServico >= 1 && tempoDeServico <= 5){
            bonus.setPorcentagemBonusTempoDeServico(0.02);
            bonus.calcularValorBonusFuncionarioDoMes();
        }else if(tempoDeServico >= 6 && tempoDeServico <= 10){
            bonus.setPorcentagemBonusTempoDeServico(0.03);
            bonus.calcularValorBonusFuncionarioDoMes();
        }else if(tempoDeServico >= 11 && tempoDeServico <= 15){
            bonus.setPorcentagemBonusTempoDeServico(0.08);
            bonus.calcularValorBonusFuncionarioDoMes();
        }else if(tempoDeServico >= 16 && tempoDeServico <= 20){
            bonus.setPorcentagemBonusTempoDeServico(0.1);
            bonus.calcularValorBonusFuncionarioDoMes();
        }else if(tempoDeServico >20){
            bonus.setPorcentagemBonusTempoDeServico(0.15);
            bonus.calcularValorBonusFuncionarioDoMes();
        }else{
            throw  new RuntimeException("Tem algo errado aí irmão"
                    + "\nserá que a data do calcula está certa?");
        }
    }
}
