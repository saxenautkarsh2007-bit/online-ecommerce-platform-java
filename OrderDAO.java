package dao;

import java.sql.*;
import model.Order;

public class OrderDAO {

    public void placeOrder(Order o) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO orders(buyer_id,product_id,quantity,status) VALUES(?,?,?,'Pending')");

            ps.setInt(1, o.getBuyerId());
            ps.setInt(2, o.getProductId());
            ps.setInt(3, o.getQuantity());

            ps.executeUpdate();
            con.close();
            System.out.println("Order Placed Successfully");
        } catch (Exception e) {
            System.out.println("Order Failed");
        }
    }
}
