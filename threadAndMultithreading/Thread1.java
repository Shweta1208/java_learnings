package threadAndMultithreading;


public class Thread1 {
    static class A extends Thread{
        public void run(){
            for(int i=1;i<=5;i++){
                System.out.println("Hey hi");
            }
        }
    }
    static class B extends Thread{
        public void run(){

            for(int i=1;i<=5;i++){
                System.out.println("Hey Bye");
            }
        }
    }

    public static int counter  = 0;

     synchronized public static void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {

        A a1 = new A();
        A a2 = new A();
        B b1 = new B();

        Thread t1 = new Thread(()->{
            for (int i=0;i<100;i++){
                increment();
            }
        });


        Thread t2 = new Thread(()->{
            for (int i=0;i<100;i++){
                increment();
            }
        });

        t1.start();
        t2.start();

        System.out.println(counter);

//        a1.start();
//        a2.start();
//        b1.start();

    }
}
