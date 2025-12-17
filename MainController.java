package controller;

import service.*;
import model.*;

public class MainController {

    UserService userService = new UserService();
    ProductService productService = new ProductService();
    OrderService orderService = new OrderService();

    public void demo() {
        userService.addUser(new Seller("Seller1", "seller@gmail.com"));
        productService.addProduct(new Product("Laptop","Gaming",50000,5,1));
        orderService.placeOrder(new Order(2,1,1));
    }
}
