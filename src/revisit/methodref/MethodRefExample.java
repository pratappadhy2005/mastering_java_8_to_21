package revisit.methodref;

import java.util.function.Function;

public class MethodRefExample {

    Function<String, String> function = String::toUpperCase;

    public static void main(String[] args) {
        // Static method reference
        Runnable r1 = MethodRefExample::printMessage;
        r1.run();

        // Instance method reference
        MethodRefExample example = new MethodRefExample();
        Runnable r2 = example::instancePrintMessage;
        r2.run();
    }

    private void instancePrintMessage() {
        System.out.println("Hello from instance method reference!");
    }

    private static void printMessage() {
        System.out.println("Hello from static method reference!");
    }
}
