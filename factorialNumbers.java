import java.util.Scanner;

public class factorialNumbers {
    static int factorial(int i){
        if (i==0){
            return 1;
        }else{
            return (i*factorial(i-1));
        }
    }
    public static void main(String args[]){
        int fact;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);

    }
}
