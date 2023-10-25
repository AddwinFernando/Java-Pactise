package Q3;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==j&&i%j==0) {
                    System.out.println(i);
                }
            }
        }
    }
}
