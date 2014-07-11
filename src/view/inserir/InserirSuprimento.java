package view.inserir;

import controller.SuprimentoController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.Suprimento;

public class InserirSuprimento extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int linhaSelecionada;

    //INSERIR
    public InserirSuprimento(DefaultTableModel modelo) {
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = modelo;
    }

    //EDITAR LINHA SELECIONADA 
    public InserirSuprimento(DefaultTableModel modelo, int linhaSelecionada, int idSuprimento) {
        this.modelo = modelo;
        preencherCampos(linhaSelecionada, idSuprimento);
    }

    //VISUALIZAR LINHA SELECIONADA
    public InserirSuprimento(int linhaSelecionada, int idSuprimento) {
        preencherCampos(linhaSelecionada, idSuprimento);
        bloquearCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgProducao = new javax.swing.ButtonGroup();
        bgNotaFiscal = new javax.swing.ButtonGroup();
        painelFundo = new javax.swing.JPanel();
        cadastroSuprimento = new javax.swing.JTabbedPane();
        produto = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        qntdade = new javax.swing.JLabel();
        scrollDescricao = new javax.swing.JScrollPane();
        txDescricao = new javax.swing.JTextPane();
        txNome = new javax.swing.JTextField();
        txQntdade = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        producao = new javax.swing.JLabel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        valor = new javax.swing.JLabel();
        txValor = new javax.swing.JTextField();
        unidadeMedida = new javax.swing.JLabel();
        txUnidadeMedida = new javax.swing.JTextField();
        notaFiscal = new javax.swing.JLabel();
        rbSim1 = new javax.swing.JRadioButton();
        rbNao1 = new javax.swing.JRadioButton();
        dataValidade = new javax.swing.JLabel();
        txDtValidade = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(255, 222, 173));
        painelFundo.setBorder(javax.swing.BorderFactory.createTitledBorder("SUPRIMENTO"));

        produto.setBackground(new java.awt.Color(255, 255, 255));

        nome.setText("NOME *");

        descricao.setText("DESCRIÇÃO *");

        qntdade.setText("QUANTIDADE *");

        scrollDescricao.setViewportView(txDescricao);

        id.setText("ID");

        txId.setEditable(false);
        txId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdActionPerformed(evt);
            }
        });

        producao.setText("É DA PRODUÇÃO? *");

        rbSim.setBackground(new java.awt.Color(255, 255, 255));
        bgProducao.add(rbSim);
        rbSim.setText("SIM");

        rbNao.setBackground(new java.awt.Color(255, 255, 255));
        bgProducao.add(rbNao);
        rbNao.setText("NÃO");

        valor.setText("VALOR");

        unidadeMedida.setText("UNIDADE MEDIDA");

        notaFiscal.setText("NOTA FISCAL");

        rbSim1.setBackground(new java.awt.Color(255, 255, 255));
        bgNotaFiscal.add(rbSim1);
        rbSim1.setText("SIM");

        rbNao1.setBackground(new java.awt.Color(255, 255, 255));
        bgNotaFiscal.add(rbNao1);
        rbNao1.setText("NÃO");

        dataValidade.setText("DATA VENCIMENTO");

        try {
            txDtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout produtoLayout = new javax.swing.GroupLayout(produto);
        produto.setLayout(produtoLayout);
        produtoLayout.setHorizontalGroup(
            produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao)
                            .addComponent(nome))
                        .addGap(18, 18, 18)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                            .addComponent(txNome)))
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(produtoLayout.createSequentialGroup()
                                .addComponent(qntdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txQntdade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(produtoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(produtoLayout.createSequentialGroup()
                                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(produtoLayout.createSequentialGroup()
                                                .addComponent(valor)
                                                .addGap(18, 18, 18)
                                                .addComponent(txValor))
                                            .addGroup(produtoLayout.createSequentialGroup()
                                                .addComponent(producao)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rbSim)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbNao))
                                    .addGroup(produtoLayout.createSequentialGroup()
                                        .addComponent(dataValidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(txDtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(produtoLayout.createSequentialGroup()
                                .addComponent(notaFiscal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbSim1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbNao1))
                            .addGroup(produtoLayout.createSequentialGroup()
                                .addComponent(unidadeMedida)
                                .addGap(18, 18, 18)
                                .addComponent(txUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        produtoLayout.setVerticalGroup(
            produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(descricao))
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scrollDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qntdade)
                    .addComponent(txQntdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidadeMedida)
                    .addComponent(txUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producao)
                    .addComponent(rbSim)
                    .addComponent(rbNao)
                    .addComponent(notaFiscal)
                    .addComponent(rbSim1)
                    .addComponent(rbNao1))
                .addGap(18, 18, 18)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor)
                    .addComponent(txValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataValidade)
                    .addComponent(txDtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        cadastroSuprimento.addTab("TIPO DE PRODUTO", produto);

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSalvar.setContentAreaFilled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cadastroSuprimento)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(70, 70, 70))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroSuprimento)
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btLimpar)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        Suprimento s = new Suprimento();

        s.setValor(Double.parseDouble(txValor.getText()));
        s.setUnidadeMedida(txUnidadeMedida.getText());

        try {
            String data = txDtValidade.getText();
            s.setDtVencimento(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "FORMATO INVÁLIDO! UTILIZE: DD/MM/YYYY\n" + ex);
        }

        if (rbNao1.isSelected()) {
            s.setNotaFiscal('N');
        } else {
            s.setNotaFiscal('S');
        }

        /**
         * Pra cima feito agr.
         */
        s.setDescricao(txDescricao.getText());
        s.setNome(txNome.getText());
        s.setQtdade(Integer.parseInt(txQntdade.getText()));

        if (rbNao.isSelected()) {
            s.setProducao('N');
        } else {
            s.setProducao('S');
        }

        SuprimentoController sc = new SuprimentoController();

        if (!(txId.getText().equals("") | (txId.getText().equals(null)))) {
            s.setCodigo(Integer.parseInt(txId.getText()));
            sc.salvar(s);

            modelo.removeRow(linhaSelecionada);
            modelo.addRow(new Object[]{s.getCodigo(), s.getDescricao(), s.getNome(), s.getQtdade()});
            dispose();
        } else {
            sc.salvar(s);
            dispose();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed

        txDescricao.setText(null);
        txNome.setText(null);
        txQntdade.setText(null);

    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgNotaFiscal;
    private javax.swing.ButtonGroup bgProducao;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTabbedPane cadastroSuprimento;
    private javax.swing.JLabel dataValidade;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel id;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel notaFiscal;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JLabel producao;
    private javax.swing.JPanel produto;
    private javax.swing.JLabel qntdade;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbNao1;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JRadioButton rbSim1;
    private javax.swing.JScrollPane scrollDescricao;
    private javax.swing.JTextPane txDescricao;
    private javax.swing.JFormattedTextField txDtValidade;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txQntdade;
    private javax.swing.JTextField txUnidadeMedida;
    private javax.swing.JTextField txValor;
    private javax.swing.JLabel unidadeMedida;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables

    private void preencherCampos(int linhaSelecionada1, int idSuprimento) {
        initComponents();
        this.linhaSelecionada = linhaSelecionada1;
        setLocationRelativeTo(null);
        SuprimentoController sc = new SuprimentoController();
        Suprimento s = sc.listarSuprimentoPorId(idSuprimento);
        txId.setText(String.valueOf(s.getCodigo()));
        txDescricao.setText(s.getDescricao());
        txNome.setText(s.getNome());
        txQntdade.setText(String.valueOf(s.getQtdade()));

        if (s.getProducao() == 'N') {
            rbNao.setSelected(true);
        } else {
            rbSim.setSelected(true);
        }
    }

    private void bloquearCampos() {

        txDescricao.setEditable(false);
        txNome.setEditable(false);
        txQntdade.setEditable(false);
        rbNao.setEnabled(false);
        rbSim.setEnabled(false);
        btLimpar.setEnabled(false);
        btSalvar.setEnabled(false);

    }
}
