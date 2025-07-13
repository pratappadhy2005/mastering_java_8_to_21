package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 10); // Generates a stream of integers from 1 to 9 (inclusive of 1, exclusive of 10)
        intStream.forEach(System.out::println); // Prints each number in the stream

        System.out.println("-----");

        IntStream intStream2 = IntStream.rangeClosed(1, 10); // Generates a stream of integers from 1 to 10 (inclusive of both)
        intStream2.forEach(System.out::println); // Prints each number in the stream

        System.out.println("-----");
        LongStream.range(1, 10).forEach(System.out::println); // Generates a stream of long integers from 1 to 9
        System.out.println("-----");
        LongStream.rangeClosed(1, 10).forEach(System.out::println); // Generates a stream of long integers from 1 to 10

        // Example of using range with a step
        System.out.println("-----");
        IntStream.range(1, 20).filter(n -> n % 2 == 0).forEach(System.out::println); // Prints even numbers from 1 to 19
    }
}
