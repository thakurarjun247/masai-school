package ja111.web20.day15;

public class Plant {
    String name;
    Integer size;

    public Plant(String name, Integer size) {
        this.name = name;
        this.size = size;
    }
}
class Main{
    public static void main(String[] args) {
        Plant plant1= new Plant("moneyplant", 20);
        Plant plant2= new Plant("moneyplant", 22);
        Plant plant3= new Plant("cactus",30);
        //add these to a collection.
    }
}
