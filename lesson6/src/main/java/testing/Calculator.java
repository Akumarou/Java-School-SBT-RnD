package testing;

public class Calculator implements ICalculator {
    public  long factorial(long n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}
