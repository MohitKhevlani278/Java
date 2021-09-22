/*
Inheritance :-
- Inherit attributes and methods from one class to another
- two classes -> 
    1)superclass(parent) - being inherited from
    2)subclass(child)    - class that inherits from another class
- Extends keyword is used for inheritance
- Useful for code reusability :- reuse attributes and methods of an existing class



*/
class FullName{
    protected String name = "Bhavin"; 
    public void FName()
    {
        System.out.println("Bhesaniya");
    }
}
class Details extends FullName {
    private int age = 21;
    public static void main(String[] args)
    {   
        Details myobj = new Details();
        myobj.FName();

        System.out.println(myobj.name + " " + myobj.age);


    }
    
}
