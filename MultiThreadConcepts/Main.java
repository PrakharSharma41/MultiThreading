package MultiThreadConcepts;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        System.out.println("main thread started");
        Thread th1=new Thread(()->{
            System.out.println("thread1 calling produce method");
            resource.produce();
        });
        Thread th2=new Thread(()->{
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
            System.out.println("thread2 calling produce method");
            resource.produce();
        });
        th1.setPriority(8);
        th1.setDaemon(true);
        th1.start();
        th2.start();
        try{
            Thread.sleep(3000);
        }catch(Exception e){

        }        
        System.out.println("thread1 is suspended");
        try{
            th1.suspend();
        }catch(Exception e){

        }
        System.out.println("main thread is finishing its work");
        try{
            th1.join();
            th2.join();
        }catch(Exception e){
        }
    }
}
