package Interview2025DSA;

import java.util.Hashtable;

public class HashtableInJava {
    // Java program to demonstrate working of HashTable

        public static void main(String args[])
        {

            // Create a HashTable to store
            // String values corresponding to integer keys
            Hashtable<Integer, String>hm = new Hashtable<Integer, String>();



            // Input the values
            hm.put(1, "Geeks");
            hm.put(12, "forGeeks");
            hm.put(15, "A computer");
            hm.put(3, "Portal india");

            // Printing the Hashtable
            System.out.println(hm);
        }
    }


