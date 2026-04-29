package threadAndMultithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Thread3 {
    static class Snake implements Runnable{
        public void run(){
            System.out.println("Hey Hi Cuties "+Thread.currentThread().getName());
        }
    }
    public static void main(String args[]) {

        Runnable r1 = new Snake();
        Thread t = new Thread(r1);
        ExecutorService es = new ThreadPoolExecutor(5,10,100, TimeUnit.MINUTES,new LinkedBlockingQueue<>()) ;
        t.start();
        es.execute(r1);
        es.execute(r1);
    }
}
