package revisit.imperativevsdeclarative;

import java.util.List;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /**
         * Imperative  - How style of programming
         */
        List<Integer> uniqueEvenNumbersImperative = new java.util.ArrayList<>();
        for (Integer number : integerList) {
            if (number % 2 == 0 && !uniqueEvenNumbersImperative.contains(number)) {
                uniqueEvenNumbersImperative.add(number);
            }
        }

        System.out.println("Unique Even Numbers using Imperative style: " + uniqueEvenNumbersImperative);

        /**
         * Declarative - What style of programming
         */
        List<Integer> uniqueEvenNumbersDeclarative = integerList.stream()
                .filter(number -> number % 2 == 0)
                .distinct()
                .toList();

        System.out.println("Unique Even Numbers using Declarative style: " + uniqueEvenNumbersDeclarative);
    }
}
