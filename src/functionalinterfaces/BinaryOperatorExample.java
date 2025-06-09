package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(10, 20));
        System.out.println(maxBy.apply(10, 20));
        System.out.println(minBy.apply(10, 20));
    }
}
