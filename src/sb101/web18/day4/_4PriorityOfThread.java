package sb101.web18.day4;

public class _4PriorityOfThread {
    public static void main(String[] args) {
        Thread secondThread=new Thread(
                ()->{
                    Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
                    Thread.currentThread().setName("secondThread min priority");
                    for (int i=0;i<10;i++)
                        System.out.println("second thread running...");
                }
        );

        Thread thirdThread=new Thread(
                ()->{
                    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                    Thread.currentThread().setName("thirdThread max priority");
                    for (int i=0;i<10;i++)
                        System.out.println("third thread running...");
                }
        );

        secondThread.start();
        thirdThread.start();
        System.gc();
    }
}
