/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Model.BonusAssiduidadeModel;
import com.pss.bonusfuncionario.Model.BonusCargoModel;
import com.pss.bonusfuncionario.Model.BonusFuncionarioDoMesModel;
import com.pss.bonusfuncionario.Model.BonusTempoDeServicoModel;
import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.Model.HistoricoDeBonus;
import java.util.ArrayList;
import com.pss.bonusfuncionario.Model.IBonusModel;
import java.time.LocalDate;

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
        listaBonus.add(BonusFuncionarioDoMesModel.getInstance());
    }
    
    public void processar(FuncionarioModel funcionario, LocalDate dataDoCalculo) throws RuntimeException{
        HistoricoDeBonus historicoBonus = new HistoricoDeBonus(funcionario.getSalarioBase(), 
                funcionario.getBonusGeneroso(), funcionario.isFuncionarioDoMes(), 
                funcionario.getNumFaltas(), funcionario.getCargo(), dataDoCalculo, 
                funcionario.getAdmissao());
        for(IBonusModel bonus : listaBonus){
            try {
                bonus.calcular(historicoBonus);
            } catch (RuntimeException ex) {
                throw ex;
            }
        }
        funcionario.setSalarioFinal(historicoBonus.somarValorBonus() + historicoBonus.getSalarioBase());
        funcionario.adicionarBonus(historicoBonus);
    }
}
