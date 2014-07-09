package view.listas;

import controller.ClienteController;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.negocio.Cliente;
import modelo.util.Acesso;
import view.inserir.InserirCliente;

public class ListarCliente extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarCliente() {
        initComponents();
        criaJTable();
        painelLista.setViewportView(tabela);
        setLocationRelativeTo(null);
        //Tá bonito agora
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
        painelLista = new javax.swing.JScrollPane();
        btDeletar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        txPesquisa = new javax.swing.JTextField();
        funcionarioLogado = new javax.swing.JLabel();
        pesquisar = new javax.swing.JLabel();
        btVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        painelFundo.setBackground(new java.awt.Color(255, 255, 153));
        painelFundo.setBorder(javax.swing.BorderFactory.createTitledBorder("FUNCIONÁRIOS"));
        painelFundo.setMaximumSize(new java.awt.Dimension(800, 600));
        painelFundo.setMinimumSize(new java.awt.Dimension(800, 600));
        painelFundo.setPreferredSize(new java.awt.Dimension(800, 600));

        painelLista.setMaximumSize(new java.awt.Dimension(400, 400));
        painelLista.setMinimumSize(new java.awt.Dimension(400, 400));
        painelLista.setPreferredSize(new java.awt.Dimension(400, 400));
        painelLista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                painelListaFocusGained(evt);
            }
        });

        btDeletar.setText("DELETAR");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btInserir.setText("NOVO");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        txPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaActionPerformed(evt);
            }
        });

        pesquisar.setText("PESQUISAR");

        btVisualizar.setText("VISUALIZAR");
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(funcionarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(pesquisar)
                        .addGap(18, 18, 18)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txPesquisa)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(btVisualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btDeletar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar))
                .addGap(18, 18, 18)
                .addComponent(painelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(funcionarioLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar)
                    .addComponent(btDeletar)
                    .addComponent(btVisualizar))
                .addGap(224, 224, 224))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirCliente inserir = new InserirCliente(modelo);
        inserir.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        int linhaSelecionada = -1;

        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int idCliente = (int) tabela.getValueAt(linhaSelecionada, 0);
            ClienteController cc = new ClienteController();
            InserirCliente editar = new InserirCliente(modelo, linhaSelecionada, idCliente);
            editar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UM CLIENTE");
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            ClienteController cc = new ClienteController();
            if (cc.excluir(id));
            {
                modelo.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UM CLIENTE");
        }
    }//GEN-LAST:event_btDeletarActionPerformed

    private void painelListaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_painelListaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_painelListaFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        modelo.setNumRows(0);
        //Metodo para atualizar a lista quando for acrescentado outro item
        preencherJTable();

    }//GEN-LAST:event_formWindowGainedFocus

    private void txPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaActionPerformed
        modelo.setNumRows(0);
        ClienteController cc = new ClienteController();

        for (Cliente c : cc.pesquisar(txPesquisa.getText(), txPesquisa.getText(), txPesquisa.getText())) {
            modelo.addRow(new Object[]{c.getCodigo(), c.getNome(), c.getCpf(), c.getDtNascimento(), c.getTelefone()});
        }

    }//GEN-LAST:event_txPesquisaActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        int linhaSelecionada = -1;

        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int idCliente = (int) tabela.getValueAt(linhaSelecionada, 0);
            ClienteController cc = new ClienteController();
            InserirCliente visualizar = new InserirCliente(linhaSelecionada, idCliente);
            visualizar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA");
        }
    }//GEN-LAST:event_btVisualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JLabel funcionarioLogado;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JScrollPane painelLista;
    private javax.swing.JLabel pesquisar;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables

    private void criaJTable() {

        tabela = new JTable(modelo) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("ID");
        modelo.addColumn("NOME");
        modelo.addColumn("CPF");
        modelo.addColumn("TELEFONE");

        preencherJTable();
    }

    private void preencherJTable() {

        ClienteController cc = new ClienteController();

        for (Cliente c : cc.listarCliente()) {
            modelo.addRow(new Object[]{c.getCodigo(), c.getNome(), c.getCpf(), c.getTelefone()});

        }

    }
}
