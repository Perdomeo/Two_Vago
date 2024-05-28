package view;

import exeptions.CodeExistingExp;
import exeptions.ValidateCodeExp;
import javax.swing.JOptionPane;
import models.Role;
import models.User;
import service.ManageService;
import service.RoleUserService;

/**
 *
 * @author William
 */
public class ManageRolView extends javax.swing.JFrame {
    private User loggedInUser;
    ManageService manageService;
    RoleUserService roleUserService;

    public ManageRolView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestionar roles");
        manageService = new ManageService();
        roleUserService = new RoleUserService();
    }

    public void setLoggedInUser(User user) {
        // Assign the current user to a window attribute
        loggedInUser = user;
        // Show the name of the user on a window component
        lblText.setText(String.valueOf(user.getId()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        txtCodes = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuManage = new javax.swing.JMenuItem();
        mnuClose = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuUser = new javax.swing.JMenuItem();
        mnuRol = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuHotels = new javax.swing.JMenuItem();
        mnuRoom = new javax.swing.JMenuItem();
        mnuTypeRoom = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Codigo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rol:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        txtRol.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRolKeyTyped(evt);
            }
        });
        jPanel1.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, -1));

        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 200, -1));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Registrar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 90, -1));

        btnModify.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 90, -1));

        lblText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblText.setText("Titulo");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        txtCodes.setEditable(false);
        txtCodes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Codigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel1.add(txtCodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 180, 40));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Hotel Uno (531-351).png"))); // NOI18N
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoUsuario.png"))); // NOI18N
        jMenu1.setText("Administrador");

        mnuManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/icoInicio.png"))); // NOI18N
        mnuManage.setText("Menu");
        mnuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageActionPerformed(evt);
            }
        });
        jMenu1.add(mnuManage);

        mnuClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cerrar-sesion.png"))); // NOI18N
        mnuClose.setText("Cerrar sesion");
        mnuClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCloseMouseClicked(evt);
            }
        });
        jMenu1.add(mnuClose);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoGestionar.png"))); // NOI18N
        jMenu2.setText("Gestionar");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoGestUsuario.png"))); // NOI18N
        jMenu3.setText("Gestionar usuarios");

        mnuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoUsuarios.png"))); // NOI18N
        mnuUser.setText("Usuarios");
        mnuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUserActionPerformed(evt);
            }
        });
        jMenu3.add(mnuUser);

        mnuRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Icopersonal.png"))); // NOI18N
        mnuRol.setText("Roles");
        mnuRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRolActionPerformed(evt);
            }
        });
        jMenu3.add(mnuRol);

        jMenu2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/hotel.png"))); // NOI18N
        jMenu4.setText("Gestionar hoteles");

        mnuHotels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoHotel.png"))); // NOI18N
        mnuHotels.setText("Hoteles");
        mnuHotels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHotelsActionPerformed(evt);
            }
        });
        jMenu4.add(mnuHotels);

        mnuRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoHabitacion.png"))); // NOI18N
        mnuRoom.setText("Habitaciones");
        mnuRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRoomActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRoom);

        mnuTypeRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Icopasillo.png"))); // NOI18N
        mnuTypeRoom.setText("Tipo de habitaciones");
        mnuTypeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTypeRoomActionPerformed(evt);
            }
        });
        jMenu4.add(mnuTypeRoom);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (completeSpace()) {
            String rol = txtRol.getText();
            int code = Integer.parseInt(txtCode.getText());
            Role role = new Role(rol, code);
            try {
                roleUserService.register(role);
                JOptionPane.showMessageDialog(null, "Se registro con exito");
                clean();
            } catch (CodeExistingExp | ValidateCodeExp ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }  
        }else{
            JOptionPane.showMessageDialog(null, "Complete los campos vacios");
        }       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtCodes.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero el codigo a eliminar");
        }else{
            int code = Integer.parseInt(txtCode.getText());
            int codes = Integer.parseInt(txtCodes.getText());
            roleUserService.delete(code);
            JOptionPane.showMessageDialog(null, "Se elimino el codigo: " + codes);
            clean();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (txtCodes.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero el codigo a modificar");
        }else{       
            if (completeSpace()){
                String rol = txtRol.getText();
                int code = Integer.parseInt(txtCodes.getText());
                Role role = new Role(rol, code);
                try {
                    roleUserService.modify(role);
                    JOptionPane.showMessageDialog(null, "Los cambios se guadaron");
                    clean();
                } catch (ValidateCodeExp ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Complete los campos vacios");
            }
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo a buscar");
        }else{
            int code = Integer.parseInt(txtCode.getText());     
            Role role = roleUserService.search(code);
            if (role != null) {
                txtCodes.setText(String.valueOf(role.getCode())); 
                txtRol.setText(role.getRole()); 
            } else {
                JOptionPane.showMessageDialog(null, "El rol con code: " + code + " no existe");
                clean();
            } 
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodeKeyTyped

    private void txtRolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRolKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtRolKeyTyped

    private void mnuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.manageWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuManageActionPerformed

    private void mnuCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCloseMouseClicked
        LoginView view = new LoginView();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuCloseMouseClicked

    private void mnuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUserActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.userWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuUserActionPerformed

    private void mnuRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRolActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.rolesWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuRolActionPerformed

    private void mnuHotelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHotelsActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.hotelWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuHotelsActionPerformed

    private void mnuRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRoomActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.roomWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuRoomActionPerformed

    private void mnuTypeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTypeRoomActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.roomTypeWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuTypeRoomActionPerformed

    public void clean (){
        txtCode.setText("");
        txtRol.setText("");
        txtCodes.setText("");
    }
    public boolean completeSpace(){
         // Check if required fields have any value
        boolean fieldsComplete = true;
        if (txtCode.getText().isEmpty() || txtRol.getText().isEmpty()) {
            fieldsComplete = false;
        }
        return fieldsComplete;   
    }

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
            java.util.logging.Logger.getLogger(ManageRolView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRolView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRolView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRolView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRolView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblText;
    private javax.swing.JMenu mnuClose;
    private javax.swing.JMenuItem mnuHotels;
    private javax.swing.JMenuItem mnuManage;
    private javax.swing.JMenuItem mnuRol;
    private javax.swing.JMenuItem mnuRoom;
    private javax.swing.JMenuItem mnuTypeRoom;
    private javax.swing.JMenuItem mnuUser;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCodes;
    private javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables
}
