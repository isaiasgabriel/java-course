import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finishDate = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(startDate, finishDate, carModel);

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("INVOICE:");
        System.out.print("Basic payment: " + carRental.getInvoice().getBasicPayment() + "\n");
        System.out.print("Tax: " + carRental.getInvoice().getTax() + "\n");
        System.out.print("Total payment: " + carRental.getInvoice().getTotalPayment() + "\n");

        sc.close();
    }
}
