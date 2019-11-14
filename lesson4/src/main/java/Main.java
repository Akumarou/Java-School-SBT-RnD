import javax.crypto.spec.PSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CountMapIml<Integer> map = new CountMapIml<Integer>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        System.out.println("Стандартный вывод по поиску элемента");
        System.out.println(map.getCount(5)); // 2
        System.out.println(map.getCount(6)); // 1
        System.out.println(map.getCount(10)); // 3



        System.out.println();System.out.println();
        System.out.println("проверка метода toMap()");
        Map<Integer,Integer> a = map.toMap();
        for (Map.Entry<Integer,Integer> t:a.entrySet()) {
            System.out.println(t.getKey() + " " + t.getValue());
        }



        System.out.println();System.out.println();
        System.out.println("проверка метода toMap(Map<T, Integer> destination)");
        Map<Integer,Integer> b = new HashMap<Integer, Integer>();
        map.toMap(b);
        for (Map.Entry<Integer,Integer> t:b.entrySet()) {
            System.out.println(t.getKey() + " " + t.getValue());
        }



        System.out.println();System.out.println();
        System.out.println("проверка метода addAll (до добавления)");
        CountMapIml<Integer> map2 = new CountMapIml<Integer>();
        map2.add(12);
        map2.add(13);
        map2.add(13);
        map2.add(12);
        map2.add(4);
        map2.add(4);
        Map<Integer,Integer> a1 = map2.toMap();
        for (Map.Entry<Integer,Integer> t:a1.entrySet()) {
            System.out.println(t.getKey() + " " + t.getValue());
        }



        System.out.println();System.out.println();
        System.out.println("проверка метода addAll (после добавления)");
        map2.addAll(map);
        Map<Integer,Integer> a2 = map2.toMap();
        for (Map.Entry<Integer,Integer> t:a2.entrySet()) {
            System.out.println(t.getKey() + " " + t.getValue());
        }
    }
}
