import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Product product = new Product();
        System.out.print("Enter product data: ");
        System.out.print("Name: ");
        product.name = scan.nextLine();
        System.out.print("Price: ");
        product.price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scan.nextInt();

        // By implementing the toString method inside the class, we can display the product data
        // directly without having to manually format the output.
        System.out.println("Product data:" + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantityToAdd = scan.nextInt();
        product.addProducts(quantityToAdd);
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed in stock: ");
        int quantityToRemove = scan.nextInt();
        product.removeProducts(quantityToRemove);
        System.out.println("Updated data: " + product);

        scan.close();
    }
}
