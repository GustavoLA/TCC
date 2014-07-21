/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.inserir;

import controller.EntradaSuprimentoController;
import controller.SuprimentoController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.EntradaSuprimento;
import modelo.negocio.Suprimento;

/**
 *
 * @author GUSTAVO
 */
public class CadastrarNovoSuprimento extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int idSuprimento;

    public CadastrarNovoSuprimento(DefaultTableModel modelo, int idSuprimento) {
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = modelo;
        this.idSuprimento = idSuprimento;
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        responsavel = new javax.swing.JLabel();
        dtMovimentacao = new javax.swing.JLabel();
        qntidade = new javax.swing.JLabel();
        txResponsavel = new javax.swing.JFormattedTextField();
        txDtMovimentacao = new javax.swing.JFormattedTextField();
        txQntidade = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        responsavel.setText("Responsavel");

        dtMovimentacao.setText("Data Movimentação");

        qntidade.setText("Quantidade");

        try {
            txDtMovimentacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qntidade)
                        .addGap(18, 18, 18)
                        .addComponent(txQntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dtMovimentacao)
                        .addGap(18, 18, 18)
                        .addComponent(txDtMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(responsavel)
                        .addGap(18, 18, 18)
                        .addComponent(txResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dtMovimentacao, qntidade, responsavel, txDtMovimentacao, txQntidade, txResponsavel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsavel)
                    .addComponent(txResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtMovimentacao)
                    .addComponent(txDtMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qntidade)
                    .addComponent(txQntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dtMovimentacao, qntidade, responsavel, txDtMovimentacao, txQntidade, txResponsavel});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        EntradaSuprimento entrada = new EntradaSuprimento();

        entrada.setQntdade(Integer.parseInt(txQntidade.getText()));
        entrada.setResponsavel(txResponsavel.getText());
        try {
            String data = txDtMovimentacao.getText();
            entrada.setDtMovimento(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter a data");
        }

        Suprimento suprimentos = new Suprimento();
        suprimentos.setCodigo(idSuprimento);
        entrada.setSuprimento(suprimentos);

        EntradaSuprimentoController sc = new EntradaSuprimentoController();
        sc.salvar(entrada);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dtMovimentacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel qntidade;
    private javax.swing.JLabel responsavel;
    private javax.swing.JFormattedTextField txDtMovimentacao;
    private javax.swing.JFormattedTextField txQntidade;
    private javax.swing.JFormattedTextField txResponsavel;
    // End of variables declaration//GEN-END:variables
}
