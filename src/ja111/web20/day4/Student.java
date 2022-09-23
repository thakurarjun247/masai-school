package ja111.web20.day4;

public class Student {
    public Student(){}
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //state: variables
    int age; //? 4 bytes
    String name;
    static String batchName="JA111"; //JA111

    //behaviour: methods
    void play(){
        System.out.println(name+ " is playing...");
    }


    public static void main(String[] args) {
        Student s1= new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(Student.batchName);
        s1.age=24;
        s1.name="Abhinav";
        //syntax:
        //<objectName>.<methodname>
        s1.play();
        System.out.println(s1.age+" "+ s1.name);
        System.out.println(Student.batchName);

        Student s180=new Student();

        //static = related to the class not to the object

        Student student;
        student=s1;
       // System.out.println(student);
        System.out.println(s1);
        Student studentNullObject=null;
        //NPE:
        //System.out.println(studentNullObject.name);



    }
}

//assignment: 5 min:
class AnotherClass{
    public static void main(String[] args) {
        Student s1= new Student();
        s1.age=24;
        s1.name="Abhinav";
        //System.out.println(batchName); ? Why
        //how to print the batch name?
    }
}


