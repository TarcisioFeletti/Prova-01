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
    public void calcular(HistoricoDeBonusModel bonus) throws RuntimeException{
        int boostGeneroso = bonus.getBonusGeneroso()+1;
        long tempoDeServico = bonus.getAdmissao().until(bonus.getDataDoCalculo(), ChronoUnit.YEARS);
        if(tempoDeServico == 0){
            bonus.setPorcentagemBonusTempoDeServico(0*boostGeneroso);
            bonus.calcularValorBonusTempoDeServico();
        }else if(tempoDeServico >= 1 && tempoDeServico <= 5){
            bonus.setPorcentagemBonusTempoDeServico(0.02*boostGeneroso);
            bonus.calcularValorBonusTempoDeServico();
        }else if(tempoDeServico >= 6 && tempoDeServico <= 10){
            bonus.setPorcentagemBonusTempoDeServico(0.03*boostGeneroso);
            bonus.calcularValorBonusTempoDeServico();
        }else if(tempoDeServico >= 11 && tempoDeServico <= 15){
            bonus.setPorcentagemBonusTempoDeServico(0.08*boostGeneroso);
            bonus.calcularValorBonusTempoDeServico();
        }else if(tempoDeServico >= 16 && tempoDeServico <= 20){
            bonus.setPorcentagemBonusTempoDeServico(0.1*boostGeneroso);
            bonus.calcularValorBonusTempoDeServico();
        }else if(tempoDeServico >20){
            bonus.setPorcentagemBonusTempoDeServico(0.15*boostGeneroso);
            bonus.calcularValorBonusTempoDeServico();
        }else{
            throw  new RuntimeException("Tem algo errado aí irmão"
                    + "\nserá que a data do calculo está certa?");
        }
    }
}
