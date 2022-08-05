package sb101.web18.day6;

import java.util.concurrent.*;

public class _3Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable[] jobs={
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),

        };
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(MyCallable myCallable:jobs){
            Future future=executorService.submit(myCallable);
            System.out.println(future.get());
        }
        executorService.shutdown();

    }
}
class MyCallable implements Callable{
    int num; //5
    public MyCallable(int num){
        this.num=num;
    }



    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+ " is calculating sum from 0 to "+ num);
        int sum=0;
        for (int i=0;i<num;i++)
            sum+=i;
        return sum;
    }
}
