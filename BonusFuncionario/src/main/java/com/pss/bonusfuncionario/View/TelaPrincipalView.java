/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.View;

import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author tarci
 */
public class TelaPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipalView() {
        initComponents();
        setVisible(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblNumeroFuncionarios = new javax.swing.JLabel();
        txtFieldNumeroFuncionarios = new javax.swing.JTextField();
        lblVersão = new javax.swing.JLabel();
        txtFieldVersao = new javax.swing.JTextField();
        menuTelaPrincipal = new javax.swing.JMenuBar();
        opcaoFuncionarioMenu = new javax.swing.JMenu();
        opcaoManterFuncionario = new javax.swing.JMenuItem();
        opcaoBuscarFuncionario = new javax.swing.JMenuItem();
        opcaoSalarioMenu = new javax.swing.JMenu();
        opcaoCalcularSalario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumeroFuncionarios.setText("Funcionários");

        txtFieldNumeroFuncionarios.setEditable(false);

        lblVersão.setText("Versao");

        txtFieldVersao.setEditable(false);
        txtFieldVersao.setText("1.8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroFuncionarios)
                    .addComponent(lblVersão))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldNumeroFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(txtFieldVersao))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroFuncionarios)
                    .addComponent(txtFieldNumeroFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVersão)
                    .addComponent(txtFieldVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(0, 515, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(0, 342, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        opcaoFuncionarioMenu.setText("Funcionário");

        opcaoManterFuncionario.setText("Adicionar Funcionario");
        opcaoFuncionarioMenu.add(opcaoManterFuncionario);

        opcaoBuscarFuncionario.setText("Buscar Funcionário");
        opcaoFuncionarioMenu.add(opcaoBuscarFuncionario);

        menuTelaPrincipal.add(opcaoFuncionarioMenu);

        opcaoSalarioMenu.setText("Salário");

        opcaoCalcularSalario.setText("Calcular Salário");
        opcaoSalarioMenu.add(opcaoCalcularSalario);

        menuTelaPrincipal.add(opcaoSalarioMenu);

        setJMenuBar(menuTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return 
     */

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public JMenuItem getOpcaoBuscarFuncionario() {
        return opcaoBuscarFuncionario;
    }

    public JMenuItem getOpcaoCalcularSalario() {
        return opcaoCalcularSalario;
    }

    public JMenuItem getOpcaoManterFuncionario() {
        return opcaoManterFuncionario;
    }

    public JTextField getTxtFieldNumeroFuncionarios() {
        return txtFieldNumeroFuncionarios;
    }

    public JTextField getTxtFieldVersao() {
        return txtFieldVersao;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumeroFuncionarios;
    private javax.swing.JLabel lblVersão;
    private javax.swing.JMenuBar menuTelaPrincipal;
    private javax.swing.JMenuItem opcaoBuscarFuncionario;
    private javax.swing.JMenuItem opcaoCalcularSalario;
    private javax.swing.JMenu opcaoFuncionarioMenu;
    private javax.swing.JMenuItem opcaoManterFuncionario;
    private javax.swing.JMenu opcaoSalarioMenu;
    private javax.swing.JTextField txtFieldNumeroFuncionarios;
    private javax.swing.JTextField txtFieldVersao;
    // End of variables declaration//GEN-END:variables
}
