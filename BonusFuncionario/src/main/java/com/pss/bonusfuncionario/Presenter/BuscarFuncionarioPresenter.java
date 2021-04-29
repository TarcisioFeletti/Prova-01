/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.View.BuscarFuncionarioView;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;

/**
 *
 * @author tarci
 */
public class BuscarFuncionarioPresenter {
    private BuscarFuncionarioView tela;
    
    public BuscarFuncionarioPresenter(){
        tela = new BuscarFuncionarioView();
    }
    
    public void iniciarTela(JDesktopPane desktop){
        desktop.add(tela);
        tela.setVisible(true);
        centralizar(desktop);
        tela.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tela.doDefaultCloseAction();
            }
        });
    }
    
    private void centralizar(JDesktopPane desktop){
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width)/2, (d.height - this.tela.getSize().height)/2);
    }
}