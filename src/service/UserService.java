package service;

import dao.UserDao;
import javax.swing.JOptionPane;
import models.User;
import view.ReservationView;

/**
 *
 * @author arper
 */
public class UserService {
    UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }
    
    public User reservationWindows(long id) {
        // Attempt to authenticate the user
        User user = userDao.authenticateId(id);
        // If authentication is successful
        if (user != null) {
            ReservationView view = new ReservationView();
            view.setLoggedInUser(user);
            view.setVisible(true);
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Problem");
        }
        return user; // Return the authenticated user
    }
}
