public class XBankAdapter implements IBankAdapter{


    @Override
    public BankResponse sendCreditRequest(BankRequest request) {
        XBankCreditAPI api = new XBankCreditAPI();
        boolean xresponse = api.validateCustomer((float) request.getAmount(), request.getCustomer());
        System.out.println("La solicitud del banco X ha sido "+xresponse);
        return new BankResponse(xresponse);
    }
}
