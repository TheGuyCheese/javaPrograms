import java.util.*;
public class namesInAscending {

    static void display(String A[], int n){
        for(int i = 0; i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[]){
        int size;
        String temp;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        String names[]= new String[size];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Names: ");

        for(int i = 0; i<size ;i++){
            names[i] = s.nextLine();
        }
        System.out.print("Without Sort: ");
        display(names, size);

        for(int i= 0; i<size;i++){
            for(int j=i+1;j<size;j++){
                if(names[i].compareTo(names[j])>0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j]=temp;
                }
            }
        }

        System.out.print("\n1With Sort: ");
        display(names, size);


    }
}
