package service;

import dao.UserDao;
import exeptions.EmailExistingExp;
import exeptions.IdExistingExp;
import exeptions.ValidateEmailExp;
import exeptions.ValidateIdExp;
import exeptions.ValidatePhoneExp;
import models.User;
import validation.ValidateEmail;
import validation.ValidateIdentification;
import validation.ValidatePhoneNumber;

/**
 *
 * @author arper
 */
public class RegisterUserService {
    UserDao userDao;
    ValidateIdentification valId;
    ValidateEmail valEmail;
    ValidatePhoneNumber valPhoneNumber;

    public RegisterUserService() {
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

}
