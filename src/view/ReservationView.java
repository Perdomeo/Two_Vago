package view;

import exeptions.CodeExistingExp;
import exeptions.ValidateCodeExp;
import exeptions.ValidateIdExp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Hotel;
import models.Reservation;
import models.Room;
import models.User;
import service.ReservationService;

/**
 *
 * @author William
 */
public class ReservationView extends javax.swing.JFrame {
    ReservationService reservationService;;
    private User loggedInUser;
    
    public ReservationView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reservation");
        reservationService = new ReservationService();
        reservationService.setMinimumDateToday(dateEntry, dateDeparture);
        reservationService.hotelList(cmbHotel);
        reservationService.fillTable(tblHotel);
        reservationService.organizeTable(tblHotel);
        disableTextEditing();
    }
    
    private void disableTextEditing() {
        dateEntry.getDateEditor().setEnabled(false);
        dateDeparture.getDateEditor().setEnabled(false);
    }
    
    public void setLoggedInUser(User user) {
        loggedInUser = user;
        txtIdentification.setText(String.valueOf(user.getId()));
        txtName.setText(user.getName() + " " + user.getLastName());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdentification = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNumberPersons = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        dateDeparture = new com.toedter.calendar.JDateChooser();
        dateEntry = new com.toedter.calendar.JDateChooser();
        txtTotalPrice = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        cmbHotel = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmbRoom = new javax.swing.JComboBox<>();
        btnPdf = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHotel = new javax.swing.JTable();
        lblPicture = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Codigo de la reserva:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Hotel:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad de personas:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de entrada:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Costo total:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtIdentification.setEditable(false);
        txtIdentification.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIdentification.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));
        txtIdentification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificationKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 210, -1));

        txtNumberPersons.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumberPersons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberPersonsKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumberPersons, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, -1));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 350, 90, -1));

        btnModify.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Cancelar reserva");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 140, -1));

        btnReserve.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReserve.setText("Reservar");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });
        jPanel1.add(btnReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 90, -1));

        btnReturn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReturn.setText("Atras");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 90, -1));

        dateDeparture.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, -1));

        dateEntry.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 210, -1));

        txtTotalPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPriceKeyTyped(evt);
            }
        });
        jPanel1.add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 210, -1));

        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, -1));

        cmbHotel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHotelActionPerformed(evt);
            }
        });
        jPanel1.add(cmbHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 210, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Fecha de salida");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        cmbRoom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(cmbRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, -1));

        btnPdf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPdf.setText("Generar PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        jPanel1.add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Habitacion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtCod.setEditable(false);
        txtCod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCod.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Codigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 180, 40));

        tblHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHotelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHotel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Hotel Uno (900-600).png"))); // NOI18N
        jPanel1.add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
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

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (reservationService.validateDate(dateEntry, dateDeparture)) {
            if (completeSpace()) {
                int code;
                do {
                    Random random = new Random();
                    code = random.nextInt(10000);
                } while (reservationService.duplicateCode(code));
                Hotel selectHotel = (Hotel) cmbHotel.getSelectedItem();
                int idHotel = selectHotel.getCode();
                Room selectRoom = (Room) cmbRoom.getSelectedItem();
                int idRoom = selectRoom.getId();
                long idUser = Long.parseLong(txtIdentification.getText());
                int numberPerson = Integer.parseInt(txtNumberPersons.getText());
                String dateEntryString = dateFormat.format(dateEntry.getDate());
                String dateDepartureString = dateFormat.format(dateDeparture.getDate());
                float totalPrice = Float.parseFloat(txtTotalPrice.getText());
                String condition = "Activa";
                Hotel hotel = new Hotel(idHotel);
                Room room = new Room(idRoom);
                User user = new User(idUser);
                Reservation reservation = new Reservation(code, hotel, room, user, numberPerson, dateEntryString, dateDepartureString, totalPrice, condition);
                try {
                    reservationService.register(reservation);
                    JOptionPane.showMessageDialog(null, "Se registró con éxito");
                } catch (CodeExistingExp | ValidateCodeExp | ValidateIdExp ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Complete los espacios en blanco");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha de salida debe ser posterior a la fecha de entrada.");
        }
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (txtCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de la resreva a buscar");
        } else {
            int code = Integer.parseInt(txtCode.getText());     
            Reservation reservation = reservationService.search(code);
            if (reservation != null) {
                try {
                    txtTotalPrice.setText(String.valueOf(reservation.getTotalPrice()));
                    txtNumberPersons.setText(String.valueOf(reservation.getNumberPerson()));
                    txtIdentification.setText(String.valueOf(reservation.getIdUser().getId()));
                    txtCod.setText(String.valueOf(reservation.getCode()));
                    cmbHotel.setSelectedItem(reservation.getIdHotel().getCode());
                    cmbRoom.setSelectedItem(reservation.getIdRoom().getId());

                    // Parsear y establecer las fechas en los componentes
                    dateEntry.setDate(dateFormat.parse(reservation.getDateEnty()));
                    dateDeparture.setDate(dateFormat.parse(reservation.getDateDeparture()));
                } catch (ParseException ex) {
                    Logger.getLogger(ReservationView.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La reservación con Código " + code + " no existe");
                clean();
            } 
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");       
        if (txtCod.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero la reserva a modificar");
        }else{
            if (reservationService.validateDate(dateEntry, dateDeparture)) {
                reservationService.validateDate(dateEntry, dateDeparture);
                if (completeSpace()){
                    int code = Integer.parseInt(txtCod.getText());
                    Hotel selectHotel = (Hotel) cmbHotel.getSelectedItem();
                    int idHotel = selectHotel.getCode();
                    Room selectRoom = (Room) cmbRoom.getSelectedItem();
                    int idRoom = selectRoom.getId();
                    long idUser = Long.parseLong(txtIdentification.getText());
                    int numberPerson = Integer.parseInt(txtNumberPersons.getText());
                    String dateEntryString = dateFormat.format(dateEntry.getDate());
                    String dateDepartureString = dateFormat.format(dateDeparture.getDate());
                    float totalPrice = Float.parseFloat(txtTotalPrice.getText());
                    String condition = "Activa";
                    Hotel hotel = new Hotel(idHotel);
                    Room room = new Room(idRoom);
                    User user = new User(idUser);
                    Reservation reservation = new Reservation(code, hotel, room, user, numberPerson, dateEntryString, dateDepartureString, totalPrice, condition);
                    try{
                        reservationService.modify(reservation);
                        JOptionPane.showMessageDialog(null, "Los cambios se guadaron");
                        
                    }catch (ValidateCodeExp | ValidateIdExp ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Complete los espacios en blanco");
                }
            }else {
            JOptionPane.showMessageDialog(null, "La fecha de salida debe ser posterior a la fecha de entrada.");
            }
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      if (txtCod.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes de buscar primero la reserva a cancelar");
        }else{
            int code = Integer.parseInt(txtCode.getText());
            int cod = Integer.parseInt(txtCod.getText());
            reservationService.delete(code);
            JOptionPane.showMessageDialog(null, "Se cancelo la reserva: " + cod);
            clean();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        long id = Long.parseLong(txtIdentification.getText());
        User user = reservationService.userWindows(id);
        if (user != null) {
            this.dispose();
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void cmbHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHotelActionPerformed
        Hotel selectedHotel = (Hotel) cmbHotel.getSelectedItem();
        int hotelId = selectedHotel.getCode();
        reservationService.roomList(cmbRoom, hotelId);    
    }//GEN-LAST:event_cmbHotelActionPerformed

    private void tblHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHotelMouseClicked
       
    }//GEN-LAST:event_tblHotelMouseClicked

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodeKeyTyped

    private void txtIdentificationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificationKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificationKeyTyped

    private void txtNumberPersonsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberPersonsKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumberPersonsKeyTyped

    private void txtTotalPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPriceKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean retroceso = key == 8;
        if (!(numeros || retroceso)){
            evt.consume();
        }
    }//GEN-LAST:event_txtTotalPriceKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        reservationService.pdfReservation();
    }//GEN-LAST:event_btnPdfActionPerformed

    public void fillTable() {
     reservationService.table();
    }
    
    public void clean(){
        Date date = new Date();
        txtTotalPrice.setText(""); 
        txtNumberPersons.setText(""); 
        txtCod.setText(""); 
        cmbHotel.setSelectedIndex(0); 
        cmbRoom.setSelectedIndex(0);
        dateEntry.setDate(date);
        dateDeparture.setDate(date);
    }
    
    public boolean completeSpace() {
        // Check if required fields have any value
        boolean fieldsComplete = true;
        if (txtTotalPrice.getText().isEmpty() || txtNumberPersons.getText().isEmpty() || txtIdentification.getText().isEmpty()
                || dateEntry.getDate() == null || dateDeparture.getDate() == null || cmbRoom.getSelectedItem() == null
                || cmbHotel.getSelectedItem() == null){
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
                new ReservationView().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbHotel;
    private javax.swing.JComboBox<String> cmbRoom;
    private com.toedter.calendar.JDateChooser dateDeparture;
    private com.toedter.calendar.JDateChooser dateEntry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTable tblHotel;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumberPersons;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
