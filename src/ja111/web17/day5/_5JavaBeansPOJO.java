package ja111.web17.day5;

//properties of Java bean
/*
* public class
* variables are private
* getter and setter are public
* */
class App{
    public static void main(String[] args) {
        _5JavaBeansPOJO object= new _5JavaBeansPOJO();
        object.setName("some name");
        System.out.println(object.getName());
        System.out.println(object.getName());
    }

}


public class _5JavaBeansPOJO {

   private String name; //some name

   _5JavaBeansPOJO(){

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


