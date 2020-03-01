package myFactory.Factory;

import myFactory.Interfaces.*;
import myFactory.Products.Coconut;
import myFactory.Products.Computer;
import myFactory.Products.Table;

public class MyFactory implements Factory {
    private MyFactoryProducts prod;
    public MyFactory(MyFactoryProducts prod){
        this.prod = prod;
    }
    @Override
    public Product makeProduct() {
        switch(prod){
            case COCONUT: return new Coconut();
            case COMPUTER: return new Computer();
            case TABLE: return new Table();
            default: throw new RuntimeException("No such product!");
        }
    }
    @Override
    public String getFactorySpecial(){
        return prod.toString();
    }
}
