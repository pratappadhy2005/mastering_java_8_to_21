package revisit.imperativevsdeclarative;

public class ImerativeVsDeclarative {
    public static void main(String[] args) {
        /**
         * Imperative  - How style of programming
         */

        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum using Imperative style: " + sum);

        /**
         * Declarative - What style of programming
         */
        int declarativeSum = java.util.stream.IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum using Declarative style: " + declarativeSum);
    }
}
