package ja111.web17.day6;

public class _3UserDefinedDataTypes {
    public static void main(String[] args) {
        Person[] persons=new Person[34];
        persons[0] = new Person();
        persons[1]= null;

        Person p1=new Person(10, "p10");
        Person p2=new Person(20, "p20");
        System.out.println(p2.age);
        //put in the array
        persons[2]=p2;
        //reading: point to the array
        Person person2=persons[2];


        System.out.println(person2.age);
        //persons[2].age
        // int age = persons[2].age;
        //print age.
    }
}
class Person
{
    int age;
    String name;
    public Person(){}
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}