package models;

/**
 *
 * @author arper
 */
public class TypeRoom {
    private int id;
    private String type;

    public TypeRoom(int id) {
        this.id = id;
    }

    public TypeRoom(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return type;
    }
}
