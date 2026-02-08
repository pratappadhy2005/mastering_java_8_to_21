package revisit.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {

        // Collections vs Stream
        // Collections (can remove or modify the original collection)
        //Collection can traverse multiple times
        // Collection performs external iteration
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Eve");
        names.add("John");

        for (String name : names) {
            System.out.println(name);
        }

        names.removeIf(name -> name.startsWith("A"));

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("------------------");

        // Stream (can't remove or modify the original collection)
        // Streams lazily evaluate the operations
        // Streams can traverse only once
        // Strams performs internal iteration
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);

        Stream<String> nameStream = names.stream()
                .filter(name -> name.startsWith("E"));
        nameStream.forEach(System.out::println);

        nameStream.forEach(System.out::println); // This will throw an exception
    }
}
