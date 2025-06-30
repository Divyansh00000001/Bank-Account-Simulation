
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name : ");
        String name = sc.nextLine();

        Account acc = new Account(name);
        int choice;

        do{
            System.out.println("----Banking System----");
            System.out.println("1.Add money");
            System.out.println("2.Withdraw money");
            System.out.println("3.Check Balance");
            System.out.println("4.Check Transaction history");
            System.out.println("5.Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1 -> {
                    System.out.print("Enter amount to deposit : ");
                    double amt = sc.nextDouble();
                    acc.deposit(amt);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw : ");
                    double amt = sc.nextDouble();
                    acc.withdraw(amt);
                }
                case 3 -> acc.checkBalance();
                case 4 -> acc.TransactionHistory();
                case 5 -> System.out.println("Thanks for banking!");
                default -> System.out.println("Invalid operation");
            }
        }while(choice != 5);
    }
}