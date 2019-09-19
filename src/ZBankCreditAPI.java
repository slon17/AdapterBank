public class ZBankCreditAPI {
    public boolean sendCreditRequest(String customer, double amount){
        if(amount < 50000)
            return true;
        else
            throw new RuntimeException("El crédito no fue aprobado");
    }
}
