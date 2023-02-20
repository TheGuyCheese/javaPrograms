import java.util.*;
public class differentStringFunctions {
/*1) Convert lower case to uppercase
2) Uppercase to lowercase
3) Replace first character with last character
4) Trim last character
5) Length of string
6) Display character at 3rd position
7) Substring staring from 5th position
8) Index of third character in string
9) Enter two string and check equal or not*/

    static void display(String s){
        System.out.println(s+"\n");
    }
    static void replace(String str){

        char[] ch = str.toCharArray();

        char temp = ch[0];
        ch[0] = ch[ch.length-1];
        ch[ch.length-1] = temp;

        display(String.valueOf(ch));

    }

    static void indexOf(String str){
        char[] ch = str.toCharArray();
        char c = ch[2];
        System.out.println(str.lastIndexOf(c)+"\n");
    }

    static void compare(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Second String: ");
        String new_string = sc.nextLine();
        System.out.print("The First String is: ");
        display(str);
        System.out.print("\nThe Second String is: ");
        display(new_string);

        if (str.equals(new_string)==true){
            System.out.println("The Strings are Equal!");
        }else{
            System.out.println("The Strings are NOT Equal!");
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String temp = str;
        StringBuffer s = new StringBuffer(temp);
        while (true) {
            System.out.println("Please Enter you choice:\n1. Convert LowerCase to UpperCase " +
                    "\n2. UpperCase to LowerCase\n3. Replace First with Last\n4. Trim Last Character" +
                    "\n5. Length of String\n6. Display Char at 3rd\n7. Substring at 5\n8. Index of 3rd Char" +
                    "\n9. To Check if two strings are equal or not\n10. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println(str.toUpperCase()+"\n");
                    break;
                case 2:
                    System.out.println(str.toLowerCase()+"\n");
                    break;
                case 3:
                    replace(str);
                    break;
                case 4:
                    System.out.println(s.deleteCharAt(s.length()-1)+"\n");
                    break;
                case 5:
                    System.out.println(str.length()+"\n");
                    break;
                case 6:
                    System.out.println(str.charAt(2)+"\n");
                    break;
                case 7:
                    System.out.println(str.substring(4,str.length()-1)+"\n");
                    break;
                case 8:
                    indexOf(str);
                    break;
                case 9:
                    compare(str);
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Please Enter the Right Choice!");
            }
        }
    }
}
