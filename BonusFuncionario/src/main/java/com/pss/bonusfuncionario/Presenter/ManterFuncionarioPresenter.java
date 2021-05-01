/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioState.ManterFuncionarioInclusaoStatePresenter;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioState.ManterFuncionarioStatePresenter;
import com.pss.bonusfuncionario.Presenter.ManterFuncionarioState.ManterFuncionarioVisualizacaoStatePresenter;
import com.pss.bonusfuncionario.View.ManterFuncionarioView;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author tarci
 */
public class ManterFuncionarioPresenter {

    private ManterFuncionarioView tela;
    private ManterFuncionarioStatePresenter estado;
    private FuncionarioModel funcionario;

    public ManterFuncionarioPresenter(FuncionarioModel funcionario, JDesktopPane desktop) {
        tela = new ManterFuncionarioView();
        desktop.add(tela);
        centralizar(desktop);
        iniciarListeners();
        tela.moveToFront();
        if (funcionario == null) {
            estado = new ManterFuncionarioInclusaoStatePresenter(this);
        } else {
            estado = new ManterFuncionarioVisualizacaoStatePresenter(this);
            this.funcionario = funcionario;
        }
        tela.setVisible(true);
    }

    private void iniciarListeners() {
        tela.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estado.fechar(tela);
            }
        });
    }

    public void removerListeners() {
        tela.getBtnSalvar().removeAll();
        tela.getBtnExcluir().removeAll();
        tela.getBtnEditar().removeAll();
    }

    public void centralizar(JDesktopPane desktop) {
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width) / 2, (d.height - this.tela.getSize().height) / 2);
    }

    public ManterFuncionarioView getView() {
        return tela;
    }

    public void setEstado(ManterFuncionarioStatePresenter estado) {
        this.estado = estado;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }
    
    

}
