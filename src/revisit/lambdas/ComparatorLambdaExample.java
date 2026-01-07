package revisit.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior to Java 8
         */
        Comparator<Integer> comparatorOld = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Comparison using anonymous class: " + comparatorOld.compare(10, 20));

        /**
         * Java 8 Lambda Expression
         */
        Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Comparison using lambda expression: " + comparatorLambda.compare(10, 20));

    }
}
