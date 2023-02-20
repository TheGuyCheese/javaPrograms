import java.util.*;
public class palindromeString {
    static boolean palindromeCheck(String A){

        String temp = "";

        Boolean res = false;

        for(int i=A.length()-1;i>=0;i--){
            temp = temp + A.charAt(i);
        }

        if(A.equals(temp)){
            res = true;
        }

        return res;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str = str.toLowerCase();

        System.out.println("Initial String: " + str);

        boolean chk = palindromeCheck(str);

        System.out.println("Final Result: " + chk);

    }


}
