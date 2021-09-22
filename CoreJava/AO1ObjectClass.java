import java.util.Scanner;   //A way of giving the proper location for the compiler to find that particular class

//Interface Stuff
interface cricket {
    public void team();
    public void ground();
}
// Interface method body in implement
class wtc implements cricket { 
    public void team() {
        System.out.println("Team Blue");
    }

    public void ground() {
        System.out.println("southampton");
    };
}
// mulitple interface
interface ind {
    public void win();
}

class Yeah implements cricket, ind {
    public void team() {
        System.out.println("Team Blue");
    }

    public void ground() {
        System.out.println("southampton");
    };

    public void win() {
        System.out.println("Team Blue win");
    }
}

// abstract class have both abstract and regular methods
abstract class Testing {
    public abstract void test_1();

    public void sleep() {
        System.out.println("ZZZZ");
    }
}
//Abstract Class method Body
class Testinherit extends Testing {
    public void test_1() {
        System.out.println("Abstract method body is her");
    }
}

// NESTED Class
class Outerclass {
    int outervar = 10;

    class Innerclass { // private innerclass / static class innerclass
        public int myInnerMethod() {
            int innervar = 5;
            System.out.println(innervar);
            return outervar;
        }
    }
}

class AO1ObjectClass {

    // Class Variables
    static String email = "bkbhesniya11@gmail.com"; 

    // instance variables
    String name;
    int age;  
    int height;  

    // Method Creation
    //Static method string with return value
    static String test_1(){
        String t = "Calling Static method (not required to create object)";
        return t;
    }
    //Static method string without return value
    static void first_method() {
        System.out.println("Method Without parameter and return value");
    }
    
    void setName(String fname) {
        // local variable
        name = fname; // set value from object creation to variable
    }
    //Method overriding 
    void setName(String fname,int age) {
        System.out.println("Method Overriding : " + fname + " : " + age);
    }

    static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    String getName() {
        System.out.println("Get variable value is : " + name);
        return name;
    }

    void setAge(int value) {
        age = value;
        System.out.println("Print age from user input : " + age);
    }



    // constructor
    public AO1ObjectClass() {
        height = 20;    
    }

    // parameterized constructor
    public AO1ObjectClass(String name) {
        System.out.println("Value from parameterized constructor : "+ name);
    }

    public static void main(String[] args) {
        // Object declartion /instantiation /Initialization
        AO1ObjectClass firstObj = new AO1ObjectClass("Passing value in parameterized constructor");
        AO1ObjectClass secondObj = new AO1ObjectClass();


        // Set and Access instance variables or methods values via object
        firstObj.setName("Value is pass for set and return value" );
        System.out.println("Print Returns value from get method : " + firstObj.getName()); // non-static method called using object of that class
        System.out.println("Access static variable value : " + AO1ObjectClass.email);
        System.out.println("Print no argument constructor : " + secondObj.height);


        // Use Built-in class for take userinput
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int sc = scObj.nextInt();
        firstObj.setAge(sc);
        scObj.close();

        //Calling Method
        first_method();                                     // static method called without create an object of the class
        System.out.println(test_1());
        firstObj.setName("Bhavin", 10);
        System.out.println(sum(5));

        // Access abstract methods
        // System.out.println("Name : " + " " + myFirstObj.fname + "\nAge : " + myFirstObj.lname + "\nGrade :" + " " + myFirstObj.fname);

        // create multiple class
        // Note :- both file ni same directory/folder or file name match class name
        // SecondClass obj = new SecondClass(); //access another file class
        // System.out.println(obj.m);

        // NestedClass STuff
        Outerclass myOuterobj = new Outerclass();
        Outerclass.Innerclass myInnerobj = myOuterobj.new Innerclass(); // normal use
        // System.out.println(myInnerobj.innervar + myOuterobj.outervar);

        // Outerclass.Innerclass myInnerobj = new Outerclass.Innerclass(); | when use static class
        System.out.println(myInnerobj.myInnerMethod()); // access outerclass attributeand method from innerclass

        // ABSTRACT CLASS STuff
        Testinherit myabsobj = new Testinherit();
        myabsobj.test_1();
        myabsobj.sleep();

        // Interface stuff
        wtc wtcobj = new wtc(); // implement class obj
        wtcobj.team();
        wtcobj.ground();
        Yeah winobj = new Yeah(); // multiple impliment class obj
        winobj.team();
        winobj.win();
    }

}
