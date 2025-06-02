package functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (msg) -> {
            System.out.println("Message received: " + msg);
        };

        consumer.accept("Hello, World!");
    }
}
