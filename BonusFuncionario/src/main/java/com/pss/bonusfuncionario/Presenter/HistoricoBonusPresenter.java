/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.Model.HistoricoDeBonusModel;
import com.pss.bonusfuncionario.View.HistoricoBonusView;
import java.awt.Dimension;
import java.awt.Frame;
import java.time.format.DateTimeFormatter;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tarci
 */
public class HistoricoBonusPresenter{

    private HistoricoBonusView tela;
    private FuncionarioModel funcionario;

    public HistoricoBonusPresenter(FuncionarioModel funcionario,JDesktopPane desktop) {
        tela = new HistoricoBonusView(new Frame(), true);
        this.funcionario = funcionario;
        iniciarDialog(desktop);
    }

    private void iniciarDialog(JDesktopPane desktop) {
        centralizar(desktop);
        tela.getTxtFieldNome().setText(funcionario.getNome());        
        tela.getTxtFieldCargo().setText(funcionario.getCargo());
        JTable table = tela.getTableBonus();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (HistoricoDeBonusModel bonus : funcionario.getHistoricoBonusCollection()) {
            model.addRow(new Object[]{"Assiduidade", bonus.getPorcentagemBonusAssiduidade(), 
                         bonus.getPorcentagemBonusAssiduidade()*bonus.getSalarioBase(), bonus.getDataDoCalculo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString()});
            model.addRow(new Object[]{"Cargo", bonus.getPorcentagemBonusCargo(), 
                         bonus.getPorcentagemBonusCargo()*bonus.getSalarioBase(), bonus.getDataDoCalculo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString()});
            model.addRow(new Object[]{"Funcionario Do Mes", bonus.getPorcentagemBonusFuncionarioDoMes(), 
                         bonus.getPorcentagemBonusFuncionarioDoMes()*bonus.getSalarioBase(), bonus.getDataDoCalculo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString()});
            model.addRow(new Object[]{"Tempo de Serviço", bonus.getPorcentagemBonusTempoDeServico(), 
                         bonus.getPorcentagemBonusTempoDeServico()*bonus.getSalarioBase(), bonus.getDataDoCalculo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString()});
        }
        tela.setVisible(true);
    }

    private void centralizar(JDesktopPane desktop) {
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width) / 2, (d.height - this.tela.getSize().height) / 2);
    }
}
