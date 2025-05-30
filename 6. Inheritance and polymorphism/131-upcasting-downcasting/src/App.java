import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Account acc = new Account(
                1001,
                "Jon Jones",
                0.0);

        BusinessAccount bacc = new BusinessAccount(
                1002,
                "Daniel Cormier",
                0.0,
                1000);

        // UPCASTING - quando você atribui um objeto da superclasse um objeto da subclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(10, "Craig Jones", 1000.0, 10000.0);
        Account acc3 = new SavingsAccount(10, "Craig Jones", 1000.0, 10000.0);

        // DOWNCASTING - quando você atribui a um objeto da subclasse um objeto da superclasse

        BusinessAccount acc4 = (BusinessAccount) acc2;
        // acc2: account que recebeu um business account acabou virando um business account.
        // apesar disso, acc2 não tem a opção loan poque ela foi declarada como Account, para isso
        // fizemos o downcasting em acc4:
        acc4.loan(100);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
        }
        // Essa operação vai dar erro porque acc3 é uma savings account
        // Business account e savings account não possuem uma relação de herança
        // por isso vai dar erro

    }
}
