import java.util.*;
public class primeNumber {
    static int isPrime(int a) {
        for (int i = 2; i < 10; i++) {
            if (a == i) {
                break;
            } else {
                if (a % i == 0) {
                    break;
                } else {
                    return a;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1");
        } else if (n == 2) {
            System.out.println("1\n2");
        }
            for (int i = 1; i <= n; i++) {
                if (isPrime(i) != -1) {
                    System.out.println(i);
                } else {
                    continue;
                }
            }
        }
    }

