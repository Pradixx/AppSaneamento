/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author diegu
 */
public class TelaInstituicaoUs extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaInstituicaoUs() {
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

        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 30));

        jTextArea1.setBackground(new java.awt.Color(131, 181, 229));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("A organização Water Basic! é uma ONG que atua na promoção da saúde pública e defesa dos direitos das comunidades vulneráveis. Em resposta às necessidades urgentes de acesso a saneamento básico, a ONG desenvolveu um aplicativo inovador, chamado \"Water Basic, That's the least\", que permite que cidadãos relatem, em tempo real, problemas relacionados à falta de infraestrutura de saneamento, como esgoto a céu aberto, falta de água potável, e áreas com alagamentos frequentes.  O Water Basic, That's the least foi projetado com foco na acessibilidade, permitindo que qualquer pessoa, mesmo com poucos recursos tecnológicos, possa utilizá-lo para fazer denúncias. O app utiliza uma interface simples, onde o usuário pode adicionar descrições dos problemas observados e marcar a localização. Após a submissão da denúncia, a equipe do Water Basic! trabalha em parceria com órgãos públicos e outras ONGs para garantir que as autoridades locais sejam notificadas e as medidas necessárias sejam tomadas para resolver o problema.  Além de facilitar o envio de denúncias, o aplicativo também oferece uma plataforma de doações, onde os usuários podem ajudar com dinheiro pessoas que estão passando por necessidades vulneráveis. Isso promove transparência e engajamento cívico, fortalecendo a voz das comunidades afetadas pela falta de saneamento.  Com o \"Water Basic, That's the least\", a Water Basic não apenas oferece uma solução tecnológica para um problema social crítico, mas também empodera cidadãos, promovendo a justiça ambiental e o direito universal a um ambiente saudável e seguro.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 440, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Tela da instituicao Water.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipalUs principal = new TelaPrincipalUs();
        this.dispose();  // Fecha a tela de login
        principal.setVisible(true);  // Abre a próxima tela
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInstituicaoUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInstituicaoUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInstituicaoUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInstituicaoUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInstituicaoUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
