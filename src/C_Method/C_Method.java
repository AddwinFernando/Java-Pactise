package C_Method;

public class C_Method {

    public static void main(String[] args) {
        Overloading object1 = new Overloading();
        object1.method();

        System.out.println("The sum1 is " + object1.sum());
        System.out.println("The sum2 is "+object1.sum(1,2));
    }
}

class Overloading {
    int sum() {
        return 7 + 5;
    }

    void method() {
        System.out.println("This is a method");
    }

    int sum(int a, int b) {
        return a + b;
    }
}
