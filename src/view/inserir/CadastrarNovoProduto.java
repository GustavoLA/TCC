/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.inserir;

import controller.EntradaProdutoController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.EntradaProduto;
import modelo.negocio.Produto;

/**
 *
 * @author GUSTAVO
 */
public class CadastrarNovoProduto extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int idProduto;

    public CadastrarNovoProduto(DefaultTableModel modelo, int idProduto) {
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = modelo;
        this.idProduto = idProduto;
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
        dtFabricacao = new javax.swing.JLabel();
        qntidade = new javax.swing.JLabel();
        txResponsavel = new javax.swing.JFormattedTextField();
        txDtFabricacao = new javax.swing.JFormattedTextField();
        txQntidade = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        dtValidade = new javax.swing.JLabel();
        txDtValidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        responsavel.setText("Responsavel");

        dtFabricacao.setText("Data Fabricação");

        qntidade.setText("Quantidade");

        try {
            txDtFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btSalvar.setText("salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        dtValidade.setText("Data Validade");

        try {
            txDtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qntidade)
                        .addGap(18, 18, 18)
                        .addComponent(txQntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(responsavel)
                            .addGap(18, 18, 18)
                            .addComponent(txResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dtFabricacao)
                            .addGap(18, 18, 18)
                            .addComponent(txDtFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dtValidade)
                            .addGap(30, 30, 30)
                            .addComponent(txDtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dtFabricacao, qntidade, responsavel, txDtFabricacao, txQntidade, txResponsavel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtFabricacao)
                    .addComponent(txDtFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtValidade)
                    .addComponent(txDtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txQntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qntidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsavel)
                    .addComponent(txResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dtFabricacao, qntidade, responsavel, txDtFabricacao, txQntidade, txResponsavel});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        EntradaProduto entrada = new EntradaProduto();

        entrada.setQntidade(Integer.parseInt(txQntidade.getText()));
        entrada.setResponsavel(txResponsavel.getText());
        try {
            String data = txDtFabricacao.getText();
            entrada.setDtFabricacao(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter a data");
        }
        try {
            String data = txDtValidade.getText();
            entrada.setDtValidade(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter a data");
        }
        Produto produtos = new Produto();
        produtos.setCodigo(idProduto);
        entrada.setProduto(produtos);

        EntradaProdutoController epc = new EntradaProdutoController();
        epc.salvar(entrada);
        dispose();

    }//GEN-LAST:event_btSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel dtFabricacao;
    private javax.swing.JLabel dtValidade;
    private javax.swing.JLabel qntidade;
    private javax.swing.JLabel responsavel;
    private javax.swing.JFormattedTextField txDtFabricacao;
    private javax.swing.JFormattedTextField txDtValidade;
    private javax.swing.JFormattedTextField txQntidade;
    private javax.swing.JFormattedTextField txResponsavel;
    // End of variables declaration//GEN-END:variables
}
