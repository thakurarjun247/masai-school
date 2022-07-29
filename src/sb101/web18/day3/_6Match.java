package sb101.web18.day3;

import java.util.Arrays;
import java.util.List;

public class _6Match {
    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(
                new Student(1,"one", 900),
                new Student(2,"two", 850),
                new Student(3,"three", 600)
        );
        //allMatch, anyMatch, noneMatch : boolean

        boolean allMarksGreaterThan500=studentList
                .stream()
                .allMatch(student -> student.marks>500);
        System.out.println(allMarksGreaterThan500);
        boolean anyMarksGreaterThan500=studentList
                .stream()
                .anyMatch(student -> student.marks>8000);
        //anyMatch = at least one of them match with this criteria
        System.out.println(anyMarksGreaterThan500);

        boolean noneMarksGreaterThan500=studentList
                .stream()
                .noneMatch(student -> student.marks>8000);
        System.out.println(noneMarksGreaterThan500);
    }
}
