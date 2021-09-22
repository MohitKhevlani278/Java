/*
String Class :-
- String is a sequence of characters treated as a object in java which contain method that perform operations on string
- String is immutabel, For modification to string of character use string buffer & string builder class
Syntax :- String <string_variable> = "<sequence_of_string>";
          String str = new String("Value");      //Dynamically Allocated
Package :- import java.io.*;
           import java.lang.*;


Memory allocation of String :-
- Whenever a String Object is created as a literal, the object will be created in String constant pool. 
- This allows JVM to optimize the initialization of String literal.
- In case of String are dynamically allocated they are assigned a new memory location in heap. 
- This string will not be added to String constant pool(str.intern(); //store in constant pool)

Note :- 
- All objects in Java are stored in a heap
- The reference variable is to the object stored in the stack area or they can be contained in other objects which puts them 
  in the heap area also.

Interface and class in String :- 
1)CharBuffer :-
2)StringBuffer  
3)StringBuilder            
4)StringTokenizer 
5)StringJoiner 
//Details After Methods

Methods :-                          Description	                                                      Return Type
length()	            Number of characters in the string		                                          int
charAt(int)           Character at the specified index (position)	                                    char
substring(int,int)	  Return the substring from the ith  index character to end                       string
concat()	            Appends a string to the end of another string	                                  string
indexOf()	            Returns the position of the first found in string	                              int
lastIndexOf()	        Returns the position of the last found in string	                              int
equals()	            Compares two strings	                                                          boolean
equalsIgnoreCase()	  Compares two strings                                                            boolean
compareTo()	          Compares two strings lexicographically	                                        int
compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	              int
toLowerCase()	        Converts a string to lower case letters	                                        String
toUpperCase()	        Converts a string to upper case letters	                                        String
trim()	              Removes whitespace from both ends of a string	                                  String
replace()	            returns a new string where the specified values are replaced	                  String
codePointAt()       	Returns the Unicode of the character at the specified index	                    int         
codePointBefore()	    Returns the Unicode of the character before the specified index	                int
codePointCount()	    Returns the Unicode in the specified text range of this String	                int
subSequence()	        Returns a new character sequence that is a subsequence of this sequence	        CharSequence
contains()	          Checks string contains a sequence of characters	                                boolean
contentEquals()	      Checks CharSequence exactly matches the String                         	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	                  boolean
startsWith()	        Checks whether a string starts with specified characters	                      boolean
getChars()	          Copies characters from a string to an array of chars	                          void
toCharArray()	        Converts this string to a new character array	                                  char[]
hashCode()	          Returns the hash code of a string	                                              int
intern()	            Returns the canonical representation for the string object	                    String
isEmpty()	            Checks whether a string is empty or not	                                        boolean
format()	            Returns formatted string using the specified locale,, and arguments	            String
matches()	            match String against a regular expression, and returns the matches	            boolean
split()	              Splits a string into an array of substrings	                                    String[]
replaceAll()	        Replaces each substring of this string that matches the                         String
replaceFirst()	      Replaces the first occurrence of a substring that matches 	                    String
copyValueOf()	        Returns a String that represents the characters of the character array	        String
getBytes()	          Encode String into a sequence of bytes using the named charset, storing the 
                      result into a new byte array	                                                  byte[]
regionMatches()	      Tests if two string regions are equal	                                          boolean
toString()	          Returns the value of a String object	                                          String
valueOf()	            Returns the string representation of the specified value	                      String


Interface and Class in String :-
##1)CharBuffer :-
- CharBuffer holds a sequence of integer values to be used in an I/O operation
- getmethod read single chars / putmethod write single chars
- Relative bulk put and get methods that transfer contiguous sequences of Chars from an int array or some other Chars buffer 
  into this buffer and from this buffer into an array.

Short buffers can be created by :-
- allocate(): This allocates space for the buffer’s content.
- wrap(): This wraps an existing long array into a buffer.

Syntax :- public abstract class CharBuffer extends Buffer implements Comparable<CharBuffer>, Appendable, CharSequence, Readable

Methods :-
append, array, arrayOffset, asReadOnlyBuffer, charAt, compact, compareTo, duplicate, equals, get, hasArray, put, isDirect,
length, order, read, slice, subSequence, toString, wrap  


##2)StringBuffer :-
- StringBuffer represents growable and writable character sequences
- java.lang.StringBuffer extends (or inherits from) Object class 
- All Implemented Interfaces of StringBuffer class :- Serializable, Appendable, CharSequence.
- safe for use by multiple threads
- This class synchronizes only on the string buffer performing the operation, not on the source
- It inherits some of the methods from Object class which are clone, equals, finalize, getClass, hashCode, notify, notifyAll

Constructor :-
1)StringBuffer() :- It reserves room for 16 characters without reallocation.
2)StringBuffer(int size) :- It accepts an integer argument that explicitly sets the size of the buffer.
3)StringBuffer(String str) :-  It accepts a String argument that sets the initial contents of the StringBuffer object 
                               and reserves room for 16 more characters without reallocation

Methods :-
capacity                int  
insert(index,String/ch) String
reverse                 String
delete(indexS,indexE)   String
deletCharAt(index no)   String
ensureCapacity(int capacity)  int   - Increase string capacity
appendCodePoint         int         - appends the string representation of the codePoint argument     
offsetByCodePoint(index,codepPointOffset) - returns the index within this sequence that is offset from the given index by
                                             codePointOffset code points.     
Some Method Alerdy discuss :-
length, append, charAt, codePointAt , codePointBefore , codePointCount, getChars, indexOf, lastIndexOf, setCharAt, 
setLength, subString, toString, trimtoSize


##3)String Builder :-
- Represents a mutable sequence of characters
- Use as a drop-in replacement for StringBuffer in places where the StringBuffer was being used by a single thread
- Faster in mostof implementations
- Instances of StringBuilder are not safe for use by multiple threads
- If such synchronization is required then it is recommended that StringBuffer be used.

Syntax :- public final class StringBuilder extends Object implements Serializable, CharSequence

Construtor :-
1)String Builder()            :- with no characters in it and an initial capacity of 16 characters
2)StringBuilder(int capacity) :- initial capacity specified by the capacity argument
3)StringBuilder(CharSequence seq) :- "  
4)StringBuilder(String str)   :- 

Methods :-
append            Join new charater in old string                                      String
appendCodePoint   appends the string representation of the codePoint argument          int
capacity          Returns the current capacity of the string                           int
Some Method Alerdy discuss :-
- charAt, codePointAt , codePointBefore , codePointCount , indexOf, lastIndexOf , length, replace, setCharAt, 
  setLength, subString, toString, toSize, insert


##4)StringTokenizer :- 
- used to break a string into tokens
- maintains a current position within the string to be tokenized
- A token is returned by taking a substring of the string that was used to create the StringTokenizer object

Construtor :-
1)StringTokenizer(String) :-
2)StringTokenizer(String str,String delim) :- delim is set of delimiters that are used to tokenize the given string
3)StringTokenizer(String str, String delim, boolean flag) :- if true considerd token, false serve to separate token


##5)StringJoiner :-
- StringJoiner is a class in java.util package which is used to construct a sequence of characters(strings) separated by a 
  delimiter and optionally starting with a supplied prefix and ending with a supplied suffix

Construtor :-
1)StringJoiner(CharSequence delimiter) 
2)StringJoiner(CharSequence delimiter,CharSequence prefix,CharSequence suffix) 
  prefix - the sequence of characters to be used at the beginning
  suffix - the sequence of characters to be used at the end
  Throws :-  NullPointerException - if prefix, delimiter, or suffix is null
*/

