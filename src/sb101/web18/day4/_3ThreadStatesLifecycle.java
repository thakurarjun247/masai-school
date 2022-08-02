package sb101.web18.day4;

public class _3ThreadStatesLifecycle {
    public static void main(String[] args) {
        //new state
        Thread firstThread = new Thread(
                //run method implementation
                        ()-> {
                            System.out.println("thread is running");
                            Thread.currentThread().setName("firstThread");
                            System.out.println(Thread.currentThread().getName());
                            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                            System.out.println(Thread.currentThread().getPriority());
                            System.out.println("sleeping...");
                            try {
                                //4. blocked state
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("waking up....");
                        }

        );



        //runnable
        //3. running
        firstThread.start();
    }
}
