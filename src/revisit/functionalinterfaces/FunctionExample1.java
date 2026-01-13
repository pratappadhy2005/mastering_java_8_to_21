package revisit.functionalinterfaces;

public class FunctionExample1 {
    public static String performConcat(String str){
      return FunctionExample.addSomething.apply(str);
    }

    public static void main(String[] args) {
        System.out.println(performConcat("hello world"));
    }
}
