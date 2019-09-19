public class TestBank {
    public static void main (String [ ] args) {

        IFactoryBank bank = new BankGenerator(BankGenerator.BANK_Z);
        BankRequest request = new BankRequest("Gerson", 20000);
        ((BankGenerator) bank).getBank().sendCreditRequest(request);

        IFactoryBank bank2 = new BankGenerator(BankGenerator.BANK_Y);
        BankRequest request2 = new BankRequest("Gerson", 20000);
        ((BankGenerator) bank2).getBank().sendCreditRequest(request2);

        IFactoryBank bank3 = new BankGenerator(BankGenerator.BANK_X);
        BankRequest request3 = new BankRequest("Gerson", 20000);
        ((BankGenerator) bank3).getBank().sendCreditRequest(request3);
    }
}
