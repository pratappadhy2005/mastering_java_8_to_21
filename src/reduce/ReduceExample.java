package reduce;

import java.util.List;
import java.util.Optional;

public class ReduceExample {

    public static int sum(List<Integer> numbers) {
        return numbers.stream()
                      .reduce(0, (a,b) -> a + b);
    }

    public static Optional<Integer> sumWithoutIdentity(List<Integer> numbers) {
        return numbers.stream()
                .reduce((a,b) -> a + b);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int total = sum(numbers);
        System.out.println("Total sum: " + total);
        System.out.println("Sum without identity: " +
            sumWithoutIdentity(numbers).orElse(0));
    }
}
