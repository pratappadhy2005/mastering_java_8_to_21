package revisit.stream;

import java.util.Optional;

public class StreamLimitAndSkipExample {

    public static Optional<Integer> limitExample() {
        return java.util.stream.IntStream.rangeClosed(1, 10)
                .limit(5)
                .boxed()
                .findFirst();
    }

    public static Optional<Integer> skipExample() {
        return java.util.stream.IntStream.rangeClosed(1, 10)
                .skip(5)
                .boxed()
                .findFirst();
    }

    public static int sumWithLimitWithReduce() {
        return java.util.stream.IntStream.rangeClosed(1, 10)
                .limit(5)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        java.util.stream.IntStream.rangeClosed(1, 10)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("********************");

        java.util.stream.IntStream.rangeClosed(1, 10)
                .skip(5)
                .forEach(System.out::println);

        System.out.println("********************");

        System.out.println(limitExample().orElse(-1));

        System.out.println("********************");

        System.out.println(skipExample().orElse(-1));

        System.out.println("********************");

        System.out.println(sumWithLimitWithReduce());
    }
}
