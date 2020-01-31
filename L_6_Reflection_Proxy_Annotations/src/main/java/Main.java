import testing.Calculator;
import testing.ICalculator;
import testing.NeverSleepingEye;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        MyClassForFrom from = new MyClassForFrom(5,"wow",6f,7d);
        MyClassForTo to = new MyClassForTo();
        System.out.println("Before:\nFrom: " + from + "\nTo: " + to);
        BeanUtils.assign(to,from);
        System.out.println("\nAfter:\nFrom: " + from + "\nTo: " + to);

        System.out.println("\n\n\nCached calculator test\n");
        Calculator calculator = new Calculator();
        System.out.println("Not proxy cached");
        long startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++) calculator.factorial((long)(i%10000));
        System.out.println("It lasted " + (System.currentTimeMillis()-startTime) + "ms");

        ICalculator calculatorProxy = (ICalculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(),
                Calculator.class.getInterfaces(),
                new NeverSleepingEye(calculator));

        System.out.println("Proxy cached");
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++) calculatorProxy.factorial((long)(i%10000));
        System.out.println("It lasted " + (System.currentTimeMillis()-startTime) + "ms");


    }
}
