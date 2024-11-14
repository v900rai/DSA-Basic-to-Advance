package November2024;// Java program to print Pyramid pattern
import java.io.*;

class pyramidPattern
{
    public static void pattern(int n)
    {
        // For printing the upper
        // part of the pyramid
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < i+1; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // For printing the lower
        // part of pyramid
        for (int i = n; i > 0; i--)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Driver program
    public static void main(String args[])
    {
        pattern(6);
    }
}

// This code is contributed by NIkita Tiwari.
