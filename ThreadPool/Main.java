import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args) throws Exception{
    Integer[] t={1,2,3,4,5,2,1};
    Stream<Integer>arr=Arrays.stream(t).distinct()        ;
    List<Integer> x=arr.collect(Collectors.toList());
    System.out.println(x.size());
        // ThreadPool pool=new ThreadPool(3, 10);
        // for(int i=0;i<10;i++){
        //     int taskNo=i;
        //     pool.execute(()->{
        //         System.out.println(Thread.currentThread().getName()+": Task "+taskNo);
        //     });
        // }
        // pool.waitUntilAllTasksFinished();
        // pool.stop();
    }
}