package ja111.web20z.day3;

public class _8AbstractClass {
}

//1. when you have all the details: concrete
//2. when you don't have enough info.: abstract methods.

abstract class Shape{ //circle, cyllinder, sphere
    int radius;
    abstract double area();
}


class Circle{
    int radius;
    double area(){
        return 3.14*radius*radius;
    }
}
