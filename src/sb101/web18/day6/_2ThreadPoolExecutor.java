package sb101.web18.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _2ThreadPoolExecutor {
    public static void main(String[] args) {
        PrintJob[] printJobs={
                new PrintJob("syllabus"),
                new PrintJob("marks"),
                new PrintJob("placement data"),
                new PrintJob("admission"),
                new PrintJob("MAC"),
        };
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        for(PrintJob printJob: printJobs)
            executorService.submit(printJob);
        executorService.shutdown();
    }
}
class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name +" job is started by thread: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name +" job is completed by thread: "+ Thread.currentThread().getName());
    }
}