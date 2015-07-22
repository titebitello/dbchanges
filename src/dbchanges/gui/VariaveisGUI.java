package dbchanges.gui;

import dbchanges.bl.GerarResultadoBO;
import dbchanges.bl.MultipleLinearRegressionBO;
import dbchanges.dal.ConsultaDicionarioDAO;
import dbchanges.dal.ProjetosDAO;
import dbchanges.dal.VariaveisDAO;
import dbchanges.dtl.ConsultaDicionarioDTO;
import dbchanges.dtl.ProjetosDTO;
import javax.swing.JOptionPane;
import dbchanges.dtl.VariaveisDTO;
import dbchanges.factory.ConnectionParameters;
import static java.lang.Integer.valueOf;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Facensa
 */
public class VariaveisGUI extends javax.swing.JFrame {

    /**
     * Creates new form CadastroVariaveisGUI
     */
    public VariaveisGUI() {
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
        jtfLinhas = new javax.swing.JTextField();
        jtfColunas = new javax.swing.JTextField();
        jtfFks = new javax.swing.JTextField();
        jtfConstraints = new javax.swing.JTextField();
        jtfIndices = new javax.swing.JTextField();
        jtfTriggers = new javax.swing.JTextField();
        jtfFunctions = new javax.swing.JTextField();
        jtfViews = new javax.swing.JTextField();
        jtfTabelas = new javax.swing.JTextField();
        btnVoltarVariaveis = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimparVariaveis = new javax.swing.JButton();
        btnCalcularAutomaticamente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jcbTipoOperacao = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jcbTipoAlteracao = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jtfTabela = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jcbTipoObjeto = new javax.swing.JComboBox();
        jcbProjetoVariavel = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                populateComboboxHistory(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Calcular Estimativa");

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

        btnCalcularAutomaticamente.setText("Buscar Dados");
        btnCalcularAutomaticamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularAutomaticamenteActionPerformed(evt);
            }
        });

        jLabel13.setText("Cálculo:");

        jLabel14.setText("Tipo de Operação:");

        jLabel15.setText("Tipo de Alteração:");

        jcbTipoAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoAlteraçãoActionPerformed(evt);
            }
        });

        jLabel16.setText("Informe a tabela:");

        jtfTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTabelaActionPerformed(evt);
            }
        });

        jLabel17.setText("Tipo de Objeto");

        jcbTipoObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoObjetoActionPerformed(evt);
            }
        });

        jLabel18.setText("Projeto:");

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
                            .addComponent(jtfTabelas))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfTabela, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbTipoOperacao, javax.swing.GroupLayout.Alignment.LEADING, 0, 110, Short.MAX_VALUE)
                    .addComponent(jcbTipoObjeto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbTipoAlteracao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbProjetoVariavel, javax.swing.GroupLayout.Alignment.LEADING, 0, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltarVariaveis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcularAutomaticamente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel13))
                    .addComponent(btnLimparVariaveis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarVariaveis)
                        .addGap(0, 0, 0)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbTipoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel15)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparVariaveis)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfFks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jcbTipoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfConstraints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel17))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIndices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jcbTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTriggers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel16))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jtfTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfViews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addGap(0, 0, 0)
                                .addComponent(jcbProjetoVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcularAutomaticamente))))
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
        ProjetosDTO projeto = (ProjetosDTO) jcbProjetoVariavel.getSelectedItem();
        //variaveis.setIdProjeto(Integer.parseInt(jtfCodigoProjeto.getText()));
        variaveis.setIdProjeto(projeto.getId());

        MultipleLinearRegressionBO coeficientes = new MultipleLinearRegressionBO();
        GerarResultadoBO tempo = new GerarResultadoBO();
        Float resultado = tempo.calcularTempo(coeficientes.calcularCoeficientes(), variaveis);
        variaveis.setTempoEstimado(resultado);

        if ((jtfLinhas.getText().isEmpty() || jtfColunas.getText().isEmpty() || jtfFks.getText().isEmpty() || jtfConstraints.getText().isEmpty() || jtfIndices.getText().isEmpty()
                || jtfTriggers.getText().isEmpty() || jtfFunctions.getText().isEmpty() || jtfViews.getText().isEmpty() || jtfViews.getText().isEmpty() || jtfTabelas.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {
            VariaveisDAO dao = new VariaveisDAO();
            dao.adiciona(variaveis);
            DecimalFormat df = new DecimalFormat("###.##");
            JOptionPane.showMessageDialog(null, "Tempo estimado: " + df.format(resultado) + " minutos");

            jtfLinhas.setText("0");
            jtfColunas.setText("0");
            jtfFks.setText("0");
            jtfConstraints.setText("0");
            jtfIndices.setText("0");
            jtfTriggers.setText("0");
            jtfFunctions.setText("0");
            jtfViews.setText("0");
            jtfTabelas.setText("0");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void populateComboboxHistory(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_populateComboboxHistory
        try {
            VariaveisDAO variavelDao = new VariaveisDAO();
            List<VariaveisDTO> variaveis = variavelDao.recuperarTipoOperacaoComboBox();
            jcbTipoOperacao.getSelectedItem();
            jcbTipoOperacao.removeAll();

            List<VariaveisDTO> variaveis2 = variavelDao.recuperarTipoAlteracaoComboBox();
            jcbTipoAlteracao.getSelectedItem();
            jcbTipoAlteracao.removeAll();

            List<VariaveisDTO> variaveis1 = variavelDao.recuperarTipoObjetoComboBox();
            jcbTipoObjeto.getSelectedItem();
            jcbTipoObjeto.removeAll();

            ProjetosDAO projetoDao = new ProjetosDAO();
            List<ProjetosDTO> projetos = projetoDao.recuperarProjetosPorNomeComboBox();
            jcbProjetoVariavel.getSelectedItem();
            jcbProjetoVariavel.removeAll();

            for (VariaveisDTO variavel : variaveis) {
                jcbTipoOperacao.addItem(variavel);
            }

            for (VariaveisDTO variavel2 : variaveis2) {
                jcbTipoAlteracao.addItem(variavel2);
            }

            for (VariaveisDTO variavel1 : variaveis1) {
                jcbTipoObjeto.addItem(variavel1);
            }

            for (ProjetosDTO projeto : projetos) {
                jcbProjetoVariavel.addItem(projeto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VariaveisGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_populateComboboxHistory

    private void jtfTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTabelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTabelaActionPerformed

    private void jcbTipoObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoObjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoObjetoActionPerformed

    private void btnCalcularAutomaticamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularAutomaticamenteActionPerformed
        try {
            ProjetosDTO projeto = (ProjetosDTO) jcbProjetoVariavel.getSelectedItem();
            ProjetosDAO projetoDao = new ProjetosDAO();
            ProjetosDTO projetos = projetoDao.buscaDadosProjetoParaConexao(projeto.getId());

            String conexao = projeto.getUsuarioDaConexao();
            String valor = jtfTabela.getText();

            ConnectionParameters connectionParameters = new ConnectionParameters(projetos);

            ConsultaDicionarioDAO dicionarioDao = new ConsultaDicionarioDAO(connectionParameters);
            ConsultaDicionarioDTO dicionario = dicionarioDao.recuperarDadosDicionarioLinhas(valor);
            ConsultaDicionarioDTO dicionario1 = dicionarioDao.recuperarDadosDicionarioColunas(conexao, valor);
            ConsultaDicionarioDTO dicionario2 = dicionarioDao.recuperarDadosDicionarioFks(conexao, valor);
            ConsultaDicionarioDTO dicionario3 = dicionarioDao.recuperarDadosDicionarioConstraints(conexao, valor);
            ConsultaDicionarioDTO dicionario4 = dicionarioDao.recuperarDadosDicionarioIndex(conexao, valor);
            ConsultaDicionarioDTO dicionario5 = dicionarioDao.recuperarDadosDicionarioTrigger(conexao, valor);
            ConsultaDicionarioDTO dicionario6 = dicionarioDao.recuperarDadosDicionarioFunction(conexao, valor);
            ConsultaDicionarioDTO dicionario7 = dicionarioDao.recuperarDadosDicionarioView(conexao, valor);
            //System.out.println(projetoDao);
            //jtfColunas.setText("" + dicionario.getLinhas());
            jtfLinhas.setText(String.valueOf(dicionario.getLinhas()));
            jtfColunas.setText(String.valueOf(dicionario1.getColunas()));
            jtfFks.setText(String.valueOf(dicionario2.getFks()));
            jtfConstraints.setText(String.valueOf(dicionario3.getConstraints()));
            jtfIndices.setText(String.valueOf(dicionario4.getIndices()));
            jtfTriggers.setText(String.valueOf(dicionario5.getTriggers()));
            jtfFunctions.setText(String.valueOf(dicionario6.getFunctions()));
            jtfViews.setText(String.valueOf(dicionario7.getViews()));
            //jtfTabelas.setText("0");
            //System.out.println(dicionario);
        } catch (SQLException ex) {
            Logger.getLogger(VariaveisGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCalcularAutomaticamenteActionPerformed

    private void jcbTipoAlteraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoAlteraçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoAlteraçãoActionPerformed

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
            java.util.logging.Logger.getLogger(VariaveisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VariaveisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VariaveisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VariaveisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VariaveisGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularAutomaticamente;
    private javax.swing.JButton btnLimparVariaveis;
    private javax.swing.JButton btnVoltarVariaveis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox jcbProjetoVariavel;
    private javax.swing.JComboBox jcbTipoAlteracao;
    private javax.swing.JComboBox jcbTipoObjeto;
    private javax.swing.JComboBox jcbTipoOperacao;
    private javax.swing.JTextField jtfColunas;
    private javax.swing.JTextField jtfConstraints;
    private javax.swing.JTextField jtfFks;
    private javax.swing.JTextField jtfFunctions;
    private javax.swing.JTextField jtfIndices;
    private javax.swing.JTextField jtfLinhas;
    private javax.swing.JTextField jtfTabela;
    private javax.swing.JTextField jtfTabelas;
    private javax.swing.JTextField jtfTriggers;
    private javax.swing.JTextField jtfViews;
    // End of variables declaration//GEN-END:variables
}
