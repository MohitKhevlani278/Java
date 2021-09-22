/*
Stream :-

- A Stream is a method to sequentially access  file(A sequence of data )
- java.io package use for character stream unicode and binary stream non-unicode text
Type :-
  1)InPutStream  − The InputStream is used to read data from a source.
  2)OutPutStream − The OutputStream is used for writing data to a destination.

Character Stream :-
- Character are stored using unicode characters
- Character stream allows to read/write data characters by character automatically
- Perform input and output for 16-bit unicode
- Ex :- FileReader and FileWriter 

Byte Stream :-
- Process data bytes by byte sequence(8bit)
- Ex :- FileInputStream and FileOutputStream

When to use Character Stream over Byte Stream? 
- In Java, characters are stored using Unicode conventions. 
- Character stream is useful when we want to process text files. 
- These text files can be processed character by character typically 16 bits.

When to use Byte Stream over  Character Stream? 
- Byte oriented reads byte by byte.  A byte stream is suitable for processing raw data like binary files.
 

Standard Stream :-
1)Standard Input :- System.in
2)Standard Output :- System.out
3)Standard Error :- System.err

hierachy Of Stream :-
                          Object
                    InputStream         OutputStream 
                    File                - Same in outputStream
                    ByteArrayInput
                    FilterInputStream
                      -BufferedInput
                      -DataInputStream  
                    ObjectInputStream


*/
import java.io.*;

public class A5IOStream {
    
    public static void main(String[] args) throws IOException {
    
    
        //Character Stream Read 
        // We can read a file in a human readable format using FileReader Accessing FileReader, FileWriter, IOException
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("./rem.txt");
            // Reading sourcefile and writing content to target file character by character.
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.print((char) temp);
        }
        
        finally {
            if (sourceStream != null)
                sourceStream.close();   // Closing stream as no longer in use
        }
        


        /*Byte Stream
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try 
        {
            sourceStream = new FileInputStream("./rem.txt");
            targetStream = new FileOutputStream ("TestingStream.txt");
              // Reading source file and writing content to target file byte by byte
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);            
        }
        finally 
        {
            if (sourceStream != null)
                sourceStream.close();            
            if (targetStream != null)            
                targetStream.close();            
        }
        */
    }
}
