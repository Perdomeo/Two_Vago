package dao;

import databasesingleton.DataBaseSingleton;
import exeptions.CodeExistingExp;
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
import models.Role;

/**
 *
 * @author William
 */
public class RoleUserDao {
    private Connection connection;
    
    public RoleUserDao() {
        connection = DataBaseSingleton.getInstance().getconnection();
    }
    
    public boolean duplicateCode(int code) {
        // Prepares the SQL query to check if the ID already exists
        String checkIdSQL = "SELECT Code FROM Roles WHERE Code = ?";
        try (PreparedStatement checkIdStmt = connection.prepareStatement(checkIdSQL)) {
            checkIdStmt.setInt(1, code);
            ResultSet rs = checkIdStmt.executeQuery();
            // If the result set contains any row, then the ID already exists
            return rs.next();
        } catch (SQLException e) {
            System.out.println("An error occurred while checking for duplicate ID");
            e.printStackTrace();
        }
        // Return false if any error occurs
        return false;
    }
    
    public void insert(Role role) throws CodeExistingExp {
        if (duplicateCode(role.getCode())){
            throw new CodeExistingExp();
        }
        // Prepares the SQL query to insert data
        String insertSQL = "INSERT INTO Roles (Role, Code) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setString(1, role.getRole());
            pstmt.setInt(2, role.getCode());
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
        // Prepare the SQL query to select data from the 'user' table
        String selectSQL = "SELECT * FROM Roles";
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
    
    public void delete(int code) {
        // Prepares the SQL query to insert data
        String deleteSQL = "DELETE FROM Roles WHERE Code = ?";
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
    
    public Role search(int code) {
        Role role = null;
        // Prepares the SQL query to search for data
        String searchSQL = "SELECT * FROM Roles WHERE Code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(searchSQL)) {
            pstmt.setLong(1, code);
            // Execute the query
            ResultSet rs = pstmt.executeQuery();
            // Check if a user was found
            if (!rs.next()) {
                System.out.println("User with ID " + code + " does not exist");
            } else {
                // Create a new User object with the retrieved data
                role = new Role(
                    rs.getString("Role"),
                    code
                );
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while making the selection in the database");
            e.printStackTrace();
        }
        return role;
    }
    
    public void modify(Role role) {
        // Prepares the SQL query to insert data
        String upDateSQL = "UPDATE Roles SET Role = ? WHERE Code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(upDateSQL)) {                   
            pstmt.setString(1, role.getRole());
            pstmt.setInt(2, role.getCode());
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

}
