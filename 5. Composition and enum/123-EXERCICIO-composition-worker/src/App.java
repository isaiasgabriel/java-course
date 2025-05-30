import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String deparment = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String workerLevelString = sc.nextLine();
        System.out.print("Base salary:");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, new Department(deparment), WorkerLevel.valueOf(workerLevelString), baseSalary);

        System.out.print("How many contracts to this worker? ");
        int contractsNumber = sc.nextInt();
        for (int i = 0; i < contractsNumber; i++) {
            sc.nextLine(); // cleaning the line of the nextInt
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.nextLine());
            System.out.print("Value per hour: ");
            double valuePerH = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerH, duration);
            worker.addContract(contract);
        }

        sc.nextLine(); // cleaning the line of the nextInt
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateMY = sc.nextLine();
        String[] dateArray = dateMY.split("/");
        int month = Integer.parseInt(dateArray[0]);
        int year = Integer.parseInt(dateArray[1]);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + dateMY + ": " + worker.income(month, year));

        sc.close();
    }
}
