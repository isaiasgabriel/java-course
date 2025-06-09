import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            // There could be a null pointer exception if sc is not initialized and we try to close it
            // So we check if sc is not null before calling close
            if (sc != null) {
                sc.close();
            }
        }

    }
}
