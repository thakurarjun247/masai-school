package os101.web16.solid;

public class LiskovSubPrinciple {
    public static void main(String[] args) {
        Bird bird= new Bird();
        Eagle eagle= new Eagle();
        Ostrich ostrich= new Ostrich();
        flyMethod(eagle);
       //flyMethod(ostrich);
    }

    static void flyMethod(FlyingBird flyingBird){
        flyingBird.fly();
    }
}


class Bird{

}

class FlyingBird{
    void fly(){
        System.out.println("bird flying..");
    }
}
class NonFlyingBird{}


class Eagle extends FlyingBird{

}

class Ostrich extends NonFlyingBird{

}