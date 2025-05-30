import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();

        // Static methods can be called using the class name
        // without the need to create an instance of the class.
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);
        sc.close();
    }
}
