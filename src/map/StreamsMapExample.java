package map;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();

        //System.out.println(studentList);

        Set<String> nameList = studentList.stream()
                .map(Student::getName) // Extracting names from Student objects
                .map(String::toUpperCase) // Converting names to uppercase
                .collect(Collectors.toSet());

        for (String s : nameList) {
            System.out.println(s);
        }
    }
}
