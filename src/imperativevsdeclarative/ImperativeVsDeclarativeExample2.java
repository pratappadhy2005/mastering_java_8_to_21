package imperativevsdeclarative;

import java.util.Arrays;
import java.util.List;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /** * Imperative programming: Step-by-step instructions to filter and print even numbers.
         * Example: Print even numbers from a list.
         */
        System.out.println("Imperative approach:");
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        /** * Declarative programming: Focus on the result rather than the steps to achieve it.
         * Example: Print even numbers from a list using a functional approach.
         */
        System.out.println("Declarative approach:");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
