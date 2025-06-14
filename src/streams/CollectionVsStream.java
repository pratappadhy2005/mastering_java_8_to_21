package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.remove(0);

        System.out.println(names);

        for (String str : names) {
            System.out.println(str);
        }

        for (String str : names) {
            System.out.println(str);
        }

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        System.out.println("==========================");
        //Can't reuse a stream to loop in the same way
        stream.forEach(System.out::println);
    }
}
