package revisit.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior to Java 8
         */
        Runnable runnableOld = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable using anonymous class");
            }
        };

        new Thread(runnableOld).start();

        //Java8 Lambda Expression
        Runnable runnableLambda = () -> System.out.println("Runnable using lambda expression");
        new Thread(runnableLambda).start();
        new Thread(() -> System.out.println("Runnable using inline lambda expression")).start();
    }
}
