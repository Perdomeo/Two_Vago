package dao;

import conexion.MySQLConexion;
import databasesingleton.DataBaseSingleton;
import exeptions.IdExistingExp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import models.Hotel;
import models.Room;
import models.StatusRoom;
import models.TypeRoom;

/**
 *
 * @author William
 */
public class RoomDao {
    MySQLConexion conexion;
    private Connection connection;
    
    public RoomDao() {
        connection = DataBaseSingleton.getInstance().getconnection();
    }
    
    public boolean duplicateId(int id) {
        // Prepares the SQL query to check if the ID already exists
        String checkIdSQL = "SELECT Id FROM Rooms WHERE Id = ?";
        try (PreparedStatement checkIdStmt = connection.prepareStatement(checkIdSQL)) {
            checkIdStmt.setInt(1, id);
            ResultSet rs = checkIdStmt.executeQuery();
            // If the result set contains any row, then the ID already exists
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Return false if any error occurs
        return false;
    }
    
    public void insert(Room room) throws IdExistingExp {
        if (duplicateId( room.getId())) {
            throw new IdExistingExp();
        }
        // Prepares the SQL query to insert data
        String insertSQL = "INSERT INTO Rooms (Id, HotelCode, Type, NumberPerson, PriceNigth, Status) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setInt(1, room.getId());
            pstmt.setInt(2, room.getHotelCode().getCode());
            pstmt.setInt(3, room.getType().getId());
            pstmt.setInt(4, room.getNumberPersons());
            pstmt.setFloat(5, room.getPriceNigth());
            pstmt.setInt(6, room.getStatus().getId());
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
        // Initialize the result map. This map will store column names, the number of columns, and table data.
        Map<String, Object> result = new HashMap<>();
        // Try to establish a connection with the database
        String selectSQL = "SELECT * FROM Rooms";
        // Try to prepare and execute the SQL query
        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            // Execute the query and retrieve the results into a ResultSet
            ResultSet rs = pstmt.executeQuery();
            // Retrieve the ResultSet metadata. Metadata contains information about the structure of the results, such as the number of columns and column names.
            ResultSetMetaData rsmd = rs.getMetaData();
            // Get the number of columns from the metadata
            int numColumns = rsmd.getColumnCount();
            // Create a list to store column names
            List<String> columnNames = new ArrayList<>();
            for (int i = 1; i <= numColumns; i++) {
                // Get the name of each column from the metadata and add it to the list
                columnNames.add(rsmd.getColumnName(i));
            }
            // Create a list to store table data
            List<List<Object>> tableData = new ArrayList<>();
            while (rs.next()) {
                // Create a list to store data for the current row
                List<Object> rowData = new ArrayList<>();
                for (int i = 1; i <= numColumns; i++) {
                    // Get the data for each column of the current row and add it to the list
                    rowData.add(rs.getObject(i));
                }
                // Add the list of row data to the table data list
                tableData.add(rowData);
            }
            // Add the number of columns, column names, and table data to the result map
            result.put("numColumns", numColumns);
            result.put("columnNames", columnNames);
            result.put("tableData", tableData);
        } catch (SQLException e) {
            // If an error occurs while performing the selection in the database, print an error message and the error stack trace
            System.out.println("An error occurred while performing selection in the database");
            e.printStackTrace();
        }
        // Print the result map for debugging
        System.out.println(result);
        // Return the result map
        return result;
    }
    
    public void delete(int id) {
        // Prepares the SQL query to insert data
        String deleteSQL = "DELETE FROM Rooms WHERE Id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)){
            pstmt.setInt(1, id);
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
    
    public Room search(int id) {
        Room room = null;
        String searchSQL = "SELECT * FROM Rooms WHERE Id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(searchSQL)) {
            pstmt.setLong(1, id);
            // Execute the query
            ResultSet rs = pstmt.executeQuery();
            // Check if a user was found
            if (!rs.next()) {
                System.out.println("User with ID " + id + " does not exist");
            } else {
                // Create a new User object with the retrieved data
                room = new Room(
                    id,
                    new Hotel(rs.getInt("HotelCode")),
                    new TypeRoom(rs.getInt("Type")),
                    rs.getInt("NumberPerson"),    
                    rs.getFloat("PriceNigth"),
                    new StatusRoom(rs.getInt("Status"))
                );
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while making the selection in the database");
            e.printStackTrace();
        }
        return room;
    }
    
    public void modify(Room room) {
        // Prepares the SQL query to insert data
        String upDateSQL = "UPDATE Rooms SET HotelCode = ?, Type = ?, NumberPerson = ?, PriceNigth = ?, Status = ? WHERE Id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(upDateSQL)) {                                                 
            pstmt.setInt(1, room.getHotelCode().getCode());
            pstmt.setInt(2, room.getType().getId());
            pstmt.setInt(3, room.getNumberPersons());
            pstmt.setFloat(4, room.getPriceNigth());
            pstmt.setInt(5, room.getStatus().getId());
            pstmt.setInt(6, room.getId());
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
    
    public void typeList(JComboBox<TypeRoom> type) {
        DefaultComboBoxModel<TypeRoom> model = new DefaultComboBoxModel<>();
        String selectSQL = "SELECT * FROM Type_room";
        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int code = rs.getInt("Code");
                String name = rs.getString("Name_type");
                TypeRoom typeRoom = new TypeRoom(code, name);
                model.addElement(typeRoom);
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió un error al insertar en la base de datos");
            e.printStackTrace();
        }
        type.setModel(model);
    }
}
