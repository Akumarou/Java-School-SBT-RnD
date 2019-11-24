public class Main {
    public static void main(String[] args) {
        MyClassForFrom from = new MyClassForFrom(5,"wow",6f,7d);
        MyClassForTo to = new MyClassForTo();
        System.out.println("Before:\nFrom: " + from + "\nTo: " + to);
        BeanUtils.assign(to,from);
        System.out.println("\nAfter:\nFrom: " + from + "\nTo: " + to);



    }
}
