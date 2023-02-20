
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class pro implements Runnable{
    BlockingQueue<Integer> obj;
    public pro(BlockingQueue<Integer> obj){
        this.obj = obj;
    }
    @Override public void run(){
        for(int i = 1;i<=10;i++){
            try{
                obj.put(i);
                System.out.println("Producer Produced "+i);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class com implements Runnable{
    BlockingQueue<Integer> obj;
    int taken = -1;
    public com(BlockingQueue<Integer> obj){
        this.obj = obj;
    }
    @Override public void run(){
        while(taken!=10){
            try{
                taken = obj.take();
                System.out.println("Consumer Consumed "+ taken);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class consumerProducerProblem {
    public static void main(String[] args)throws Exception{
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(10);
        pro p1 = new pro(bq);
        com c1 = new com (bq);

        Thread pTh = new Thread(p1);
        Thread cTh = new Thread(c1);

        pTh.start();
        cTh.start();
    }
}

