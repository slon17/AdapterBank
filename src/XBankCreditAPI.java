public class XBankCreditAPI {

    public boolean validateCustomer(float amount, String customer){
        if(amount > 50000)
            return false;
        return true;
    }
}
