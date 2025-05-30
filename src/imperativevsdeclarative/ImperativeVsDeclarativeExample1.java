package imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /** * Imperative programming: Step-by-step instructions to achieve a result.
         * Example: Calculate the sum of even numbers from 1 to 10.
         */
        int sum = 0 ;
        for (int i =0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Imperative Sum of even numbers from 1 to 100: " + sum);

        /** * Declarative programming: Focus on the result rather than the steps to achieve it.
         * Example: Calculate the sum of even numbers from 1 to 10 using a functional approach.
         */
        int sum1 = IntStream.rangeClosed(1, 101)
                .sum();
        System.out.println("Declarative Sum of even numbers from 1 to 100: " + sum1);
    }
}
