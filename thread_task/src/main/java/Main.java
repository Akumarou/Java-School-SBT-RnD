public class Main {
    public static void main(String[] args) {
        additional a = new additional();
        new Thread(new myRunnable("A", a)).start();
        new Thread(new myRunnable("B", a)).start();
        new Thread(new myRunnable("C", a)).start();
    }
}