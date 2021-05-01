/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Presenter;

import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.Model.HistoricoDeBonus;
import com.pss.bonusfuncionario.View.HistoricoBonusView;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tarci
 */
public class HistoricoBonusPresenter {

    private HistoricoBonusView tela;
    private FuncionarioModel funcionario;

    public HistoricoBonusPresenter(FuncionarioModel funcionario) {
        tela = new HistoricoBonusView(new Frame(), true);
        this.funcionario = funcionario;
    }

    public void iniciarDialog(JDesktopPane desktop) {
        centralizar(desktop);
        tela.setVisible(true);
        tela.getTxtFieldNome().setText(funcionario.getNome());        
        tela.getTxtFieldCargo().setText(funcionario.getCargo());
        JTable table = tela.getTableBonus();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (HistoricoDeBonus bonus : funcionario.getBonusCollection()) {
            model.addRow(new Object[]{"Assiduidade", bonus.getPorcentagemBonusAssiduidade(), 
                         bonus.getPorcentagemBonusAssiduidade()*bonus.getSalarioBase(), bonus.getDataDoCalculo()});
            model.addRow(new Object[]{"Cargo", bonus.getPorcentagemBonusCargo(), 
                         bonus.getPorcentagemBonusCargo()*bonus.getSalarioBase(), bonus.getDataDoCalculo()});
            model.addRow(new Object[]{"Funcionario Do Mes", bonus.getPorcentagemBonusFuncionarioDoMes(), 
                         bonus.getPorcentagemBonusFuncionarioDoMes()*bonus.getSalarioBase(), bonus.getDataDoCalculo()});
            model.addRow(new Object[]{"Tempo de Serviço", bonus.getPorcentagemBonusTempoDeServico(), 
                         bonus.getPorcentagemBonusTempoDeServico()*bonus.getSalarioBase(), bonus.getDataDoCalculo()});
        }
        tela.getBtnFechar().addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               tela.dispose();
           }
        });
    }

    private void centralizar(JDesktopPane desktop) {
        Dimension d = desktop.getSize();
        this.tela.setLocation((d.width - this.tela.getSize().width) / 2, (d.height - this.tela.getSize().height) / 2);
    }
}
