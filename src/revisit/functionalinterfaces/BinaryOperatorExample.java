package revisit.functionalinterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> sumOperator = (a, b) -> a + b;
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = sumOperator.apply(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}
