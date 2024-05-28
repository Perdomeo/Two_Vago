package service;

import dao.UserDao;
import exeptions.EmailExistingExp;
import exeptions.IdExistingExp;
import exeptions.ValidateEmailExp;
import exeptions.ValidateIdExp;
import exeptions.ValidatePhoneExp;
import javax.swing.JComboBox;
import models.User;
import validation.ValidateEmail;
import validation.ValidateIdentification;
import validation.ValidatePhoneNumber;

/**
 *
 * @author arper
 */
public class ManageUserService {
    UserDao userDao;
    ValidateIdentification valId;
    ValidateEmail valEmail;
    ValidatePhoneNumber valPhoneNumber;

    public ManageUserService() {
        userDao = new UserDao();
        valId = new ValidateIdentification();
        valEmail = new ValidateEmail();
        valPhoneNumber = new ValidatePhoneNumber();
    }

    public void registerUser (User user) throws IdExistingExp, EmailExistingExp {
        if (!valEmail.validateEmail(user.getEmail())){
            throw new ValidateEmailExp();
        }
        if (!valId.validateIdentification(user.getId())){
            throw new ValidateIdExp();
        }
        if (!valPhoneNumber.validatePhoneNumbers(user.getPhone())) {
            throw  new ValidatePhoneExp();           
        }
        userDao.insert(user);      
    }
    
    public void modify (User user) throws EmailExistingExp{
        if (!valEmail.validateEmail(user.getEmail())){
            throw new ValidateEmailExp();
        }
        if (!valPhoneNumber.validatePhoneNumbers(user.getPhone())) {
                throw  new ValidatePhoneExp();           
        }
        userDao.modify(user);  
    }
    
    public void delete (long id){
        userDao.delete(id);
    }
    
    public User search (long id){
        return userDao.search(id);
    }
    
    public void roleList(JComboBox rol){
        userDao.roleList(rol);
    }

}
