package sb101.web18.day4;

public class _5JoinConditionalSuspension {
    //Join
    //serialize = sequence/order of thread execution.
    public static void main(String[] args) throws InterruptedException { //one thread
        System.out.println("inside main method "+Thread.currentThread().getName());
        Sum sumObject=new Sum();
       Thread sumThread=new Thread(sumObject);
       sumThread.start(); //calculate the sum

        //main thread should join(run) only after sumThread is done executing.
        //sumThread->mainThread will start
        sumThread.join();
        System.out.println(sumObject.sum); //main : print the sum
    }

}
//Thread Priority
//sum: sum thread
//print the sum : main thread

//sum -> main
//sum thread
class Sum implements Runnable{
    int sum;//0
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<10;i++)
            sum+=i; //45
    }
}
