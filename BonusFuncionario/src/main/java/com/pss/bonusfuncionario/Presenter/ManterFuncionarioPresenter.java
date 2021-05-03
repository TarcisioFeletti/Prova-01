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

/**
 *
 * @author tarci
 */
public class ManterFuncionarioPresenter{

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
            this.funcionario = funcionario;
            estado = new ManterFuncionarioVisualizacaoStatePresenter(this);
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
        if (tela.getBtnSalvar().getActionListeners() != null) {
            for (ActionListener actionListener : tela.getBtnSalvar().getActionListeners()) {
                tela.getBtnSalvar().removeActionListener(actionListener);
            }
        }
        if (tela.getBtnEditar().getActionListeners() != null) {
            for (ActionListener actionListener : tela.getBtnSalvar().getActionListeners()) {
                tela.getBtnSalvar().removeActionListener(actionListener);
            }
        }
        if (tela.getBtnExcluir().getActionListeners() != null) {
            for (ActionListener actionListener : tela.getBtnSalvar().getActionListeners()) {
                tela.getBtnSalvar().removeActionListener(actionListener);
            }
        }
    }

    private void centralizar(JDesktopPane desktop) {
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

    public boolean verificaCampos() {
        if (tela.getTxtFieldNome().getText().isEmpty()) {
            return false;
        }
        if (tela.getTxtFieldIdade().getText().isEmpty()) {
            return false;
        }
        if (verificaData(tela.getTxtFormatedFieldAdmissao().getText())) {
            return false;
        }
        if (tela.getTxtFieldSalario().getText().isEmpty()) {
            return false;
        }
        if (tela.getTxtFieldFaltas().getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean verificaData(String verifica) {
        if (verifica.substring(6, 10).isBlank() && verifica.substring(3, 5).isBlank() && verifica.substring(0, 2).isBlank()) {
            return true;
        } else {
            return false;
        }
    }
}
