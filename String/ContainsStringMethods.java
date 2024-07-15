package String;
import java.io.*;
import java.lang.*;

public class ContainsStringMethods {
    // Java Program to Illustrate How to Find a Substring
// in the String using contains() Method

// Importing required classes

    // Class


        // Main driver method
        public static void main(String[] args)
        {
            // String in which substring
            // to be searched
            String test = "software";

            CharSequence seq = "soft";
            boolean bool = test.contains(seq);
            System.out.println("Found soft?: " + bool);

            // Returns true substring if found.
            boolean seqFound = test.contains("war");
            System.out.println("Found war? " + seqFound);

            // Returns true substring if found
            // otherwise return false
            boolean sqFound = test.contains("wr");
            System.out.println("Found wr?: " + sqFound);
        }
    }


