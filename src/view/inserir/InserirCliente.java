package view.inserir;

import controller.ClienteController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.Cliente;
import modelo.negocio.Endereco;


public class InserirCliente extends javax.swing.JFrame {
    
    private DefaultTableModel modelo;
    private int linhaSelecionada;

    //INSERIR NOVO 
    public InserirCliente(DefaultTableModel modelo) {
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = modelo;
    }

    //EDITAR LINHA SELECIONADA
    public InserirCliente(DefaultTableModel modelo, int linhaSelecionada, int idCliente) {
        this.modelo = modelo;
        PreencherCampos(linhaSelecionada, idCliente);
    }

    //VISUALIZAR LINHA SELECIONADA
    public InserirCliente(int linhaSelecionada, int idCliente) {
        PreencherCampos(linhaSelecionada, idCliente);
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

        bgSexo = new javax.swing.ButtonGroup();
        painelFundo = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        cadastroCliente = new javax.swing.JTabbedPane();
        dadosPessoais = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        rg = new javax.swing.JLabel();
        dtNascimento = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txRg = new javax.swing.JFormattedTextField();
        txCpf = new javax.swing.JFormattedTextField();
        txDtNascimento = new javax.swing.JFormattedTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        email = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        celular = new javax.swing.JLabel();
        dtCadastro = new javax.swing.JLabel();
        anotacoes = new javax.swing.JLabel();
        scrollAnotacoes = new javax.swing.JScrollPane();
        txAnotacoes = new javax.swing.JTextPane();
        id = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        txCelular = new javax.swing.JFormattedTextField();
        txDtCadastro = new javax.swing.JFormattedTextField();
        endereco = new javax.swing.JPanel();
        rua = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        txRua = new javax.swing.JTextField();
        cep = new javax.swing.JLabel();
        txNumero = new javax.swing.JTextField();
        txEstado = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txCep = new javax.swing.JFormattedTextField();
        idEndereco = new javax.swing.JLabel();
        txIdEndereco = new javax.swing.JTextField();
        complemento = new javax.swing.JLabel();
        TxComplemento = new javax.swing.JTextField();
        bairro = new javax.swing.JLabel();
        txBairro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(0, 153, 153));
        painelFundo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), java.awt.Color.white)); // NOI18N

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

        cadastroCliente.setBackground(java.awt.Color.white);

        dadosPessoais.setBackground(java.awt.Color.white);

        nome.setText("NOME *");

        telefone.setText("TELEFONE * ");

        cpf.setText("CPF *");

        rg.setText("RG  *");

        dtNascimento.setText("DATA DE NASCIMENTO");

        sexo.setText("SEXO");

        try {
            txRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRgActionPerformed(evt);
            }
        });

        try {
            txCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        bgSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        email.setText("EMAIL");

        celular.setText("CELULAR");

        dtCadastro.setText("DATA DE  CADASTRO  *");

        anotacoes.setText("ANOTAÇÕES");

        scrollAnotacoes.setViewportView(txAnotacoes);

        id.setText("ID");

        txId.setEditable(false);

        try {
            txCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txDtCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout dadosPessoaisLayout = new javax.swing.GroupLayout(dadosPessoais);
        dadosPessoais.setLayout(dadosPessoaisLayout);
        dadosPessoaisLayout.setHorizontalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollAnotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dadosPessoaisLayout.createSequentialGroup()
                            .addComponent(id)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dadosPessoaisLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sexo)
                                .addComponent(email)
                                .addComponent(celular)
                                .addComponent(dtNascimento)
                                .addComponent(rg)
                                .addComponent(cpf)
                                .addComponent(telefone)
                                .addComponent(nome)
                                .addComponent(anotacoes)
                                .addComponent(dtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)
                            .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                    .addComponent(rbMasculino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbFeminino))
                                .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 141, Short.MAX_VALUE))
        );
        dadosPessoaisLayout.setVerticalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rg)
                    .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtNascimento)
                    .addComponent(txDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celular)
                    .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtCadastro)
                    .addComponent(txDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anotacoes)
                    .addComponent(scrollAnotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cadastroCliente.addTab("DADOS PESSOAIS ", dadosPessoais);

        endereco.setBackground(java.awt.Color.white);

        rua.setText("RUA *");

        numero.setText("NÚMERO *");

        estado.setText("ESTADO *");

        cidade.setText("CIDADE *");

        cep.setText("CEP ");

        txEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEstadoActionPerformed(evt);
            }
        });

        idEndereco.setText("ID");

        txIdEndereco.setEditable(false);

        complemento.setText("COMPLEMENTO");

        bairro.setText("BAIRRO");

        javax.swing.GroupLayout enderecoLayout = new javax.swing.GroupLayout(endereco);
        endereco.setLayout(enderecoLayout);
        enderecoLayout.setHorizontalGroup(
            enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enderecoLayout.createSequentialGroup()
                        .addComponent(idEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enderecoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(enderecoLayout.createSequentialGroup()
                                .addComponent(complemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enderecoLayout.createSequentialGroup()
                                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado)
                                    .addComponent(cidade)
                                    .addComponent(cep)
                                    .addComponent(bairro))
                                .addGap(58, 58, 58)
                                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                    .addComponent(txCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                    .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))))
                            .addGroup(enderecoLayout.createSequentialGroup()
                                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rua)
                                    .addComponent(numero))
                                .addGap(55, 55, 55)
                                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        enderecoLayout.setVerticalGroup(
            enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complemento))
                .addGap(30, 30, 30)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rua))
                .addGap(30, 30, 30)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero)
                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado))
                .addGap(30, 30, 30)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade)
                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep)
                    .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairro)
                    .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEndereco)
                    .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        cadastroCliente.addTab("ENDEREÇO", endereco);

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(34, 34, 34)
                .addComponent(btLimpar)
                .addGap(61, 61, 61))
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroCliente)
                .addContainerGap())
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar))
                .addGap(24, 24, 24))
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

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        Cliente c = new Cliente();

        //CLIENTE
        c.setAnotacoes(txAnotacoes.getText());
        c.setCelular(txCelular.getText());
        c.setCpf(txCpf.getText());
        c.setEmail(txEmail.getText());
        c.setNome(txNome.getText());
        c.setRg(txRg.getText());
        c.setTelefone(txTelefone.getText());
        
        try {
            String data = txDtCadastro.getText();
            c.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "FORMATO INVÁLIDO! UTILIZE DD/MM/YYYY\n" + ex);
        }
        try {
            String data = txDtNascimento.getText();
            c.setDtNascimento(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "FORMATO INVÁLIDO! UTILIZE DD/MM/YYYY\n" + ex);
        }
        
        if (rbMasculino.isSelected()) {
            c.setSexo('M');
        } else {
            c.setSexo('F');
        }
        
        Endereco e = new Endereco();
        
        e.setCidade(txCidade.getText());
        e.setComplemento(TxComplemento.getText());
        e.setEstado(txEstado.getText());
        e.setNumero(Integer.parseInt(txNumero.getText()));
        e.setRua(txRua.getText());
        e.setCep(txCep.getText());
        e.setBairro(txBairro.getText());
        if (!(txIdEndereco.getText().equals("") | (txIdEndereco.getText().equals(null)))) {
            e.setCodigo(Integer.parseInt(txIdEndereco.getText()));
        }
        c.setEndereco(e);
        
        ClienteController cc = new ClienteController();
        
        if (!(txId.getText().equals("") | (txId.getText().equals(null)))) {
            c.setCodigo(Integer.parseInt(txId.getText()));
            cc.salvar(c);
            
            modelo.removeRow(linhaSelecionada);
            modelo.addRow(new Object[]{c.getCodigo(), c.getAnotacoes(), c.getCelular(), c.getCpf(), c.getDtCadastro(), c.getDtNascimento(), c.getEmail(), c.getNome(), c.getRg(), c.getTelefone()});
            dispose();
        } else {
            cc.salvar(c);
            dispose();
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        
        txAnotacoes.setText(null);
        txCelular.setText(null);
        txCpf.setText(null);
        txDtCadastro.setText(null);
        txDtNascimento.setText(null);
        txEmail.setText(null);
        txNome.setText(null);
        txRg.setText(null);
        txTelefone.setText(null);
        
        txCidade.setText(null);
        TxComplemento.setText(null);
        txEstado.setText(null);
        txNumero.setText(null);
        txRua.setText(null);
        txCep.setText(null);
        txBairro.setText(null);

    }//GEN-LAST:event_btLimparActionPerformed

    private void txRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txRgActionPerformed

    private void txEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxComplemento;
    private javax.swing.JLabel anotacoes;
    private javax.swing.JLabel bairro;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTabbedPane cadastroCliente;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel complemento;
    private javax.swing.JLabel cpf;
    private javax.swing.JPanel dadosPessoais;
    private javax.swing.JLabel dtCadastro;
    private javax.swing.JLabel dtNascimento;
    private javax.swing.JLabel email;
    private javax.swing.JPanel endereco;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idEndereco;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JLabel rg;
    private javax.swing.JLabel rua;
    private javax.swing.JScrollPane scrollAnotacoes;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextPane txAnotacoes;
    private javax.swing.JTextField txBairro;
    private javax.swing.JFormattedTextField txCelular;
    private javax.swing.JFormattedTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JFormattedTextField txCpf;
    private javax.swing.JFormattedTextField txDtCadastro;
    private javax.swing.JFormattedTextField txDtNascimento;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEstado;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txIdEndereco;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNumero;
    private javax.swing.JFormattedTextField txRg;
    private javax.swing.JTextField txRua;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables

    private void PreencherCampos(int linhaSelecionada1, int idCliente) {
        initComponents();
        this.linhaSelecionada = linhaSelecionada1;
        setLocationRelativeTo(null);
        ClienteController cc = new ClienteController();
        Cliente c = cc.listarClientePorId(idCliente);
        //CLIENTE
        txId.setText(String.valueOf(c.getCodigo()));
        txAnotacoes.setText(c.getAnotacoes());
        txCelular.setText(c.getCelular());
        txCpf.setText(c.getCpf());
        txEmail.setText(c.getEmail());
        txNome.setText(c.getNome());
        txRg.setText(c.getRg());
        txTelefone.setText(c.getTelefone());
        SimpleDateFormat formataDtCadastro = new SimpleDateFormat("dd/MM/yyyy");
        String dtCadastroEdt = formataDtCadastro.format(c.getDtCadastro());
        txDtCadastro.setText(dtCadastroEdt);
        SimpleDateFormat formataDtNascimento = new SimpleDateFormat("dd/MM/yyyy");
        String dtNascimentoEdt = formataDtNascimento.format(c.getDtNascimento());
        txDtNascimento.setText(dtNascimentoEdt);
        if (c.getSexo() == 'F') {
            rbFeminino.setSelected(true);
        } else {
            rbMasculino.setSelected(true);
        }
        //ENDEREÇO
        txIdEndereco.setText(String.valueOf(c.getEndereco().getCodigo()));
        txNumero.setText(String.valueOf(c.getEndereco().getNumero()));
        txCidade.setText(c.getEndereco().getCidade());
        TxComplemento.setText(c.getEndereco().getComplemento());
        txEstado.setText(c.getEndereco().getEstado());
        txRua.setText(c.getEndereco().getRua());
        txCep.setText(c.getEndereco().getCep());
        txBairro.setText(c.getEndereco().getBairro());
        
    }
    
    private void bloquearCampos() {
        
        TxComplemento.setEditable(false);
        txAnotacoes.setEditable(false);
        txCelular.setEditable(false);
        txCelular.setEditable(false);
        txCep.setEditable(false);
        txCidade.setEditable(false);
        txCpf.setEditable(false);
        txDtCadastro.setEditable(false);
        txDtNascimento.setEditable(false);
        txEmail.setEditable(false);
        txEstado.setEditable(false);
        txNome.setEditable(false);
        txNumero.setEditable(false);
        txRg.setEditable(false);
        txRua.setEditable(false);
        txTelefone.setEditable(false);
        rbFeminino.setEnabled(false);
        rbMasculino.setEnabled(false);
        btLimpar.setEnabled(false);
        btSalvar.setEnabled(false);
        txBairro.setEditable(false);
    }
}
