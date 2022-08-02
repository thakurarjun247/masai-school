package sb101.web18.day4;

public class _2CreateThread {
    public static void main(String[] args) {
        MyThreadFirstWay myThreadFirstWay= new MyThreadFirstWay();
        myThreadFirstWay.start();

        //2nd way
        //implement runnable interface

        Thread myThreadSecondWay=new Thread(new MyRunnable());

        Thread myThreadLambdaWay=new Thread(()-> System.out.println("my thread lambda way"));
        myThreadSecondWay.start();
        myThreadLambdaWay.start();

        Thread myThreadAnonymousInnerClass= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" myThreadAnonymousInnerClass");
            }
        });
        myThreadAnonymousInnerClass.start();

    }
}

class Test extends Thread{

}
//1st way


//extending the Thread class
class MyThreadFirstWay extends Thread{
    @Override
    public void run() {
        System.out.println("hello from MyThreadFirstWay");
    }
}

//2nd way
//lambda
//implement Runnable
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("hello from MyThreadSecondWay");
    }
}
//anonymous inner class