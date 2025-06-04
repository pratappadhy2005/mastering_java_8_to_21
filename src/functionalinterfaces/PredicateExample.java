package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (i) -> i > 10;

        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        System.out.println("Is 15 greater than 10 and even as well ? " + predicate.and(isEven).test(15)); // true
        System.out.println("Is 15 greater than 10 or even as well ? " + predicate.or(isEven).test(15)); // false
        System.out.println("Is 15 not greater than 10 ? " + predicate.negate().test(15)); // false
    }
}
