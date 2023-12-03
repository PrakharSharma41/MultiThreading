import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.StampedLock;

public class SharedResource{
    boolean isAvailable=false;
    StampedLock lock=new StampedLock();
    public void producer(){
        long stamp=lock.readLock();
        try{
            System.out.println(Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
            
        }catch(Exception e){

        }
        finally{
            lock.unlockRead(stamp);
        }
    }
    public void consumer(){
        long stamp=lock.writeLock();
        try{
            System.out.println(Thread.currentThread().getName());
            isAvailable=false;
        }catch(Exception e){

        }
        finally{
            lock.unlockWrite(stamp);
        }
    }
}