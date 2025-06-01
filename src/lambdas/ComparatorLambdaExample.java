package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior to JAVA8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Prior to JAVA8: " + comparator.compare(10, 20));

        /**
         * Using Lambda Expression
         */
        Comparator<Integer> lambdaComparator = (o1, o2) -> {
            return o1.compareTo(o2);
        };

        System.out.println("Using Lambda Expression: " + lambdaComparator.compare(10, 20));
    }
}
