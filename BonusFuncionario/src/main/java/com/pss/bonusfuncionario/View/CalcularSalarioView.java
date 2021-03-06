/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.View;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;

/**
 *
 * @author tarci
 */
public class CalcularSalarioView extends javax.swing.JInternalFrame {

    /**
     * Creates new form CalcularSalarioView
     */
    public CalcularSalarioView() {
        initComponents();
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JButton getBtnListarTodos() {
        return btnListarTodos;
    }

    public JTable getTableCalcularSalarios() {
        return tableCalcularSalarios;
    }

    public JFormattedTextField getTxtFormatadoData() {
        return txtFormatadoData;
    }

    public JFormattedTextField getTxtFormatadoDataDoCalculo() {
        return txtFormatadoDataDoCalculo;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFormatadoData = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        btnListarTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCalcularSalarios = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        txtFormatadoDataDoCalculo = new javax.swing.JFormattedTextField();
        lblDataDoCalculo = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(700, 400));

        try {
            txtFormatadoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatadoData.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnBuscar.setText("Buscar");

        btnListarTodos.setText("Listar Todos");

        tableCalcularSalarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Funcon??rio", "Data", "Sal??rio Base(R$)", "B??nus(R$)", "Sal??rio(R$)"
            }
        ));
        jScrollPane1.setViewportView(tableCalcularSalarios);

        btnCalcular.setText("Calcular");

        try {
            txtFormatadoDataDoCalculo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatadoDataDoCalculo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblDataDoCalculo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblDataDoCalculo.setText("Data do c??lculo");

        btnFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFormatadoData, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarTodos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataDoCalculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormatadoDataDoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormatadoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnListarTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(txtFormatadoDataDoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataDoCalculo)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataDoCalculo;
    private javax.swing.JTable tableCalcularSalarios;
    private javax.swing.JFormattedTextField txtFormatadoData;
    private javax.swing.JFormattedTextField txtFormatadoDataDoCalculo;
    // End of variables declaration//GEN-END:variables
}
