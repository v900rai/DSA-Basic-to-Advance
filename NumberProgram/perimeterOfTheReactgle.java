package NumberProgram;

public class perimeterOfTheReactgle {
    public static void   perimeterofreactangle(int length , int breadth){
        int perimeter = 2 * (length + breadth);

        System.out.println("The perimeter of the given rectangle of length "
                + length + " and breadth " + breadth + " = "
                + perimeter);

    }
    public static void main(String[] args)
    {
        // Initialize a variable length that stores length of
        // the given rectangle
        int length = 10;

        // Initialize a variable breadth that stores breadth
        // of the given rectangle
        int breadth = 20;

        // Call the perimeter method on these length and
        // breadth
        perimeterofreactangle(length, breadth);
}
    }
