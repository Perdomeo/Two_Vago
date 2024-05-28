package models;

/**
 *
 * @author William
 */
public class Role {
    private String role;
    private int code;

    public Role(int code) {
        this.code = code;
    }

    public Role(String role, int code) {
        this.role = role;
        this.code = code;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        return role; 
    }

}
