package ja111.web17.day7;

public class _4HeirarchicalInheritence {
    public static void main(String[] args) {
        Monkey monkey=  new Monkey();
        monkey.move();
        Cat cat = new Cat();
        cat.move();
    }
}

 class PetAnimal{
    public void move(){
        System.out.println("move");
    }
}
class Monkey extends PetAnimal{
    @Override
    public void move(){
        System.out.println("move - jump");
    }
}
class Cat extends PetAnimal{
    @Override
    public void move(){
        System.out.println("move -  slowly");
    }
}
