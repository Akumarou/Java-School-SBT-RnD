package AbstractFactory.myAbstractFactory;

import AbstractFactory.Factories.BadFactory;
import AbstractFactory.Factories.GoodFactory;
import AbstractFactory.Interfaces.AbstractFactory;
import AbstractFactory.Interfaces.Factory;

public class myAbstractFactory implements AbstractFactory {
    private Factory factory;

    public myAbstractFactory(Factories fact) {
        switch (fact){
            case Good:
                this.factory = new GoodFactory();
                break;
            case Bad:
                this.factory = new BadFactory();
                break;
            default: throw new RuntimeException("NOPE");
        }
    }

    public Factory getFactory() {
        return factory;
    }
}
