package view.inserir;

import controller.FornecedorController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.Endereco;
import modelo.negocio.Fornecedor;

public class InserirFornecedor extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int linhaSelecionada;

    public InserirFornecedor(DefaultTableModel modelo) {
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = modelo;
    }

    public InserirFornecedor(DefaultTableModel modelo, int linhaSelecionada, int idFornecedor) {
        initComponents();
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        setLocationRelativeTo(null);

        FornecedorController fc = new FornecedorController();
        Fornecedor f = fc.listarFornecedorPorId(idFornecedor);

        //FORNECEDOR
        txId.setText(String.valueOf(f.getCodigo()));
        txDescricao.setText(f.getDescricao());
        txEmail.setText(f.getEmail());
        txFax.setText(f.getFax());
        txMarcaProduto.setText(f.getMarcaProduto());
        txNome.setText(f.getNomeFantasia());
        txNomeProduto.setText(f.getNomeProduto());
        txTelefone.setText(f.getTelefone());

        SimpleDateFormat formataDtFornecimento = new SimpleDateFormat("dd/MM/yyyy");
        String dtFornecimentoEdt = formataDtFornecimento.format(f.getDtFornecimento());
        txDtFornecimento.setText(dtFornecimentoEdt);

        //ENDEREÇO
        txCidade.setText(String.valueOf(f.getEndereco().getCidade()));
        txComplemento.setText(String.valueOf(f.getEndereco().getComplemento()));
        txEstado.setText(String.valueOf(f.getEndereco().getEstado()));
        txNumero.setText(String.valueOf(f.getEndereco().getNumero()));
        txRua.setText(String.valueOf(f.getEndereco().getRua()));
        txIdEndereco.setText(String.valueOf(f.getEndereco().getCodigo()));
        txCep.setText(f.getEndereco().getCep());

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
        cadastroFornecedor = new javax.swing.JTabbedPane();
        dadosFornecedor = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        telefone = new javax.swing.JLabel();
        txTelefone = new javax.swing.JFormattedTextField();
        fax = new javax.swing.JLabel();
        txFax = new javax.swing.JFormattedTextField();
        email = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        campoObrigatorio = new javax.swing.JLabel();
        cnpj = new javax.swing.JLabel();
        txCnpj = new javax.swing.JFormattedTextField();
        endereco = new javax.swing.JPanel();
        rua = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        txNumero = new javax.swing.JTextField();
        txRua = new javax.swing.JTextField();
        complemento = new javax.swing.JLabel();
        txComplemento = new javax.swing.JTextField();
        estado = new javax.swing.JLabel();
        txEstado = new javax.swing.JTextField();
        cidade = new javax.swing.JLabel();
        txCidade = new javax.swing.JTextField();
        idEndereco = new javax.swing.JLabel();
        txIdEndereco = new javax.swing.JTextField();
        cep = new javax.swing.JLabel();
        txCep = new javax.swing.JFormattedTextField();
        tipoProduto = new javax.swing.JPanel();
        nomeProduto = new javax.swing.JLabel();
        txNomeProduto = new javax.swing.JTextField();
        marcaProduto = new javax.swing.JLabel();
        txMarcaProduto = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        dtFornecimento = new javax.swing.JLabel();
        txDtFornecimento = new javax.swing.JFormattedTextField();
        scrollDescricao = new javax.swing.JScrollPane();
        txDescricao = new javax.swing.JTextArea();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(255, 255, 153));
        painelFundo.setBorder(javax.swing.BorderFactory.createTitledBorder("FORNECEDOR"));
        painelFundo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        nome.setText("NOME *");

        telefone.setText("TELEFONE *");

        try {
            txTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        fax.setText("FAX");

        try {
            txFax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        email.setText("EMAIL*");

        id.setText("ID:");

        txId.setEditable(false);
        txId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdActionPerformed(evt);
            }
        });

        campoObrigatorio.setText("* CAMPO OBRIGATÓRIO");

        cnpj.setText("CNPJ");

        javax.swing.GroupLayout dadosFornecedorLayout = new javax.swing.GroupLayout(dadosFornecedor);
        dadosFornecedor.setLayout(dadosFornecedorLayout);
        dadosFornecedorLayout.setHorizontalGroup(
            dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosFornecedorLayout.createSequentialGroup()
                        .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefone)
                            .addComponent(fax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(txFax))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dadosFornecedorLayout.createSequentialGroup()
                        .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(dadosFornecedorLayout.createSequentialGroup()
                                    .addComponent(nome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosFornecedorLayout.createSequentialGroup()
                                    .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(email)
                                        .addComponent(cnpj))
                                    .addGap(31, 31, 31)
                                    .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txEmail)
                                        .addGroup(dadosFornecedorLayout.createSequentialGroup()
                                            .addComponent(txCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGroup(dadosFornecedorLayout.createSequentialGroup()
                                .addComponent(id)
                                .addGap(18, 18, 18)
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoObrigatorio))
                        .addGap(0, 375, Short.MAX_VALUE))))
        );
        dadosFornecedorLayout.setVerticalGroup(
            dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosFornecedorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fax)
                    .addComponent(txFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpj)
                    .addComponent(txCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(campoObrigatorio)
                .addGap(40, 40, 40)
                .addGroup(dadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        cadastroFornecedor.addTab("DADOS DO FORNECEDOR", dadosFornecedor);

        rua.setText("RUA  *");

        numero.setText("NÚMERO *");

        txRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRuaActionPerformed(evt);
            }
        });

        complemento.setText("COMPLEMENTO");

        estado.setText("ESTADO *");

        cidade.setText("CIDADE  *");

        idEndereco.setText("ID");

        cep.setText("CEP");

        javax.swing.GroupLayout enderecoLayout = new javax.swing.GroupLayout(endereco);
        endereco.setLayout(enderecoLayout);
        enderecoLayout.setHorizontalGroup(
            enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enderecoLayout.createSequentialGroup()
                        .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rua)
                            .addComponent(numero)
                            .addComponent(estado)
                            .addGroup(enderecoLayout.createSequentialGroup()
                                .addComponent(idEndereco)
                                .addGap(18, 18, 18)
                                .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cidade))
                        .addGap(24, 24, 24)
                        .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(enderecoLayout.createSequentialGroup()
                                .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(complemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txComplemento))
                            .addComponent(txRua, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(txEstado)
                            .addComponent(txCidade))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(enderecoLayout.createSequentialGroup()
                        .addComponent(cep)
                        .addGap(18, 18, 18)
                        .addComponent(txCep)))
                .addContainerGap())
        );
        enderecoLayout.setVerticalGroup(
            enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rua)
                    .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero)
                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complemento)
                    .addComponent(txComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado)
                    .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep)
                    .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEndereco)
                    .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        cadastroFornecedor.addTab("ENDEREÇO", endereco);

        nomeProduto.setText("NOME DO PRODUTO *");

        txNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeProdutoActionPerformed(evt);
            }
        });

        marcaProduto.setText("MARCA DO PRODUTO *");

        descricao.setText("DESCRIÇÃO");

        dtFornecimento.setText("DATA DE FORNECIMENTO *");

        try {
            txDtFornecimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txDescricao.setColumns(20);
        txDescricao.setRows(5);
        scrollDescricao.setViewportView(txDescricao);

        javax.swing.GroupLayout tipoProdutoLayout = new javax.swing.GroupLayout(tipoProduto);
        tipoProduto.setLayout(tipoProdutoLayout);
        tipoProdutoLayout.setHorizontalGroup(
            tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tipoProdutoLayout.createSequentialGroup()
                        .addGroup(tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeProduto)
                            .addComponent(marcaProduto)
                            .addComponent(descricao))
                        .addGap(28, 28, 28)
                        .addGroup(tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(txMarcaProduto)
                            .addComponent(scrollDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tipoProdutoLayout.createSequentialGroup()
                        .addComponent(dtFornecimento)
                        .addGap(18, 18, 18)
                        .addComponent(txDtFornecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        tipoProdutoLayout.setVerticalGroup(
            tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoProdutoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProduto)
                    .addComponent(txNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marcaProduto)
                    .addComponent(txMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricao)
                    .addComponent(scrollDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(tipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtFornecimento)
                    .addComponent(txDtFornecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(346, Short.MAX_VALUE))
        );

        cadastroFornecedor.addTab("TIPO DE PRODUTO", tipoProduto);

        btSalvar.setText("SALVAR");
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
            .addComponent(cadastroFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(33, 33, 33)
                .addComponent(btLimpar)
                .addGap(90, 90, 90))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar))
                .addGap(20, 20, 20))
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

    private void txRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txRuaActionPerformed

    private void txNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeProdutoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txDescricao.setText(null);
        txDtFornecimento.setText(null);
        txEmail.setText(null);
        txFax.setText(null);
        txMarcaProduto.setText(null);
        txNome.setText(null);
        txNomeProduto.setText(null);
        txTelefone.setText(null);

        txCidade.setText(null);
        txComplemento.setText(null);
        txEstado.setText(null);
        txNumero.setText(null);
        txRua.setText(null);
        txCep.setText(null);


    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Fornecedor f = new Fornecedor();

        f.setCnpj(txCnpj.getText());
        f.setDescricao(txDescricao.getText());
        f.setEmail(txEmail.getText());
        f.setFax(txFax.getText());
        f.setMarcaProduto(txMarcaProduto.getText());
        f.setNomeFantasia(txNome.getText());
        f.setNomeProduto(txNomeProduto.getText());
        f.setTelefone(txTelefone.getText());
        try {
            String data = txDtFornecimento.getText();
            f.setDtFornecimento(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "FORMATO INVÁLIDO! UTILIZE: DD/MM/YYYY\n" + ex);
        }

        Endereco e = new Endereco();
        e.setCidade(txCidade.getText());
        e.setComplemento(txComplemento.getText());
        e.setEstado(txEstado.getText());
        e.setNumero(Integer.parseInt(txNumero.getText()));
        e.setRua(txRua.getText());
        e.setCep(txCep.getText());

        if (!(txIdEndereco.getText().equals("") | (txIdEndereco.getText().equals(null)))) {
            e.setCodigo(Integer.parseInt(txIdEndereco.getText()));
        }
        f.setEndereco(e);

        FornecedorController fc = new FornecedorController();
        if (!(txId.getText().equals("") | (txId.getText().equals(null)))) {
            f.setCodigo(Integer.parseInt(txId.getText()));
            fc.salvar(f);

            modelo.removeRow(linhaSelecionada);
            modelo.addRow(new Object[]{f.getCodigo(), f.getCnpj(), f.getDescricao(), f.getDtFornecimento(), f.getEmail(), f.getFax(), f.getMarcaProduto(), f.getNomeFantasia(), f.getNomeProduto(), f.getTelefone()});
            dispose();
        } else {
            fc.salvar(f);
            dispose();
        }
    }//GEN-LAST:event_btSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTabbedPane cadastroFornecedor;
    private javax.swing.JLabel campoObrigatorio;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cnpj;
    private javax.swing.JLabel complemento;
    private javax.swing.JPanel dadosFornecedor;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel dtFornecimento;
    private javax.swing.JLabel email;
    private javax.swing.JPanel endereco;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel fax;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idEndereco;
    private javax.swing.JLabel marcaProduto;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nomeProduto;
    private javax.swing.JLabel numero;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JLabel rua;
    private javax.swing.JScrollPane scrollDescricao;
    private javax.swing.JLabel telefone;
    private javax.swing.JPanel tipoProduto;
    private javax.swing.JFormattedTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JFormattedTextField txCnpj;
    private javax.swing.JTextField txComplemento;
    private javax.swing.JTextArea txDescricao;
    private javax.swing.JFormattedTextField txDtFornecimento;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEstado;
    private javax.swing.JFormattedTextField txFax;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txIdEndereco;
    private javax.swing.JTextField txMarcaProduto;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNomeProduto;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextField txRua;
    private javax.swing.JFormattedTextField txTelefone;
    // End of variables declaration//GEN-END:variables
}
