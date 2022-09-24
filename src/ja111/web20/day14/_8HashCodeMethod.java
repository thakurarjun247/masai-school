package ja111.web20.day14;

public class _8HashCodeMethod {
    //o1, o2 => address.
    //int hashCode(Object object) //aka hashing Function
    public static void main(String[] args) {
        Plant plant = new Plant(10, "rose");
        int i=plant.hashCode();
        System.out.println(i);
        //not completely true: hashCode will decide
        // where an object will be stored in memory
        //set.add(1)
        Integer num=1465454;
        System.out.println(num.hashCode()); //843435

    }
}
