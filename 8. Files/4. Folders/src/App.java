import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("\nFolders:");
        // List all folders in the specified path
        for (File folder : folders) {
            // System.out.println(folder);
            System.out.println(folder.getName());
        }

        System.out.println("\nFiles:");
        // List all files in the specified path
        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file.getName());
        }

        // Create a new directory called "subdir" in the specified path
        boolean success = new File(strPath + "/new_folder").mkdir();
        System.out.println("\nDirectory created successfully: " + success);

        sc.close();

    }
}
