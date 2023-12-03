public class MonitorLockExample {
    public synchronized void task1(){
        // synchronized(this){
        try{
            System.out.println("inside task1");
            Thread.sleep(10000);
            System.out.println("task1 completed");
        }catch(Exception e){
            System.out.println();
        }
    // }
    }
    public void task2(){
        System.out.println("inside task2 before sync");
        synchronized(this){
            System.out.println("inside task2 after sync");
        }
    }
    public void task3(){System.out.println("inside task3");}
}
