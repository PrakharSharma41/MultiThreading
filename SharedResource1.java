import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource1 {
    AtomicInteger var=new AtomicInteger(0);

    public void increment(){
        var.incrementAndGet();
    }
    public Integer get(){
        return var.get();
    }
}
