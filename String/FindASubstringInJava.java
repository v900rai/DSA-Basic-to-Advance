package String;
import java.io.*;

public class FindASubstringInJava {
    // Java Program to illustrate to Find a Substring
// in the String

// Importing required classes


    // Main class


        // Main driver method
        public static void main(String[] args)
        {

            // A string in which a substring
            // is to be searched
            String str
                    = "GeeksforGeeks is a computer science portal";

            // Returns index of first occurrence of substring
            int firstIndex = str.indexOf("Geeks");

            System.out.println("First occurrence of char Geeks"
                    + " is found at : "
                    + firstIndex);

            // Returns index of last occurrence
            int lastIndex = str.lastIndexOf("Geeks");
            System.out.println(
                    "Last occurrence of char Geeks is"
                            + " found at : " + lastIndex);

            // Index of the first occurrence
            // after the specified index if found
            int first_in = str.indexOf("Geeks", 10);
            System.out.println("First occurrence of char Geeks"
                    + " after index 10 : "
                    + first_in);

            int last_in = str.lastIndexOf("Geeks", 20);
            System.out.println("Last occurrence of char Geeks "
                    + "after index 20 is : "
                    + last_in);
        }
    }


