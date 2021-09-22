// public class SecondClass {
//     int  m = 20;

// }

abstract class absMethod{
    public String Fname = "BHAVIN";
    public int age = 21;
    public abstract void Study();   //abstract method without body 
}
//Subclass(inherit from absMethod)
class Student extends absMethod{

    public int grade = 2022;
    public void Study() {
        System.out.println("Studing all day");
    }
}

