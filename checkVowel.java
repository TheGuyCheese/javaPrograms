import java.util.*;
public class checkVowel {

    static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Character: ");

        char c = sc.next().charAt(0);
        System.out.println("The Character is: " + check(c));
        System.out.println();
    }
    static String check(char c){
        String temp = "aieouAIEOU";
        if(temp.indexOf(c)!=-1){
            return "vowel";
        }else{
            return "consonant";
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Please Enter you choice: \n 1. Check 2. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    input();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Please Enter A correct Value!");
            }
        }
    }

}
