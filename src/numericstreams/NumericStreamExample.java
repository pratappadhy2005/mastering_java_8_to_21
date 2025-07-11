package numericstreams;

import java.util.List;

public class NumericStreamExample {

    public static int sum(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (a,b)-> a + b);
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
       System.out.println("Sum of integers: " + sum(integers));
    }
}
