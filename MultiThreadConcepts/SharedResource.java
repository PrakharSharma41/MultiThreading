package MultiThreadConcepts;

public class SharedResource {
    boolean isAvailable=false;
    public synchronized void produce(){
        System.out.println("lock acquired");
        isAvailable=true;
        try{
            Thread.sleep(8000);
        }catch(Exception e){

        }
        System.out.println("lock released");
    }
}
