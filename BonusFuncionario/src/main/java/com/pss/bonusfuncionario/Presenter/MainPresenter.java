/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.View.BuscarFuncionario;
import com.pss.bonusfuncionario.View.BuscarFuncionarioView;
import com.pss.bonusfuncionario.View.CalcularSalarioView;
import com.pss.bonusfuncionario.View.ManterFuncionarioView;
import com.pss.bonusfuncionario.View.TelaPrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author tarci
 */
public class MainPresenter {
    public static void main(String[] args){
        TelaPrincipalView tela = new TelaPrincipalView();
        tela.getOpcaoManterFuncionario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tela.getDesktop().add(new ManterFuncionarioView());
            }
        });
        
        tela.getOpcaoBuscarFuncionario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tela.getDesktop().add(new BuscarFuncionario());
            }
        });
        
        tela.getOpcaoCalcularSalario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tela.getDesktop().add(new CalcularSalarioView());
            }
        });
    }
}
