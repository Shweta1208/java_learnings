package threadAndMultithreading;

public class Thread2 {

    static class A implements Runnable {
        public void run(){
            for(int i=1;i<=5;i++){
                System.out.println("Hey hi");
            }
        }
    }

    static class B implements Runnable {
        public void run(){
            for(int i=1;i<=5;i++){
                System.out.println("Hey hi");
            }
        }
    }

    public static void main(String[] args) {
        Runnable a1 = new A();
        Runnable b1 = new B();

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();
    }
}
