package ja111.web20.day5;

public class _2ObjectCollaboration {
    public static void main(String[] args) {
        Person person= new Person();
        person.name="xyz";
        person.city="city";
        person.zip="455003";
        System.out.println(person.city);

        Office office= new Office();
        office.companyName="MasaiSchool";

        //creating address
        Address masaiAddress= new Address();
        masaiAddress.city="BLR";
        masaiAddress.zip="474747";

        //assigning this address to the office
        office.address=masaiAddress;
        System.out.println(office.companyName);
        System.out.println(office.address.city);

    }
}

class Person{
    String name;
    String city;
    String zip;
}

class Address{
    String city;
    String zip;
}
// 2*10 + 3*10 = 10(2+3)
class Office{
    String companyName;
    Address address; //composition
//static inner class, it restricts the reuse of the address class.
   /* static class Address{
        String city;
        String zip;
    }*/
}

//Nest Eggs
class Nest{//composition
    Egg[] eggs;
}
class Egg{}
