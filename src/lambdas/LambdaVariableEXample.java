package lambdas;

import java.util.function.Consumer;

public class LambdaVariableEXample {
    public static void main(String[] args) {
        int i = 0;
        //Not allowed in Java
        //Consumer<Integer> c1 = (i) -> {System.out.println("Value of i: " + i)};
    }
}
