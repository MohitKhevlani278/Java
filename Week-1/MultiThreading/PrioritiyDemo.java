class NormalPriority extends Thread {
    public void run() {
        setPriority(NORM_PRIORITY);
        try {
            for (int i = 0; i < 10; i++){
                System.out.println("NormalPriority thread " + i);
            }
            } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}

class LowPriorityThread extends Thread {
    public void run() {
        setPriority(MIN_PRIORITY);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("LowPriority thread " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class PrioritiyDemo {

    public static void main(String[] args) {
        LowPriorityThread lp = new LowPriorityThread();
        lp.start();
        NormalPriority npt = new NormalPriority();
        npt.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
