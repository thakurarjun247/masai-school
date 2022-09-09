package ja111.web20.day7;

public class _3UserDefinedObjectsInAnArray {


    public static void main(String[] args) {
        Student[] students= new Student[2];
        Student s1= new Student("robot");
        Student s2 = new Student("chunnu");
        students[0]=s1;
        students[1]=s2;
        for (Student s:students) {
            System.out.println(s.name);
        }
    }
}
