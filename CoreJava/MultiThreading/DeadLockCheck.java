class X {

    synchronized void x1()
    {
        x2();
    }
    synchronized void x2(){

    }
}
class ThreadX1 extends Thread {
    X xObj;

    ThreadX1(X xObj) 
    {
        this.xObj = xObj;
    }
    public void run()
    {
        for(int i = 0; i < 100000; i++) {
            xObj.x1();
        }
    }
}

class DeadLockCheck {
    
    private static final int NUMTHREADS = 10;
    public static void main(String[] args) {

        X xObj = new X();

        //Create and Start Thread
        ThreadX1 threads[] = new ThreadX1[NUMTHREADS];
        for(int i = 0; i < NUMTHREADS; i++)
        {
            threads[i] = new ThreadX1(xObj);
            threads[i].start();
        }

        //Wait for threads to complete
        for(int i = 0; i < NUMTHREADS; i++)
        {
            try{
                threads[i].join();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Done");
    }
}
