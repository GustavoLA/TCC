/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.inserir;

import controller.EntradaSuprimentoController;
import controller.FuncionarioController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.EntradaSuprimento;
import modelo.negocio.Estoque;
import modelo.negocio.Funcionario;
import modelo.negocio.Suprimento;
import modelo.util.Acesso;
import validadores.Validadores;

/**
 *
 * @author User
 */
public class CadastroEntradaSuprimento extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int idSuprimento;

    public CadastroEntradaSuprimento(DefaultTableModel modelo, int idSuprimento) {
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = modelo;
        this.idSuprimento = idSuprimento;
        setResizable(false);
        carregarCombo();
        funcionarioLogado.setText(Acesso.getFuncionarioLogado().getNome());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelTopo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        responsavel = new javax.swing.JLabel();
        dtMovimentacao = new javax.swing.JLabel();
        txDtMovimentacao = new javax.swing.JFormattedTextField();
        qntidade = new javax.swing.JLabel();
        txQntidade = new javax.swing.JFormattedTextField();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        txIdSuprimento = new javax.swing.JTextField();
        cbFuncionario = new javax.swing.JComboBox();
        valor = new javax.swing.JLabel();
        txValor = new javax.swing.JFormattedTextField();
        formaPagamento = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txDtVencimento = new javax.swing.JFormattedTextField();
        funcionarioLogado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        painelFundo.setBackground(java.awt.Color.white);
        painelFundo.setMaximumSize(new java.awt.Dimension(700, 550));
        painelFundo.setMinimumSize(new java.awt.Dimension(700, 550));
        painelFundo.setRequestFocusEnabled(false);

        painelTopo.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setText("Entrada de Suprimentos");

        javax.swing.GroupLayout painelTopoLayout = new javax.swing.GroupLayout(painelTopo);
        painelTopo.setLayout(painelTopoLayout);
        painelTopoLayout.setHorizontalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTopoLayout.setVerticalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTopoLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        responsavel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        responsavel.setText("Responsável:  ");

        dtMovimentacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dtMovimentacao.setText("Data da Movimentação:  ");

        try {
            txDtMovimentacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        qntidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        qntidade.setText("Quantidade:  ");

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clean2.png"))); // NOI18N
        btLimpar.setBorderPainted(false);
        btLimpar.setContentAreaFilled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btSalvar.setBorder(null);
        btSalvar.setBorderPainted(false);
        btSalvar.setContentAreaFilled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        txIdSuprimento.setEditable(false);

        valor.setText("Valor");

        formaPagamento.setText("Forma de pagamento");

        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cheque", "Cartão de Crédito", "Outros" }));

        jLabel2.setText("Data de vencimento");

        try {
            txDtVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addComponent(txIdSuprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(cbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(qntidade)
                                        .addGap(65, 65, 65)
                                        .addComponent(txQntidade))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFundoLayout.createSequentialGroup()
                                        .addComponent(dtMovimentacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txDtMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFundoLayout.createSequentialGroup()
                                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelFundoLayout.createSequentialGroup()
                                                .addComponent(valor)
                                                .addGap(114, 114, 114))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                                                .addComponent(formaPagamento)
                                                .addGap(36, 36, 36)))
                                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txValor))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txDtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(funcionarioLogado)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsavel)
                    .addComponent(cbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtMovimentacao)
                    .addComponent(txDtMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txDtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qntidade)
                    .addComponent(txQntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor)
                    .addComponent(txValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formaPagamento)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(txIdSuprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(funcionarioLogado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (Validadores.validaCampoVazio(txDtMovimentacao.getText(), "Data de Movimentação")
                && Validadores.validaCampoVazio(txDtVencimento.getText(), "Data de Vencimento")
                && Validadores.validaCampoVazio(txQntidade.getText(), "Quantidade")
                && Validadores.validaCampoVazio(txValor.getText(), "Valor")
                && Validadores.validaData(txDtMovimentacao.getText(), "Data de Movimentação")
                && Validadores.validaData(txDtVencimento.getText(), "Data de Vencimento")
                && Validadores.validaDouble(txQntidade.getText(), "Quantidade")
                && Validadores.validaDouble(txValor.getText(), "Valor")) {

            EntradaSuprimento entrada = new EntradaSuprimento();

            entrada.setQntdade(Integer.parseInt(txQntidade.getText()));
            entrada.setResponsavel((Funcionario) cbFuncionario.getSelectedItem());
            entrada.setFormaPagamento(cbFormaPagamento.getSelectedItem() + "");

            try {
                String data = txDtMovimentacao.getText();
                entrada.setDtMovimento(new SimpleDateFormat("dd/MM/yyyy").parse(data));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter a data");
            }
            try {
                String data = txDtVencimento.getText();
                entrada.setDtVencimento(new SimpleDateFormat("dd/MM/yyyy").parse(data));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter a data");
            }

//      entrada.setQnqtidadeTotal(entrada.getQnqtidadeTotal() + entrada.getQntdade());
            Suprimento suprimentos = new Suprimento();
            suprimentos.setCodigo(idSuprimento);
            entrada.setSuprimento(suprimentos);

            EntradaSuprimentoController sc = new EntradaSuprimentoController();
            sc.salvar(entrada);

            //        Estoque e = new Estoque();
            //        e.setQntidade(entrada.getQntdade() + e.getQntidade());
            //        EstoqueController ec = new EstoqueController();
            //        ec.salvar(e);
            dispose();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed

        txDtMovimentacao.setText(null);
        txQntidade.setText(null);
    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbFormaPagamento;
    private javax.swing.JComboBox cbFuncionario;
    private javax.swing.JLabel dtMovimentacao;
    private javax.swing.JLabel formaPagamento;
    private javax.swing.JLabel funcionarioLogado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelTopo;
    private javax.swing.JLabel qntidade;
    private javax.swing.JLabel responsavel;
    private javax.swing.JFormattedTextField txDtMovimentacao;
    private javax.swing.JFormattedTextField txDtVencimento;
    private javax.swing.JTextField txIdSuprimento;
    private javax.swing.JFormattedTextField txQntidade;
    private javax.swing.JFormattedTextField txValor;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables

    private void carregarCombo() {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbFuncionario.getModel();
        comboModel.removeAllElements();
        List<Funcionario> f = new ArrayList<>();
        FuncionarioController fc = new FuncionarioController();
        f = fc.listarFuncionario();

        for (int linha = 0; linha < f.size(); linha++) {
            Funcionario fb = f.get(linha);
            comboModel.addElement(fb);
        }

    }

}
