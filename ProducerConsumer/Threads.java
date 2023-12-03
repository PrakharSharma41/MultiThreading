package ProducerConsumer;

import java.util.ArrayList;
import java.util.Arrays;

public class Threads {
    public static void main(String[] args) {
        SharedResource obj=new SharedResource();
        ArrayList<String>items=new ArrayList<>(Arrays.asList("one","two","three","four","five"));
        // int i=1;
        // while(i<=5){
            Thread producer=new Thread(()->{
                try{
                    for(int i=1;i<=6;i++){
                        obj.addItem("item "+i);
                    }
                }catch(Exception e){

                }
            });
            Thread consumer=new Thread(()->{
                try{
                    for(int i=1;i<=6;i++){
                        obj.removeItem();
                    }
                }catch(Exception e){

                }
            });      
            producer.start();
            consumer.start();
        //     i++;  
        // }
        
    }
}
