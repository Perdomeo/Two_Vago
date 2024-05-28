package dao;

import databasesingleton.DataBaseSingleton;
import exeptions.CodeExistingExp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Hotel;
import com.itextpdf.text.Document;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class HotelDao {
    private Connection connection;
    
    public HotelDao() {
        connection = DataBaseSingleton.getInstance().getconnection();
    }
    
    public boolean duplicateCode(int code) {
        // Prepares the SQL query to check if the ID already exists
        String checkIdSQL = "SELECT Code FROM Hotels WHERE Code = ?";
        try (PreparedStatement checkIdStmt = connection.prepareStatement(checkIdSQL)) {
            checkIdStmt.setInt(1, code);
            ResultSet rs = checkIdStmt.executeQuery();
            // If the result set contains any row, then the ID already exists
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Return false if any error occurs
        return false;
    }
    
    public void insert(Hotel hotel) throws CodeExistingExp {
        if (duplicateCode(hotel.getCode())){
            throw new CodeExistingExp();
        }
        // Prepares the SQL query to insert data
        String insertSQL = "INSERT INTO Hotels (Code, Name, City, Address, Rating, PriceNight, Amenities, cancellationPolicy) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setInt(1, hotel.getCode());
            pstmt.setString(2, hotel.getName());
            pstmt.setString(3, hotel.getCity());
            pstmt.setString(4, hotel.getAddress());
            pstmt.setInt(5, hotel.getRating());
            pstmt.setFloat(6, hotel.getPriceNight());
            pstmt.setString(7, hotel.getAmenities());
            pstmt.setString(8, hotel.getCancellationPolicy());
            // Execute the query
            int rowsAffected = pstmt.executeUpdate();
            // Verify if the insertion was successful
            if (rowsAffected > 0) {
                System.out.println("Successful integration");
            } else {
                System.out.println("Data could not be inserted");
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while inserting into the database");
            e.printStackTrace();
        }
    }
    
    public Map<String, Object> select() {
        // Initialize the result map
        Map<String, Object> result = new HashMap<>();
        // Prepare the SQL query to select data from the 'Hotels' table
        String selectSQL = "SELECT Name, City, Address, Rating, PriceNight, Amenities, cancellationPolicy FROM Hotels";
        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            // Execute the query and retrieve the results into a ResultSet
            ResultSet rs = pstmt.executeQuery();
            // Retrieve the ResultSet metadata
            ResultSetMetaData rsmd = rs.getMetaData();
            // Get the number of columns from the metadata
            int numColumns = rsmd.getColumnCount();
            // Create a list to store customized column names
            List<String> columnNames = new ArrayList<>();
            // Customize column names as needed
            for (int i = 1; i <= numColumns; i++) {
                String columnName = rsmd.getColumnName(i);
                // Customize column names here according to your requirements for the 'Hotels' table
                // For example, you can replace column names with user-friendly names
                if (columnName.equals("Name")) {
                    columnNames.add("Hotel");
                } else if (columnName.equals("City")) {
                    columnNames.add("Ciudad");
                } else if (columnName.equals("Address")) {
                    columnNames.add("Direccion");
                } else if (columnName.equals("Rating")) {
                    columnNames.add("Calificacion");
                } else if (columnName.equals("PriceNight")) {
                    columnNames.add("Precio Noche");
                } else if (columnName.equals("Amenities")) {
                    columnNames.add("Servicios");
                } else if (columnName.equals("cancellationPolicy")) {
                    columnNames.add("Politicas");
                } else {
                    // If no customization is needed, use the original column name
                    columnNames.add(columnName);
                }
            }
            // Create a list to store table data
            List<List<Object>> tableData = new ArrayList<>();
            // Iterate over the ResultSet to retrieve the data
            while (rs.next()) {
                List<Object> rowData = new ArrayList<>();
                // Retrieve data for each column and add it to the row data list
                for (int i = 1; i <= numColumns; i++) {
                    rowData.add(rs.getObject(i));
                }
                // Add the row data list to the table data list
                tableData.add(rowData);
            }
            // Add the number of columns, customized column names, and table data to the result map
            result.put("numColumns", numColumns);
            result.put("columnNames", columnNames);
            result.put("tableData", tableData);
        } catch (SQLException e) {
            // Handle any SQL exceptions
            System.out.println("An error occurred while performing selection in the database");
            e.printStackTrace();
        }
        // Return the result map
        return result;
    }
    
    public void delete(int code) {
        // Prepares the SQL query to insert data
        String deleteSQL = "DELETE FROM Hotels WHERE Code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)){
            pstmt.setInt(1, code);
            // Execute the query
            int rowsAffected = pstmt.executeUpdate();
            // Verify if the insertion was successful
            if (rowsAffected > 0) {
                System.out.println("Successfully eliminated");
            } else {
                System.out.println("The user has not been deleted");
            }
        }catch (SQLException e) {
            System.out.println("An error occurred while making the selection in the database");
            e.printStackTrace();
        }
    }
    
    public Hotel search(int code) {
        Hotel hotel = null;
        // Prepares the SQL query to search for data
        String searchSQL = "SELECT * FROM Hotels WHERE Code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(searchSQL)) {
            pstmt.setLong(1, code);
            // Execute the query
            ResultSet rs = pstmt.executeQuery();
            // Check if a user was found
            if (!rs.next()) {
                System.out.println("User with ID " + code + " does not exist");
            } else {
                // Create a new User object with the retrieved data
                hotel = new Hotel(
                    code,
                    rs.getString("Name"),
                    rs.getString("City"),
                    rs.getString("Address"),
                    rs.getInt("Rating"),
                    rs.getFloat("PriceNight"),
                    rs.getString("Amenities"),
                    rs.getString("cancellationPolicy")
                    );
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while making the selection in the database");
            e.printStackTrace();
        }
        return hotel;
    }
    
    public void modify(Hotel hotel) {
        // Prepares the SQL query to insert data
        String upDateSQL = "UPDATE Hotels SET Name = ?, City = ?, Address = ?, Rating = ?, PriceNight = ?, Amenities = ?, cancellationPolicy = ? WHERE Code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(upDateSQL)) {                                    
            pstmt.setString(1, hotel.getName());
            pstmt.setString(2, hotel.getCity());
            pstmt.setString(3, hotel.getAddress());
            pstmt.setInt(4, hotel.getRating());
            pstmt.setFloat(5, hotel.getPriceNight());
            pstmt.setString(6, hotel.getAmenities());
            pstmt.setString(7, hotel.getCancellationPolicy());
            pstmt.setInt(8, hotel.getCode());
            // Execute the query
            int rowsAffected = pstmt.executeUpdate();
            // Verify if the insertion was successful
            if (rowsAffected > 0) {
                System.out.println("successful modification");
            } else {
                System.out.println("data not modified");
            }   
        } catch (SQLException e) {
            System.out.println("An error occurred while making the selection in the database");
            e.printStackTrace();
        }
    }  
    
    public List<Hotel> getHoteles() {
        List<Hotel> hoteles = new ArrayList<>();
        String searchSQL = "SELECT * FROM Hotels";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(searchSQL)) {
            while (rs.next()) {
                Hotel hotel = new Hotel(
                        rs.getInt("Code"),
                        rs.getString("Name"),
                        rs.getString("City"),
                        rs.getString("Address"),
                        rs.getInt("Rating"),
                        rs.getFloat("PriceNight"),
                        rs.getString("Amenities"),
                        rs.getString("cancellationPolicy")
                );
                hoteles.add(hotel);
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while retrieving data from the database");
            e.printStackTrace();
        }
        return hoteles;
    }
    
    public void pdfHoteles() {
        Document document = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(document, new FileOutputStream(ruta + "/Desktop/PERDOMO/Diseño Software/Proyecto/PDF/Reporte_Hoteles.pdf"));

            document.open();

            // Add títle the documents
            Paragraph titulo = new Paragraph("Reporte de Hoteles");
            document.add(titulo);
            document.add(new Paragraph("" + "\n"));

            PdfPTable tabla = new PdfPTable(6); // Ajusta el número de columnas según los atributos de tu clase Hotel
            tabla.addCell("Código");
            tabla.addCell("Nombre");
            tabla.addCell("Ciudad");
            tabla.addCell("Dirección");
            tabla.addCell("Rating");
            tabla.addCell("Precio por Noche");

            List<Hotel> hoteles = getHoteles();
            for (Hotel hotel : hoteles) {
                tabla.addCell(String.valueOf(hotel.getCode()));
                tabla.addCell(hotel.getName());
                tabla.addCell(hotel.getCity());
                tabla.addCell(hotel.getAddress());
                tabla.addCell(String.valueOf(hotel.getRating()));
                tabla.addCell("$ " + String.valueOf(hotel.getPriceNight()));
            }

            document.add(tabla);

            document.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
