package threadAndMultithreading;


public class RaceCondition {
    public static void main(String[] args){
        Stack stack = new Stack(5);
        Thread t1 = new Thread(()->{
            for(int i=0;i<5;i++){
                stack.push(i);
            }
        });

            Thread t2 = new Thread(()->{
                for(int i=0;i<5;i++){
                    System.out.print(stack.pop());
                }
            });
        t1.start();
            t2.start();


    }

}
