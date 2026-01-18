package revisit.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<Integer> squareOperator = number -> number * number;

    public static void main(String[] args) {
        int number = 5;
        int squaredValue = squareOperator.apply(number);
        System.out.println("The square of " + number + " is: " + squaredValue);
    }
}
