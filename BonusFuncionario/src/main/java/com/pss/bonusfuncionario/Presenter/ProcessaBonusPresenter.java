/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Model.BonusAssiduidadeModel;
import com.pss.bonusfuncionario.Model.BonusCargoModel;
import com.pss.bonusfuncionario.Model.BonusDistanciaModel;
import com.pss.bonusfuncionario.Model.BonusTempoDeServicoModel;
import com.pss.bonusfuncionario.Model.FuncionarioModel;
import java.util.ArrayList;
import com.pss.bonusfuncionario.Model.IBonusModel;
import com.pss.bonusfuncionario.Model.MenorQueZeroException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tarci
 */
public class ProcessaBonusPresenter {
    private ArrayList<IBonusModel> listaBonus = new ArrayList<>();
    
    public ProcessaBonusPresenter(){
        listaBonus.add(BonusTempoDeServicoModel.getInstance());
        listaBonus.add(BonusAssiduidadeModel.getInstance());
        listaBonus.add(BonusCargoModel.getInstance());
        listaBonus.add(BonusDistanciaModel.getInstance());
    }
    
    public void processar(FuncionarioModel funcionario) throws MenorQueZeroException{
        for(IBonusModel bonus : listaBonus){
            try {
                bonus.calcular(funcionario);
            } catch (MenorQueZeroException ex) {
                throw ex;
            }
        }
    }
}
