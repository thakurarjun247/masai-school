package sb101.web18.day5;

public class _3SynchronizedBlockDemo {
    public static void main(String[] args) {
        Shared shared=new Shared();
        Thread1 thread1=new Thread1(shared,"Ram");
        Thread2 thread2 =new Thread2(shared, "Shyam");
        thread1.start();
        thread2.start();
    }
}
//2 option
//1 ww..
//2 w.w.
class Shared {

    public void methodWithSynchronizedBlock(String name) {
        System.out.println("like a bakery shop/clock tower/read only");
       System.out.println("not into critical section");
       System.out.println("The Earth revolves around the Sun");

        //critical section start here
//entire class lock - demonitisation - all the ATMs locked
      /* synchronized (Shared.class) {
        }*/

        //get lock on this current obj

        synchronized (this){
            System.out.println("you are inside an ATM, aka critical section");
            System.out.println("Welcome");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
            System.out.println(Thread.currentThread().getName());

        }
        //critical section start here
        System.out.println("like a bakery shop");
       System.out.println("2+2=4");

    }
}


class Thread1 extends Thread{
    Shared c;
    String name;
    public Thread1(Shared c, String name){
        this.c=c;
        this.name=name;
    }

    @Override
    public void run() {
        c.methodWithSynchronizedBlock(name);
    }
}

class Thread2 extends Thread{
    Shared c;
    String name;
    public Thread2(Shared c, String name){
        this.c=c;
        this.name=name;
    }

    @Override
    public void run() {
        c.methodWithSynchronizedBlock(name);
    }
}
