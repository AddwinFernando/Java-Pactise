package B_Class;

public class B_Class {

    void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        B_Class object1 = new B_Class();
        object1.run();

        Dummy object2 = new Dummy();
        object2.dance();
    }
}
class Dummy{
    void dance(){
        System.out.println("Dancing");
    }
}

