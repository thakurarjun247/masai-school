package ja111.web20z.day7.object;

public class _6InstanceOfWeProblem {
    //Person{} has two subtypes
    //Professional : wfh()
    //Student: goToCOllege()
    //takePerson( Person person)
    // check using instanceof
    public static void main(String[] args) {
        takePerson(new Professional());
        takePerson(new Student());
    }
    static void takePerson( Person person){
        if(person instanceof  Professional){
            Professional prof=(Professional) person;
            prof.wfh();
        }

        if(person instanceof  Student){
            Student stu=(Student) person;
            stu.goCollege();
        }
    }
}
class Person{}
class Professional extends Person{
    void wfh(){
        System.out.println("wfh");
    }
}
class Student extends Person{
    void goCollege(){
        System.out.println("gocollege");
    }
}