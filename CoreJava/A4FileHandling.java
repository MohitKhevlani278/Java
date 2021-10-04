/*
FileHandling :-
- java.io.file package use
Syntax :-  File a = new File(filename/pathforfile);

Constructors :-
1)File(File parent, String child) : Creates a new File instance from a parent abstract pathname and a child pathname string.
2)File(String pathname)           : Creates a new File instance by converting the given pathname string into an abstract pathname.
3)File(String parent, String child) : Creates a new File instance from a parent pathname string and a child pathname string.
4)File(URI uri)                   : Creates a new File instance by converting the given file: URI into an abstract pathname

Methods



boolean canExecute()                        : Tests whether the application can execute the file denoted by this abstract pathname.
boolean canRead()                           : Tests whether the application can read the file denoted by this abstract pathname.
boolean canWrite()                          : Tests whether the application can modify the file denoted by this abstract pathname.
int compareTo(File pathname)                : Compares two abstract pathnames lexicographically.
boolean createNewFile()                     : Atomically creates a new, empty file named by this abstract pathname .
static File createTempFile(String prefix, String suffix) : Creates an empty file in the default temporary-file directory.
boolean delete()                            : Deletes the file or directory denoted by this abstract pathname.
boolean equals(Object obj)                  : Tests this abstract pathname for equality with the given object.
boolean exists()                            : Tests whether the file or directory denoted by this abstract pathname exists.
String getAbsolutePath()                    : Returns the absolute pathname string of this abstract pathname.
long getFreeSpace()                         : Returns the number of unallocated bytes in the partition .
String getName()                            : Returns the name of the file or directory denoted by this abstract pathname.
String getParent()                          : Returns the pathname string of this abstract pathname’s parent.
File getParentFile()                        : Returns the abstract pathname of this abstract pathname’s parent.
String getPath()                            : Converts this abstract pathname into a pathname string.
boolean isDirectory()                       : Tests whether the file denoted by this pathname is a directory.
boolean isFile()                            : Tests whether the file denoted by this abstract pathname is a normal file.
boolean isHidden()                          : Tests whether the file named by this abstract pathname is a hidden file.
long length()                               : Returns the length of the file denoted by this abstract pathname.
String[] list()                             : Returns an array of strings naming the files and directories in the directory .
File[] listFiles()                          : Returns an array of abstract pathnames denoting the files in the directory.
boolean mkdir()                             : Creates the directory named by this abstract pathname.
boolean renameTo(File dest)                 : Renames the file denoted by this abstract pathname.
boolean setExecutable(boolean executable)   : A convenience method to set the owner’s execute permission.
boolean setReadable(boolean readable)       : A convenience method to set the owner’s read permission.
boolean setReadable(boolean readable, boolean ownerOnly) : Sets the owner’s or everybody’s read permission.
boolean setReadOnly()                       : Marks the file or directory named so that only read operations are allowed.
boolean setWritable(boolean writable)       : A convenience method to set the owner’s write permission.
String toString()                           : Returns the pathname string of this abstract pathname.
URI toURI()                                 : Constructs a file URI that represents this abstract pathname.


                    
*/

import java.io.File; //import file class 
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileWriter; // write in the file
import java.io.FileNotFoundException; //handle error if file not found
import java.util.Scanner; //read text files

public class A4FileHandling {
    public static void main(String[] args) {

        // createfile
        try {
            // File firstObj = new File("firstfile.txt"); //create file
            File firstObj = new File("D:\\firstfile.txt"); // specific directory file created
            if (firstObj.createNewFile()) { // createnewfile method have boolean if created true otherwise false
                System.out.println("File created: " + firstObj.getName());// getname method use to print filename
            } else {
                System.out.println("Files already exists");
            }
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }

        // writing in file
        try {
            FileWriter writeinfile = new FileWriter("firstfile.txt");
            writeinfile.write("I started first time writing");
            writeinfile.close();
            System.out.println("Successfully write");
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }

        // reading file
        try {
            File readfile = new File("firstfile.txt");
            Scanner myread = new Scanner(readfile);
            while (myread.hasNextLine()) {
                String data = myread.nextLine();
                System.out.println(data);
            }
            myread.close();
        } catch (FileNotFoundException e) {
            System.out.println("filenot found");
            e.printStackTrace();
        }

        // get file info
        File firstObj = new File("firstfile.txt");
        if (firstObj.exists()) {
            System.out.println("File Name : " + firstObj.getName());
            System.out.println("File Path : " + firstObj.getAbsolutePath());
            System.out.println("Writeable : " + firstObj.canWrite());
            System.out.println("Readable  : " + firstObj.canRead());
            System.out.println("File size in bytes : " + firstObj.length());
        } else {
            System.out.println("file not found");
        }

        // list of file in directory
        try {
            File listFile = new File("D:\\");
            String[] paths = listFile.list();
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // create directory
        File dir = new File("D:\\FirstDir");
        if (dir.mkdir()) {
            System.out.println("directory is created");
        } else {
            System.out.println("Cannot be created");
        }

        // delete file or delete directory
        File delObj = new File("D:\\FirstDir"); // firstfile.txt
        if (delObj.delete()) {
            System.out.println("delete the file: " + delObj.getName());
        } else {
            System.out.println("failed to delete");
        }

        // Copy file
        try {

            //Byte Stream
            // FileInputStream in = new FileInputStream("./firstfile.txt");
            // FileOutputStream out = new FileOutputStream("./secondfile.txt");

            //Character Stream
            FileReader in = new FileReader("./firstfile.txt");
            FileWriter out = new FileWriter("output.txt");


            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("Done to Copy File");
            in.close();
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
