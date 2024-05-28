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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import models.Hotel;
import models.Reservation;
import models.Room;
import models.TypeRoom;
import models.User;
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
import models.Role;
import models.StatusRoom;

/**
 *
 * @author William
 */
public class ReservationDao {
    private Connection connection;
    
    public ReservationDao() {
        connection = DataBaseSingleton.getInstance().getconnection();  
    }
    
    public boolean duplicateCode(int code) {
    // Prepares the SQL query to check if the ID already exists
    String checkIdSQL = "SELECT Code FROM Reservations WHERE Code = ?";
    try (PreparedStatement checkIdStmt = connection.prepareStatement(checkIdSQL)) {
        checkIdStmt.setInt(1, code);
        // Execute the query
        ResultSet rs = checkIdStmt.executeQuery();
        // If the result set contains any row, then the ID already exists
        return rs.next();
    } catch (SQLException e) {
        // Handle any SQL exceptions that occur during the process
        e.printStackTrace();
    }
    // Return false if any error occurs
    return false;
    }
    
    public void insert(Reservation reservation) throws CodeExistingExp {
        // Check if the id already exists before proceeding with the insertion
        if (duplicateCode( reservation.getCode())) {
            throw new CodeExistingExp();
        }
        // Prepares the SQL query to insert data
        String insertSQL = "INSERT INTO Reservations (Code, Id_hotel, Id_room, Id_user, NumberPerson, dateEntry, dateDeparture, TotalPrice, State) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setInt(1, reservation.getCode());
            pstmt.setInt(2, reservation.getIdHotel().getCode());
            pstmt.setInt(3, reservation.getIdRoom().getId());
            pstmt.setLong(4, reservation.getIdUser().getId());
            pstmt.setInt(5, reservation.getNumberPerson());
            pstmt.setString(6, reservation.getDateEnty());
            pstmt.setString(7, reservation.getDateDeparture());
            pstmt.setFloat(8, reservation.getTotalPrice());
            pstmt.setString(9, reservation.getCondition());
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
        String deleteSQL = "DELETE FROM Reservations WHERE Code = ?";
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
    
    public Reservation search(int code) {
        Reservation reservation = null;
        // Prepares the SQL query to search for data
        String searchSQL = "SELECT * FROM Reservations WHERE Code = ? ";
        try (PreparedStatement pstmt = connection.prepareStatement(searchSQL)) {
            pstmt.setInt(1, code);
            // Execute the query
            ResultSet rs = pstmt.executeQuery();
            // Check if a user was found
            if (!rs.next()) {
                System.out.println("User with Code " + code + " does not exist");
            } else {
                // Create a new User object with the retrieved data
                reservation = new Reservation(
                    code,
                    new Hotel(rs.getInt("Id_hotel")),
                    new Room (rs.getInt("Id_room")),
                    new User (rs.getInt("Id_user")),
                    rs.getInt("NumberPerson"),
                    rs.getString("dateEntry"),
                    rs.getString("dateDeparture"),
                    rs.getFloat("TotalPrice"),
                    rs.getString("State")                   
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservation;
    }
    
    public void modify (Reservation reservation) {
        // Prepares the SQL query to insert data
        String upDateSQL = "UPDATE Reservations SET Id_hotel = ?, Id_room = ?, Id_user = ?, NumberPerson = ?, dateEntry = ?, dateDeparture = ?, TotalPrice = ?, State = ? WHERE Code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(upDateSQL)){                                              
            pstmt.setInt(1, reservation.getIdHotel().getCode());
            pstmt.setInt(2, reservation.getIdRoom().getId());
            pstmt.setLong(3, reservation.getIdUser().getId());
            pstmt.setInt(4, reservation.getNumberPerson());
            pstmt.setString(5, reservation.getDateEnty());
            pstmt.setString(6, reservation.getDateDeparture());
            pstmt.setFloat(7, reservation.getTotalPrice());
            pstmt.setString(8, reservation.getCondition());
            pstmt.setInt(9, reservation.getCode());
            // Execute the query
            int rowsAffected = pstmt.executeUpdate();
            // Verify if the insertion was successful
            if (rowsAffected > 0) {
                System.out.println("Successful modification");
            } else {
                System.out.println("Data not modified");
            }    
        }catch (SQLException e) {
            System.out.println("An error occurred while making the selection in the database");
            e.printStackTrace();
        }
    }   
    
    public void hotelList(JComboBox<Hotel> hotels) {
        DefaultComboBoxModel<Hotel> model = new DefaultComboBoxModel<>();
        String selectSQL = "SELECT * FROM Hotels";
        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int code = rs.getInt("Code");
                String name = rs.getString("Name");
                Hotel hotel = new Hotel(code, name);
                model.addElement(hotel);
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió un error al insertar en la base de datos");
            e.printStackTrace();
        }
        hotels.setModel(model);
    }
   
    public void RoomList(JComboBox<Room> room, int hotelId) {
        DefaultComboBoxModel<Room> model = new DefaultComboBoxModel<>();
        String selectSQL = "SELECT r.Id, r.Code_type, t.Name_type FROM Rooms r JOIN Type_room t ON r.Code_type = t.Code WHERE r.HotelCode = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            pstmt.setInt(1, hotelId);  // Set the hotel ID in the query
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Id");
                int typeId = rs.getInt("Code_type");
                String typeName = rs.getString("Name_type");
                TypeRoom type = new TypeRoom(typeId, typeName);
                Room rooms = new Room(id, type);
                model.addElement(rooms);
            }
            System.out.println("Total elements added to the model: " + model.getSize());
        } catch (SQLException e) {
            System.out.println("An error occurred while inserting into the database");
            e.printStackTrace();
        }
        room.setModel(model);
    }
    
