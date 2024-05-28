package view;

import javax.swing.JOptionPane;
import models.User;
import service.LoginService;

/**
 *
 * @author William
 */
public class LoginView extends javax.swing.JFrame {
    LoginService loginService;
    private User loggedInUser;
    
    public LoginView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Iniciar sesion");
        loginService = new LoginService();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        lblPicture = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnHome = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Edit");
        jMenuBar1.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Correo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Clave:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        pswPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(pswPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, -1));

        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegister.setText("Registrarse");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 110, -1));

        btnReturn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReturn.setText("Atras");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        btnStart.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnStart.setText("Iniciar sesion");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Hotel Uno (531-351).png"))); // NOI18N
        jPanel1.add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        mnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/icoInicio.png"))); // NOI18N
        mnHome.setText("Inicio");
        mnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnHomeMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnHome);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoHotel.png"))); // NOI18N
        jMenu4.setText("Hoteles");
        jMenuBar2.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoNosotros.png"))); // NOI18N
        jMenu6.setText("Nosotros");
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        RegisterUserView view = new RegisterUserView();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        HomeView view = new HomeView();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        if (completeSpace()){
            String email = txtEmail.getText();
            String password = pswPassword.getText();
            User user = loginService.login(email, password);
            if (user != null) {
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete los espacios vacios");
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        if (espacio){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void pswPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswPasswordKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        if (espacio){
            evt.consume();
        }
    }//GEN-LAST:event_pswPasswordKeyTyped

    private void mnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnHomeMouseClicked
        HomeView view = new HomeView();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnHomeMouseClicked

    public boolean completeSpace(){
        boolean field = true;
        if (txtEmail.getText().isEmpty() || pswPassword.getText().isEmpty()){
            field = false;
        }
        return field;
    }
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JMenu mnHome;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
