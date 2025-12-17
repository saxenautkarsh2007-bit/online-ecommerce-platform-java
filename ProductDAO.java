package dao;

import java.sql.*;
import model.Product;

public class ProductDAO {

    public void addProduct(Product p) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO products(name,description,price,quantity,seller_id) VALUES(?,?,?,?,?)");

            ps.setString(1, p.getName());
            ps.setString(2, p.getDescription());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQuantity());
            ps.setInt(5, p.getSellerId());

            ps.executeUpdate();
            con.close();
            System.out.println("Product Added Successfully");
        } catch (Exception e) {
            System.out.println("Product Addition Failed");
        }
    }
}
