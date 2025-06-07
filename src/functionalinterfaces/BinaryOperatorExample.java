package functionalinterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

    public static void main(String[] args) {
        System.out.println(new BinaryOperatorExample().binaryOperator.apply(10, 20));
    }
}
