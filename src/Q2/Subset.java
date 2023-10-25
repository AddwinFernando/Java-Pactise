package Q2;

public class Subset {
    public static void main(String[] args) {
        int[] arr1 = { 3, 5, 7, 12, 1, 9, 10, 0, 2 };
        int[] arr2 = { 6, 3, 8 };
        boolean res = false;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    res = true;
                    break;
                } else {
                    res = false;
                }
            }

        }
        System.out.println(res);
    }
}
