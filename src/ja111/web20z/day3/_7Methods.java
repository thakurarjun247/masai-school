package ja111.web20z.day3;

public abstract class _7Methods {
    public static void main(String[] args) {
        hi(); //method calling
        int total=sum(2,3);
        System.out.println(total);
    }
    //Syntax:
    //[Access_Modifiers] return_Type method_Name([param_List])[throws Exception_List]
    //{
    // return something;
    // }

    //two types of methods:
    //concrete
    public static void hi(){ //definiton
        System.out.println("hi");
    }

    public static int sum(int x, int y ){
        return x+y;
    }

    //abstract methods:
    abstract public  int calculateArea();
}
