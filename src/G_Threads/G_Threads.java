package G_Threads;

public class G_Threads extends Thread{
    public static void main(String[] args) {
        G_Threads thread = new G_Threads();
        thread.start();
    }

    public void run() {
        System.out.println("Running");
    }
}
