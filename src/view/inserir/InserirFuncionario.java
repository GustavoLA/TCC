package view.inserir;

/**
 *
 * @author User
 */
import controller.FuncionarioController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.Endereco;
import modelo.negocio.Funcionario;

public class InserirFuncionario extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int linhaSelecionada;

    //Inserir novo
    public InserirFuncionario(DefaultTableModel modelo) {
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = modelo;
    }

    //Visualizar
    public InserirFuncionario(int linhaSelecionada, int idFuncionario) {
        preencherCampos(linhaSelecionada, idFuncionario);
        bloquearCampos();
    }

    //COSTRUTOR PARA EDITAR UM FUNCIONARIO SELECIONADO
    public InserirFuncionario(DefaultTableModel modelo, int linhaSelecionada, int idFuncionario) {
        this.modelo = modelo;
        preencherCampos(linhaSelecionada, idFuncionario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        painelFundo = new javax.swing.JPanel();
        painelTopo = new javax.swing.JPanel();
        painelRodape = new javax.swing.JPanel();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        painelDadosPessoais = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        rg = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        sexo = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        dtNascimento = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        txCpf = new javax.swing.JFormattedTextField();
        txDtNascimento = new javax.swing.JFormattedTextField();
        txTelefone = new javax.swing.JFormattedTextField();
        txRg = new javax.swing.JFormattedTextField();
        painelEndereco = new javax.swing.JPanel();
        estado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        cidade = new javax.swing.JLabel();
        txCidade = new javax.swing.JTextField();
        rua = new javax.swing.JLabel();
        txRua = new javax.swing.JTextField();
        cep = new javax.swing.JLabel();
        bairro = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        txCep = new javax.swing.JFormattedTextField();
        txBairro = new javax.swing.JTextField();
        txNumero = new javax.swing.JTextField();
        complemento = new javax.swing.JLabel();
        txComplemento = new javax.swing.JTextField();
        txIdEndereco = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ctps = new javax.swing.JLabel();
        txCtps = new javax.swing.JTextField();
        salario = new javax.swing.JLabel();
        txSalario = new javax.swing.JFormattedTextField();
        dtAdmissao = new javax.swing.JLabel();
        txDtAdmissao = new javax.swing.JFormattedTextField();
        dtDemissao = new javax.swing.JLabel();
        observacao = new javax.swing.JLabel();
        txDtDemissao = new javax.swing.JFormattedTextField();
        scrollTxObservacao = new javax.swing.JScrollPane();
        txObservacao = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        txLogin = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        txSenha = new javax.swing.JPasswordField();

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
            .addGap(0, 10, Short.MAX_VALUE)
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

        painelDadosPessoais.setBackground(java.awt.Color.white);
        painelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS PESSOAIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        nome.setText("Nome*:  ");

        cpf.setText("CPF*:  ");

        rg.setText("RG*:  ");

        rbMasculino.setBackground(java.awt.Color.white);
        rbMasculino.setText("Masculino");

        rbFeminino.setBackground(java.awt.Color.white);
        rbFeminino.setText("Feminino");

        sexo.setText("Sexo:  ");

        dtNascimento.setText("Data de Nascimento:  ");

        telefone.setText("Telefone:  ");

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

        try {
            txTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelDadosPessoaisLayout = new javax.swing.GroupLayout(painelDadosPessoais);
        painelDadosPessoais.setLayout(painelDadosPessoaisLayout);
        painelDadosPessoaisLayout.setHorizontalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(telefone)
                        .addGap(18, 18, 18)
                        .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(cpf)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(rg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txRg)))))
                        .addGap(17, 17, 17)))
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(sexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbMasculino)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFeminino))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(dtNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))))
        );
        painelDadosPessoaisLayout.setVerticalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino)
                    .addComponent(sexo)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(rg)
                    .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtNascimento)
                    .addComponent(txDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefone)
                            .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        painelEndereco.setBackground(java.awt.Color.white);
        painelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENDEREÇO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        estado.setText("Estado*:  ");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cidade.setText("Cidade*:  ");

        rua.setText("Rua:  ");

        cep.setText("CEP:  ");

        bairro.setText("Bairro:  ");

        numero.setText("Número:  ");

        try {
            txCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        complemento.setText("Complemento:");

        javax.swing.GroupLayout painelEnderecoLayout = new javax.swing.GroupLayout(painelEndereco);
        painelEndereco.setLayout(painelEnderecoLayout);
        painelEnderecoLayout.setHorizontalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estado)
                    .addComponent(cidade)
                    .addComponent(rua))
                .addGap(28, 28, 28)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txCidade, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txRua, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEstado, 0, 300, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cep)
                    .addComponent(bairro)
                    .addComponent(numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complemento)
                        .addGap(10, 10, 10)
                        .addComponent(txComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addComponent(txBairro)
                    .addComponent(txCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        painelEnderecoLayout.setVerticalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cep)
                            .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEnderecoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade)
                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro)
                    .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rua)
                    .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero)
                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complemento)
                    .addComponent(txComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS PROFISSIONAIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        ctps.setText("Carteira de Trabalho*:  ");

        salario.setText("Salário*:  ");

        dtAdmissao.setText("Data de Admissão*:  ");

        try {
            txDtAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dtDemissao.setText("Data de Demissão:  ");

        observacao.setText("Observações:  ");

        try {
            txDtDemissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txObservacao.setColumns(20);
        txObservacao.setRows(5);
        scrollTxObservacao.setViewportView(txObservacao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ctps)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txCtps, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dtAdmissao)
                                .addGap(18, 18, 18)
                                .addComponent(txDtAdmissao)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(dtDemissao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txDtDemissao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(salario)
                                .addGap(18, 18, 18)
                                .addComponent(txSalario))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(observacao)
                        .addGap(47, 47, 47)
                        .addComponent(scrollTxObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctps)
                    .addComponent(txCtps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salario)
                    .addComponent(txSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtAdmissao)
                    .addComponent(dtDemissao)
                    .addComponent(txDtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDtDemissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observacao)
                    .addComponent(scrollTxObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DE ACESSO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        login.setText("Login:  ");

        senha.setText("Senha:  ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txLogin)
                .addGap(18, 18, 18)
                .addComponent(senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(565, 565, 565))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha)
                    .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addGap(109, 109, 109))
            .addComponent(painelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 733, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Funcionario f = new Funcionario();

        f.setCpf(txCpf.getText());
        f.setLogin(txLogin.getText());
        f.setRg(txRg.getText());
        f.setSenha(txSenha.getText());
        f.setTelefone(txTelefone.getText());
        f.setcTrabalho(txCtps.getText());
        f.setNome(txNome.getText());
        f.setSalario(Double.parseDouble(txSalario.getText()));
        try {
            String data = txDtAdmissao.getText();
            f.setDtAdmissao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "FORMATO INVÁLIDO! UTILIZE: DD/MM/YYYY\n" + ex);
        }
        try {
            String data = txDtDemissao.getText();
            f.setDtDemissao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "FORMATO INVÁLIDO! UTILIZE: DD/MM/YYYY\n" + ex);
        }
        try {
            String data = txDtNascimento.getText();
            f.setDtNascimento(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "FORMATO INVÁLIDO! UTILIZE: DD/MM/YYYY\n" + ex);
        }
        if (rbMasculino.isSelected()) {
            f.setSexo('M');
        } else {
            f.setSexo('F');
        }

        Endereco e = new Endereco();

        e.setCidade(txCidade.getText());
        e.setComplemento(txComplemento.getText());
        //COMBO  e.setEstado(txEstado.getText());
        e.setNumero(Integer.parseInt(txNumero.getText()));
        e.setRua(txRua.getText());
        e.setCep(txCep.getText());
        e.setBairro(txBairro.getText());
        if (!(txIdEndereco.getText().equals("") | (txIdEndereco.getText().equals(null)))) {
            e.setCodigo(Integer.parseInt(txIdEndereco.getText()));
        }
        f.setEndereco(e);

        FuncionarioController fc = new FuncionarioController();

        if (!(txId.getText().equals("") | (txId.getText().equals(null)))) {
            f.setCodigo(Integer.parseInt(txId.getText()));
            fc.salvar(f);

            modelo.removeRow(linhaSelecionada);
            modelo.addRow(new Object[]{f.getCodigo(), f.getCpf(), f.getDtAdmissao(), f.getDtDemissao(), f.getDtNascimento(), f.getLogin(), f.getNome(), f.getRg(), f.getSenha(), f.getTelefone(), f.getcTrabalho(), f.getSalario()});
            dispose();
        } else {
            fc.salvar(f);
            dispose();
        }


    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txObservacao.setText(null);
        txCpf.setText(null);
        txCtps.setText(null);
        txDtAdmissao.setText(null);
        txDtDemissao.setText(null);
        txDtNascimento.setText(null);
        txLogin.setText(null);
        txNome.setText(null);
        txSenha.setText(null);
        txTelefone.setText(null);
        txRg.setText(null);
        txSalario.setText(null);
        txCidade.setText(null);
        txComplemento.setText(null);
        // COMBO txEstado.setText(null);
        txNumero.setText(null);
        txRua.setText(null);
        txCep.setText(null);
        txBairro.setText(null);

    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel complemento;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel ctps;
    private javax.swing.JLabel dtAdmissao;
    private javax.swing.JLabel dtDemissao;
    private javax.swing.JLabel dtNascimento;
    private javax.swing.JLabel estado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel login;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel observacao;
    private javax.swing.JPanel painelDadosPessoais;
    private javax.swing.JPanel painelEndereco;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JPanel painelTopo;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JLabel rg;
    private javax.swing.JLabel rua;
    private javax.swing.JLabel salario;
    private javax.swing.JScrollPane scrollTxObservacao;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField txBairro;
    private javax.swing.JFormattedTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextField txComplemento;
    private javax.swing.JFormattedTextField txCpf;
    private javax.swing.JTextField txCtps;
    private javax.swing.JFormattedTextField txDtAdmissao;
    private javax.swing.JFormattedTextField txDtDemissao;
    private javax.swing.JFormattedTextField txDtNascimento;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txIdEndereco;
    private javax.swing.JTextField txLogin;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextArea txObservacao;
    private javax.swing.JFormattedTextField txRg;
    private javax.swing.JTextField txRua;
    private javax.swing.JFormattedTextField txSalario;
    private javax.swing.JPasswordField txSenha;
    private javax.swing.JFormattedTextField txTelefone;
    // End of variables declaration//GEN-END:variables
 private void preencherCampos(int linhaSelecionada, int idFuncionario) {
        initComponents();
        this.linhaSelecionada = linhaSelecionada;
        setLocationRelativeTo(null);

        FuncionarioController fc = new FuncionarioController();
        Funcionario f = fc.listarFuncionarioPorId(idFuncionario);

        //FUNCIONARIO
        txId.setText(String.valueOf(f.getCodigo()));
        txSalario.setText(String.valueOf(f.getSalario()));
        txCpf.setText(f.getCpf());
        txCtps.setText(f.getcTrabalho());
        txLogin.setText(f.getLogin());
        txNome.setText(f.getNome());
        txRg.setText(f.getRg());
        txSenha.setText(f.getSenha());
        txTelefone.setText(f.getTelefone());
        if (f.getSexo() == 'F') {
            rbFeminino.setSelected(true);
        } else {
            rbMasculino.setSelected(true);
        }
        SimpleDateFormat formataDtAdmissao = new SimpleDateFormat("dd/MM/yyyy");
        String dtAdmissaoEdt = formataDtAdmissao.format(f.getDtAdmissao());
        txDtAdmissao.setText(dtAdmissaoEdt);
        SimpleDateFormat formataDtDemissao = new SimpleDateFormat("dd/MM/yyyy");
        String dtDemissaoEdt = formataDtDemissao.format(f.getDtDemissao());
        txDtDemissao.setText(dtDemissaoEdt);
        SimpleDateFormat formatadtNascimento = new SimpleDateFormat("dd/MM/yyyy");
        String dtNascimentoEdt = formatadtNascimento.format(f.getDtNascimento());
        txDtNascimento.setText(dtNascimentoEdt);
        //ENDEREÇO
        txIdEndereco.setText(String.valueOf(f.getEndereco().getCodigo()));
        txNumero.setText(String.valueOf(f.getEndereco().getNumero()));
        txCidade.setText(f.getEndereco().getCidade());
        txComplemento.setText(f.getEndereco().getComplemento());
        //Combo txEstado.setText(f.getEndereco().getEstado());
        txRua.setText(f.getEndereco().getRua());
        txCep.setText(f.getEndereco().getCep());
        txBairro.setText(f.getEndereco().getCep());
    }

    private void bloquearCampos() {
        txNome.setEditable(false);
        txCep.setEditable(false);
        txCidade.setEditable(false);
        txComplemento.setEditable(false);
        txCpf.setEditable(false);
        txCtps.setEditable(false);
        txDtDemissao.setEditable(false);
        txDtNascimento.setEditable(false);
        cbEstado.setEditable(false);
        txLogin.setEditable(false);
        txNumero.setEditable(false);
        txObservacao.setEditable(false);
        txRg.setEditable(false);
        txSalario.setEditable(false);
        txRua.setEditable(false);
        txTelefone.setEditable(false);
        txDtAdmissao.setEditable(false);
        rbFeminino.setEnabled(false);
        rbMasculino.setEnabled(false);
        txSenha.setEditable(false);
        btLimpar.setEnabled(false);
        btSalvar.setEnabled(false);
        txBairro.setEnabled(false);

    }
}
