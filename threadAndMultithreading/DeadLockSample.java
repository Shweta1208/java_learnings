package threadAndMultithreading;

public class DeadLockSample {
    public static final Object objA = new Object();
    public static final Object objB = new Object();

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(()->
        {
            synchronized (objA){
                System.out.println("Thread 1: Holding lock A...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread 1: Waiting for lock B...");
                synchronized (objB){
                    System.out.println("Thread 1: Acquired lock B!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (objA){
                System.out.println("Thread2 is holding Obj b");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                System.out.println("Thread2 is waiting for Obj a");
                synchronized (objB){
                    System.out.println("THread2 acquired Obj a");
                }
            }
        });

        t1.start();
        t2.start();
    }

}
