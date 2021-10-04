class RunnableY implements Runnable {

    // @Override run method
    public void run() {

        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("Thread with runnable interface implements");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        RunnableY runnable = new RunnableY(); // Create runnable object
        Thread tx = new Thread(runnable); // Pass runnable object to thread constructor
        tx.start();
    }
}
