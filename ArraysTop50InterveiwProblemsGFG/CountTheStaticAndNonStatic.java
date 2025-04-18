package ArraysTop50InterveiwProblemsGFG;

public class CountTheStaticAndNonStatic {
    // Java program to demonstrate static variables

        private static int count = 0;
        private int nonStaticCount = 0;

        public void incrementCounter()
        {
            count++;
            nonStaticCount++;
        }
        public static int getStaticCount()
        {
            return count;
        }
        public int getNonStaticCount()
        {
            return nonStaticCount;
        }
        public static void main(String args[])
        {
            System.out.println("Creating non stating object creating here ");
            CountTheStaticAndNonStatic stVarObj1 = new CountTheStaticAndNonStatic();
            CountTheStaticAndNonStatic stVarObj2 = new CountTheStaticAndNonStatic();
            stVarObj1.incrementCounter();
            stVarObj2.incrementCounter();
            System.out.println("Static count for stVarObj1: " +
                    stVarObj1.getStaticCount());
            System.out.println("NonStatic count for stVarObj1: " +
                    stVarObj1.getNonStaticCount());
            System.out.println("Static count for stVarObj2: " +
                    stVarObj2.getStaticCount());
            System.out.println("NonStatic count for stVarObj2: " +
                    stVarObj2.getNonStaticCount());
        }
    }


