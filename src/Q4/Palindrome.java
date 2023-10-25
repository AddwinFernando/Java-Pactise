package Q4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuffer sb = new StringBuffer(a);
        String b = String.valueOf(sb.reverse());

        if(a.equals(b)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }


    }
}
