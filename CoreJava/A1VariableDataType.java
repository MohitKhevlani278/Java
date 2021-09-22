import java.util.ArrayList;
 //This class for enum example
class FreshJuice {
    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }
    FreshJuiceSize size;
}

class  A1VariableDataType {
    public static void main(String[] args)
    {
        String Fname = "Bhavin"; 
        float Num = 10.10f;      
        char ch = 'B';              //single char only,surrounded by single quotes  
        final int Fix_value = 20;   //final variable value like constant not changed
        System.out.println(Fname +  " / " +Num+ " / " + ch + " / Final variable = " +Fix_value); 
    
        //Start program Enum
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println("Size: " + juice.size);
            
        //TypeCasting
        int intcast = 10;             //Widening casting(automatically) int to double
        double doublecast = intcast;     
        int Test = (int)doublecast;   //Narrowing casting(Manually) double to int
        System.out.println("Widening casting : " + doublecast + "Narrowing casting : " + Test);

        //Wrapping in oop
        char c = 'a';
        Character a = c;    //  Character object Boxing
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(25);  // Autoboxing because ArrayList stores only objects
        System.out.println(arrayList.get(0)); 
        //Unboxing
        int num = arrayList.get(0); // unboxing because get method returns an Integer object
        System.out.println(num);    // printing the values from primitive data types
    }

}

