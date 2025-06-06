package functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel > 10 && gpa >= 3.0;

        System.out.println(biPredicate.test(10, 35.0));
    }
}
