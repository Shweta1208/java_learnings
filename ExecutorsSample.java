package threadAndMultithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsSample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es =  Executors.newFixedThreadPool(5);
        for (int i = 1; i <=5; i++) {
            int finalI = i;
            Future<?> f = es.submit(()-> {
                int v= factorial(finalI);
                System.out.println(v);
            });
        }

        Future<Integer> fut = es.submit(()-> 1+2);
        Integer x = fut.get();
        System.out.println(x);
        System.out.println(fut.isDone());
        System.out.println(fut.isCancelled());

        es.shutdown();
    }

    public static int factorial(int v){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if(v<=1) return v;
        int val=1;
        for(int i=1;i<=v;i++){
            val *= i;
        }
        return val;
    }
}
