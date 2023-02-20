import java.util.*;
public class checkPrime {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       if(number==1) {
           System.out.println("1 is neither a PRIME number nor a COMPOSITE number");
       } else if (number==2) {
           System.out.println("Is Prime");
       }else {
           for (int i = 2; i < 10; i++) {
               if (number == i) {
                   break;
               } else {
                   if (number % i == 0) {
                       System.out.println("Is not Prime!");
                       System.exit(1);
                   } else {
                       System.out.println("Is Prime!");
                       System.exit(1);
                   }
               }
           }
       }
       }
}
