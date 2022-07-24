package inheritance;

public class Question2 {
    public static void main(String[] args) {
        SavingsAcc user1 = new SavingsAcc(25000,100);
        CurrentAcc user2 = new CurrentAcc(30000);
        SavingsAcc user3 = new SavingsAcc(10000,4);
        System.out.println("Bank balance is: ");
        System.out.println(Bank.balance());



    }
}


 class Bank {
    private int bal;
    private int rate;
    protected static int balance=0;


        public  void setBal(int b){
            this.bal=b;
            balance+=b;
        }
        public  int getBal(){
            return bal;
        }
        public   long totalbalance(){
            bal=bal*rate;
            return bal;
        }
        public static int balance(){
            return balance;
        }

}
class SavingsAcc extends Bank{
private int bal;
private int interest;
SavingsAcc(int b,int i){this.bal=b; this.interest=i; balance+=b*i;}



    @Override
    public int getBal() {
        return bal;
    }


}
class CurrentAcc extends Bank{

    private int bal;
    CurrentAcc(int bal){
        this.bal=bal;
        balance+=bal;

    }



    @Override
    public int getBal() {
        return bal;
    }

    @Override
    public long totalbalance() {
        return bal;
    }

}