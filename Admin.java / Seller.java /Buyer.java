package model;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email, "ADMIN");
    }
}


package model;

public class Seller extends User {
    public Seller(String name, String email) {
        super(name, email, "SELLER");
    }
}


package model;

public class Buyer extends User {
    public Buyer(String name, String email) {
        super(name, email, "BUYER");
    }
}
