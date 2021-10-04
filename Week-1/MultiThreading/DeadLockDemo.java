class A {
    B classBObj;

    synchronized void a1() {
        System.out.println("Synchronized method a1");
        classBObj.b2();

    }

    synchronized void a2() {
        System.out.println("Synchronized method a2");
    }
}

class B {
    A classAObj;

    synchronized void b1() {
        System.out.println("Synchronized method b1");
        classAObj.a2();
    }

    synchronized void b2() {
        System.out.println("Synchronized method b2");
    }
}

class Thread1 extends Thread {
    A classAObj;

    Thread1(A classAObj) {
        this.classAObj = classAObj;
    }
    public void run() {
        for (int i = 0; i < 100000; i++) {
            classAObj.a1();
        }
    }
}

class Thread2 extends Thread {
    B classBObj;
    Thread2(B classBObj) {
        this.classBObj = classBObj;
    }
    public void run() {

        for (int i = 0; i < 100000; i++) {
            classBObj.b1();
        }
    }
}

class DeadLockDemo {
    public static void main(String[] args) {
        A classAObj = new A();
        B classBObj = new B();
        classAObj.classBObj = classBObj;
        classBObj.classAObj = classAObj;

        //Create Thread
        Thread1 tx1 = new Thread1(classAObj);
        Thread2 tx2 = new Thread2(classBObj);

        try {
            tx1.join();
            tx2.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    
        System.out.println("Done");

    }
}
/*
- Each time a1() method calls the b2() method and returns
- First thread calls a1() method again
- Then second thread calls b1()
- Deadlock occurs because the second thread waits for a lock on the A object and First thread 
  waits for a lock on the B object.
- 
*/
