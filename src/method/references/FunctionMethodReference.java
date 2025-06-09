package method.references;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String, String> toUpperCaseLambda = (str) -> str.toUpperCase();
    static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("hello world"));
        System.out.println(toUpperCaseMethodRef.apply("hello world"));
    }
}
