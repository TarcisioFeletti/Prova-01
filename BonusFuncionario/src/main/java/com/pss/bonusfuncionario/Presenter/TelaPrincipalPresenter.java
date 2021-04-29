/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.View.BuscarFuncionarioView;
import com.pss.bonusfuncionario.View.ManterFuncionarioView;
import com.pss.bonusfuncionario.View.TelaPrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;

/**
 *
 * @author tarci
 */
public class TelaPrincipalPresenter {
    private TelaPrincipalView tela;
    
    public TelaPrincipalPresenter(){
        tela = new TelaPrincipalView();
    }
    
    public void iniciarGUI(){
        tela.getOpcaoManterFuncionario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //new ManterFuncionarioPresenter().iniciarTela(tela.getDesktop());
            }
        });
        
        tela.getOpcaoBuscarFuncionario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new BuscarFuncionarioPresenter().iniciarTela(tela.getDesktop());
            }
        });
        
        tela.getOpcaoCalcularSalario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new CalcularSalarioPresenter().iniciarTela(tela.getDesktop());
            }
        });
    }
    
    public JDesktopPane getDesktop(){
        return tela.getDesktop();
    }
}
