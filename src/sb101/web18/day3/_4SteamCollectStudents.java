package sb101.web18.day3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//create a stream of  students
//

public class _4SteamCollectStudents {

    public static void main(String[] args) {
        List<Student> studentList=Arrays.asList(
                new Student(1,"one", 900),
                new Student(2,"two", 850),
                new Student(3,"three", 600)
        );
        //and filter and print name of the student with marks>800
        studentList
                .stream()
                .filter(student -> student.marks>800)
                .forEach(student -> System.out.println(student.name));

        //collect those items into a collection.

        List<Student> studentWithMarksMoreThan800=studentList
                .stream()
                .filter(student -> student.marks>800)
                .collect(Collectors.toList());

        Set<Student> studentWithMarksMoreThan800Set=studentList
                .stream()
                .filter(student -> student.marks>800)
                .collect(Collectors.toSet());

        System.out.println(studentWithMarksMoreThan800);



    }
}
class Student{
    Integer roll;
    String name;
    Integer marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(Integer roll, String name, Integer marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

}