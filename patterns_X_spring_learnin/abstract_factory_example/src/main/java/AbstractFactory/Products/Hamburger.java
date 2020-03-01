package AbstractFactory.Products;

import AbstractFactory.Interfaces.Product;

public class Hamburger implements Product {
    String name;
    public Hamburger(String name){
        this.name = name;
    }
    public String getProductName() {
        return name;
    }
}
