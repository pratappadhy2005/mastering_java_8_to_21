package revisit.stream;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static int performMultiplication(int a, int b) {
        System.out.println("Multiplying " + a + " and " + b);
        return a * b;
    }

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1, ReduceExample::performMultiplication);
    }

    public static int performMultiplicationV2(List<Integer> integerList){
        return integerList.stream()
                .reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGpaStudent(List<Student> studentList) {
        return studentList.stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 3, 5, 7);
        System.out.println(performMultiplication(integerList));

        System.out.println("********************");

        System.out.println(performMultiplicationV2(integerList));

        System.out.println("********************");

        System.out.println(performMultiplicationWithoutIdentity(integerList).orElse(0));

        System.out.println("********************");

        List<Student> studentList = StudentDataBase.getAllStudents();
        Optional<Student> studentOptional = getHighestGpaStudent(studentList);
        studentOptional.ifPresent(System.out::println);
    }
}
