public class YBankAdapter implements IBankAdapter {
    @Override
    public BankResponse sendCreditRequest(BankRequest request) {
        YBankCreditAPI api = new YBankCreditAPI();
        char yresponse = api.getApproval(request.getCustomer(), request.getAmount());
        BankResponse response = new BankResponse();

        if(yresponse == 'Y')
            response.setResponse(true);
        else if (yresponse == 'N')
            response.setResponse(false);
        System.out.println("La solicitud del banco Y ha sido "+yresponse);
        return response;
    }
}
