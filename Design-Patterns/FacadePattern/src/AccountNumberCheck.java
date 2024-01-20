public class AccountNumberCheck {
    private int accountNumber = 1234;

    public int getAccountNumber() {
        return accountNumber;
    }
    public boolean isActiveAccount(int accountNumber){
        if (accountNumber == getAccountNumber()){
            return true;
        }else {
            return false;
        }
    }
}
class SecurityCodeCheck{
    private int  securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }
    public boolean isActiveAccount(int securityCode){
        if (securityCode == getSecurityCode()){
            return true;
        }else {
            return true;
        }
    }
}
class WelcomeToBank{
    public WelcomeToBank() {
        System.out.println("Welcome to Bank Pekao");
        System.out.println("We are happy keep your money safe and secure");
    }
}