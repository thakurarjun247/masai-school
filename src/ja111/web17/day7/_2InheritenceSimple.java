package ja111.web17.day7;

public class _2InheritenceSimple {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.setName("Rocky");
        System.out.println(dog.getName());
    }

}
class Animal{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{

}