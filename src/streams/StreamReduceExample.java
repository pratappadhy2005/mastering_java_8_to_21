package streams;

import java.util.List;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> numbers) {
        return numbers.stream()
                      .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int result = performMultiplication(numbers);
        System.out.println("Product of numbers: " + result);
    }
}
