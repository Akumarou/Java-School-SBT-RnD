import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> journal = createJournal();
        writeList(journal);
        for(int i = 0; i < 10; i++){
            tryToMarry(journal);
            writeList(journal);
        }
    }

    private static ArrayList<Person> createJournal() {
        ArrayList<Person> journal = new ArrayList<Person>();
        journal.add(new Person(true,"Kovenov Ivan Olegovich"));
        journal.add(new Person(false,"Hoperova Inna Olegovna"));
        journal.add(new Person(true,"Kazanskii Viktor Sergeevich"));
        journal.add(new Person(false,"Lyubimaya Olga Stanislavovna"));
        journal.add(new Person(true,"Koshevoi Igor Nikolaevich"));
        journal.add(new Person(false,"Grek Anastasia Denisovna"));
        journal.add(new Person(true,"Repnikov Aleksei Nikolaevich"));
        return journal;
    }

    private static void tryToMarry(ArrayList<Person> journal) {
        Random rand = new Random();
        int first = rand.nextInt(journal.size());
        int second = rand.nextInt(journal.size());
        System.out.println("Trying to marry " + journal.get(first) + " with " + journal.get(second));
        if (journal.get(first).marry(journal.get(second))) System.out.println("success"); else System.out.println("denied");

    }

    private static void writeList(ArrayList<Person> journal) {
        System.out.println("Journal of residents");
        for(int i=0;i<journal.size();i++) System.out.println(journal.get(i));
        System.out.println();
    }
}
