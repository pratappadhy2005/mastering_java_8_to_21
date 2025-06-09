package generics;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList stringList = new ArrayList();
        stringList.add("Hello");
        stringList.add("World");

        String output = (String) stringList.get(0);
    }
}
