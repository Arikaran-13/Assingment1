package Class_And_Objects;

public class Question3 {
public static void main(String[]args){
    Account user = new Account(12000,"Arikaran S","12345fde");
    user.withdraw();
    user.deposit(10000);
    user.withdraw();
    System.out.println(user);
}
}

class Account {
    private double balance;
    private String accHolder;
    private String accNum;

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accHolder='" + accHolder + '\'' +
                ", accNum='" + accNum + '\'' +
                '}';
    }

    Account(double d, String name, String accnum) {
        this.balance = d;
        this.accHolder = name;
        this.accNum = accnum;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
        System.out.println("Deposited...");
    }

    public void withdraw() {
        System.out.println("Your balance is :" + balance);

    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

}