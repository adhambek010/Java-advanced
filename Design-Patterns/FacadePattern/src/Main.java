public class Main {
    public static void main(String[] args) {
        BankAccountFacade assignBank = new BankAccountFacade(1234,1234);
        assignBank.withdrawCash(50.00);
        assignBank.withdrawCash(900.00);
        assignBank.depositCash(200.00);
    }
}
