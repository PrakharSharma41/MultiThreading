import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource{
    boolean isAvailable=false;
    public void producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }catch(Exception e){

        }
        finally{
            lock.readLock().unlock();
        }
    }
    public void consumer(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName());
            isAvailable=false;
        }catch(Exception e){

        }
        finally{
            lock.writeLock().unlock();
        }
    }
}