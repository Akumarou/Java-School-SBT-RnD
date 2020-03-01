import AbstractFactory.Interfaces.*;
import AbstractFactory.myAbstractFactory.*;

public class Main {
    public static void main(String[] args) {
        AbstractFactory[] factories = {new myAbstractFactory(Factories.Good),new myAbstractFactory(Factories.Bad)};
        for(AbstractFactory f:factories){
            System.out.println(f.getFactory().getFactorySpeciality());
            f.getFactory().initProducts().forEach(e-> System.out.println(e.getProductName()));
            System.out.println();
        }
    }
}
