public class MonitorThread1Runnable implements Runnable{
    MonitorLockExample obj;
    
    @Override
    public void run() {
        obj.task1();
    }

    public MonitorThread1Runnable(MonitorLockExample obj) {
        this.obj = obj;
    }
    
}
