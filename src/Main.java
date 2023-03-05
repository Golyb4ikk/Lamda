
import java.util.function.*;


public class Main {
    public static void main(String[] args) {
       Function<Double,Long>function=new Function<Double, Long>() {
           @Override
           public Long apply(Double aDouble) {
               return Math.round(aDouble);
           }
       };
        Function<Double,Long>function1=function2 ->Math.round(function2);
    }

}
