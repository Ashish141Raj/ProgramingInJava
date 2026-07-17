/*Create a BankAccount class with:
* -Account number
* -account Holder Name
* -balance
*
* methods:
* deposit(double Amount)
* withdraw(double Amount)
* displayBalance()
*
* overload deposit():
*  -deposit(int amount)
*  -deposit(double amount)

* Create two account objects and perform different transections.
 */

package Oops.Clss_OBjects;

public class MiniProject {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101,"Navya Verma",1300000);
        BankAccount acc2 = new BankAccount(102,"Ashish Raj",1345000);

        System.out.println("Account of "+acc1.accHolName);
        acc1.deposit(900000);
        acc1.display();
        acc1.withdraw(1);
        acc1.display();

        System.out.println();
        System.out.println("Account of "+acc2.accHolName);
        acc2.deposit(950000.78);
        acc2.display();
    }
}
class BankAccount{
    double accNum;
    String accHolName;
    double balance;

    public BankAccount(double accNum,String accHolName,double balance){
        this.accNum = accNum;
        this.accHolName = accHolName;
        this.balance = balance;
    }
//    Deposit method
    void deposit(int amount){
        balance += amount;
        System.out.println(amount+ " (int) Deposit");
    }
    void deposit(double amount){
        balance += amount;
        System.out.println(amount + " is Deposited");
    }

//    Withdraw method
    void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println(amount+" withdraw Amount"+ balance +" Remaining Balance");
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    void display(){
        System.out.println("Holder Name: "+accHolName);
        System.out.println("Account Number: "+accNum);
        System.out.println("Balance: "+balance);
    }

}
