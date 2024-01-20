public class BankAccountFacade {
    private int acctNumber;
    private int securityCode;

    private AccountNumberCheck numberChecker;
    private SecurityCodeCheck securityChecker;
    private FundsCheck fundsChecker;
    private WelcomeToBank welcomeToBank;

    public BankAccountFacade(int acctNumber, int securityCode) {
        this.acctNumber = acctNumber;
        this.securityCode = securityCode;
        numberChecker = new AccountNumberCheck();
        securityChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
        welcomeToBank = new WelcomeToBank();
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public AccountNumberCheck getNumberChecker() {
        return numberChecker;
    }

    public SecurityCodeCheck getSecurityChecker() {
        return securityChecker;
    }

    public FundsCheck getFundsChecker() {
        return fundsChecker;
    }

    public WelcomeToBank getWelcomeToBank() {
        return welcomeToBank;
    }
    public void withdrawCash(double amt){
        if (numberChecker.isActiveAccount(acctNumber) && securityChecker.isActiveAccount(securityCode)&&
                fundsChecker.haveEnoughMoney(amt)){
            System.out.println("Transaction Completed\n");
        }else {
            System.out.println("Transaction Failed\n");
        }
    }
    public void depositCash(double amt){
        if (numberChecker.isActiveAccount(acctNumber) && securityChecker.isActiveAccount(securityCode)&&
                fundsChecker.haveEnoughMoney(amt)){
            System.out.println("Transaction Completed\n");
        }else {
            System.out.println("Transaction Failed\n");
        }
    }
}