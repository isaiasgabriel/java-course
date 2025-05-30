import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();

        Product[] vect = new Product[arraySize];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // Consome a linha deixada pelo nextInt e prepara para o próximo nextLine
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        System.out.println("PRODUCTS LIST:");
        for (int i = 0; i < vect.length; i++) {
            String name = vect[i].getName();
            double price = vect[i].getPrice();
            System.out.println(name + ", " + String.format("%.2f", price));
        }

        sc.close();
    }
}
