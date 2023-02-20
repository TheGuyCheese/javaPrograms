import java.io.*;
class one extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}

class two extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Hello");
        }
    }
}

class three extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class multiThreading {
    public static void main(String[] args){
        one t1 = new one();
        two t2 = new two();
        three t3 = new three();
        t1.start();
        t2.start();
        t3.start();
    }
}
