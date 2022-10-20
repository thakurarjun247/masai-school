package ja111.web20z.day9;
import java.util.*;
public class _4StateTopper {
    //Let’s create a HashMap for the State topper students, and print them back.
    public static void main(String[] args) {
        Map<String, Student> hm = new HashMap<>();
        hm.put("MH", new Student(10, "abc", 950));
        hm.put("HP", new Student(11, "def", 900));
        hm.put("MP", new Student(12, "ghi", 800));
        hm.put("UK", new Student(13, "xyz", 959));
        //get all the state names.
        System.out.println(hm.keySet());
        for(Student student: hm.values())
            System.out.println(student);

        hm
                .forEach((k, v)-> System.out.println(k+"--> "+v));
    }
}
//# You Problem:
//
//Sort the above HashMap according to the Student Mark(ascending order).
