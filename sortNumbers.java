import java.util.Scanner;
import java.util.Arrays;
public class sortNumbers {

    static void output(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(" " + arr[i] + " ");
        }

    }

    public static void main (String args[]){

        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the 10 Numbers to be sorted: ");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        output(array);

        System.out.println();

        Arrays.sort(array);

        output(array);



    }
}
