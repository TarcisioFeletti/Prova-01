/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.View.HistoricoBonusView;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JDesktopPane;

/**
 *
 * @author tarci
 */
public class HistoricoBonusPresenter {
    private HistoricoBonusView tela;
    
    public HistoricoBonusPresenter(){
        tela = new HistoricoBonusView(new Frame(), true);
    }
    
    public void iniciarDialog(JDesktopPane desktop) {
        centralizar(desktop);
        tela.setVisible(true);
    }

    private void centralizar(JDesktopPane desktop) {
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width) / 2, (d.height - this.tela.getSize().height) / 2);
    }
}
