package models;

/**
 *
 * @author arper
 */
public class StatusRoom {
    private int id;
    private String status;

    public StatusRoom(int id) {
        this.id = id;
    }

    public StatusRoom(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return status;
    }
}
