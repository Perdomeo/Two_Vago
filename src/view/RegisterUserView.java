package view;

import exeptions.EmailExistingExp;
import exeptions.IdExistingExp;
import exeptions.ValidateEmailExp;
import exeptions.ValidateIdExp;
import exeptions.ValidatePhoneExp;
import javax.swing.JOptionPane;
import models.Role;
import models.User;
import service.RegisterUserService;

/**
 *
 * @author arper
 */
public class RegisterUserView extends javax.swing.JFrame {
    RegisterUserService userRegisterService;
    
    public RegisterUserView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registrar Usuario");
        userRegisterService = new RegisterUserService();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtReturn = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnILogin = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Identificacion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Genero:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Edad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("E-mail:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Direccion de residencia:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Numero de celular:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Apellido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 210, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 210, -1));

        txtLastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 210, -1));

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 210, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 210, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 210, -1));

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 210, -1));

        txtReturn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtReturn.setText("Atras");
        txtReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReturnActionPerformed(evt);
            }
        });
        jPanel1.add(txtReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegister.setText("Registrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 90, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Clave: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 210, -1));

        cmbGenero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otros" }));
        jPanel1.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 200, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Hotel Uno (601-525).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 520));

        mnILogin.setBorder(null);
        mnILogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoUsuario.png"))); // NOI18N
        mnILogin.setText("Iniciar sesion");
        mnILogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnILoginMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnILogin);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoHotel.png"))); // NOI18N
        jMenu3.setText("Hoteles");
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoNosotros.png"))); // NOI18N
        jMenu4.setText("Nosotros");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if (completeSpace()){
            long id = Long.parseLong(txtId.getText());
            String name = txtName.getText();
            String lastName = txtLastName.getText();
            String email = txtEmail.getText();
            String genero = cmbGenero.getSelectedItem().toString();
            String password = txtPassword.getText();
            int age = Integer.parseInt(txtAge.getText());
            String address = txtAddress.getText();
            String phone = txtPhone.getText();
            Role role = new Role(1);
            User user = new User(id, name, lastName, email, genero, password, age, address, phone, role);       
            try {
                userRegisterService.registerUser(user);
                JOptionPane.showMessageDialog(null, "Se registro con exito");
                clean();
            } catch (IdExistingExp | EmailExistingExp | ValidateEmailExp | ValidateIdExp | ValidatePhoneExp ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete los campos vacios");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;
        if (espacio || !numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        if (espacio){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        if (espacio){
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReturnActionPerformed
        LoginView view = new LoginView();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtReturnActionPerformed

    private void mnILoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnILoginMouseClicked
        LoginView view = new LoginView();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnILoginMouseClicked

    public void clean(){
        // clean the boxes
        txtId.setText(""); 
        txtName.setText(""); 
        txtLastName.setText(""); 
        txtEmail.setText(""); 
        cmbGenero.setSelectedIndex(0); 
        txtPassword.setText(""); 
        txtAge.setText(""); 
        txtAddress.setText(""); 
        txtPhone.setText(""); 
    }
    
    public boolean completeSpace() {
        // Check if required fields have any value
        boolean fieldsComplete = true;
        if (txtId.getText().isEmpty() || txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtEmail.getText().isEmpty()
            || txtPassword.getText().isEmpty() || txtAge.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhone.getText().isEmpty()) {
            fieldsComplete = false;
        }
        return fieldsComplete;
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
            java.util.logging.Logger.getLogger(RegisterUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnILogin;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JButton txtReturn;
    // End of variables declaration//GEN-END:variables
}
