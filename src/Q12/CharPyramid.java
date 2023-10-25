package Q12;

import java.util.Scanner;

public class CharPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        for (int i = 65; i <lim+65; i++) {
            for (int j =1; j <= i-64; j++) {
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}
