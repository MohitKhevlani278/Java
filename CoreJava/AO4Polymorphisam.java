/*
Polymorphisam :-
- "Many form" and it occurs when we have many classes that are related to each other by inheritance
- polymorphisam use inheritad methods to perform different tasks
- Allow to perform single actions in different ways
-

*/
class Bca{
    public void subject(){
        System.out.println("Java,c++,python");
    }
}
class Sem1 extends Bca{
    public void subject(){
        System.out.println("Student 1 ask oop lanaguage : we say Java,c++,python");
    }
}
class Sem2 extends Bca{
    public void subject(){
        System.out.println("Student 2 ask oop lanaguage : we say Java,c++,python");
    }
}

public class AO4Polymorphisam {

    public static void main(String[] args)
    {
        Bca firstobj = new Bca();
        Sem1 secondobj = new Sem1();
        Sem2 thirdobj = new Sem2();
        firstobj.subject();
        secondobj.subject();
        thirdobj.subject();
    }
    
}
