import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HomeWorkStream<T> {
    private List<T> list = null;

    private HomeWorkStream(List<T> list) {
        this.list = list;
    }


    public static <T> HomeWorkStream<T> of(T... values) {
        List<T> arrayList = Arrays.asList(values);
        return new HomeWorkStream<T>(arrayList);
    }
    public static <T> HomeWorkStream<T> of(List<T> source) {
        return new HomeWorkStream<T>(source);
    }

    public HomeWorkStream<T> filter(Predicate<? super T> predicate) {
        list = list.stream().filter(predicate).collect(Collectors.toList());
        return this;
    }

    public HomeWorkStream<T> transform(Consumer<? super T> consumer) {
        list.forEach(consumer);
        return this;
    }

    public Map toMap(Function<? super T,?> mapper) {
        Map map = (Map) list.stream().map(mapper);
        return map;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        list.forEach(e->result.append(e.toString()+"\n"));
        return result.toString();
    }
}
