
class ThreadX extends Thread {
    
    //Override run method
    public void run() {
        try {
            // int i = 5; 
            // while (i > 0) 
            while (true)        //Condition true so infinte time print
            {
                Thread.sleep(3000);
                System.out.println("Hello This is first thread program");
                // i--;
                /*
                Excercise - 2 Question
                int max = 10,min = 5;
                int range = max - min + 1;
                int rand = (int)(Math.random() * range) + min;
                System.out.println(rand);
                */

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo1 {
    public static void main(String[] args) {

        //Create threadx class object
        ThreadX tx = new ThreadX();
        tx.start();         //start thrad
    }
}
