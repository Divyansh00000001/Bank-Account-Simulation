
import java.util.ArrayList;

public class Account {

    private final String Account_Holder_Name;
    private double balance;
    private final ArrayList<String> transactionHistory = new ArrayList<>();

    public Account(String name){
        this.Account_Holder_Name = name;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if(amount > balance){
            balance = balance + amount;
            transactionHistory.add("Deposited : " +balance);
            System.out.println("Deposition successful!");
        }else{
            System.out.println("Deposition unsuccessful");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            transactionHistory.add("Withdrawn : " + balance);
            System.out.println("Money withdrawn");
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance(){
        System.out.println("Account holder : " +Account_Holder_Name);
        System.out.println("Current Balance is : " +balance);
    }

    public void TransactionHistory(){
        System.out.println("Transaction history is : ");
        for(String txn : transactionHistory) {
            System.out.println(" -" +txn);
        }
    }

}
