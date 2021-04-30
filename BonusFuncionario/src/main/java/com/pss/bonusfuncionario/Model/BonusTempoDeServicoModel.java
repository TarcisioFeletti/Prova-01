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
    public void calcular(FuncionarioModel funcionario) throws MenorQueZeroException{
        if(funcionario.getTempoDeServico() == 0){
            funcionario.setPorcentagemBonusTempoDeServico(0);
        }else if(funcionario.getTempoDeServico() >= 1 && funcionario.getTempoDeServico() <= 5){
            funcionario.setPorcentagemBonusTempoDeServico(0.02);
        }else if(funcionario.getTempoDeServico() >= 6 && funcionario.getTempoDeServico() <= 10){
            funcionario.setPorcentagemBonusTempoDeServico(0.03);
        }else if(funcionario.getTempoDeServico() >= 11 && funcionario.getTempoDeServico() <= 15){
            funcionario.setPorcentagemBonusTempoDeServico(0.08);
        }else if(funcionario.getTempoDeServico() >= 16 && funcionario.getTempoDeServico() <= 20){
            funcionario.setPorcentagemBonusTempoDeServico(0.1);
        }else if(funcionario.getTempoDeServico() >20){
            funcionario.setPorcentagemBonusTempoDeServico(0.15);
        }else{
            throw  new MenorQueZeroException();
        }
    }
}