    public Map<String, Object> selectReservationsForUser(int userId) {
        // Initialize the result map
        Map<String, Object> result = new HashMap<>();
        // Prepare the SQL query to select reservations for the specified user
        String selectSQL = "SELECT * FROM Reservations WHERE UserID = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            // Set the user ID parameter in the prepared statement
            pstmt.setInt(1, userId);
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
                // Customize column names here if necessary
                columnNames.add(columnName);
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
    
   public List<Reservation> getReservations() {
    List<Reservation> reservations = new ArrayList<>();
    String searchSQL = "SELECT r.Code, r.Id_hotel, h.Name AS HotelName, r.Id_room, ro.Code_type, tr.Name_type AS RoomType, "
                     + "ro.NumberPerson, ro.PriceNigth, r.Id_user, u.Name AS UserName, r.NumberPerson, r.dateEntry, r.dateDeparture, "
                     + "r.TotalPrice, r.State "
                     + "FROM Reservations r "
                     + "JOIN Hotels h ON r.Id_hotel = h.Code "
                     + "JOIN User u ON r.Id_user = u.Id "
                     + "JOIN Rooms ro ON r.Id_room = ro.Id "
                     + "JOIN Type_room tr ON ro.Code_type = tr.Code";

    try (Statement stmt = connection.createStatement();
         ResultSet rs = stmt.executeQuery(searchSQL)) {
        if (!rs.isBeforeFirst()) {
            System.out.println("No reservations found.");
        } else {
            while (rs.next()) {
                Hotel hotel = new Hotel(rs.getInt("Id_hotel"), rs.getString("HotelName"));
                TypeRoom typeRoom = new TypeRoom(rs.getInt("Code_type"), rs.getString("RoomType"));
                Room room = new Room(rs.getInt("Id_room"), hotel, typeRoom, rs.getInt("NumberPerson"), rs.getFloat("PriceNigth"), null); // Adjust `null` if necessary
                User user = new User(rs.getLong("Id_user"), rs.getString("UserName"));
                Reservation reservation = new Reservation(
                        rs.getInt("Code"),
                        hotel,
                        room,
                        user,
                        rs.getInt("NumberPerson"),
                        rs.getDate("dateEntry").toLocalDate().toString(),
                        rs.getDate("dateDeparture").toLocalDate().toString(),
                        rs.getFloat("TotalPrice"),
                        rs.getString("State")
                );
                reservations.add(reservation);

                // Print out the details of the reservation for debugging purposes
                System.out.println("Reservation added: " + reservation);
            }
        }
    } catch (SQLException e) {
        System.out.println("Ocurrió un error al recuperar datos de la base de datos");
        e.printStackTrace();
    }
    return reservations;
}

    
    public void pdfReservations() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/PERDOMO/Diseño Software/Proyecto/PDF/Reporte_Reservas.pdf"));

            documento.open();

            // Agregar título al documento
            Paragraph titulo = new Paragraph("Reporte de Reservas");
            documento.add(titulo);

            // Agregar espacio entre el título y la tabla
            documento.add(new Paragraph(" "));
            PdfPTable tabla = new PdfPTable(9); // Ajusta el número de columnas según los atributos de tu clase Reservation

            tabla.addCell("Código");
            tabla.addCell("Hotel");
            tabla.addCell("Habitacion");
            tabla.addCell("Usuario");
            tabla.addCell("Número de Personas");
            tabla.addCell("Fecha de Entrada");
            tabla.addCell("Fecha de Salida");
            tabla.addCell("Precio Total");
            tabla.addCell("Estado");

            List<Reservation> reservations = getReservations();
            for (Reservation reservation : reservations) {
                tabla.addCell(String.valueOf(reservation.getCode()));
                tabla.addCell(String.valueOf(reservation.getIdHotel().getName()));
                tabla.addCell(String.valueOf(reservation.getIdRoom().getType().getType()));
                tabla.addCell(String.valueOf(reservation.getIdUser().getName()));
                tabla.addCell(String.valueOf(reservation.getNumberPerson()));
                tabla.addCell(reservation.getDateEnty());
                tabla.addCell(reservation.getDateDeparture());
                tabla.addCell(String.valueOf(reservation.getTotalPrice()));
                tabla.addCell(reservation.getCondition());
            }

            documento.add(tabla);

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte de Reservas creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
