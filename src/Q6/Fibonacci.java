package Q6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int p = 0,n=1,temp;
        for (int i = 0; i <= limit; i++) {
            temp = p+n;
            p = n;
            n = temp;
            System.out.println(temp);
        }
    }
}
