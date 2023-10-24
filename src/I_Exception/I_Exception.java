package I_Exception;

public class I_Exception {
    public static void main(String[] args) {
        try {
            int a = 24 / 0;
            System.out.println("Exception");
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("error");
            } else {
                System.out.println(e);
            }


        }
    }
}
