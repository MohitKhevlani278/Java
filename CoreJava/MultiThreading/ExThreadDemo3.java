class Main extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                t1.sleep(300);
                System.out.println("X");
                t1.sleep(800);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class t1 extends Main {
    void run1() {
        System.out.println("Thread class 1 Call");
        super.run();
    }
}

class t2 extends Main {
    void run1() {
        System.out.println("Thread class 2 Call");
        super.run();
    }
}

class t3 extends Main {

    void run1() {
        System.out.println("Thread class 3 Call");
        super.run();
    }
}

class t4 extends Main {
    void run1() {
        System.out.println("Thread class 4 Call");
        super.run();
    }
}

class t5 extends Main {
    void run1() {
        System.out.println("Thread class 5 Call");
        super.run();
    }
}

public class ExThreadDemo3 {
    public static void main(String[] args) {

        try {

            t1 t1Obj = new t1();
            t1Obj.run1();
            System.out.println(t1Obj.getName());
            
            t2 t2Obj = new t2();
            t2Obj.run1();

            t3 t3Obj = new t3();
            t3Obj.run1();

            t4 t4Obj = new t4();
            t4Obj.run1();

            t5 t5Obj = new t5();
            t5Obj.run1();

            

            System.out.println("Exectuion Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
