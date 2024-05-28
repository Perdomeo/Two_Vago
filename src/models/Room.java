package models;

/**
 *
 * @author William
 */
public class Room {
    private int id;
    private Hotel hotelCode;
    private TypeRoom type;
    private int numberPersons;
    private float priceNigth;
    private StatusRoom status;

    public Room(int id) {
        this.id = id;
    }

    public Room(int id, TypeRoom type) {
        this.id = id;
        this.type = type;
    }

    public Room(int id, Hotel hotelCode, TypeRoom type, int numberPersons, float priceNigth, StatusRoom status) {
        this.id = id;
        this.hotelCode = hotelCode;
        this.type = type;
        this.numberPersons = numberPersons;
        this.priceNigth = priceNigth;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hotel getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(Hotel hotelCode) {
        this.hotelCode = hotelCode;
    }

    public TypeRoom getType() {
        return type;
    }

    public void setType(TypeRoom type) {
        this.type = type;
    }

    public int getNumberPersons() {
        return numberPersons;
    }

    public void setNumberPersons(int numberPersons) {
        this.numberPersons = numberPersons;
    }

    public float getPriceNigth() {
        return priceNigth;
    }

    public void setPriceNigth(float priceNigth) {
        this.priceNigth = priceNigth;
    }

    public StatusRoom getStatus() {
        return status;
    }

    public void setStatus(StatusRoom status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return type.getType();
    }
}
