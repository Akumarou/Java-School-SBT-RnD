public class Main {
    public static void main(String[] args) throws InterruptedException {
       Thread t[] = new Thread[1000];

        for(int i=0;i<1000;i++)
            t[i] = new Thread(new R());


        for(int i=0;i<1000;i++)
            t[i].start();


        for(int i=0;i<1000;i++)
            t[i].join();

        System.out.println(SingletonLogger.getInstance().getCounter());



    }
}
