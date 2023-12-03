import java.util.concurrent.locks.ReentrantLock;

public class SharedResource{
    boolean isAvailable=false;
    public void producer(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(4000);
        }catch(Exception e){

        }
        finally{
            lock.unlock();
        }
    }
}