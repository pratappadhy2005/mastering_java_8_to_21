package lambdas;

public class RunnableLambdaExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Running in a separate thread using Runnable interface.");
    }

    public static void main(String[] args) {
        /**
         * Prior to Java 8
         */
        Runnable runnable = new RunnableLambdaExample();
        Thread thread = new Thread(runnable);
        thread.start();

        /**
         * Using Lambda Expression in Java 8 and later
         */
        Runnable runnableLambda = () -> {
            System.out.println("Running in a separate thread using Lambda expression.");
            System.out.println("This is a simple example of using Lambda expressions to implement Runnable interface.");
        };
        Thread threadLambda = new Thread(runnableLambda);
        threadLambda.start();

        new Thread(() ->
            System.out.println("Running in a separate thread using Lambda expression with inline implementation.")).start();
    }
}
