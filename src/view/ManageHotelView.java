package view;

import exeptions.CodeExistingExp;
import exeptions.ValidateCodeExp;
import javax.swing.JOptionPane;
import models.Hotel;
import models.User;
import service.HotelService;
import service.ManageService;

/**
 *
 * @author William
 */
public class ManageHotelView extends javax.swing.JFrame {
    private User loggedInUser;
    HotelService hotelService;
    ManageService manageService;
    
    public ManageHotelView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestionas Hoteles");
        hotelService = new HotelService();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCancel = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPriceNight = new javax.swing.JTextField();
        txtAmenities = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cmbClasification = new javax.swing.JComboBox<>();
        lblText = new javax.swing.JLabel();
        txtCodes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblPicture = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
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
        jLabel1.setText("Ciudad:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Politicas de cancelacion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Direccion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Precio por noche:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Comodidades:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Clasificacion:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Codigo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 160, -1));

        txtCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCityKeyTyped(evt);
            }
        });
        jPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 160, -1));

        txtCancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 160, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, -1));

        txtPriceNight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPriceNight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceNightKeyTyped(evt);
            }
        });
        jPanel1.add(txtPriceNight, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 160, -1));

        txtAmenities.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtAmenities, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 160, -1));

        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 160, -1));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        btnModify.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Registrar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        cmbClasification.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbClasification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cmbClasification.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estrellas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel1.add(cmbClasification, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 150, 60));

        lblText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblText.setText("Titulo");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        txtCodes.setEditable(false);
        txtCodes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Codigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel1.add(txtCodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 180, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Generar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Hotel Uno (601-525).png"))); // NOI18N
        jPanel1.add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (completeSpace()){
            int code = Integer.parseInt(txtCode.getText());
            String name = txtName.getText();
            String city = txtCity.getText();
            String cancellation = txtCancel.getText();
            String address = txtAddress.getText();
            int rating =  Integer.parseInt(cmbClasification.getSelectedItem().toString());
            float priceNight = Float.parseFloat(txtPriceNight.getText());
            String amenities =  txtAmenities.getText();
            Hotel hotel = new Hotel(code, name, city, address, rating, priceNight, amenities, cancellation);
            try{
                hotelService.register(hotel);
                clean();
            }catch (CodeExistingExp | ValidateCodeExp ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete los campos vacios");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo a buscar");
        }else{
            int code = Integer.parseInt(txtCode.getText());     
            Hotel hotel = hotelService.search(code);
            if (hotel != null) {
                txtAddress.setText(hotel.getAddress()); 
                txtName.setText(hotel.getName()); 
                txtAmenities.setText(hotel.getAmenities()); 
                txtCity.setText(hotel.getCity()); 
                txtCodes.setText(String.valueOf(hotel.getCode())); 
                txtPriceNight.setText(String.valueOf(hotel.getPriceNight())); 
                cmbClasification.setSelectedItem(String.valueOf(hotel.getRating()));
                txtCancel.setText(hotel.getCancellationPolicy()); 
            } else {
                JOptionPane.showMessageDialog(null, "El Hotel con code: " + code + " no existe");
                clean();
            } 
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (txtCodes.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero al usuario a modificar");
        }else{       
            if (completeSpace()){
                int code = Integer.parseInt(txtCodes.getText());
                String name = txtName.getText();
                String city = txtCity.getText();
                String cancellation = txtCancel.getText();
                String address = txtAddress.getText();
                int rating =  Integer.parseInt(cmbClasification.getSelectedItem().toString());
                float priceNight = Float.parseFloat(txtPriceNight.getText());
                String amenities =  txtAmenities.getText();
                Hotel hotel = new Hotel(code, name, city, address, rating, priceNight, amenities, cancellation);
                try {
                    hotelService.modify(hotel);
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtCodes.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero al usuario a eliminar");
        }else{
            int code = Integer.parseInt(txtCode.getText());
            int codes = Integer.parseInt(txtCodes.getText());
            hotelService.delete(code);
            JOptionPane.showMessageDialog(null, "Se elimino el hotel: " + codes);
            clean();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodeKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtCityKeyTyped

    private void txtPriceNightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceNightKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceNightKeyTyped

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

    private void mnuCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCloseMouseClicked
        LoginView view = new LoginView();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuCloseMouseClicked

    private void mnuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageActionPerformed
        long id = Long.parseLong(lblText.getText());
        User user = manageService.manageWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_mnuManageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hotelService.pdfHoteles();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void clean(){
        // clean the boxes
        txtAddress.setText(""); 
        txtName.setText(""); 
        txtAmenities.setText(""); 
        txtCity.setText(""); 
        txtCode.setText(""); 
        txtCodes.setText(""); 
        txtPriceNight.setText(""); 
        cmbClasification.setSelectedIndex(0);
        txtCancel.setText("");
     }
    
    public boolean completeSpace() {
        // Check if required fields have any value
        boolean fieldsComplete = true;
        if (txtAddress.getText().isEmpty() || txtName.getText().isEmpty() || txtAmenities.getText().isEmpty() || txtCity.getText().isEmpty()
            || txtCode.getText().isEmpty() || txtPriceNight.getText().isEmpty() || txtCancel.getText().isEmpty()) {
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
            java.util.logging.Logger.getLogger(ManageHotelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageHotelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageHotelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageHotelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageHotelView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbClasification;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblText;
    private javax.swing.JMenu mnuClose;
    private javax.swing.JMenuItem mnuHotels;
    private javax.swing.JMenuItem mnuManage;
    private javax.swing.JMenuItem mnuRol;
    private javax.swing.JMenuItem mnuRoom;
    private javax.swing.JMenuItem mnuTypeRoom;
    private javax.swing.JMenuItem mnuUser;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAmenities;
    private javax.swing.JTextField txtCancel;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCodes;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPriceNight;
    // End of variables declaration//GEN-END:variables
}
