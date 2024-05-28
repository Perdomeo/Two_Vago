package service;

import dao.UserDao;
import javax.swing.JOptionPane;
import models.User;
import view.ManageHotelView;
import view.ManageRolView;
import view.ManageRoomsView;
import view.ManageTypeRoom;
import view.ManageUserView;
import view.ManageView;

/**
 *
 * @author arper
 */
public class ManageService {
    UserDao userDao;

    public ManageService() {
        userDao = new UserDao();
    }
    
    public User hotelWindows(long id) {
        // Attempt to authenticate the user
        User user = userDao.authenticateId(id);
        // If authentication is successful
        if (user != null) {
            ManageHotelView view = new ManageHotelView();
            view.setLoggedInUser(user);
            view.setVisible(true);
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Problem");
        }
        return user; // Return the authenticated user
    }
    
    public User roomWindows(long id) {
        // Attempt to authenticate the user
        User user = userDao.authenticateId(id);
        // If authentication is successful
        if (user != null) {
            ManageRoomsView view = new ManageRoomsView();
            view.setLoggedInUser(user);
            view.setVisible(true);
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Problem");
        }
        return user; // Return the authenticated user
    }
    
    public User roomTypeWindows(long id) {
        // Attempt to authenticate the user
        User user = userDao.authenticateId(id);
        // If authentication is successful
        if (user != null) {
            ManageTypeRoom view = new ManageTypeRoom();
            view.setLoggedInUser(user);
            view.setVisible(true);
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Problem");
        }
        return user; // Return the authenticated user
    }
    
    public User userWindows(long id) {
        // Attempt to authenticate the user
        User user = userDao.authenticateId(id);
        // If authentication is successful
        if (user != null) {
            ManageUserView view = new ManageUserView();
            view.setLoggedInUser(user);
            view.setVisible(true);
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Problem");
        }
        return user; // Return the authenticated user
    }
    
    public User rolesWindows(long id) {
        // Attempt to authenticate the user
        User user = userDao.authenticateId(id);
        // If authentication is successful
        if (user != null) {
            ManageRolView view = new ManageRolView();
            view.setLoggedInUser(user);
            view.setVisible(true);
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Problem");
        }
        return user; // Return the authenticated user
    }
    
    
    public User manageWindows(long id) {
        // Attempt to authenticate the user
        User user = userDao.authenticateId(id);
        // If authentication is successful
        if (user != null) {
            ManageView view = new ManageView();
            view.setLoggedInUser(user);
            view.setVisible(true);
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Problem");
        }
        return user; // Return the authenticated user
    }
    
    
}
