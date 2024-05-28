package service;

import dao.UserDao;
import javax.swing.JOptionPane;
import models.User;
import view.ManageView;
import view.UserView;

/**
 *
 * @author arper
 */
public class LoginService {
    UserDao userDao;

    public LoginService() {
        userDao = new UserDao();
    }
    
    public User login(String email, String password) {
        // Attempt to authenticate the user
        User user = userDao.authenticateUser(email, password);
        // If authentication is successful
        if (user != null) {
            // Determine the user's role and open the corresponding view
            switch (user.getRole().getCode()) {
                case 1:
                    UserView userView = new UserView();
                    userView.setLoggedInUser(user);
                    userView.setVisible(true); // Open UserView for Admin
                    break;
                case 2:
                    ManageView manageView = new ManageView();
                    manageView.setLoggedInUser(user);
                    manageView.setVisible(true); // Open ManageView for User
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Role mismatch");
                    break;
            }
        } else {
            // Display error message for failed authentication
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrecto");
        }
        return user; // Return the authenticated user
    }
    
}
