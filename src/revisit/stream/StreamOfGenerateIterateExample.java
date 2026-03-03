package revisit.stream;

import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {
    public static void main(String[] args) {
        Stream<String> strStream=  Stream.of("Java", "Python", "JavaScript");
        strStream.forEach(System.out::println);

        System.out.println("********************");

        Stream<Integer> generateStream = Stream.generate(() -> (int) (Math.random() * 100)).limit(5);
        generateStream.forEach(System.out::println);

        System.out.println("********************");

        Stream<Integer> iterateStream = Stream.iterate(1, n -> n + 1).limit(5);
        iterateStream.forEach(System.out::println);

    }
}
