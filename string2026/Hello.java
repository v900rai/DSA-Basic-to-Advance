package string2026;

public class Hello {
    public static void main(String[] args) {
      /*  System.out.println("Hello vishal rai");

        StringBuilder sb = new StringBuilder("Vishal");
        sb.append(" Rai"); // same object modify hota hai

*/




                StringBuilder sb = new StringBuilder("Vishal");

                sb.append(" Rai");        // Vishal Rai
                sb.insert(0, "Mr. ");     // Mr. Vishal Rai
                sb.delete(0, 4);          // Vishal Rai
                sb.reverse();             // iaR lahsiv

                System.out.println(sb);

                String result = sb.toString(); // convert to String
            }
        }


