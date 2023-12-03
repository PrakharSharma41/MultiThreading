import java.util.concurrent.ThreadPoolExecutor;

public class Threads{

    // static class MultiThread extends Thread{
    //     @Override
    //     public void run(){
    //         System.out.println("thread name "+Thread.currentThread().getName());
    //     }
    // }
    public static void main(String[] args) {
        
        // method 1
        // Runnable runnable=()->{
        //     // System.out.println("in run method");
        //     System.out.println("thread name "+Thread.currentThread().getName());
        // };
        // Thread thread =new Thread(runnable); // thread is created but not started
        // thread.start();
        // System.out.println(Thread.currentThread().getName());

        // // method 2
        // MultiThread th=new MultiThread();
        // th.start();

        // synchronize example
        // MonitorLockExample obj=new MonitorLockExample();
        // MonitorThread1Runnable runnableObj=new MonitorThread1Runnable(obj);
        // Thread thread1=new Thread(runnableObj);
        // Thread thread2=new Thread(()->{obj.task2();});
        // Thread thread3=new Thread(()->{obj.task3();});
        // thread1.start();
        // thread2.start();
        // thread3.start();


        // example
        // SharedResource obj=new SharedResource();
        // Thread producer=new Thread(()->{
        //     try{
        //         Thread.sleep(2000);
        //     }catch(Exception e){
                
        //     }
        //     obj.addItem();
        // });
        // Thread consumer=new Thread(()->obj.consume());
        // producer.start();
        // consumer.start();
        // interupting threads
        // Thread thread = new Thread(() -> {
        //     System.out.println("in thread");
        //     while (!Thread.currentThread().isInterrupted()) {
        //         // Long-running task
        //     }
        // });
        // thread.start();   
        // System.out.println("in main");     

        // thread pool
        // SharedResource1 shr=new SharedResource1();
        // Thread th1=new Thread(()->{
        //     for(int i=0;i<200;i++){
        //         shr.increment();
        //     }
        // });
        // Thread th2=new Thread(()->{
        //     for(int i=0;i<200;i++){
        //         shr.increment();
        //     }
        // });
        // th1.start();th2.start();
        // System.out.println(shr.get());

    }
}
