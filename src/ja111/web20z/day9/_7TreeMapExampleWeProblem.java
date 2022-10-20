package ja111.web20z.day9;
import java.util.*;
public class _7TreeMapExampleWeProblem {
    //Student -> String:
    //StudentObj -> StudName
    //sorted basaed on the marks
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>(new StudentMarksComparator());

        tm.put(new Student(10,"Ganesh",950),"Maharastra");
        tm.put(new Student(12,"Surya",850),"Tamilnadu");
        tm.put(new Student(15,"Venkat",920),"Telangana");
        tm.put(new Student(16,"Dinesh",910),"Haryana");
        tm.put(new Student(18,"Srinu",880),"Kerla");
        System.out.println(tm);
    }
}
