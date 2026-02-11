package revisit.stream;

import revisit.data.Student;
import revisit.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

        getNamesList();

        System.out.println("********************");

        getNamesSet();
    }

    private static void getNamesSet() {
        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    private static void getNamesList() {
        List<String> studentNameList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        for (String name : studentNameList) {
            System.out.println(name);
        }
    }
}
