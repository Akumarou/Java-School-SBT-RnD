import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    private static final Random rand = new Random();

    public static void main(String[] args) {

        List<Person> someCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            someCollection.add(new Person((rand.nextInt() % 50 + 10), ("Name" + i)));
        }

        HomeWorkStream<Person> stream = HomeWorkStream.of(someCollection)
                .filter(p -> p.getAge() > 30)
                .transform(p -> new Person(p.getAge() + 30));
        System.out.println(stream);

        Map map = stream.toMap(Person::getName);
        System.out.println(map.toString());

    }
}
