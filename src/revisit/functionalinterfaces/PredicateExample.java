package revisit.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isEven = number -> number % 2 == 0;

    static Predicate<Integer> isPositive = number -> number > 0;

    static Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);

    public static void main(String[] args) {

        int testNumber = -1;
        if (isEven.test(testNumber)) {
            System.out.println(testNumber + " is even.");
        } else {
            System.out.println(testNumber + " is odd.");
        }

        if (isPositive.test(testNumber)) {
            System.out.println(testNumber + " is positive.");
        } else {
            System.out.println(testNumber + " is negative or zero.");
        }

        if (isEvenAndPositive.test(testNumber)) {
            System.out.println(testNumber + " is even and positive.");
        } else {
            System.out.println(testNumber + " is not both even and positive.");
        }

    }
}
