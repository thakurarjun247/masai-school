package ja111.web20z.day3;

public class _5ObjectCollab {
    public static void main(String[] args) {
        Student student= new Student();
        student.age=10;
        Address addressOfStudent= new Address();
        addressOfStudent.city="BLR";
        addressOfStudent.country="India";
        student.studentAddress=addressOfStudent ;
        System.out.println(student.studentAddress.city);
    }
}
class Student{
    String name;
    int age;
    //composition : One object is made up of another object.
    Address studentAddress;
}

class Address{
    String city;
    String country;
}

class Employee{
    String empId;
   Address employeeAddress;
}