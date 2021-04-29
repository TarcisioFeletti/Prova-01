/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.View;

/**
 *
 * @author tarci
 */
public class ManterFuncionarioView extends javax.swing.JFrame {

    /**
     * Creates new form ManterFuncionario
     */
    public ManterFuncionarioView() {
        initComponents();
        this.setLocationRelativeTo(this.getParent());
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCargo = new javax.swing.JLabel();
        comboBoxCargo = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtFieldNome = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtFieldIdade = new javax.swing.JTextField();
        lblBonus = new javax.swing.JLabel();
        comboBoxBonus = new javax.swing.JComboBox<>();
        lblSalario = new javax.swing.JLabel();
        txtFieldSalario = new javax.swing.JTextField();
        lblFaltas = new javax.swing.JLabel();
        txtFieldFaltas = new javax.swing.JTextField();
        checkBoxFuncionarioDoMes = new javax.swing.JCheckBox();
        lblAdmissao = new javax.swing.JLabel();
        txtFieldAdmissao = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblCargo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCargo.setText("Cargo");

        comboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        lblIdade.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblIdade.setText("Idade");

        lblBonus.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblBonus.setText("Bônus");

        comboBoxBonus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSalario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblSalario.setText("Salário");

        lblFaltas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFaltas.setText("Faltas");

        checkBoxFuncionarioDoMes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        checkBoxFuncionarioDoMes.setText("Funcionário do mes");
        checkBoxFuncionarioDoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFuncionarioDoMesActionPerformed(evt);
            }
        });

        lblAdmissao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblAdmissao.setText("Admissão");

        btnFechar.setText("Fechar");

        btnSalvar.setText("Salvar");

        jButton1.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCargo)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFaltas)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFieldFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(checkBoxFuncionarioDoMes)
                                    .addGap(0, 7, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnFechar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBonus)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFieldNome)
                                    .addComponent(comboBoxBonus, 0, 200, Short.MAX_VALUE))
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnSalvar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAdmissao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFieldAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblIdade)
                                            .addComponent(lblSalario))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFieldIdade)
                                            .addComponent(txtFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(comboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBonus)
                            .addComponent(comboBoxBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxFuncionarioDoMes)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFaltas)
                                .addComponent(txtFieldFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdade)
                            .addComponent(txtFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalario)
                            .addComponent(txtFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdmissao)
                            .addComponent(txtFieldAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxFuncionarioDoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFuncionarioDoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxFuncionarioDoMesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkBoxFuncionarioDoMes;
    private javax.swing.JComboBox<String> comboBoxBonus;
    private javax.swing.JComboBox<String> comboBoxCargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdmissao;
    private javax.swing.JLabel lblBonus;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblFaltas;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtFieldAdmissao;
    private javax.swing.JTextField txtFieldFaltas;
    private javax.swing.JTextField txtFieldIdade;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldSalario;
    // End of variables declaration//GEN-END:variables
}
