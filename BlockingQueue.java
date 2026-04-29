package threadAndMultithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    Queue<Integer> queue;
    int capacity;

    public BlockingQueue() {
        queue = new LinkedList<>();
        capacity = 10;
    }

    public BlockingQueue(int capacity){
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized boolean add(int value) throws InterruptedException {
        while(queue.size()>=capacity){
            queue.wait();
        }
        queue.add(value);
        queue.notifyAll();
        return true;
    }

    public synchronized int remove() throws InterruptedException {
        while(queue.isEmpty()){
            queue.wait();
        }
        int value = queue.poll();
        queue.notifyAll();
        return value;
    }
}
