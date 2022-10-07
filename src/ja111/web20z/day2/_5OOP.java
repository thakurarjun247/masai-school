package ja111.web20z.day2;

public class _5OOP {

    //programming styles aka paradigms
    // FP: Java (after version 8)
    // OOP: c++, Java, C#, Scala,
    // Procedural.
    //Java : MultiParadigm language

    //Class is a template or a blueprint for the objects. variables(properties), methods(behaviours, functions)
    // whereas Object is an instance of the Class.
    public static void main(String[] args) {
         //Plant plantObject=new Plant();
        System.out.println("");
        Plant plantObject; //declared a variable
        Plant anotherPlantObject;
        plantObject=new Plant();
        anotherPlantObject=plantObject;
        //new operator allocates memory for storing the object on the heap
        // heap is (memory are to store object)
        // it gives default values to the instance variable.
        plantObject.hi();

        // [new Plant()]
         //      ^
            //   |
        //plantObject

        //Data present inside the object at that instance of time
        // is called the state of an object.
        // it is the current value of the instance variable of an object.
        plantObject.height=110;
        plantObject.name="cactus";

        System.out.println(plantObject.height);
        System.out.println(plantObject.name);

    }

    //class Name Movie :
    //variable: duration double, name: String
    //2 movie objects

    // day 1, day 2, day 3
    //remaining topics: static, boolean operator: not part of the Monday Evaluation
    //Scanner: Take input from user.: Yes this will be


}

