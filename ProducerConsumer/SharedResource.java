package ProducerConsumer;
import java.util.ArrayList;

public class SharedResource {
    ArrayList<String> arr=new ArrayList<>();
    static final int MAX_SIZE=10;
    public synchronized void addItem(String item){
        if(arr.size()==MAX_SIZE){
            try{
                System.out.println("queue is full, waiting for "+"consumer to consume");
                wait();
            }catch(Exception e){
                
            }
        }else{
            arr.add(item);
            System.out.println("adding item "+item+" to the queue");
            notify();
        }
    }    
    public synchronized void removeItem(){
        if(arr.size()==0){
            try{
                System.out.println("queue is empty, waiting for "+"producer to insert");
                wait();
            }catch(Exception e){
                
            }
        }else{
            System.out.println("got the element: "+arr.removeLast());
            notify();            
        }
    }
}
