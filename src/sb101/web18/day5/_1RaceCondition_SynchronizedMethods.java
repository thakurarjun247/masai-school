package sb101.web18.day5;

public class _1RaceCondition_SynchronizedMethods {
    //e.g. LL 1->2->3
    //Race Condition: Occurs when there is concurrency
    //A condition in which 2 or more threads compete to get some shared resources(ATM, var, object)
    //Concurrency: concurrent = simultaneous =at the same time
    // . Two threads working on the same variable/data at the same time
    //Concurrency -> Race Condition-> Data Inconsistency
    //solution is synchronization-> giving them an order.
    //allow you to enter the critical section one person/thread at a time;
    public static void main(String[] args) {
        Common c=new Common();
        ThreadA t1=new ThreadA(c,"Ram");
        ThreadB t2=new ThreadB(c,"Shyam");
        t1.start();
        t2.start();
        //before synchronization (opt1)
        //t1->t2 -> Welcome Welcome Ram Shyam
        //t2->t1  -> Welcome Welcome Shyam Ram

        //after synchronization (opt2)
        //t1->t2 -> Welcome Ram Welcome Shyam
        //t2->t1  -> Welcome  Shyam Welcome Ram

        //Synchronization can be done in two ways
        //1. synchronized method
        //2. synchronized block

        /*Synchronization
        *
        * */
    }
}
class Common{

    //static = class level lock
    //without static, only with synchronized =  object level
    public static synchronized void methodWithSynchronizedKeywordInSignature(String name){
       // methodWithSynchronizedKeywordInSignature
        //critical section
        System.out.println("Welcome");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);

    }
/*
    public void  methodWithSynchronizedBlock(String name){
        System.out.println("not into critical section");
        System.out.println("The Earth revolves around the Sun");

        //critical section start here
        System.out.println("Welcome");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        //critical section start here

        System.out.println("2+2=4");
    }*/
}

class ThreadA extends Thread{
    Common c;
    String name;
    public ThreadA(Common c, String name){
        this.c=c;
        this.name=name;
    }

    @Override
    public void run() {
        c.methodWithSynchronizedKeywordInSignature(name);
    }
}

class ThreadB extends Thread{
    Common c;
    String name;
    public ThreadB(Common c, String name){
        this.c=c;
        this.name=name;
    }

    @Override
    public void run() {
        c.methodWithSynchronizedKeywordInSignature(name);
    }
}


