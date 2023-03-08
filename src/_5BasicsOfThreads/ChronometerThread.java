package _5BasicsOfThreads;

public class ChronometerThread implements Runnable{
    private Thread thread;
    private String threadName; // birden fazla thread olacağından java nın bu thread lerin farklı olduğunu anlaması için String type bir threadName tanımladık.

    public ChronometerThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating: "+ threadName);
    }

    @Override
    public void run() { //burada run metodu bizim thread in kendisidir.
        System.out.println("Running: " + threadName);

        try
        {
            for (int i = 1; i <= 10; i++){
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception){
            System.out.println("Thread broke" + threadName);
        }
        System.out.println("Thread finished: " + threadName);
    }

    public void start(){ //bu blok her zaman standarttır thread'i başlatmak için.
        System.out.println("Thread object is creating");
        if (thread == null){ //eğer thread boş ise
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
