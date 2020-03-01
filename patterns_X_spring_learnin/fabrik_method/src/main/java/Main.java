import myFactory.Factory.MyFactory;
import myFactory.Factory.MyFactoryProducts;
import myFactory.Interfaces.Factory;

public class Main {
    public static void main(String[] args) {
        Factory[] myFactory = {new MyFactory(MyFactoryProducts.COCONUT),
                new MyFactory(MyFactoryProducts.COMPUTER),
                new MyFactory(MyFactoryProducts.TABLE)};
        for (Factory f:myFactory) {
            System.out.println("This is " + f.getFactorySpecial() + " factory. It makes '" + f.makeProduct().getName() + "'");
        }
    }
}
