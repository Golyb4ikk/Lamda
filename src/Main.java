
import java.util.function.*;


public class Main {
    public static void main(String[] args) {
      Supplier<Integer>supplier=new Supplier<Integer>(){
          @Override
          public Integer get(){
              return (int)(Math.random()*100);
          }
      };
      Supplier<Integer>supplier1=()->(int)(Math.random()*100);
    }

}
