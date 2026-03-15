package restartEverythingDSAMarch2026;



    public class StringLength {

        public static void main(String[] args) {

            String str = "hello";

            int count = 0;

            for(char c : str.toCharArray()) {
                count++;
            }

            System.out.println("Length: " + count);
        }
    }

