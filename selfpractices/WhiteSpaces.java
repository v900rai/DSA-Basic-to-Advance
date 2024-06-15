package selfpractices;

public class WhiteSpaces {

    static int ind;

    static void removal(String s)
    {
        for(ind = 0; ind < s.length(); ind++)
        {
            char ch = s.charAt(ind);
            if(ch != ' ')
                System.out.print(ch);
        }
    }

    public static void main (String args[])
    {
        Object SqueezeString = null;
        SqueezeString("   coding ninjas    ");
    }

    private static void SqueezeString(String s) {
    }
}
