package December2024;

public class CharacterIncrementABCD {

    public static void main (String[] args)
    {
        int i, j, n = 5;
        for (i = 1; i <= n; i++)
        {
            int ch = 65;
            for (j = 1; j <= i; j++)
            {
                System.out.print(((char)ch));
                ch++;
            }
            System.out.println();
        }
    }
}
