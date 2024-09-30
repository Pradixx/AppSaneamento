/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import Beans.Cadastro;
import DAO.CadastroDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author diegu
 */
public class TelaCadastroUs extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaCadastroUs() {
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

        btnCadastrar = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 540, 90));

        txtUsername.setBackground(new java.awt.Color(25, 95, 161));
        txtUsername.setBorder(null);
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 430, 20));

        txtNome.setBackground(new java.awt.Color(25, 95, 161));
        txtNome.setBorder(null);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 430, 20));

        txtSobrenome.setBackground(new java.awt.Color(25, 95, 161));
        txtSobrenome.setBorder(null);
        getContentPane().add(txtSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 430, 20));

        txtIdade.setBackground(new java.awt.Color(25, 95, 161));
        txtIdade.setBorder(null);
        getContentPane().add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 430, 20));

        txtEmail.setBackground(new java.awt.Color(25, 95, 161));
        txtEmail.setBorder(null);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 334, 430, 20));

        txtSenha.setBackground(new java.awt.Color(25, 95, 161));
        txtSenha.setBorder(null);
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 430, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Tela de Cadastro Water.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String username = txtUsername.getText();
        String nome = txtNome.getText();
        String sobrenome = txtSobrenome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String email = txtEmail.getText();
        String senha = txtSenha.getText();
        
        Cadastro c = new Cadastro();
        c.setUsername(username);
        c.setNome(nome);
        c.setSobrenome(sobrenome);
        c.setIdade(idade);
        c.setEmail(email);
        c.setSenha(senha);
        
        CadastroDAO cadastroDAO = new CadastroDAO();
        cadastroDAO.cadastrarUsuario(c);
        
        txtUsername.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        txtIdade.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        
        TelaLogin telaLogin = new TelaLogin();
        this.dispose();
        telaLogin.setVisible(true);
        
        JOptionPane.showMessageDialog(this, "Cadastro bem-sucedido!" );
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
