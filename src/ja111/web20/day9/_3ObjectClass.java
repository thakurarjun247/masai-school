package ja111.web20.day9;

import ja111.web20.day7.Student;

public class _3ObjectClass {
    public static void main(String[] args) {
        Object object;
        MyClass myClass= new MyClass();
        System.out.println(myClass);
        Student student= new Student("Pablo");
        System.out.println(student);
        Student[] students= {student, new Student("student2") };
        for(Student s:students)
            System.out.println(s);


        //what happens when you print an object
        //toString method is used.
    }

}
class MyClass{
    String message="How have you been?";

   @Override
    public String toString(){
       return  message;
   }
}


