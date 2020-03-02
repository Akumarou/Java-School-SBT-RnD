public class additional {
    private volatile String ch = "A";

    synchronized void printChar(String chara) {
        while (!chara.equals(ch)) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(chara);
        if (ch.equals("A")) ch = "B";
        else if (ch.equals("B")) ch = "C";
        else ch = "A";
        notifyAll();
    }
}
