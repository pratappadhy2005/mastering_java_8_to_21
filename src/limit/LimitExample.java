package limit;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LimitExample {

    public static List<Student> getPartialStudents(List<Student> students, int limit) {
        return students.stream()
                       .limit(limit)
                       .collect(Collectors.toList());
    }

    public static List<Student> getPartialStudentsWithSkip(List<Student> students, int limit, int skip) {
        return students.stream()
                       .skip(skip)
                       .limit(limit)
                       .collect(Collectors.toList());
    }

    public static Optional<Integer> getSumOfNumbers(List<Integer> numbers){
        return numbers.stream()
                      .limit(5)
                      .reduce((a,b) -> a + b);
    }

    public static void main(String[] args) {
        //Limit example
        List<Student> students= StudentDataBase.getAllStudents();
        List<Student> limitedStudents = getPartialStudents(students, 3);
        for (Student student : limitedStudents) {
            System.out.println(student);
        }

        //Skip example
        System.out.println("Students after skipping 2 and limiting to 3:");
        List<Student> skippedAndLimitedStudents = getPartialStudentsWithSkip(students, 3, 2);
        for (Student student : skippedAndLimitedStudents) {
            System.out.println(student);
        }

        //Get sum of numbers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> sum = getSumOfNumbers(numbers);
        System.out.println("Sum of first 5 numbers: " + sum.orElse(0));
    }
}
