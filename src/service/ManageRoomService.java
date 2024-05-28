package service;

import dao.RoomDao;
import dao.UserDao;
import exeptions.IdExistingExp;
import exeptions.ValidateEmailExp;
import javax.swing.JComboBox;
import models.Room;
import validation.ValidateIdentification;

/**
 *
 * @author arper
 */
public class ManageRoomService {
    RoomDao roomDao;
    ValidateIdentification valId;
      
    public ManageRoomService() {
        roomDao = new RoomDao();
        valId = new ValidateIdentification();
    }
    
    public void register(Room room) throws IdExistingExp{
        if (valId.validateIdentification(room.getId())){
            throw new ValidateEmailExp();
        }
        roomDao.insert(room);
    }
    
    public void delete (int id){
        roomDao.delete(id);
    }
    
    public Room search (int id){
        return roomDao.search(id);
    }
    
    public void modify (Room room){
        roomDao.modify(room);
    }
    
    public void TypeList(JComboBox rol){
        roomDao.typeList(rol);
    }

    public void hotelList(JComboBox hotel){
        roomDao.hotelList(hotel);
    }
    
}
