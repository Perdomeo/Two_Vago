package view;

import exeptions.IdExistingExp;
import exeptions.ValidateIdExp;
import javax.swing.JOptionPane;
import models.Hotel;
import models.Room;
import models.StatusRoom;
import models.TypeRoom;
import models.User;
import service.ManageRoomService;
import service.ManageService;

/**
 *
 * @author William
 */
public class ManageRoomsView extends javax.swing.JFrame {
    private User loggedInUser;
    ManageRoomService manageRoomService;
    ManageService manageService;
    
    public ManageRoomsView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Manage of Rooms");
        manageRoomService = new ManageRoomService();
        manageRoomService.TypeList(cmbTypeRoom);
        manageRoomService.hotelList(cmbHotelCode);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cmbTypeRoom = new javax.swing.JComboBox<>();
        cmbHotelCode = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtIdentification = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumberPersons = new javax.swing.JTextField();
        lblText = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        mnuManage = new javax.swing.JMenuItem();
        mnuClose = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mnuUser = new javax.swing.JMenuItem();
        mnuRol = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuHotels = new javax.swing.JMenuItem();
        mnuRoom = new javax.swing.JMenuItem();
        mnuTypeRoom = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Hotel:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de habitacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Id:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 200, -1));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        btnModify.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Registrar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        cmbTypeRoom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbTypeRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel1.add(cmbTypeRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 150, -1));

        cmbHotelCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbHotelCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel1.add(cmbHotelCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad de personas:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        txtPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 200, -1));

        txtIdentification.setEditable(false);
        txtIdentification.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIdentification.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel1.add(txtIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 180, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Precio por noche:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        txtNumberPersons.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumberPersons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberPersonsKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumberPersons, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 200, -1));

        lblText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblText.setText("Titulo");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 20));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Hotel Uno (531-351).png"))); // NOI18N
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoUsuario.png"))); // NOI18N
        jMenu6.setText("Administrador");

        mnuManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/icoInicio.png"))); // NOI18N
        mnuManage.setText("Menu");
        mnuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageActionPerformed(evt);
            }
        });
        jMenu6.add(mnuManage);

        mnuClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cerrar-sesion.png"))); // NOI18N
        mnuClose.setText("Cerrar sesion");
        mnuClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCloseMouseClicked(evt);
            }
        });
        jMenu6.add(mnuClose);

        jMenuBar1.add(jMenu6);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoGestionar.png"))); // NOI18N
        jMenu3.setText("Gestionar");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoGestUsuario.png"))); // NOI18N
        jMenu4.setText("Gestionar usuarios");

        mnuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoUsuarios.png"))); // NOI18N
        mnuUser.setText("Usuarios");
        mnuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUserActionPerformed(evt);
            }
        });
        jMenu4.add(mnuUser);

        mnuRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Icopersonal.png"))); // NOI18N
        mnuRol.setText("Roles");
        mnuRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRolActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRol);

        jMenu3.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/hotel.png"))); // NOI18N
        jMenu5.setText("Gestionar hoteles");

        mnuHotels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoHotel.png"))); // NOI18N
        mnuHotels.setText("Hoteles");
        mnuHotels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHotelsActionPerformed(evt);
            }
        });
        jMenu5.add(mnuHotels);

        mnuRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoHabitacion.png"))); // NOI18N
        mnuRoom.setText("Habitaciones");
        mnuRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRoomActionPerformed(evt);
            }
        });
        jMenu5.add(mnuRoom);

        mnuTypeRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Icopasillo.png"))); // NOI18N
        mnuTypeRoom.setText("Tipo de habitaciones");
        mnuTypeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTypeRoomActionPerformed(evt);
            }
        });
        jMenu5.add(mnuTypeRoom);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (completeSpace()){
            int id = Integer.parseInt(txtId.getText());
            Hotel selectedHotel = (Hotel) cmbHotelCode.getSelectedItem();
            int hotelCode = selectedHotel.getCode();
            TypeRoom selectType = (TypeRoom) cmbTypeRoom.getSelectedItem();
            int type = selectType.getId();
            int numnberPerson = Integer.parseInt(txtNumberPersons.getText());
            float priceNigth = Float.parseFloat(txtPrice.getText());
            int status = 1;
            Hotel hotel = new Hotel(hotelCode);
            TypeRoom typeRoom = new TypeRoom(type);
            StatusRoom statusRoom = new StatusRoom(status);
            Room room = new Room(id, hotel, typeRoom, numnberPerson, priceNigth, statusRoom);
            try {
                manageRoomService.register(room);
                JOptionPane.showMessageDialog(null, "Se registro con exito");
                clean();
            } catch (IdExistingExp | ValidateIdExp ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete los campos vacios");
        }        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la identificacion a buscar");
        }else{
            int id = Integer.parseInt(txtId.getText());     
            Room room = manageRoomService.search(id);
            if (room != null) {
                txtPrice.setText(String.valueOf(room.getPriceNigth())); 
                cmbHotelCode.setSelectedItem(room.getHotelCode().getCode()); 
                cmbTypeRoom.setSelectedItem(room.getType().getType()); 
                txtIdentification.setText(String.valueOf(room.getId()));
                txtNumberPersons.setText(String.valueOf(room.getNumberPersons()));
            } else {
                JOptionPane.showMessageDialog(null, "Habitacion con ID " + id + " no existe");
                clean();
            } 
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (txtIdentification.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero la habitacion a modificar");
        }else{       
            if (completeSpace()){
            int id = Integer.parseInt(txtIdentification.getText());
            Hotel selectedHotel = (Hotel) cmbHotelCode.getSelectedItem();
            int hotelCode = selectedHotel.getCode();
            TypeRoom selectType = (TypeRoom) cmbTypeRoom.getSelectedItem();
            int type = selectType.getId();
            int numnberPerson = Integer.parseInt(txtNumberPersons.getText());
            float priceNigth = Float.parseFloat(txtPrice.getText());
            int status = 1;
            Hotel hotel = new Hotel(hotelCode);
            TypeRoom typeRoom = new TypeRoom(type);
            StatusRoom statusRoom = new StatusRoom(status);
            Room room = new Room(id, hotel, typeRoom, numnberPerson, priceNigth, statusRoom);
            try {
                manageRoomService.modify(room);
                JOptionPane.showMessageDialog(null, "Se modifico con exito");
                clean();
            } catch (ValidateIdExp ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }else{
                JOptionPane.showMessageDialog(null, "Complete los campos vacios");
            } 
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtIdentification.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero la habitacion a eliminar");
        }else{
            int id = Integer.parseInt(txtId.getText());   
            int identification = Integer.parseInt(txtIdentification.getText());
            manageRoomService.delete(id);
            JOptionPane.showMessageDialog(null, "Se elimino la habitacion: " + identification);
            clean();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtNumberPersonsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberPersonsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberPersonsKeyTyped

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

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

    public void clean(){
        // clean the boxes
        txtId.setText(""); 
        txtPrice.setText(""); 
        cmbHotelCode.setSelectedIndex(0); 
        cmbTypeRoom.setSelectedIndex(0); 
        txtIdentification.setText("");
        txtNumberPersons.setText("");
    }
    
    public boolean completeSpace() {
        // Check if required fields have any value
        boolean fieldsComplete = true;
        if (txtId.getText().isEmpty() || txtPrice.getText().isEmpty()) {
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
            java.util.logging.Logger.getLogger(ManageRoomsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbHotelCode;
    private javax.swing.JComboBox<String> cmbTypeRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
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
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtNumberPersons;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
