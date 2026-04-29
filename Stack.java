package threadAndMultithreading;

public class Stack {
    public int[] array;
    public int stackTop;
    Object lock ;

    public  Stack(int capacity){
        array = new  int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean isEmpty(){
        return stackTop<0;
    }

    public boolean isFull(){
        return stackTop >= array.length-1;
    }

    public boolean push(int num){
        synchronized (lock) {
            if (isFull())
                return false;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            stackTop++;
            array[stackTop] = num;
            return true;
        }
    }

    public int pop(){
        synchronized (lock){
        if(isEmpty())
            return Integer.MIN_VALUE;

        int obj = array[stackTop];
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        stackTop--;

        return obj;
    }}
}
