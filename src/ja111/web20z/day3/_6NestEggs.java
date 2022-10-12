package ja111.web20z.day3;

public class _6NestEggs {
    //Create a nest class (height, color, 2 eggs) and create it's objects.
    //
    //1 Nest (height, color) : 2 Eggs(size, color)
    public static void main(String[] args) {
        Egg egg1= new Egg();
        egg1.color="white";
        egg1.size= 2;

        Egg egg2= new Egg();
        egg2.color="pale";
        egg2.size= 3;
        Nest nest= new Nest();
        nest.color="brown";
        nest.height=100;

        Egg[] arrayOfEggs= new Egg[2];
        arrayOfEggs[0]=egg1;
        arrayOfEggs[1]=egg2;
        nest.eggs=arrayOfEggs;
        System.out.println(nest.height);


    }

}



