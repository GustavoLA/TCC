/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FuncionarioController;
import javax.swing.JOptionPane;
import modelo.negocio.Funcionario;
import modelo.util.Acesso;
import view.listas.ListarFuncionario;

/**
 *
 * @author gustavo_lourenco
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public Login() {
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

        PainelFunco = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        txLogin = new javax.swing.JTextField();
        txSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login.setText("LOGIN");

        Senha.setText("SENHA");

        btEntrar.setText("ENTRAR");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelFuncoLayout = new javax.swing.GroupLayout(PainelFunco);
        PainelFunco.setLayout(PainelFuncoLayout);
        PainelFuncoLayout.setHorizontalGroup(
            PainelFuncoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFuncoLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(PainelFuncoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelFuncoLayout.createSequentialGroup()
                        .addComponent(Senha)
                        .addGap(18, 18, 18)
                        .addComponent(txSenha))
                    .addGroup(PainelFuncoLayout.createSequentialGroup()
                        .addComponent(Login)
                        .addGap(18, 18, 18)
                        .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFuncoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEntrar)
                .addGap(49, 49, 49))
        );
        PainelFuncoLayout.setVerticalGroup(
            PainelFuncoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFuncoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(PainelFuncoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PainelFuncoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha)
                    .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btEntrar)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelFunco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelFunco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String login;
        String senha;
        login = txLogin.getText();
        senha = txSenha.getText();
        FuncionarioController fc = new FuncionarioController();
        Funcionario f = fc.verificaLoginSenha(login, senha);
        if (f != null) {
            Principal p = new Principal();
            p.setVisible(true);
            dispose();
            Acesso.setFuncionarioLogado(f);
        } else {
            JOptionPane.showMessageDialog(null, "USUARIO/SENHA INVALIDO");
        }
    }//GEN-LAST:event_btEntrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JPanel PainelFunco;
    private javax.swing.JLabel Senha;
    private javax.swing.JButton btEntrar;
    private javax.swing.JTextField txLogin;
    private javax.swing.JPasswordField txSenha;
    // End of variables declaration//GEN-END:variables
}
