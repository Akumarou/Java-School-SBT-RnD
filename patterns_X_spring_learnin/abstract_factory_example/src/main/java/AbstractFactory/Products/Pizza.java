package AbstractFactory.Products;

import AbstractFactory.Interfaces.Product;

public class Pizza implements Product {
    String name;

    public Pizza(String name) {
        this.name = name;
    }

    public String getProductName() {
        return name;
    }
}
