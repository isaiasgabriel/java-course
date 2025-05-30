import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vão ser registradas? ");
        int arraySize = sc.nextInt();

        Person[] vect = new Person[arraySize];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // Consome a linha deixada pelo nextInt e prepara para o próximo nextLine
            System.out.println();
            System.out.printf("Dados da %dª pessoa:%n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new Person(name, age, height);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println("Pessoas cadastradas:");
        System.out.println("---------------------");

        double sumHeight = 0.0;
        String[] ageBelowSixteenArray = new String[arraySize];
        int countUnderSixteen = 0;

        for (int i = 0; i < vect.length; i++) {
            // Impressão de dados:
            System.out.println();
            String name = vect[i].getName();
            int age = vect[i].getAge();
            double height = vect[i].getHeight();
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.printf("Nome: %s%nIdade: %d%nAltura: %.2f%n", name, age, height);

            // Obtenção de dados (Soma das pessoas com menos de 16 anos e guardando em um
            // array auxiliar):
            sumHeight += height;
            if (age < 16) {
                ageBelowSixteenArray[countUnderSixteen] = name;
                countUnderSixteen++;
            }
        }

        double averageHeight = sumHeight / vect.length;
        double underSixteenAverage = (double) (countUnderSixteen * 100) / vect.length;
        System.out.println("Altura média: " + String.format("%.2f", averageHeight));
        if (countUnderSixteen > 0) {
            System.out.println("Pessoas com menos de 16 anos: " + underSixteenAverage + "%");
            for (int i = 0; i < countUnderSixteen; i++) {
                System.out.println(ageBelowSixteenArray[i]);
            }
        }

        sc.close();
    }
}
