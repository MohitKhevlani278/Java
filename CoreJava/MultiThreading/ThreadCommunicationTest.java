class K{
    boolean flag;
    synchronized void k1()
    {
        if(flag == false)
        {
            flag = true;
            try{
                System.out.println("Calling wait");
                wait();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else
        {
            flag = false;
            System.out.println("Calling NotifyAll");
            notifyAll();
        }
    }
}
class ThreadK extends Thread {
    K k;
    ThreadK(K k)
    {
        this.k = k;
    }
    public void run()
    {
        k.k1();
        System.out.println("Done");
    }
}
public class ThreadCommunicationTest {
    public static void main(String[] args)
    {
        K k = new K();
        new ThreadK(k).start();
        new ThreadK(k).start();
    }
}
