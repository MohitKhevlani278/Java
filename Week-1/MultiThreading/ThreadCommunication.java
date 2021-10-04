class Producer extends Thread {
    Queue queue;

    Producer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        int i = 0;
        while (true) {
            queue.add(i++);
        }
    }
}

class Consumer extends Thread {
    String str;
    Queue queue;

    Consumer(String str ,Queue queue){
        this.str = str;
        this.queue = queue;
    }

    public void run() {
        while (true) {
            System.out.println(str + " " + queue.remove());
        }
    }
}

class Queue {
    private final static int SIZE = 10;
    int array[] = new int[SIZE];
    int r = 0,w = 0, count = 0;

    synchronized void add(int i) {
        while (count == SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        array[w++] = i;
        if (w >= SIZE) {
            w = 0;
        }
        ++count;
        notifyAll();
    }

    synchronized int remove() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        int element = array[r++];
        if (r >= SIZE) {
            r = 0;
        }
        --count;
        notifyAll();
        return element;
    }
}

class ThreadCommunication {

    public static void main(String[] args) {
        Queue queue = new Queue();
        new Producer(queue).start();
        new Consumer("consumerA" ,queue).start();
        new Consumer("consumerB" ,queue).start();
    }
}
