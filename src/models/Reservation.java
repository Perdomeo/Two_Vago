package models;

/**
 *
 * @author William
 */
public class Reservation {
    private int code;
    private Hotel idHotel;
    private Room idRoom;
    private User idUser;
    private int numberPerson;
    private String dateEnty;
    private String dateDeparture;
    private float totalPrice;
    private String condition;

    public Reservation() {
    }

    public Reservation(int code) {
        this.code = code;
    }

    public Reservation(int code, Hotel idHotel, Room idRoom, User idUser, int numberPerson, String dateEnty, String dateDeparture, float totalPrice, String condition) {
        this.code = code;
        this.idHotel = idHotel;
        this.idRoom = idRoom;
        this.idUser = idUser;
        this.numberPerson = numberPerson;
        this.dateEnty = dateEnty;
        this.dateDeparture = dateDeparture;
        this.totalPrice = totalPrice;
        this.condition = condition;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Hotel getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Hotel idHotel) {
        this.idHotel = idHotel;
    }

    public Room getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Room idRoom) {
        this.idRoom = idRoom;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public String getDateEnty() {
        return dateEnty;
    }

    public void setDateEnty(String dateEnty) {
        this.dateEnty = dateEnty;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
