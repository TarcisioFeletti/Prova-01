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
    public void calcular(FuncionarioModel funcionario) {
        if (funcionario.getCargo().equalsIgnoreCase("Gerente")) {
            funcionario.setPorcentagemBonusCargo(0.15);
        }else if(funcionario.getCargo().equalsIgnoreCase("Analista de TI")){
            funcionario.setPorcentagemBonusCargo(0.1);
        }else if(funcionario.getCargo().equalsIgnoreCase("Supervisor")){
            funcionario.setPorcentagemBonusCargo(0.08);
        }else if(funcionario.getCargo().equalsIgnoreCase("Programador")){
            funcionario.setPorcentagemBonusCargo(0.05);
        }else if(funcionario.getCargo().equalsIgnoreCase("Trainee")){
            funcionario.setPorcentagemBonusCargo(0.02);
        }else if(funcionario.getCargo().equalsIgnoreCase("Assistente")){
            funcionario.setPorcentagemBonusCargo(0.01);
        }
    }

    public static BonusCargoModel getInstance() {
        if (instancia == null) {
            instancia = new BonusCargoModel();
        }
        return instancia;
    }
}
