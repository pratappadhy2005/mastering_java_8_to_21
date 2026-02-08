package revisit.lambdas;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int result = X % N;

        if (result == 0)
            System.out.print(N);
        else
            System.out.print(result);

        sc.close();
    }

}