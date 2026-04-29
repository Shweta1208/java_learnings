package threadAndMultithreading;

public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue q = new BlockingQueue(10);
        Thread producer = new Thread(()->{
            int i =0;
            while(true){
                try {
                    q.add(i++);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(()->{
            while(true){
                try{
                    q.remove();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
