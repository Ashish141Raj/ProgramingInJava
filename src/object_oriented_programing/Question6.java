package object_oriented_programing;
/*6. Bank Account (Constructor Overloading)
Create a BankAccount class.

Constructors:
- Default balance = ₹0
- Constructor with initial balance
- Constructor with account holder name and initial balance

Methods:
- deposit()
- withdraw()
- displayBalance()
*/
public class Question6 {
    public static void main(String[] args) {
    BankAccount obj = new BankAccount();
    BankAccount obj2 = new BankAccount(500000d);
    BankAccount obj3 = new BankAccount("Ashish Raj",1000009d);
    obj3.withdraw(1);
    obj3.deposit(10);
    obj3.displayBalance();
    }
}
class BankAccount{
    String accountHolderName;
    double balance;

    BankAccount(){
        balance = 0.0;
    }
    BankAccount(Double balance){
        this.balance=balance;
    }
    BankAccount(String accountHolderName,double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance = balance-amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance(){
        System.out.println("Account Holder name: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}
