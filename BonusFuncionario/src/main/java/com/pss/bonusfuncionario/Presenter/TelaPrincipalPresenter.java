/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.View.TelaPrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JDesktopPane;

/**
 *
 * @author tarci
 */
public class TelaPrincipalPresenter{
    private TelaPrincipalView tela;
    private static TelaPrincipalPresenter instancia;
    
    private TelaPrincipalPresenter(){
        tela = new TelaPrincipalView();
        tela.getTxtFieldNumeroFuncionarios().setText("0");  
        iniciarListeners();
    }
    
    public static TelaPrincipalPresenter getInstancia(){
        if(instancia == null){
            instancia = new TelaPrincipalPresenter();
        }
        return instancia;
    }
    
    private void iniciarListeners(){
        tela.getOpcaoManterFuncionario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new ManterFuncionarioPresenter(null, tela.getDesktop());
            }
        });
        
        tela.getOpcaoBuscarFuncionario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new BuscarFuncionarioPresenter(tela.getDesktop());
            }
        });
        
        tela.getOpcaoCalcularSalario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new CalcularSalarioPresenter(tela.getDesktop());
            }
        });
        
    }
    
    public JDesktopPane getDesktop(){
        return tela.getDesktop();
    }
    
    public void update(List<FuncionarioModel> funcionarioCollection){
        this.tela.getTxtFieldNumeroFuncionarios().setText(String.valueOf(funcionarioCollection.size()));
    }
}
