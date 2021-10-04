class a extends Thread {
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

class b extends Thread {
    public void run() {
        try {
            int i = 5;
            while (i > 0) {
                Thread.sleep(3000);
                System.out.println("B");
                i--;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExThreadDemo1 {
    public static void main(String[] args) {

        a aThread = new a();
        aThread.start();

        // Get and set thread name
        System.out.println("Get the name of thread : " + aThread.getName());
        aThread.setName("Thread A");
        System.out.println("Name of thread after set new name : " + aThread.getName());

        // Get and Set Thread Priority
        System.out.println("Priority before set new priority : " + aThread.getPriority());
        aThread.setPriority(10);
        System.out.println("Priority after set new priority : " + aThread.getPriority());

        b bThread = new b();
        bThread.start();
        System.out.println(bThread.getPriority());
        System.out.println("Get Thread information in string format :  " + bThread.toString());

        try {
            System.out.println("Return Informationwhich thread currently running :" + Thread.currentThread());
            aThread.join(); // allows one thread to wait until another thread completes its execution.
            bThread.join();
            System.out.println("Check thread is alive or not : " + bThread.isAlive()); // Check thread is alive or not
            System.out.println("Thread Working Completed");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
