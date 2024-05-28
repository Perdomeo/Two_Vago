package models;

/**
 *
 * @author William
 */
public class User {
    private long id;
    private String name;
    private String lastName;
    private String email;
    private String genero;
    private String password;
    private int age;
    private String address;
    private String phone;
    private Role role;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(long id) {
        this.id = id;
    }

    public User(long id, String name, String lastName, String email, String genero, String password, int age, String address, String phone, Role role) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.genero = genero;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    } 
}