import java.nio.CharBuffer;
import java.util.*;

class A2String {
  public static void main(String[] args) {

    // CharBuffer Example
    // Declaring the capacity of the CharBuffer
    int capacity = 4;
  
    try {
      // creating object of CharBuffer and allocating size capacity
      CharBuffer charbuffer = CharBuffer.allocate(capacity);

      // append the value in CharBuffer using append() method
      charbuffer.append('a').append('b').append('c').append('d').rewind();

      // print the CharBuffer
      System.out.println("Original CharBuffer: " + Arrays.toString(charbuffer.array()));
    }

    catch (Exception e) {
      System.out.println("Exception throws : " + e);
    }

    // StringBuffer Example :-
    StringBuffer buffer = new StringBuffer();
    System.out.println(buffer.capacity());

    StringBuffer strBuffer = new StringBuffer("Bhavin Bhesaniya");
    System.out.println(strBuffer.capacity() + " " + strBuffer.length());

    // StringBuilder Example :
    try {

      StringBuilder sb = new StringBuilder(); // Default Constructor
      sb.append("Bhavin");
      System.out.println(sb.toString());

      StringBuilder sb2 = new StringBuilder("CharSequence Constructor"); // Able to pass int also instead of character
      System.out.println(sb2.toString());

      StringBuilder sb3 = new StringBuilder(sb.toString()); // String pass in construtor
      boolean checkStr = sb3.equals(sb);
      System.out.println(checkStr);

    } catch (Exception e) {
      System.out.println(e);
    }

    // StringTokenizer
    try {
      StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");
      // StringTokenizer st1 = new StringTokenizer("Hello : Geeks : How are you", "
      // :");
      // StringTokenizer st1 = new StringTokenizer("Hello : Geeks : How are you", " :"
      // , true);

      while (st1.hasMoreTokens())
        System.out.println(st1.nextToken()); // without loop print first hello token only
    } catch (Exception e) {
      System.out.println(e);
    }

    // StringJoiner
    ArrayList<String> al = new ArrayList<>();

    al.add("Ram");
    al.add("Shyam");
    al.add("Alice");
    al.add("Bob");

    StringJoiner sj1 = new StringJoiner(",");

    // setEmptyValue() method
    sj1.setEmptyValue("sj1 is empty");
    System.out.println(sj1);

    // add() method
    sj1.add(al.get(0)).add(al.get(1));
    System.out.println(sj1);

    // length() method
    System.out.println("Length of sj1 : " + sj1.length());

    StringJoiner sj2 = new StringJoiner(":");
    sj2.add(al.get(2)).add(al.get(3));

    // merge() method
    sj1.merge(sj2);

    // toString() method
    System.out.println(sj1.toString());

    System.out.println("Length of new sj1 : " + sj1.length());

  }
}