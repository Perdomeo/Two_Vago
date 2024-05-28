package dao;

import conexion.MySQLConexion;
import databasesingleton.DataBaseSingleton;
import exeptions.EmailExistingExp;
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
import models.Role;
import models.User;

/**
 *
 * @author William
 */
public class UserDao {
    MySQLConexion conexion;
    private Connection connection;

    public UserDao() {
        connection = DataBaseSingleton.getInstance().getconnection();
    }
    
    public boolean duplicateId(long id) {
        // Prepares the SQL query to check if the ID already exists
        String checkIdSQL = "SELECT Id FROM User WHERE Id = ?";
        try (PreparedStatement checkIdStmt = connection.prepareStatement(checkIdSQL)) {
            checkIdStmt.setLong(1, id);
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
    
    public boolean duplicateEmail(String email) {
        // Prepares the SQL query to check if the email already exists
        String checkEmailSQL = "SELECT Id FROM User WHERE Email = ?";
        try (PreparedStatement checkEmailStmt = connection.prepareStatement(checkEmailSQL)) {
            checkEmailStmt.setString(1, email);
            // Execute the query
            ResultSet rs = checkEmailStmt.executeQuery();
            // If the result set contains any row, then the email already exists
            return rs.next();
        } catch (SQLException e) {
            // Handle any SQL exceptions that occur during the process
            System.out.println("An error occurred while checking for duplicate email");
            e.printStackTrace();
        }
        // Return false if any error occurs
        return false;
    }
    
    private boolean duplicateEmailExcludingCurrentUser(String email, long userId) {
        try (PreparedStatement pstmt = connection.prepareStatement("SELECT COUNT(*) FROM User WHERE Email = ? AND Id != ?")) {
            pstmt.setString(1, email);
            pstmt.setLong(2, userId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void insert(User user) throws IdExistingExp, EmailExistingExp {
        // Check if the id already exists before proceeding with the insertion
        if (duplicateId( user.getId())) {
            throw new IdExistingExp();
        }
        // Check if the Email already exists before proceeding with the insertion
        if (duplicateEmail(user.getEmail())){
            throw new EmailExistingExp();
        }
        // Proceed with insertion if the ID is unique
        String insertSQL = "INSERT INTO User (Id, Name, LastName, Email, Genero, Password, Age, Address, Phone, Id_role ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setLong(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getLastName());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getGenero());
            pstmt.setString(6, user.getPassword());
            pstmt.setInt(7, user.getAge());
            pstmt.setString(8, user.getAddress());
            pstmt.setString(9, user.getPhone());
            pstmt.setInt(10, user.getRole().getCode());
            // Execute the query
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Map<String, Object> select() {
        // Initialize the result map. This map will store column names, the number of columns, and table data.
        Map<String, Object> result = new HashMap<>();
        // Prepare the SQL query to select data from the 'user' table
        String selectSQL = "SELECT * FROM User";
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
   
    public void delete(long id) {
        String deleteSQL = "DELETE FROM User WHERE Id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
            pstmt.setLong(1, id);
            // Execute the query
            int rowsAffected = pstmt.executeUpdate();
            // Verify if the deletion was successful
            if (rowsAffected > 0) {
                System.out.println("Successfully eliminated");
            } else {
                System.out.println("The user has not been deleted");
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while deleting from the database");
            e.printStackTrace();
        }
    }
    
    public User search(long id) {
        User user = null;
        // Prepares the SQL query to search for data
        String searchSQL = "SELECT * FROM User WHERE Id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(searchSQL)) {
            pstmt.setLong(1, id);
            // Execute the query
            ResultSet rs = pstmt.executeQuery();
            // Check if a user was found
            if (!rs.next()) {
                System.out.println("User with ID " + id + " does not exist");
            } else {
                // Create a new User object with the retrieved data
                user = new User(
                    id,
                    rs.getString("Name"),
                    rs.getString("LastName"),
                    rs.getString("Email"),
                    rs.getString("Genero"),
                    rs.getString("Password"),
                    rs.getInt("Age"),
                    rs.getString("Address"),
                    rs.getString("Phone"),
                    new Role(rs.getString("Role"), 1)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public User searchEmail(String email) {
        User user = null;
        // Prepares the SQL query to search for data
        String searchSQL = "SELECT * FROM User WHERE Email = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(searchSQL)) {
            pstmt.setString(1, email);
            // Execute the query
            ResultSet rs = pstmt.executeQuery();
            // Check if a user was found
            if (!rs.next()) {
                System.out.println("User with email " + email + " does not exist");
            } else {
                // Create a new User object with the retrieved data
                user = new User(
                    rs.getLong("Id"),
                    rs.getString("Name"),
                    rs.getString("LastName"),
                    rs.getString("Email"),
                    rs.getString("Genero"),
                    rs.getString("Password"),
                    rs.getInt("Age"),
                    rs.getString("Address"),
                    rs.getString("Phone"),
                    new Role(rs.getString("Role"), 1)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public void modify(User user) throws EmailExistingExp {
        // Check if the Email already exists before proceeding with the insertion
        if (duplicateEmailExcludingCurrentUser(user.getEmail(), user.getId())){
            throw new EmailExistingExp();
        }
        // Prepares the SQL query to insert data
        String upDateSQL = "UPDATE User SET Name = ?, LastName = ?, Email = ?, Genero = ?, Password = ?, Age = ?, Address = ?, Phone = ?, Role = ? WHERE Id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(upDateSQL)) {                   
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getLastName());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getGenero());
            pstmt.setString(5, user.getPassword());
            pstmt.setInt(6, user.getAge());
            pstmt.setString(7, user.getAddress());
            pstmt.setString(8, user.getPhone());
            pstmt.setString(9, user.getRole().getRole());
            pstmt.setLong(10, user.getId());
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
    
    public void roleList(JComboBox<Role> rol) {
        DefaultComboBoxModel<Role> model = new DefaultComboBoxModel<>();
        String selectSQL = "SELECT * FROM Roles";
        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int code = rs.getInt("Code");
                String roleName = rs.getString("Role");
                Role role = new Role(roleName, code);
                model.addElement(role);
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió un error al insertar en la base de datos");
            e.printStackTrace();
        }
        rol.setModel(model);
    }
    
    public User authenticateUser(String email, String password) {
        User user = null;
        String sql = "SELECT * FROM User WHERE Email = ? AND Password = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                long id = rs.getLong("Id");
                String name = rs.getString("Name");
                String lastName = rs.getString("LastName");
                String genero = rs.getString("Genero");
                int age = rs.getInt("Age");
                String address = rs.getString("Address");
                String phone = rs.getString("Phone");
                int roleId = rs.getInt("Id_role");
                Role role = getRoleById(roleId);
                user = new User(id, name, lastName, email, genero, password, age, address, phone, role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public User authenticateId(long ids) {
        User user = null;
        String sql = "SELECT * FROM User WHERE Id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, ids);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                long id = rs.getLong("Id");
                String name = rs.getString("Name");
                String lastName = rs.getString("LastName");
                String email = rs.getString("Email");
                String genero = rs.getString("Genero");
                String password = rs.getString("Password");
                int age = rs.getInt("Age");
                String address = rs.getString("Address");
                String phone = rs.getString("Phone");
                int roleId = rs.getInt("Id_role");
                Role role = getRoleById(roleId);
                user = new User(id, name, lastName, email, genero, password, age, address, phone, role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    
    private Role getRoleById(int roleId) {
        Role role = null;
        String sql = "SELECT * FROM Roles WHERE Code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, roleId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                role = new Role(roleId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }
    
}
