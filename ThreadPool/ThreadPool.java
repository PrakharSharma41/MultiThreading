import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {
    boolean isStopped=false;
    private BlockingQueue taskQueue=null;
    private List<PoolThreadRunnable> runnables=new ArrayList();
    public ThreadPool(int noOfThreads, int maxTasks) {
        taskQueue=new ArrayBlockingQueue<>(maxTasks);
        for(int i=0;i<noOfThreads;i++){
            PoolThreadRunnable pt=new PoolThreadRunnable(taskQueue);
            runnables.add(pt);
        }
        for(PoolThreadRunnable pt:runnables){
            new Thread(pt).start();;
        }
    }
    public synchronized void execute(Runnable task) throws Exception{
        if(this.isStopped) throw
                new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.offer(task);        
    }
    public synchronized void stop(){
        this.isStopped = true;
        for(PoolThreadRunnable runnable : runnables){
            runnable.doStop();
        }
    }    

    public synchronized void waitUntilAllTasksFinished() {
        while(this.taskQueue.size() > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
