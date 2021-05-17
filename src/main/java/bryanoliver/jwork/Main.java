package bryanoliver.jwork;
public class Main extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("Code outside thread");
    }
    public void run() {
        System.out.println("Code inside thread");
    }
}