package AbstractFactory.Factories;

import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Product;
import AbstractFactory.Products.Hamburger;
import AbstractFactory.Products.Pizza;

import java.util.Arrays;
import java.util.List;

public class BadFactory implements Factory {
    public String getFactorySpeciality()  {
        return "I am a bad factory";
    }

    public List<Product> initProducts() {
        return Arrays.asList(new Hamburger("Bad hamburger"),new Pizza("Bad pizza"));
    }
}
