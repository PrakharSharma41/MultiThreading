public class SharedResource {
    boolean isItemPresent=false;
    public synchronized void addItem(){        
        isItemPresent=true;
        System.out.println("producer thread calling notify");
        notifyAll();
    }
    public void consume(){
        System.out.println("consumer thread inside consumeItem");
        if(!isItemPresent){
            try{
                System.out.println("consumer thread is waiting");
                wait();
            }
            catch(Exception e){

            }
        }
        isItemPresent=false;
    }
}
