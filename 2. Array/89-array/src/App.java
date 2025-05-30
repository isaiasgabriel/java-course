import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        double[] vect = new double[arraySize];
        double sum = 0;

        for (int i = 0; i < arraySize; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double averageHeight = sum / arraySize;
        System.out.println("AVERAGE HEIGHT = " + String.format("%.2f", averageHeight));

        sc.close();
    }
}
