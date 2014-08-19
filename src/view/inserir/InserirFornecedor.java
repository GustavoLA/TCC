/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.inserir;

import controller.FornecedorController;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.Endereco;
import modelo.negocio.Fornecedor;

/**
 *
 * @author User
 */
public class InserirFornecedor extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int linhaSelecionada;

    //INSERIR NOVO
    public InserirFornecedor(DefaultTableModel modelo) {
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = modelo;
    }

    //EDITAR LINHA SELECIONADA
    public InserirFornecedor(DefaultTableModel modelo, int linhaSelecionada, int idFornecedor) {
        this.modelo = modelo;
        PreencherCampos(linhaSelecionada, idFornecedor);
    }

    //VISUALIZAR LINHA SELECIONADA
    public InserirFornecedor(int linhaSelecionada, int idFornecedor) {
        PreencherCampos(linhaSelecionada, idFornecedor);
        bloquearCampos();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelTopo = new javax.swing.JPanel();
        painelRodape = new javax.swing.JPanel();
        painelDadosFornecedor = new javax.swing.JPanel();
        nomeFantasia = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        fax = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        txTelefone = new javax.swing.JFormattedTextField();
        txFax = new javax.swing.JFormattedTextField();
        txEmail = new javax.swing.JTextField();
        cnpj = new javax.swing.JLabel();
        txCnpj = new javax.swing.JTextField();
        txNomeFantasia = new javax.swing.JTextField();
        campoObrigatorio = new javax.swing.JLabel();
        txIdFornecedor = new javax.swing.JTextField();
        painelEndereco = new javax.swing.JPanel();
        estado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        cep = new javax.swing.JLabel();
        txCep = new javax.swing.JFormattedTextField();
        cidade = new javax.swing.JLabel();
        txCidade = new javax.swing.JTextField();
        bairro = new javax.swing.JLabel();
        txBairro = new javax.swing.JTextField();
        txIdEndereco = new javax.swing.JTextField();
        rua = new javax.swing.JLabel();
        txRua = new javax.swing.JTextField();
        numero = new javax.swing.JLabel();
        complemento = new javax.swing.JLabel();
        txComplemento = new javax.swing.JTextField();
        txNumero = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        painelTipoProduto = new javax.swing.JPanel();
        nomeProduto = new javax.swing.JLabel();
        marcaProduto = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDescricao = new javax.swing.JTextPane();
        txNomeProduto = new javax.swing.JTextField();
        txMarcaProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        painelFundo.setBackground(java.awt.Color.white);

        painelTopo.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout painelTopoLayout = new javax.swing.GroupLayout(painelTopo);
        painelTopo.setLayout(painelTopoLayout);
        painelTopoLayout.setHorizontalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelTopoLayout.setVerticalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        painelRodape.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout painelRodapeLayout = new javax.swing.GroupLayout(painelRodape);
        painelRodape.setLayout(painelRodapeLayout);
        painelRodapeLayout.setHorizontalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelRodapeLayout.setVerticalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        painelDadosFornecedor.setBackground(java.awt.Color.white);
        painelDadosFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DO FORNECEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        nomeFantasia.setText("Nome Fantasia*:  ");

        telefone.setText("Telefone*:  ");

        fax.setText("Fax:  ");

        email.setText("Email:  ");

        try {
            txTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txFax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cnpj.setText("CNPJ:  ");

        campoObrigatorio.setText("* CAMPO OBRIGATÓRIO");

        javax.swing.GroupLayout painelDadosFornecedorLayout = new javax.swing.GroupLayout(painelDadosFornecedor);
        painelDadosFornecedor.setLayout(painelDadosFornecedorLayout);
        painelDadosFornecedorLayout.setHorizontalGroup(
            painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosFornecedorLayout.createSequentialGroup()
                .addGroup(painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosFornecedorLayout.createSequentialGroup()
                        .addGroup(painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefone)
                            .addComponent(nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadosFornecedorLayout.createSequentialGroup()
                                .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txFax, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txNomeFantasia))
                        .addGap(30, 30, 30)
                        .addGroup(painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadosFornecedorLayout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosFornecedorLayout.createSequentialGroup()
                                .addComponent(cnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txCnpj)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelDadosFornecedorLayout.createSequentialGroup()
                        .addComponent(campoObrigatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelDadosFornecedorLayout.setVerticalGroup(
            painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosFornecedorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFantasia)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(fax)
                    .addComponent(email)
                    .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoObrigatorio)
                    .addComponent(txIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        painelEndereco.setBackground(java.awt.Color.white);
        painelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENDEREÇO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        estado.setText("Estado:  ");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cep.setText("CEP:  ");

        try {
            txCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cidade.setText("Cidade *:");

        bairro.setText("Bairro:  ");

        rua.setText("Rua:  ");

        numero.setText("Número:  ");

        complemento.setText("Complemento:");

        javax.swing.GroupLayout painelEnderecoLayout = new javax.swing.GroupLayout(painelEndereco);
        painelEndereco.setLayout(painelEnderecoLayout);
        painelEnderecoLayout.setHorizontalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addComponent(rua)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado))
                        .addGap(35, 35, 35)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 296, Short.MAX_VALUE))
                            .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelEnderecoLayout.createSequentialGroup()
                                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cep)
                                    .addComponent(bairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelEnderecoLayout.createSequentialGroup()
                                .addComponent(numero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txComplemento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelEnderecoLayout.setVerticalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cep)
                    .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade)
                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro)
                    .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rua)
                        .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numero)
                        .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(complemento)
                        .addComponent(txComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clean2.png"))); // NOI18N
        btLimpar.setBorder(null);
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

        painelTipoProduto.setBackground(java.awt.Color.white);
        painelTipoProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE PRODUTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        nomeProduto.setText("Nome do Produto *:  ");

        marcaProduto.setText("Marca do Produto*:  ");

        descricao.setText("Descrição:  ");

        jScrollPane1.setViewportView(txDescricao);

        javax.swing.GroupLayout painelTipoProdutoLayout = new javax.swing.GroupLayout(painelTipoProduto);
        painelTipoProduto.setLayout(painelTipoProdutoLayout);
        painelTipoProdutoLayout.setHorizontalGroup(
            painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                        .addComponent(nomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                        .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcaProduto)
                            .addComponent(descricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        painelTipoProdutoLayout.setVerticalGroup(
            painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProduto)
                    .addComponent(txNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaProduto)
                    .addComponent(txMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                        .addComponent(descricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)))
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addComponent(painelDadosFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelTipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(painelTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txDescricao.setText(null);
        txEmail.setText(null);
        txFax.setText(null);
        txMarcaProduto.setText(null);
        txNomeFantasia.setText(null);
        txNomeProduto.setText(null);
        txTelefone.setText(null);

        txCidade.setText(null);
        txComplemento.setText(null);
        // Combo txEstado.setText(null);
        txNumero.setText(null);
        txRua.setText(null);
        txCep.setText(null);
        txBairro.setText(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Fornecedor f = new Fornecedor();

        f.setCnpj(txCnpj.getText());
        f.setDescricao(txDescricao.getText());
        f.setEmail(txEmail.getText());
        f.setFax(txFax.getText());
        f.setMarcaProduto(txMarcaProduto.getText());
        f.setNomeFantasia(txNomeFantasia.getText());
        f.setNomeProduto(txNomeProduto.getText());
        f.setTelefone(txTelefone.getText());

        Endereco e = new Endereco();
        e.setCidade(txCidade.getText());
        e.setComplemento(txComplemento.getText());
        //combo e.setEstado(txEstado.getText());
        e.setNumero(Integer.parseInt(txNumero.getText()));
        e.setRua(txRua.getText());
        e.setCep(txCep.getText());
        e.setBairro(txBairro.getText());

        if (!(txIdEndereco.getText().equals("") | (txIdEndereco.getText().equals(null)))) {
            e.setCodigo(Integer.parseInt(txIdEndereco.getText()));
        }
        f.setEndereco(e);

        FornecedorController fc = new FornecedorController();
        if (!(txIdFornecedor.getText().equals("") | (txIdFornecedor.getText().equals(null)))) {
            f.setCodigo(Integer.parseInt(txIdFornecedor.getText()));
            fc.salvar(f);

            modelo.removeRow(linhaSelecionada);
            modelo.addRow(new Object[]{f.getCodigo(), f.getCnpj(), f.getDescricao(), f.getEmail(), f.getFax(), f.getMarcaProduto(), f.getNomeFantasia(), f.getNomeProduto(), f.getTelefone()});
            dispose();
        } else {
            fc.salvar(f);
            dispose();
        }

    }//GEN-LAST:event_btSalvarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel campoObrigatorio;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cnpj;
    private javax.swing.JLabel complemento;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel email;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel fax;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel marcaProduto;
    private javax.swing.JLabel nomeFantasia;
    private javax.swing.JLabel nomeProduto;
    private javax.swing.JLabel numero;
    private javax.swing.JPanel painelDadosFornecedor;
    private javax.swing.JPanel painelEndereco;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JPanel painelTipoProduto;
    private javax.swing.JPanel painelTopo;
    private javax.swing.JLabel rua;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField txBairro;
    private javax.swing.JFormattedTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextField txCnpj;
    private javax.swing.JTextField txComplemento;
    private javax.swing.JTextPane txDescricao;
    private javax.swing.JTextField txEmail;
    private javax.swing.JFormattedTextField txFax;
    private javax.swing.JTextField txIdEndereco;
    private javax.swing.JTextField txIdFornecedor;
    private javax.swing.JTextField txMarcaProduto;
    private javax.swing.JTextField txNomeFantasia;
    private javax.swing.JTextField txNomeProduto;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextField txRua;
    private javax.swing.JFormattedTextField txTelefone;
    // End of variables declaration//GEN-END:variables

 private void PreencherCampos(int linhaSelecionada1, int idFornecedor) {
        initComponents();
        this.linhaSelecionada = linhaSelecionada1;
        setLocationRelativeTo(null);
        FornecedorController fc = new FornecedorController();
        Fornecedor f = fc.listarFornecedorPorId(idFornecedor);
        //FORNECEDOR
        txIdFornecedor.setText(String.valueOf(f.getCodigo()));
        txDescricao.setText(f.getDescricao());
        txEmail.setText(f.getEmail());
        txFax.setText(f.getFax());
        txMarcaProduto.setText(f.getMarcaProduto());
        txNomeFantasia.setText(f.getNomeFantasia());
        txNomeProduto.setText(f.getNomeProduto());
        txTelefone.setText(f.getTelefone());
        //ENDEREÇO
        txCidade.setText(String.valueOf(f.getEndereco().getCidade()));
        txComplemento.setText(String.valueOf(f.getEndereco().getComplemento()));
       //COMBO txEstado.setText(String.valueOf(f.getEndereco().getEstado()));
        txNumero.setText(String.valueOf(f.getEndereco().getNumero()));
        txRua.setText(String.valueOf(f.getEndereco().getRua()));
        txIdEndereco.setText(String.valueOf(f.getEndereco().getCodigo()));
        txCep.setText(f.getEndereco().getCep());
        txBairro.setText(f.getEndereco().getBairro());
    }
    
    private void bloquearCampos() {
        
        txCep.setEditable(false);
        txCidade.setEditable(false);
        txCnpj.setEditable(false);
        txComplemento.setEditable(false);
        txDescricao.setEditable(false);
        txEmail.setEditable(false);
        cbEstado.setEditable(false);
        txFax.setEditable(false);
        txMarcaProduto.setEditable(false);
        txNomeFantasia.setEditable(false);
        txNomeProduto.setEditable(false);
        txNumero.setEditable(false);
        txRua.setEditable(false);
        txTelefone.setEditable(false);
        btLimpar.setEnabled(false);
        btSalvar.setEnabled(false);
        txBairro.setEditable(false);
        
    }
    
}

