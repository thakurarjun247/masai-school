package sb101.web18.day6;

public class _1InterThreadCommunication {
    //t1, t2
    //t1 preparing some document
    //t2 print
    //t1 -> t2 join()    t1.join
    //main t1.join
    //wait notify
    //t2 will wait(), t1 will notify(), notifyAll()
    public static void main(String[] args) throws InterruptedException {
        MyThread mt=new MyThread();
        mt.start();
        synchronized (mt){
            //Causes the current thread to wait until it is awakened,
            //typically by being notified or interrupted
            System.out.println("main going into wait state");
            //main will wait for mt,
            mt.wait();
            System.out.println("main got notified.");
        }
        System.out.println(mt.total);
    }
}
class MyThread extends Thread{
    int total=0;
    @Override
    public void run() {
      synchronized (this){
          for(int i=0;i<100;i++)
              total+=i;
          System.out.println("MT is notifying main now");
          this.notify();

      }

    }
}