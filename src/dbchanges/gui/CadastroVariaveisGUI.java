/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbchanges.gui;

import dbchanges.bl.GerarResultadoBO;
import dbchanges.bl.MultipleLinearRegressionBO;
import dbchanges.dal.CadastroVariaveisDAO;
import javax.swing.JOptionPane;
import dbchanges.dtl.VariaveisDTO;
import java.util.List;

/**
 *
 * @author Facensa
 */
public class CadastroVariaveisGUI extends javax.swing.JFrame {

    /**
     * Creates new form CadastroVariaveisGUI
     */
    public CadastroVariaveisGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfLinhas = new javax.swing.JTextField();
        jtfColunas = new javax.swing.JTextField();
        jtfFks = new javax.swing.JTextField();
        jtfConstraints = new javax.swing.JTextField();
        jtfIndices = new javax.swing.JTextField();
        jtfTriggers = new javax.swing.JTextField();
        jtfFunctions = new javax.swing.JTextField();
        jtfViews = new javax.swing.JTextField();
        jtfTabelas = new javax.swing.JTextField();
        jtfCodigoProjeto = new javax.swing.JTextField();
        btnVoltarVariaveis = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimparVariaveis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Variáveis");

        jLabel2.setText("Informe os valores para cada variável");

        jLabel3.setText("Quantidade de linhas");

        jLabel4.setText("Quantidade de colunas");

        jLabel5.setText("Quantidade de fks");

        jLabel6.setText("Quantidade de constraints");

        jLabel7.setText("Quantidade de indices");

        jLabel8.setText("Quantidade de triggers");

        jLabel9.setText("Quantidade de functions");

        jLabel10.setText("Quantidade de views");

        jLabel11.setText("Quantidade de tabelas");

        jLabel12.setText("Código do projeto");

        jtfLinhas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLinhas.setText("0");

        jtfColunas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfColunas.setText("0");
        jtfColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfColunasActionPerformed(evt);
            }
        });

        jtfFks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfFks.setText("0");

        jtfConstraints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfConstraints.setText("0");

        jtfIndices.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfIndices.setText("0");

        jtfTriggers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfTriggers.setText("0");

        jtfFunctions.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfFunctions.setText("0");

        jtfViews.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfViews.setText("0");

        jtfTabelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfTabelas.setText("0");

        jtfCodigoProjeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCodigoProjeto.setText("0");

        btnVoltarVariaveis.setText("Voltar");
        btnVoltarVariaveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarVariaveisActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimparVariaveis.setText("Limpar");
        btnLimparVariaveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparVariaveisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfLinhas)
                            .addComponent(jtfColunas)
                            .addComponent(jtfFks)
                            .addComponent(jtfConstraints)
                            .addComponent(jtfIndices)
                            .addComponent(jtfTriggers)
                            .addComponent(jtfFunctions)
                            .addComponent(jtfViews)
                            .addComponent(jtfTabelas)
                            .addComponent(jtfCodigoProjeto))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfFks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfConstraints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIndices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTriggers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfViews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnVoltarVariaveis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparVariaveis)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfColunasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfColunasActionPerformed

    private void btnLimparVariaveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparVariaveisActionPerformed
        jtfLinhas.setText("");
        jtfColunas.setText("");
        jtfFks.setText("");
        jtfConstraints.setText("");
        jtfIndices.setText("");
        jtfTriggers.setText("");
        jtfFunctions.setText("");
        jtfViews.setText("");
        jtfTabelas.setText("");
        jtfCodigoProjeto.setText("");
    }//GEN-LAST:event_btnLimparVariaveisActionPerformed

    private void btnVoltarVariaveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarVariaveisActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarVariaveisActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        VariaveisDTO variaveis = new VariaveisDTO();
        variaveis.setLinhas(Integer.parseInt(jtfLinhas.getText()));
        variaveis.setColunas(Integer.parseInt(jtfColunas.getText()));
        variaveis.setFks(Integer.parseInt(jtfFks.getText()));
        variaveis.setConstraints(Integer.parseInt(jtfConstraints.getText()));
        variaveis.setIndices(Integer.parseInt(jtfIndices.getText()));
        variaveis.setTriggers(Integer.parseInt(jtfTriggers.getText()));
        variaveis.setFunctions(Integer.parseInt(jtfFunctions.getText()));
        variaveis.setViews(Integer.parseInt(jtfViews.getText()));
        variaveis.setTabelas(Integer.parseInt(jtfTabelas.getText()));
        variaveis.setIdProjeto(Integer.parseInt(jtfCodigoProjeto.getText()));
        
        MultipleLinearRegressionBO coeficientes = new MultipleLinearRegressionBO();
        GerarResultadoBO tempo = new GerarResultadoBO();
        tempo.calcularTempo((List<Double>) coeficientes, variaveis);

        System.out.println(tempo);        
        
        if ((jtfLinhas.getText().isEmpty() || jtfColunas.getText().isEmpty() || jtfFks.getText().isEmpty() || jtfConstraints.getText().isEmpty() || jtfIndices.getText().isEmpty()
                || jtfTriggers.getText().isEmpty() || jtfFunctions.getText().isEmpty() || jtfViews.getText().isEmpty() || jtfViews.getText().isEmpty() || jtfTabelas.getText().isEmpty()
                || jtfCodigoProjeto.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {
            CadastroVariaveisDAO dao = new CadastroVariaveisDAO();
            dao.adiciona(variaveis);
            JOptionPane.showMessageDialog(null, "Variáveis cadastradas com sucesso! ");

            jtfLinhas.setText("");
            jtfColunas.setText("");
            jtfFks.setText("");
            jtfConstraints.setText("");
            jtfIndices.setText("");
            jtfTriggers.setText("");
            jtfFunctions.setText("");
            jtfViews.setText("");
            jtfTabelas.setText("");
            jtfCodigoProjeto.setText("");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVariaveisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVariaveisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVariaveisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVariaveisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVariaveisGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimparVariaveis;
    private javax.swing.JButton btnVoltarVariaveis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtfCodigoProjeto;
    private javax.swing.JTextField jtfColunas;
    private javax.swing.JTextField jtfConstraints;
    private javax.swing.JTextField jtfFks;
    private javax.swing.JTextField jtfFunctions;
    private javax.swing.JTextField jtfIndices;
    private javax.swing.JTextField jtfLinhas;
    private javax.swing.JTextField jtfTabelas;
    private javax.swing.JTextField jtfTriggers;
    private javax.swing.JTextField jtfViews;
    // End of variables declaration//GEN-END:variables
}
