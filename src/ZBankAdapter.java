public class ZBankAdapter implements IBankAdapter {
    @Override
    synchronized public BankResponse sendCreditRequest(BankRequest request) {
        ZBankCreditAPI api = new ZBankCreditAPI();
        boolean zresponse;
        try{
            zresponse = api.sendCreditRequest(request.getCustomer(), request.getAmount());
        }
        catch (RuntimeException e){
            zresponse = false;
        }
        System.out.println("La solicitud del banco Z ha sido "+zresponse);
        return new BankResponse(zresponse);
    }
}
