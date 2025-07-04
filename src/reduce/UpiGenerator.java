package reduce;

import java.util.Random;

public class UpiGenerator {

    public static String generateUpiNumber() {
        Random random = new Random();
        int length = random.nextBoolean() ? 8 : 9;

        // Ensure it doesn't start with zero
        int firstDigit = random.nextInt(9) + 1;
        StringBuilder upi = new StringBuilder();
        upi.append(firstDigit);

        for (int i = 1; i < length; i++) {
            upi.append(random.nextInt(10));
        }

        return upi.toString();
    }

    public static void main(String[] args) {
        System.out.println("Generated UPI Number: " + generateUpiNumber());
    }
}
