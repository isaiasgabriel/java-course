import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class App {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String path = "/home/user/java-workplace/curso/10.Generics/1.generics-example/2.generics-list/input.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				list.add(new Product(name, price));
				line = br.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}