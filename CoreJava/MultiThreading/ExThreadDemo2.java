package MultiThreading;

class RunInterface implements Runnable {
    // @Override run method
    public void run() {

        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("A");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class RunInterface1 implements Runnable {

    // @Override run method
    public void run() {

        try {
            while (true) {
                Thread.sleep(3000);
                System.out.println("A");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExThreadDemo2 {
    public static void main(String[] args) {
        RunInterface runnable = new RunInterface(); 
        Thread tx = new Thread(runnable); 
        tx.start();

        RunInterface1 tn = new RunInterface1(); 
        Thread tx1 = new Thread(tn);
        tx1.start();
        
        try {
            tx.join();
            tx1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
