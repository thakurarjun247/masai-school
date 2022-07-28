package sb101.web18.day1.maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _3TreeMap {
    public static void main(String[] args) {
        //Treemap is sorted Map
        Map<String, Integer> map=new TreeMap<>();
        map.put("TopGun", 10); //replaced by the next line
        map.put("RRR", 9);
        map.put("ABC", 7);
        map.put("ZZZ", 4);
        System.out.println(map);
        //need to pass a comparator
        Map<Student, Integer> studentToRollNo=new TreeMap<>(new StudentComparatorAscMarks());
        Student s1=new Student(10, "one");
        Student s2=new Student(9, "two");
        Student s3=new Student(11, "three");
        Student s4=new Student(11, "three");
        studentToRollNo.put( s1, 1);
        studentToRollNo.put(s2, 4);
        studentToRollNo.put(s3, 0);//inserted
        studentToRollNo.put(s4, 5);//replace the previous one
        System.out.println(studentToRollNo);

    }
}
class StudentComparatorAscMarks<Student> implements Comparator<sb101.web18.day1.maps.Student>{

    @Override
    public int compare(sb101.web18.day1.maps.Student o1, sb101.web18.day1.maps.Student o2) {
        if(o1.marks>o2.marks)
            return 1;
        else if(o1.marks<o2.marks)
            return -1;
        else return 0;
    }
}
class Student{
    Integer marks;
    String name;

    public Student(Integer marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}