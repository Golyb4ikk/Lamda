
import java.util.function.*;


public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        Predicate<Integer>predicate1=integer -> integer >0;
        System.out.println(predicate.test(2));
        System.out.println(predicate1.test(-10));
    }
}
