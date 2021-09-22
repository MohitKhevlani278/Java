/*
Date And Time
- not have built-in date class but we can import the java.time package to work with dataandtime api.

*/
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class A7dataandtime {

    public static void main(String[] args) {

        // Print currentDate and time using data class
        Date currentDate = new Date();
        System.out.println(currentDate.toString());

        //Print local machine date and time
        LocalDateTime myobj = LocalDateTime.now();
        System.out.println(myobj);

        //Format date and time
        DateTimeFormatter formobj = DateTimeFormatter.ofPattern("E,dd-MM-yyyy HH:mm:ss");
        String formatdt = myobj.format(formobj);
        System.out.println(formatdt);


        // Calendar
        
        // declaring an array to store month abbreviations
        String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug","Sep", "Oct", "Nov", "Dec" };
 
        // declaring an array to store AM or PM
        String amPm[] = { "AM", "PM" };
 
        /* Creating an object of GregorianCalendar class using default constructor*/
        GregorianCalendar gcal = new GregorianCalendar();
        
        // GregorianCalendar gcal = new GregorianCalendar(2018, 3, 30); Passing year, month, DayOfMonth, (hourOfDay,MINUTE,second,timezone,locale);
        

        // displaying the date, time, time zone and locale
        System.out.print("Date: "
                         + month[gcal.get(Calendar.MONTH)] + " "
                         + gcal.get(Calendar.DATE) + ", "
                         + gcal.get(Calendar.YEAR) + "\n"
                         + "Time: "
                         + gcal.get(Calendar.HOUR) + ":"
                         + gcal.get(Calendar.MINUTE) + ":"
                         + gcal.get(Calendar.SECOND) + " "
                         + amPm[gcal.get(Calendar.AM_PM)] + "\n"
                         + "Time Zone: " + gcal.getTimeZone().getDisplayName()
                         + "\n"
                         + "Locale: "
                         + Locale.getDefault().getDisplayName());

    }
}
/* 
Date and Time :-
- In java.util package, this class encapsulates the current date and time

Constructor :-
1)Date()  :- Initalize date and Time Object
2)Date(long milliseconds) :- accepts an argument that equals the number of milliseconds

Calender :-
java.util.GregorianCalendar vs java.util.Calendar
- Calendar Class being an abstract class cannot be instantiated. 
- So an object of the Calendar Class is initialized as: 
  Syntax :- Calendar cal = Calendar.getInstance();

- Object named cal of Calendar Class is initialized with the current date and time in the default locale and timezone. 
- Whereas, GregorianCalendar Class being a concrete class, can be instantiated. 
- So an object of the GregorianCalendar Class is initialized as: 
  
  Syntax :- GregorianCalendar gcal = new GregorianCalendar();

- gcal of GregorianCalendar Class is initialized with the current date and time in the default locale and timezone.




*/