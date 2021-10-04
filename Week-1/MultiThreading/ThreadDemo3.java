class ThreadM extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("ThreadM method run after 10 iteration");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadN extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                Thread.sleep(200);
                System.out.println("ThreadN method run after 20 iteration");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadDemo3 {

    public static void main(String[] args) {

        ThreadM tm = new ThreadM();
        tm.start();
        ThreadN tn = new ThreadN();
        tn.start();

        try {
            tm.join();  //allows one thread to wait until another thread completes its execution.
            tn.join();
            System.out.println("Thread Working Completed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
