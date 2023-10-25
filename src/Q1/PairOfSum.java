package Q1;

import java.util.ArrayList;

public class PairOfSum {
    public static void main(String[] args) {
        int[] arr = {-5, 1, -40, 20, 6, 8, 7 };
        int k = 15;
        boolean tf = false;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j< arr.length;j++){
                if(i==j){
                    continue;
                } else {
                    if(arr[i]+arr[j]==k){
                        tf = true;
                        break;
                    }
                }
            }
        }
        System.out.println(tf);
    }
}
