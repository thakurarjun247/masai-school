package ja111.web17.day7;

public class _1InheritenceDemo {

}
//
class Student{
    String name;
    String phone;

}

class Employee extends Student{
      String employeeId;
}
/*
*
* B extends A ( A is inherited by B) in this case:
* A Parent, super, base class
* B is Child, sub, inherited class
*
* IS-A relationship - parent/child relationship
* HAS-A relationship - one class contains another - Nest contains Eggs - Car/Engine Emplyee/Address
*
* */

//HAS-A relationship - aka composition
// egg has a nest
//nest has a egg - correct
//Car
class Nest{
    Egg egg;
}
class Egg{

}