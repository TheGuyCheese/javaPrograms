package threadInJava;

import java.util.Scanner;

class threadExample implements Runnable{
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter you Name: ");
        String a = sc.next();
        System.out.println(a + " created this thread.");
    }
}
public class threadingInJava extends Thread{
    public static void main(String[] args){
        Thread obj = new Thread(new threadExample());
        obj.start();

        System.out.println("Thread Has been created with name - "+ obj.getName());
    }
}
