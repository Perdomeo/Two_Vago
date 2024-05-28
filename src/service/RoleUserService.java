package service;

import dao.RoleUserDao;
import exeptions.CodeExistingExp;
import exeptions.ValidateCodeExp;
import javax.swing.JComboBox;
import models.Role;
import validation.ValidateCode;

/**
 *
 * @author arper
 */
public class RoleUserService {
    RoleUserDao roleUserDao;
    ValidateCode valCode;
    
    public RoleUserService() {
        roleUserDao = new RoleUserDao();
        valCode = new ValidateCode();
    }
    
    public void register (Role role) throws CodeExistingExp{
        if (!valCode.validateCode(role.getCode())){
            throw new ValidateCodeExp();
        }          
        roleUserDao.insert(role);
    }
    
    public void modify(Role role){
        roleUserDao.modify(role);
    }
    
    public Role search(int code){
        return roleUserDao.search(code);
    }
    
    public void delete(int code){
        roleUserDao.delete(code);
    }

}
