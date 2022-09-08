package ja111.web20.day6;

public class _2CallingAConstructorUsingThis {

    _2CallingAConstructorUsingThis(){
        //call to this() should always be the first statement in a const.
        this(10);//this will point to the current construtor
        System.out.println("default const.");
    }
    _2CallingAConstructorUsingThis(int x){

        System.out.println("1 arg const.");
    }

    public static void main(String[] args) {
        _2CallingAConstructorUsingThis object= new _2CallingAConstructorUsingThis();
    }
}
