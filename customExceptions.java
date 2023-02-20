import java.util.*;
public class customExceptions extends Exception{
    public customExceptions(String s){
        super(s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b;
        System.out.println("Please Enter the a number below 50!");
        int temp = sc.nextInt();
        try{
            if(temp>50){
                throw new customExceptions("Number should be less than 50!");
            }
        }catch(customExceptions ex){
            System.out.println(ex);
            System.exit(1);
        }
        System.out.println("Square of the Number = "+ temp*temp);
    }
}
