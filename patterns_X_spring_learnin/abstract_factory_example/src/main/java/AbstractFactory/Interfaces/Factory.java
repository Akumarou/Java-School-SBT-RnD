package AbstractFactory.Interfaces;

import java.util.List;

public interface Factory {
    String getFactorySpeciality();
    List<Product> initProducts();
}
