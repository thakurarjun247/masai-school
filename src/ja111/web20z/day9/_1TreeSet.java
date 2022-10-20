package ja111.web20z.day9;

import java.util.Set;
import java.util.TreeSet;

public class _1TreeSet {
    public static void main(String[] args) {
        Set<String> treeSet= new TreeSet<>();
        treeSet.add("z");
        treeSet.add("a");
        treeSet.add("x");
        //unique
        //sorted in natural ordering
        // nulls aren't allowed
        System.out.println(treeSet);

        Set<Student> studentTreeSet= new TreeSet<>();
        studentTreeSet.add(new Student(100, "abc", 90));
        studentTreeSet.add(new Student(101, "xyz", 80));
        studentTreeSet.add(new Student(102, "lms", 95));
        System.out.println(studentTreeSet);

        Set<Student> studentsSortedBasedOnMarks= new TreeSet<>(new StudentMarksComparator());
        studentsSortedBasedOnMarks.add(new Student(100, "abc", 90));
        studentsSortedBasedOnMarks.add(new Student(101, "xyz", 80));
        studentsSortedBasedOnMarks.add(new Student(102, "lms", 95));
        System.out.println(studentsSortedBasedOnMarks);
    }
}
