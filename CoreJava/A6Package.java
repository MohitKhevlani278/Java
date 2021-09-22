/*
Pacakge :-
- Java package is used to group related classes
- Use package to avoid name conflict,and to write a better maintainable code

1)Built-in package        (package from the java api)
2)User defined package    (create your own package)

 1)Built-in package :-
 - Java api is a library of prewritten classes,that are free to use,inculded java development enviroment
 - library divided into two part :- package and classes
 - either import single class or import whole package that contain all the classes
 - import keyword use at begin of file  
 Ex :- import package.name.class; single class 
       import package.name.*;     import the whole package  

 2)User defined package :-
 - Java uses a file system directory to store them.
 - root ->mypack -> filename.java

 gi


 */


 import java.util.Scanner;


public class A6Package {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER USERNAME : ");
        String username = obj.nextLine();
        System.out.println("User Name is : " + username);
        obj.close();
    }
}
