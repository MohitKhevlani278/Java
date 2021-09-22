/*
Encapsulation :- 
- Hide sensitive data from user so increased security of data
- binding data and method into single unit
- better control of class attribute and methods
- class-attributes can be read-only(use only get) or write-only(only use set) 
- flexible without affecting other parts
   
How to achieve :-
 - declare class variable/attributes as private
 - get and set method to accessand update the value of private variable
    
Get/Set Method :- return the variable value,set method set the value
Ex :- getVariableName() / setVariableName()

*/

public class AO5OopENcapsulation {
    public static void main(String[] args) {
        AO3PersonEncapsulation myobj = new AO3PersonEncapsulation();
        myobj.setName("Bhavin");
        System.out.println(myobj.getName());
    }
}
