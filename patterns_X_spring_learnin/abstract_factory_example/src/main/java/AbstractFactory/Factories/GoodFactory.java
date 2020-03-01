package AbstractFactory.Factories;

import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Product;
import AbstractFactory.Products.Hamburger;
import AbstractFactory.Products.Pizza;

import java.util.Arrays;
import java.util.List;

public class GoodFactory implements Factory {

    public String getFactorySpeciality() {
        return "I am a good factory";
    }

    public List<Product> initProducts() {
        return Arrays.asList(new Hamburger("Good hamburger"),new Pizza("Good pizza"));
    }

}
