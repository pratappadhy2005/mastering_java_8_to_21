package revisit.lambdas;

import java.util.function.Consumer;

public class LamdaVariable2 {
    static int value =4;
    public static void main(String[] args) {

        Consumer<Integer> c1 = (i) -> {
            value++;
            //value = value++; // This will cause a compilation error
            System.out.println(i + value);
        };

        value++;
        c1.accept(5);
    }
}
