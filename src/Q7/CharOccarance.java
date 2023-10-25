package Q7;

import java.util.Scanner;

public class CharOccarance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] arr = a.split("");
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(b.equals(arr[i])){
                count++;
            }
        }
        System.out.println("The charector "+b+" occurs "+count+" times");
    }
}
