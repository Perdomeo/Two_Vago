package service;

import com.toedter.calendar.JDateChooser;
import dao.ReservationDao;
import dao.UserDao;
import exeptions.CodeExistingExp;
import exeptions.ValidateCodeExp;
import exeptions.ValidateDateExp;
import exeptions.ValidateIdExp;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import models.Reservation;
import models.User;
import validation.ValidateCode;
import validation.ValidateDate;
import validation.ValidateIdentification;
import view.UserView;

/**
 *
 * @author arper
 */
public class ReservationService {
    ReservationDao reservationDao;
    UserDao userDao;
    ValidateCode valCode;
    ValidateIdentification valId;
    ValidateDate valDate;

    public ReservationService() {
        reservationDao = new ReservationDao();
        valCode = new ValidateCode();
        valId = new ValidateIdentification();
        valDate = new ValidateDate();
        userDao = new UserDao();
    }
    
    public void register (Reservation reservation) throws CodeExistingExp{
        if (!valCode.validateCode(reservation.getCode())){
            throw new ValidateCodeExp();
        }
        if (!valId.validateIdentification(reservation.getIdUser().getId())){
            throw new ValidateIdExp();
        }
        if (valDate.validateDate(reservation.getDateEnty()) || valDate.validateDate(reservation.getDateDeparture())){
            throw new ValidateDateExp();
        }
        reservationDao.insert(reservation);
    }
    
    public void delete (int code){
        reservationDao.delete(code);
    }
    
    public Reservation search (int code){
        return reservationDao.search(code);
    }
    
    public void modify (Reservation reservation){
        reservationDao.modify(reservation);
    }
    
    public boolean duplicateCode (int code){
        return reservationDao.duplicateCode(code);
    }
    
    public Map<String, Object> table(){
        return reservationDao.select();
    }
    
    public void setMinimumDateToday(JDateChooser dateEntry, JDateChooser dateDeparture) {
        // Get the current date
        Date today = new Date();
        // Set the minimum date as today's date
        dateEntry.setMinSelectableDate(today);
        dateDeparture.setMinSelectableDate(today);
    }
    
    public boolean validateDate(JDateChooser dateEntry, JDateChooser dateDeparture) {
        LocalDate fechaEntry = convertToLocalDate(dateEntry.getDate());
        LocalDate fechaDeparture = convertToLocalDate(dateDeparture.getDate());        
        // Verificar si la fecha de salida es posterior a la fecha de entrada
        return fechaDeparture != null && fechaDeparture.isAfter(fechaEntry);
    }
    
    private LocalDate convertToLocalDate(Date date) {
        return date != null ? date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate() : null;
    }
    
    public void roomList(JComboBox room, int idHotel){
        reservationDao.RoomList(room, idHotel);
    }
    
    public void hotelList(JComboBox hotel){
        reservationDao.hotelList(hotel);
    }
    
    public void fillTable (JTable hotel){
        // We call the select method of the user controller. This method returns a map with column names, the number of columns, and table data.
        Map<String, Object> result = reservationDao.select();

        // We retrieve the column names from the result map. Column names are returned as a list of strings.
        List<String> columnNames = (List<String>) result.get("columnNames");

        // We retrieve the table data from the result map. Table data is returned as a list of lists of objects. Each inner list represents a row of the table and contains the data for that row.
        List<List<Object>> tableData = (List<List<Object>>) result.get("tableData");

        // We create a new table model. A table model is an object that manages the data for a table.
        DefaultTableModel model = new DefaultTableModel();
        // We iterate through the list of column names
        for (String columnName : columnNames) {
            // We add each column name to the table model. This creates the columns in the table.
            model.addColumn(columnName);
        }
        // We iterate through the list of table data
        for (List<Object> rowData : tableData) {
            // We add each row of data to the table model. This adds the data to the corresponding columns in the table.
            model.addRow(rowData.toArray());
        }
        // We set the model on the table. This updates the table to display the data from the model.
        hotel.setModel(model);
    }
    
    public void organizeTable(JTable table) {
        // Automatically adjust the width of the columns to display the content completely
        for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
            TableColumn column = table.getColumnModel().getColumn(columnIndex);
            int preferredWidth = column.getMinWidth();
            int maxWidth = column.getMaxWidth();
            for (int rowIndex = 0; rowIndex < table.getRowCount(); rowIndex++) {
                TableCellRenderer cellRenderer = table.getCellRenderer(rowIndex, columnIndex);
                Component cellComponent = table.prepareRenderer(cellRenderer, rowIndex, columnIndex);
                int cellWidth = cellComponent.getPreferredSize().width + table.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, cellWidth);
                // If the preferred width exceeds the maximum width, set the maximum width
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }
            column.setPreferredWidth(preferredWidth);
        }
        // Automatically adjust the height of the rows to display the content completely
        table.setRowHeight(30); // Replace 'preferredHeight' with the desired row height
    }
    
    public User userWindows(long id) {
        // Attempt to authenticate the user
        User user = userDao.authenticateId(id);
        // If authentication is successful
        if (user != null) {
            UserView view = new UserView();
            view.setLoggedInUser(user);
            view.setVisible(true);
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Problem");
        }
        return user; // Return the authenticated user
    }
    
    public void pdfReservation (){
        reservationDao.pdfReservations();
    }
}
