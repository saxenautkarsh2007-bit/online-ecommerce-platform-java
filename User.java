package model;

public class User {
    protected int id;
    protected String name;
    protected String email;
    protected String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
}
