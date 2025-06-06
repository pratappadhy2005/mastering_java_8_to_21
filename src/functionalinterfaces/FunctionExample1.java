package functionalinterfaces;

public class FunctionExample1 {
    public static void performConcate(String str){
        System.out.println(FunctionExample.stringLength.apply(str));
    }

    public static void main(String[] args) {
        performConcate("PratapPadhy");
    }
}
