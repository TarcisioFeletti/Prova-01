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
public class BonusAssiduidadeModel implements IBonusModel {

    private static BonusAssiduidadeModel instancia = null;

    private BonusAssiduidadeModel() {
    }

    @Override
    public void calcular(FuncionarioModel funcionario) throws MenorQueZeroException{
        if (funcionario.getTempoDeServico() == 0) {
            funcionario.setPorcentagemBonusAssiduidade(0.1);
        } else if (funcionario.getTempoDeServico() >= 1 && funcionario.getTempoDeServico() <= 3) {
            funcionario.setPorcentagemBonusAssiduidade(0.05);
        } else if (funcionario.getTempoDeServico() >= 4) {
            funcionario.setPorcentagemBonusAssiduidade(0.01);
        } else {
            throw new MenorQueZeroException();
        }
    }

    public static BonusAssiduidadeModel getInstance() {
        if (instancia == null) {
            instancia = new BonusAssiduidadeModel();
        }
        return instancia;
    }
}
