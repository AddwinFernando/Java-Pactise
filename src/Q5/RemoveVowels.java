package Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split("");
        ArrayList<String> arrsrt = new ArrayList<String>(Arrays.asList(arr));

        for(String ch:arrsrt){
            if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")){
                arrsrt.remove(ch);
            }
        }
        System.out.println(arrsrt);
    }
}

