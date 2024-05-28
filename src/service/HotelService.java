package service;

import dao.HotelDao;
import dao.UserDao;
import exeptions.CodeExistingExp;
import exeptions.ValidateCodeExp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import models.Hotel;
import validation.ValidateCode;

/**
 *
 * @author arper
 */
public class HotelService {
    HotelDao hotelDao;
    UserDao userDao;
    ValidateCode valCode;
    
    public HotelService() {
        hotelDao = new HotelDao();
        valCode = new ValidateCode();
        userDao = new UserDao();
    }
    
    public void register(Hotel hotel) throws CodeExistingExp{
        if (!valCode.validateCode(hotel.getCode())){
            throw new ValidateCodeExp();
        }
        hotelDao.insert(hotel);
    }
    
    public Hotel search(int code){
        return hotelDao.search(code);
    }
    
    public void delete(int code){
        hotelDao.delete(code);
    }
    
    public void modify(Hotel hotel){
        hotelDao.modify(hotel);
    }
    
    public void fillTable (JTable hotel){
        // We call the select method of the user controller. This method returns a map with column names, the number of columns, and table data.
        Map<String, Object> result = hotelDao.select();

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
    
    public List<Hotel> getHoteles() {
        return hotelDao.getHoteles();
    }
    
    public void TarjetasDinamicas(JPanel parentPanel) {
        JPanel cardsPanel = new JPanel();
        cardsPanel.setLayout(new GridLayout(0, 3, 10, 10));

        List<Hotel> hoteles = getHoteles();
        for (Hotel hotel : hoteles) {
            JPanel card = new JPanel();
            card.setBorder(new EmptyBorder(10, 10, 10, 10));
            card.setBackground(Color.WHITE);
            card.setLayout(new BorderLayout());

            JLabel title = new JLabel(hotel.getName());
            card.add(title, BorderLayout.NORTH);

            JLabel content = new JLabel("<html>Ciudad: " + hotel.getCity() + " <br/>Estrellas: " + hotel.getRating() + " <br/>Dirección: " + hotel.getAddress() + "</html>");
            card.add(content, BorderLayout.CENTER);

            cardsPanel.add(card);
        }

        JScrollPane scrollPane = new JScrollPane(cardsPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JPanel scrollPaneContainer = new JPanel(new BorderLayout());
        scrollPaneContainer.add(scrollPane, BorderLayout.CENTER);

        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(scrollPaneContainer, BorderLayout.CENTER);
    }



    
    public void pdfHoteles (){
        hotelDao.pdfHoteles();
    }

}
