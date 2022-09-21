package ja111.web17.day7;

public class _8SuperVariable {
    public static void main(String[] args) {
        WildDog wildDog=new WildDog();
        //wildDog.printColor();
        wildDog.talk();
    }
}

class WildAnimal{
    WildAnimal(){} //zero-arg constructor, noarg constructor, default constructor, implicit
    String color="white";
    void speak(){
        System.out.println("wildanimal speaks");
    }
}

class WildDog extends WildAnimal{
    WildDog(){        super();
    }
    String color="black";
    @Override
    void speak(){
        System.out.println("Wilddog speaks");
    }
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    void talk(){
        speak();
        super.speak();
    }

}