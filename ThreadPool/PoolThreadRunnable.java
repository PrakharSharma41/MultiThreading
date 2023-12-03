import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable{
    private Thread thread;
    private BlockingQueue taskQueue=null;
    private boolean isStopped=false;
    @Override
    public void run() {
        this.thread=Thread.currentThread();
        while(!isStopped()){
            try{
                Runnable runnable=(Runnable)taskQueue.take();// threads are blocked here if cannot read from blocking queue
                runnable.run();
            }catch(Exception e){
                System.out.println("exception occured in thread "+thread.getName());
            }
        }
    }
    public PoolThreadRunnable(BlockingQueue taskQueue) {
        this.taskQueue = taskQueue;
    }
    public synchronized void doStop(){
        isStopped=true;
        this.thread.interrupt();
    }
    public synchronized boolean isStopped(){
        return isStopped;
    }

}
