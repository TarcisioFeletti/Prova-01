/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter.Command;

import com.pss.bonusfuncionario.Collection.FuncionarioCollection;
import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioPresenter;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author tarci
 */
public class ManterFuncionarioIncluirCommand extends ManterFuncionarioCommand{
    @Override
    public void executar(ManterFuncionarioPresenter presenter){
        LocalDate date = LocalDate.of(Integer.parseInt(presenter.getView().getTxtFormatedFieldAdmissao().getText().substring(6,10)),
                Integer.parseInt(presenter.getView().getTxtFormatedFieldAdmissao().getText().substring(3, 5)), 
                Integer.parseInt(presenter.getView().getTxtFormatedFieldAdmissao().getText().substring(0, 2)));
        System.out.println(date);
        FuncionarioCollection.getInstancia().adicinarFuncionario(
        new FuncionarioModel(presenter.getView().getTxtFieldNome().getText(), 
        Integer.parseInt(presenter.getView().getTxtFieldIdade().getText()),
        date, 
        Double.parseDouble(presenter.getView().getTxtFieldSalario().getText()),
        presenter.getView().getCheckBoxFuncionarioDoMes().isSelected(), 
        Integer.parseInt(presenter.getView().getTxtFieldFaltas().getText()),
        presenter.getView().getComboBoxCargo().getSelectedItem().toString(),
        presenter.getView().getComboBoxBonus().getSelectedIndex()));
        JOptionPane.showMessageDialog(presenter.getView(), "Dado inserido com sucesso");
    }
}
