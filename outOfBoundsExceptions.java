import java.util.Scanner;

public class outOfBoundsExceptions extends Exception {

    public outOfBoundsExceptions(String s){
        super(s);
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the marks of 5 subjects: ");
        int[] arr = new int[5];
        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }
            for(int i =0; i<5;i++) {
                try {
                    if (arr[i] > 100){
                        int pos = i+1;
                        throw new outOfBoundsExceptions("Marks Out of Bound for Value at position: "+ pos);
                    }
                }catch(outOfBoundsExceptions ex){
                    System.out.println(ex);
                    System.exit(1);

                }

            }
        System.out.println("Program is successfully executed!");
    }
}
