package view;

import exeptions.EmailExistingExp;
import exeptions.IdExistingExp;
import exeptions.ValidateEmailExp;
import exeptions.ValidateIdExp;
import exeptions.ValidatePhoneExp;
import javax.swing.JOptionPane;
import models.Role;
import models.User;
import service.ManageService;
import service.ManageUserService;

/**
 *
 * @author William
 */
public class ManageUserView extends javax.swing.JFrame {
    ManageUserService manageUserService;
    private User loggedInUser;
    ManageService manageService;

    public ManageUserView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestionar Usuario");
        manageUserService = new ManageUserService();
        manageUserService.roleList(cmbRole);
        manageService = new ManageService();
    }
    
    public void setLoggedInUser(User user) {
        loggedInUser = user;
        txtIdentification.setText(String.valueOf(user.getId()));
        txtName.setText(user.getName() + " " + user.getLastName());
        lblText.setText(String.valueOf(user.getId()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        cmbGenero = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JTextField();
        lblText = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtIdentification = new javax.swing.JTextField();
        cmbRole = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnuManage = new javax.swing.JMenuItem();
        mnuClose = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuUser = new javax.swing.JMenuItem();
        mnuRol = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuHotels = new javax.swing.JMenuItem();
        mnuRoom = new javax.swing.JMenuItem();
        mnuTypeRoom = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Nombre:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Genero:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Edad:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("E-mail:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Direccion de residencia:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Numero de celular:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Apellido:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 210, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 210, -1));

        txtLastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, -1));

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 210, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 210, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 210, -1));

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 210, -1));

        cmbGenero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otros" }));
        jPanel2.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 200, 30));

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 210, -1));

        lblText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblText.setText("Titulo");
        jPanel2.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Clave: ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegister.setText("Registrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 90, -1));

        btnModify.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel2.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 90, -1));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 90, -1));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 90, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Identificacion:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtIdentification.setEditable(false);
        txtIdentification.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIdentification.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel2.add(txtIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 180, 40));

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 210, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Genero:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Hotel Uno (900-600).png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoUsuario.png"))); // NOI18N
        jMenu7.setText("Administrador");

        mnuManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/icoInicio.png"))); // NOI18N
        mnuManage.setText("Menu");
        mnuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageActionPerformed(evt);
            }
        });
        jMenu7.add(mnuManage);

        mnuClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cerrar-sesion.png"))); // NOI18N
        mnuClose.setText("Cerrar sesion");
        mnuClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCloseMouseClicked(evt);
            }
        });
        jMenu7.add(mnuClose);

        jMenuBar2.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/IcoGestionar.png"))); // NOI18N
        jMenu8.setText("Gestionar");

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

        jMenu8.add(jMenu3);

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

        jMenu8.add(jMenu4);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        if (espacio){
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

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
            Role selectedRole = (Role) cmbRole.getSelectedItem();
            int selectedRoleCode = selectedRole.getCode();
            Role role = new Role(selectedRoleCode);
            User user = new User(id, name, lastName, email, genero, password, age, address, phone, role);
            try {
                manageUserService.registerUser(user);
                JOptionPane.showMessageDialog(null, "Se registro con exito");
                clean();
            } catch (IdExistingExp | EmailExistingExp | ValidateEmailExp | ValidateIdExp | ValidatePhoneExp ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete los campos vacios");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (txtIdentification.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero al usuario a modificar");
        }else{       
            if (completeSpace()){
                long id = Long.parseLong(txtIdentification.getText());
                String name = txtName.getText();
                String lastName = txtLastName.getText();
                String email = txtEmail.getText();
                String genero = cmbGenero.getSelectedItem().toString();
                String password = txtPassword.getText();
                int age = Integer.parseInt(txtAge.getText());
                String address = txtAddress.getText();
                String phone = txtPhone.getText();
                Role role = new Role("Usuario", 1);
                User user = new User(id, name, lastName, email, genero, password, age, address, phone, role);
                try {
                    manageUserService.modify(user);
                    JOptionPane.showMessageDialog(null, "Los cambios se guadaron");
                    clean();
                } catch (EmailExistingExp | ValidateEmailExp | ValidateIdExp | ValidatePhoneExp ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Complete los campos vacios");
            }
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtIdentification.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero al usuario a eliminar");
        }else{
            long id = Long.parseLong(txtId.getText());
            long identification = Long.parseLong(txtIdentification.getText());
            manageUserService.delete(id);
            JOptionPane.showMessageDialog(null, "Se elimino el usuario: " + identification);
            clean();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la identificacion a buscar");
        }else{
            long id = Long.parseLong(txtId.getText());     
            User user = manageUserService.search(id);
            if (user != null) {
                txtIdentification.setText(String.valueOf(user.getId())); 
                txtName.setText(user.getName()); 
                txtLastName.setText(user.getLastName()); 
                txtEmail.setText(user.getEmail()); 
                cmbGenero.setSelectedItem(user.getGenero()); 
                txtPassword.setText(user.getPassword()); 
                txtAge.setText(String.valueOf(user.getAge())); 
                txtAddress.setText(user.getAddress()); 
                txtPhone.setText(user.getPhone());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario con ID " + id + " no existe");
                clean();
            } 
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
        txtIdentification.setText("");
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
            java.util.logging.Logger.getLogger(ManageUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblText;
    private javax.swing.JMenu mnuClose;
    private javax.swing.JMenuItem mnuHotels;
    private javax.swing.JMenuItem mnuManage;
    private javax.swing.JMenuItem mnuRol;
    private javax.swing.JMenuItem mnuRoom;
    private javax.swing.JMenuItem mnuTypeRoom;
    private javax.swing.JMenuItem mnuUser;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
