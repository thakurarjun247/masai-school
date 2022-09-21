package ja111.web17.day7;

public class _5MultipleInheritence {
    public static void main(String[] args) {
        HiHello hiHello=new HiHello();
        hiHello.speak();
    }
}

class Hi{
    void speak(){
        System.out.println("hi");
    }
}

class Hello{
    void speak(){
        System.out.println("hello");
    }
}

class HiHello extends Hello /*, Hi */{ //Compilation error if uncommented

}
