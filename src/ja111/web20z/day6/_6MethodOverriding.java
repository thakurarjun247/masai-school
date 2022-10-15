package ja111.web20z.day6;

public class _6MethodOverriding {
    public static void main(String[] args) {
        Plant plant= new Plant();
        Cactus cactus= new Cactus();
        plant.water();
        cactus.water();
    }


}

class Plant{
    void water(){
        System.out.println("plant needs water everyday");
    }
}

class Cactus extends Plant{
    //water() be here by inheri.
    //change the implementation of the water()
    //aka overriding
    @Override
    void water(){
        System.out.println("Cactus needs water occasionally");

    }


    //### Rules for Java Method Overriding
    //
    //1. The method must have the same name as in the parent class
    //2. The method must have the same parameter as in the parent class.
    //3. There must be an IS-A relationship (inheritance).
}
