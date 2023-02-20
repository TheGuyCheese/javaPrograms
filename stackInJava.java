import java.util.*;
import java.io.*;

public class stackInJava {
    static void push(Stack<Integer> stack, int n){
        stack.push(n);
    }
    static void pop(Stack<Integer> stack){
        Integer x = (Integer) stack.pop();
        System.out.println();
    }

    static void stack_search(Stack<Integer> stack, int a){
        Integer pos =(Integer) stack.search(a);
        if(pos==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element is found at: "+ pos);
        }
    }

    static void printStack(Stack<Integer> stack){
        System.out.println("Stack: "+ stack);
    }

    static void topOfStack(Stack<Integer> stack){
        Integer top = (Integer) stack.peek();
        System.out.println("Element at the top: "+top);
    }

    public static void main(String[] args){
        Stack<Integer> stk = new Stack<Integer>();
        push(stk, 8);
        push(stk,6);
        push(stk, 9);
        push(stk, 17);
        push(stk, 5);
        printStack(stk);
        stack_search(stk, 6);
        System.out.print("Poping the value out of stack.");
        System.out.print("\nAfter Pop");
        pop(stk);
        printStack(stk);
        topOfStack(stk);
    }
}
