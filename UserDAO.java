package dao;

import java.sql.*;
import model.User;

public class UserDAO {

    public void addUser(User user) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users(name,email,role) VALUES(?,?,?)");

            ps.setString(1, user.name);
            ps.setString(2, user.email);
            ps.setString(3, user.role);

            ps.executeUpdate();
            con.close();
            System.out.println("User Added Successfully");
        } catch (Exception e) {
            System.out.println("User Insertion Failed");
        }
    }
}
