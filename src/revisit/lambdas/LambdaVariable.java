package revisit.lambdas;

import java.util.function.Consumer;

public class LambdaVariable {

    public static void main(String[] args) {
        int i = 1;

        Consumer<Integer> c1 = ((i1) -> {
            //i=3; // This will cause a compilation error
            System.out.println(i);
        });
    }
}
