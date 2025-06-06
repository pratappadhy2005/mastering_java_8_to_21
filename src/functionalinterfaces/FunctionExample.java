package functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, Integer> stringLength = str -> str.length();

    static Function<String, String> toUpperCase = str -> str.toUpperCase();

    public static void main(String[] args) {
        System.out.println(toUpperCase.andThen(stringLength).apply("PratapPadhy")); // Returns 13
        System.out.println(stringLength.compose(toUpperCase).apply("PratapPadhy")); // Returns 13
    }
}
