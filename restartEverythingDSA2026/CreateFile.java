package restartEverythingDSA2026;


    import java.io.File;
import java.io.IOException;

    public class CreateFile {
        public static void main(String[] args) {
            try {
                File file = new File("test.txt");

                if (file.createNewFile()) {
                    System.out.println("File created");
                } else {
                    System.out.println("File already exists");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


