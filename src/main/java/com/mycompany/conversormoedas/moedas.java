/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversormoedas;

import javax.swing.JOptionPane;

/**
 *
 * @author kauan
 */
public class moedas extends javax.swing.JFrame {

    /**
     * Creates new form moedas
     */
    public moedas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        txtfrom = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(29, 31, 47));

        jPanel1.setBackground(new java.awt.Color(29, 31, 47));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite o valor:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Moeda de Origem:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Moeda de Destino:");

        txtamount.setBackground(new java.awt.Color(44, 62, 80));
        txtamount.setForeground(new java.awt.Color(255, 255, 255));

        txtfrom.setBackground(new java.awt.Color(44, 62, 80));
        txtfrom.setForeground(new java.awt.Color(255, 255, 255));
        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "BRL", "EUR", "GBP", "JPY", "CHF", "CAD", "AUD", "NZD", "MXN", "INR", "CNY", " " }));

        txtto.setBackground(new java.awt.Color(44, 62, 80));
        txtto.setForeground(new java.awt.Color(255, 255, 255));
        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRL", "EUR", "USD", "GBP", "JPY", "CHF", "CAD", "AUD", "NZD", "MXN", "INR", "CNY", " " }));

        jButton1.setBackground(new java.awt.Color(76, 175, 80));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Converter");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONVERSOR DE MOEDAS");

        txtResult.setBackground(new java.awt.Color(44, 62, 80));
        txtResult.setForeground(new java.awt.Color(255, 255, 255));
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtamount)
                            .addComponent(txtfrom, 0, 141, Short.MAX_VALUE)
                            .addComponent(txtto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
        // Obtém o valor inserido no campo de texto 'txtamount'
        double amount = Double.parseDouble(txtamount.getText());

        // Verifica se o valor inserido é maior que zero
        if (amount <= 0) {
            JOptionPane.showMessageDialog(this, "O valor deve ser maior que zero.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtém as moedas de origem (txtfrom) e destino (txtto)
        String fromCurrency = txtfrom.getSelectedItem().toString();  // Moeda de origem (ex: USD)
        String toCurrency = txtto.getSelectedItem().toString();      // Moeda de destino (ex: BRL, EUR)

        // Verifica se as moedas de origem e destino foram selecionadas corretamente
        if (fromCurrency.equals("") || toCurrency.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione as moedas de origem e destino.", "Erro de Seleção", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Declaração da variável para a taxa de conversão
        double conversionRate = 1.0;

        // Conversão de acordo com as moedas selecionadas
        if (fromCurrency.equals("USD")) {
            switch (toCurrency) {
                case "BRL": conversionRate = 5.50; break;  // 1 USD = 5.50 BRL
                case "EUR": conversionRate = 0.92; break;  // 1 USD = 0.92 EUR
                case "GBP": conversionRate = 0.82; break;  // 1 USD = 0.82 GBP
                case "JPY": conversionRate = 110.15; break;  // 1 USD = 110.15 JPY
                case "CHF": conversionRate = 0.92; break;  // 1 USD = 0.92 CHF
                case "CAD": conversionRate = 1.35; break;  // 1 USD = 1.35 CAD
                case "AUD": conversionRate = 1.45; break;  // 1 USD = 1.45 AUD
                case "NZD": conversionRate = 1.55; break;  // 1 USD = 1.55 NZD
                case "MXN": conversionRate = 20.00; break;  // 1 USD = 20.00 MXN
                case "INR": conversionRate = 74.00; break;  // 1 USD = 74.00 INR
                case "CNY": conversionRate = 6.45; break;  // 1 USD = 6.45 CNY
            }
        } else if (fromCurrency.equals("EUR")) {
            switch (toCurrency) {
                case "BRL": conversionRate = 6.00; break;  // 1 EUR = 6.00 BRL
                case "USD": conversionRate = 1.09; break;  // 1 EUR = 1.09 USD
                case "GBP": conversionRate = 0.89; break;  // 1 EUR = 0.89 GBP
                case "JPY": conversionRate = 120.00; break;  // 1 EUR = 120.00 JPY
                case "CHF": conversionRate = 0.97; break;  // 1 EUR = 0.97 CHF
                case "CAD": conversionRate = 1.45; break;  // 1 EUR = 1.45 CAD
                case "AUD": conversionRate = 1.56; break;  // 1 EUR = 1.56 AUD
                case "NZD": conversionRate = 1.65; break;  // 1 EUR = 1.65 NZD
                case "MXN": conversionRate = 21.50; break;  // 1 EUR = 21.50 MXN
                case "INR": conversionRate = 85.00; break;  // 1 EUR = 85.00 INR
                case "CNY": conversionRate = 7.45; break;  // 1 EUR = 7.45 CNY
            }
        } else if (fromCurrency.equals("BRL")) {
            switch (toCurrency) {
                case "USD": conversionRate = 0.18; break;  // 1 BRL = 0.18 USD
                case "EUR": conversionRate = 0.15; break;  // 1 BRL = 0.15 EUR
                case "GBP": conversionRate = 0.14; break;  // 1 BRL = 0.14 GBP
                case "JPY": conversionRate = 20.00; break;  // 1 BRL = 20.00 JPY
                case "CHF": conversionRate = 0.16; break;  // 1 BRL = 0.16 CHF
                case "CAD": conversionRate = 0.18; break;  // 1 BRL = 0.18 CAD
                case "AUD": conversionRate = 0.20; break;  // 1 BRL = 0.20 AUD
                case "NZD": conversionRate = 0.21; break;  // 1 BRL = 0.21 NZD
                case "MXN": conversionRate = 3.50; break;  // 1 BRL = 3.50 MXN
                case "INR": conversionRate = 13.00; break;  // 1 BRL = 13.00 INR
                case "CNY": conversionRate = 1.15; break;  // 1 BRL = 1.15 CNY
            }
        }

        // Calcula o valor convertido
        double convertedAmount = amount * conversionRate;

        // Exibe o valor convertido no campo txtResult
        txtResult.setText(String.format("%.2f %s", convertedAmount, toCurrency));

    } catch (NumberFormatException e) {
        // Caso o valor inserido não seja numérico
        JOptionPane.showMessageDialog(this, "Por favor, insira um valor válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(moedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtamount;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JComboBox<String> txtto;
    // End of variables declaration//GEN-END:variables
}