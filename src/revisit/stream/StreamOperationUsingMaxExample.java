package revisit.stream;

import revisit.data.Student;
import revisit.data.StudentDataBase;

public class StreamOperationUsingMaxExample {

    //max using reduce
    public static int maxUsingReduce() {
        return java.util.stream.IntStream.of(1, 2, 3, 4, 5)
                .reduce(Integer.MIN_VALUE, Integer::max);
    }

    public static int getStudentWithMaxNoteBooks(){
        int maxNoteBooks = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(Integer.MIN_VALUE, Integer::max);
        return maxNoteBooks;
    }

    public static void main(String[] args) {
            int max = java.util.stream.IntStream.of(1, 2, 3, 4, 5)
                    .max()
                    .orElse(-1);
            System.out.println(max);

            System.out.println("********************");

            System.out.println(maxUsingReduce());

            System.out.println("********************");

            System.out.println(getStudentWithMaxNoteBooks());
    }
}
