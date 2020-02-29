public class R implements Runnable {
    public void run() {
        SingletonLogger.getInstance();
    }
}
