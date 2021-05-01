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
    public void calcular(HistoricoDeBonus bonus) throws RuntimeException{
        if (bonus.getNumFaltas()== 0) {
            bonus.setPorcentagemBonusAssiduidade(0.1);
            bonus.calcularValorBonusAssiduidade();
        } else if (bonus.getNumFaltas()>= 1 && bonus.getNumFaltas()<= 3) {
            bonus.setPorcentagemBonusAssiduidade(0.05);
            bonus.calcularValorBonusAssiduidade();
        } else if (bonus.getNumFaltas()>= 4) {
            bonus.setPorcentagemBonusAssiduidade(0.01);
            bonus.calcularValorBonusAssiduidade();
        } else {
            throw new RuntimeException("Nunca vi uma pessoa ter menos de 0 faltas");
        }
    }

    public static BonusAssiduidadeModel getInstance() {
        if (instancia == null) {
            instancia = new BonusAssiduidadeModel();
        }
        return instancia;
    }
}
