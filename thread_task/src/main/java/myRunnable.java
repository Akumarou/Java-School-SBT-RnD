public class myRunnable implements Runnable {
    private String a;
    private additional ad;

    public myRunnable(String a, additional ad) {
        this.a = a;
        this.ad = ad;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) ad.printChar(a);
    }
}
