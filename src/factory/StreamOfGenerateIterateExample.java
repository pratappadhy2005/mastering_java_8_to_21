package factory;

import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.forEach(System.out::println);
        System.out.println("-----");

        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 1);
        integerStream.limit(5).forEach(System.out::println);

        System.out.println("-----");
        Stream<String> generatedStream = Stream.generate(() -> "Hello");
        generatedStream.limit(5).forEach(System.out::println);
    }
}
