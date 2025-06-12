import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String[] lines = new String[] { "Good morning", "Good evening", "Good night" };
        String path = "/home/user/java-workplace/curso/8. Files/3. FileWriter & BufferedWriter/out.txt";
        // new FileWriter(path, true); -> append = true 
        // add new lines without replacing everything
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
