import java.util.Locale;
import java.util.Scanner;

import entities.Hostel;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hostel[] hostel = new Hostel[10];

        System.out.print("How many rooms will be rented? ");
        int roomsToBeRented = sc.nextInt();

        for (int i = 0; i < roomsToBeRented; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            int roomArrayLocaion = room - 1;
            System.out.println();

            if (hostel[roomArrayLocaion] == null) {
                hostel[roomArrayLocaion] = new Hostel(name, email, room);
            } else {
                System.out.print("Room already rented.");
            }
        }

        System.out.println("Busy rooms:");

        for (int i = 0; i < hostel.length; i++) {
            if (hostel[i] != null) {
                int roomToBeDisplayed = i + 1;
                String name = hostel[i].getName();
                String email = hostel[i].getEmail();
                System.out.println(roomToBeDisplayed + ": " + name + ", " + email);
            }
        }

        sc.close();
    }
}
