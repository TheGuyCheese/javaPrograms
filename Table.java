import java.util.Scanner;
public class Table {
    static void printTable(int number, int c){

        if(c>0){
            System.out.println(number + " * " + c + " = " + number*c);
            printTable(number, c-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number Whose Table You Want to Obtain: ");
        int number = sc.nextInt();
        System.out.println("Please Enter up to How many Multiples the Table Should be: ");
        int count = sc.nextInt();
        printTable(number, count);
    }
}
