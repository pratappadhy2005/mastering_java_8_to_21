package revisit.stream;

import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static int performMultiplication(int a, int b) {
        System.out.println("Multiplying " + a + " and " + b);
        return a * b;
    }

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1, ReduceExample::performMultiplication);
    }

    public static int performMultiplicationV2(List<Integer> integerList){
        return integerList.stream()
                .reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) -> a*b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 3, 5, 7);
        System.out.println(performMultiplication(integerList));
        System.out.println(performMultiplicationV2(integerList));

        System.out.println(performMultiplicationWithoutIdentity(integerList).orElse(0));
    }
}
