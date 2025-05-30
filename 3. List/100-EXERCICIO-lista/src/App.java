import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idToIncrease = sc.nextInt();

        // Emp será uma referência à nossa lista
        Employee emp = employees.stream()
                .filter(x -> x.getId() == idToIncrease)
                .findFirst()
                .orElse(null);

        if (emp == null) {
            System.out.println("User not found");
            System.out.println();
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalaryByPercentage(percentage);
        }

        System.out.println("List of employees:");
        for (Employee item : employees) {
            System.out.println(item.getId() + ", " + item.getName() + ", " + item.getSalary());
        }

        sc.close();
    }
}
