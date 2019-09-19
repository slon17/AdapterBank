public class YBankCreditAPI {
    public char getApproval(String customer, double amount){
        if(amount<50000)
            return 'Y';
        return 'N';
    }
}
