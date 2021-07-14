package bihavioral.ChainOfResp;

public class ATM {

    private ReleaseCurrencyChain chainFor100;

    public ATM() {
        this.chainFor100 = new Release100Chain();

        ReleaseCurrencyChain chainFor50 = new Release50Chain();
        ReleaseCurrencyChain chainFor10 = new Release10Chain();

        chainFor50.setNextChain(chainFor10);
        chainFor100.setNextChain(chainFor50);



    }
    public void releaseMoney(int requestedValue){
        Currency currency = new Currency(requestedValue);
        chainFor100.release(currency);

    }

}
