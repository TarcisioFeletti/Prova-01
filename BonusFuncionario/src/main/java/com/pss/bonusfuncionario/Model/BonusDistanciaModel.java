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
public class BonusDistanciaModel implements IBonusModel {

    private static BonusDistanciaModel instancia = null;

    private BonusDistanciaModel() {
    }

    @Override
    public void calcular(FuncionarioModel funcionario) throws MenorQueZeroException {
        if (funcionario.getDistanciaDoTrabalho() <= 20) {
            funcionario.setPorcentagemBonusDistancia(0.01);
        } else if (funcionario.getDistanciaDoTrabalho() > 20 && funcionario.getDistanciaDoTrabalho() <= 50) {
            funcionario.setPorcentagemBonusDistancia(0.02);
        } else if (funcionario.getDistanciaDoTrabalho() > 50 && funcionario.getDistanciaDoTrabalho() <= 100) {
            funcionario.setPorcentagemBonusDistancia(0.05);
        } else if (funcionario.getDistanciaDoTrabalho() > 100 && funcionario.getDistanciaDoTrabalho() <= 150) {
            funcionario.setPorcentagemBonusDistancia(0.08);
        } else if (funcionario.getDistanciaDoTrabalho() > 150 && funcionario.getDistanciaDoTrabalho() <= 200) {
            funcionario.setPorcentagemBonusDistancia(0.1);
        } else if (funcionario.getDistanciaDoTrabalho() > 200) {
            funcionario.setPorcentagemBonusDistancia(0.15);
        } else{
            throw new MenorQueZeroException();
        }
    }

    public static BonusDistanciaModel getInstance() {
        if (instancia == null) {
            instancia = new BonusDistanciaModel();
        }
        return instancia;
    }
}
