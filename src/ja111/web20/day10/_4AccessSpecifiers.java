package ja111.web20.day10;

public class _4AccessSpecifiers {
    /*
    * 1. **Private**: The access level of a private modifier is only within the class.
    *  It cannot be accessed from outside the class.
    *
    *
    * 4. **Public**: The access level of a public modifier is everywhere. It can be accessed from within the class,
* outside the class, within the package and outside the package.
*
*
2. **Default**: The access level of a default modifier is only within the package.
*  It cannot be accessed from outside the package. Aka package-protected
* . If you do not specify any access level, it will be the default.
*
*
3. **Protected**: The access level of a protected modifier is within the package and outside the package
* through child class. If you do not make the child class, it cannot be accessed from outside the package.
*
*

    * */

    public static void main(String[] args) {
        ClassWithPrivateVar obj= new ClassWithPrivateVar();
        //private: avaialble only within the class.
        //public: available everywhere
        //ct error
       // System.out.println(obj.anInt);
        obj.getAnInt();
    }
}

class ClassWithPrivateVar{

   private int anInt=10;

    public int getAnInt() {

        return anInt;
    }

    public void setAnInt(int newValue) {
        this.anInt = newValue;
    }

    void hello(){
       System.out.println(anInt);
   }
}
class Family{
    private int anPro;
}

