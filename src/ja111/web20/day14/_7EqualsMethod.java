package ja111.web20.day14;

public class _7EqualsMethod {
    public static void main(String[] args) {
        Plant snakePlant= new Plant(12, "DarkGreen");
        Plant moneyPlant = new Plant(50, "Green");
        Plant moneyPlant2 = new Plant(50, "Green");
        System.out.println(snakePlant.equals(moneyPlant)); //false
        System.out.println(moneyPlant.equals(moneyPlant2)); //
        //our definition : if the color and height of two plants are same they should be treated equal.
        //Jvm def (obj) : if the address of the two plant are diff they will be deemed unequal.
        //symetric: if x.equals(y) then y.equals(x)
        // reflexive: x.equals(x) should always be true
        //transitive: if x.equals(y) and y.equals(z) then x.equals(z)
        //consistent: x.equals(y)
    }
}
