package view;

import models.User;
import service.ManageService;


/**
 *
 * @author arper
 */
public class ManageView extends javax.swing.JFrame {
    private User loggedInUser;
    ManageService manageService;

    public ManageView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administrador");
        manageService = new ManageService();
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
        lblText1 = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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

        lblText1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblText1.setText("Administradro:");
        jPanel1.add(lblText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 20));

        lblText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblText.setText("Titulo");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Hotel Uno (900-600).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

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

    private void mnuCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCloseMouseClicked
        LoginView view = new LoginView();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuCloseMouseClicked

    private void mnuRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRoomActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.roomWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuRoomActionPerformed

    private void mnuHotelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHotelsActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.hotelWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuHotelsActionPerformed

    private void mnuTypeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTypeRoomActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.roomTypeWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuTypeRoomActionPerformed

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

    private void mnuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.manageWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuManageActionPerformed

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
            java.util.logging.Logger.getLogger(ManageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblText1;
    private javax.swing.JMenu mnuClose;
    private javax.swing.JMenuItem mnuHotels;
    private javax.swing.JMenuItem mnuManage;
    private javax.swing.JMenuItem mnuRol;
    private javax.swing.JMenuItem mnuRoom;
    private javax.swing.JMenuItem mnuTypeRoom;
    private javax.swing.JMenuItem mnuUser;
    // End of variables declaration//GEN-END:variables
}
