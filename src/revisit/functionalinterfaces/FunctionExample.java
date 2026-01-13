package revisit.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> function = (s) -> s.toUpperCase();

    static Function<String, String> addSomething = (s) -> s + "default";

    public static void main(String[] args) {
        System.out.println(function.apply("hello world"));
        System.out.println(function.andThen(addSomething).apply("hello world"));
        System.out.println(function.compose(addSomething).apply("hello world"));
    }
}
