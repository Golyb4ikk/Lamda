
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Stream<Person>personStream=Stream.of(new Person("LLL",23),new Person("KKK",24));
        BiConsumer<Person,Person>biConsumer=(min,max)-> System.out.println(min.toString()+max.toString());
        Comparator<Person>personComparator=Comparator.comparing(Person::getAge).thenComparing(Person::getName);
        findMinMax(personStream,personComparator,biConsumer);

        findCountEvenNums(List.of(1,2,3,4));

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? extends T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            list.sort((Comparator<? super T>) order);
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        }
    }

    public static void findCountEvenNums(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        Predicate<Integer> predicate = (n) -> (n % 2) == 0;
        Stream<Integer> resStream = stream.filter(predicate);
        System.out.println("Кол.четных чисел" + resStream.count());
    }
}
