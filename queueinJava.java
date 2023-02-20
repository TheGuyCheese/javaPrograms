import java.util.*;
import java.io.*;
public class queueinJava {

    public static void main(String args[]){
        Queue<Integer> q= new PriorityQueue<Integer>();
        System.out.print("Initial Queue: ");
        System.out.print(q);
        System.out.print("\nAdding elements to the queue: ");
        q.add(5);
        q.add(10);
        q.add(16);
        q.add(23);
        q.add(43);
        System.out.println(q);
        System.out.print("Removing 2 elements from the queue: ");
        q.remove(10);
        q.remove(23);
        System.out.println(q);
        System.out.print("The Element at the top of the queue: "+q.peek());

    }
}
