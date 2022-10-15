package ja111.web20z.day6;

public class _3HeirarchicalInheritence {
    //base class Animal {String name, speak()}
    //first child class Cat
    //Second child class Dog
    public static void main(String[] args) {
        new Father().hi();
        Son son= new Son();
        System.out.println(son.lastName);
        Daughter daughter= new Daughter();
        daughter.hi();
    }
}

class Father{
    String lastName="Singh";
    void hi(){
        System.out.println("hi, my last name is "+ lastName);
    }

   }
   class Son extends Father{//.....
     }
   class Daughter extends Father{}






