public class BankGenerator implements IFactoryBank{
    public static final int BANK_X = 1;
    public static final int BANK_Y = 2;
    public static final int BANK_Z = 3;

    private IBankAdapter bank;

    public BankGenerator(int bank) {
        this.bank = generateBank(bank);
    }

    public IBankAdapter getBank() {
        return bank;
    }

    public void setBank(IBankAdapter bank) {
        this.bank = bank;
    }

    @Override
    public IBankAdapter generateBank(int bank) {
        switch (bank){
            case BANK_X:
                return new XBankAdapter();
            case BANK_Y:
                return new YBankAdapter();
            case BANK_Z:
                return new ZBankAdapter();
        }
        return null;
    }
}
