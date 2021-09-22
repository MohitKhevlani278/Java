/*
Array :-
- Array is a data structure that contains a group of elements, these elements are all of the same data type
- In java all arrays are dynamically allocated , Ordered and start index with 0 and find length using length Property 
- Every array type implements the interfaces Cloneable and java.io.Serializable
- In case of primitive data types, the actual values are stored in contiguous memory locations. 
- In case of objects of a class, the actual objects are stored in heap segment.
- If we try to access element outside the array size JVM throws ArrayIndexOutOfBoundsException
- superclass of any array type is java.lang.Object. 
- arrays are object of a class and direct superclass of arrays is class Object
- Default values of primitive datatype is 0 and user-defined type is null


Syntax :- data-type[] variablename;                     //declared  only reference of array is created
          Variablename = new datatype[arraysize];       //create a new array give memory location

          dataType[] arrayRefVar = new dataType[arraySize];     //In one line create a new array 
          String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};    //create a new array with value Declaring array literal

          Access Elements :- arrayRefVar[indexNo]; Or Loops
          Update Elements :- arrayRefVar[indexNo] = new value; 
          Find Length     :- arrayRefVar.length;          
         
- Multi-dimensional array containing one or more array
Syntax :- int[][] intArray = new int[10][20]; //a 2D array or matrix
          int[][][] intArray = new int[10][20][10]; //a 3D array


Class objects of arrays :-
- Every array has an associated Class object, shared with all other arrays with the same component type
Syntax :- arrayVariable.getClass()  / arrayVariable.getclass().getSuperclass()


Array Member :-
- The public final field length, which contains the number of components of the array. length may be positive or zero.
- All the members inherited from class Object; the only method of Object that is not inherited is its clone method.
- The public method clone(), which overrides clone method in class Object and throws no checked exceptions.


Cloning array :-
- Object cloning refers to the creation of an exact copy of an object. 
- It creates a new instance of the class of the current object and initializes all its fields with exactly the contents of the 
  corresponding fields of this object.
Syntax :- Using Assignment Operator to create a copy of the reference variable 

- Every class that implements clone() should call super.clone() to obtain the cloned object reference.
- implement java.lang.Cloneable interface whose object clone we want to create otherwise it will throw CloneNotSupportedException 
  when clone method is called on that class’s object.
Syntax :- protected Object clone() throws CloneNotSupportedException

Shallow copy :- 
- method of copying an object and is followed by default in cloning. 
- In this method, the fields of an old object X are copied to the new object Y. 
- While copying the object type field the reference is copied to Y

Deep copy :-
- A deep copy copies all fields and makes copies of dynamically allocated memory pointed to by the fields.
- A deep copy occurs when an object is copied along with the objects to which it refers.


Array Class :-
- Arrays class in java.util package is a part of the Java Collection Framework. 
- This class provides static methods to dynamically create and access Java arrays. 
- It consists of only static methods and the methods of Object class. 
- The methods of this class can be used by the class name itself
Hierachiy :- java.lang.Object -> java.util.Arrays
- java.util.Arrays class contains various static methods for sorting and searching, comparing ,filling array elements. 
- These methods are overloaded for all primitive types.


Reflection Array Class :- 
- Array class in java.lang.reflect package is a part of the Java Reflection. 
- This class provides static methods to dynamically create and access Java arrays. 
- It is a final class, which means it can’t be instantiated, or changed. 
- Only the methods of this class can be used by the class name itself.

Final Array :-
- final array means that the array variable which is actually a reference to an object, cannot be changed to refer to anything else,
  but the members of array can be modified


Jagged Array :-
- A jagged array is an array of arrays such that member arrays can be of different sizes



Exception :-
1) Checked :- checked at compile time. 
- If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the 
  exception using throws keyword.

2) Unchecked :- unchecked at compile time
- In Java exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked.



*/

import java.util.*;

public class A3Array {
    // Array of objects class for testing
    static class Student {
        public int roll_no;
        public String name;

        Student(int roll_no, String name) {
            this.roll_no = roll_no;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        System.out.println("Print One-Dimensional Array with user input :-  ");
        Scanner userInputInsert = new Scanner(System.in);
        System.out.print("Enter no of input you need to add : ");

        int[] arrayVar = new int[10]; // Declare Array

        int NoOfInput;
        NoOfInput = userInputInsert.nextInt();

        for (int i = 0; i < NoOfInput; i++) {
            arrayVar[i] = userInputInsert.nextInt();
        }
        System.out.println("Print Array after user input :-  ");
        for (int i = 0; i < NoOfInput; i++) {
            System.out.println(arrayVar[i]);
        }
        userInputInsert.close();
        
        

        System.out.println("Array Of Object/ declare class and access his method :-");
        Student[] arrayOfObj = new Student[2];
        arrayOfObj[0] = new Student(12, "Bhavin");


        System.out.println("Multi-Dimensional Array / Jagged Array :- ");
        int[][] myNum = { {2,7,9},{3,6,1},{7,4,2}};
        for (int i = 0; i < myNum.length; ++i) {
            for (int j = 0; j < myNum[i].length; ++j) {
                System.out.print(myNum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Print Single value from multidimensional array : "+ myNum[0][2]);

        System.out.println("Passing Array to method :- ");
        int[] sumVar = {3,4,5,6,7,8,9,10,11};
        sum(sumVar);

        System.out.println("Return Array from method :- ");
        int[] retrunSum = m1();
        System.out.println("Return Array length : " + retrunSum.length );
        
        System.out.println("Class Object of arrays :- ");
        int intArray[] = new int[3];
        System.out.println(intArray.getClass() + " Diffrence : " + intArray.getClass().getSuperclass());
        

        System.out.println("Cloneing Array Methods :- ");
        int intArrays[] = {1,2,3};          
        int cloneArray[] = intArrays.clone();
        // will print false as deep copy is created for one-dimensional array
        System.out.println(intArrays == cloneArray);// in multidimensional [0][1] added after intArrays
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i]+" ");
        }
        System.out.println();

        System.out.println("Jagged array in java :-");
        int r = 5;
         // Declaring 2-D array with 5 rows
        int arr[][] = new int[r][];
 
        // Creating a 2D array such that first row has 1 element, second row has two elements and so on.
        for (int i = 0; i < arr.length; i++)
            arr[i] = new int[i + 1];
 
        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }




    }
    public static void sum(int[] sumVar) {
        int sum = 0;
        for (int i = 0; i < sumVar.length;i++) {
            sum = sum + sumVar[i];
        }
        System.out.println("Total sum is :" + sum);    
    }
    public static int[] m1() 
    {
        // returning  array
        return new int[]{1,2,3};
    }

}
