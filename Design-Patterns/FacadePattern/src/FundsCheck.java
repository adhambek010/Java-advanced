public class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }
    public void decreaseCashFromAccount(double amt){
        cashInAccount -= amt;
    }
    public void increaseCashInAccount(double amt){
        cashInAccount += amt;
    }
    public boolean haveEnoughMoney(double amt){
        if (amt > getCashInAccount()){
            System.out.println("Error : Insufficient funds");
            System.out.println("Your Current Balance : "+getCashInAccount());
            return false;
        }else {
            decreaseCashFromAccount(amt);
            System.out.println("Withdrawal has complete\nCurrent Balance is : "+getCashInAccount());
            return true;
        }
    }
    public void makeDeposit(double amt){
        increaseCashInAccount(amt);
        System.out.println("Deposit has complete\nCurrent Balance is :  "+getCashInAccount());
    }
}
