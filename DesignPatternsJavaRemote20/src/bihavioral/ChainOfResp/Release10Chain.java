package bihavioral.ChainOfResp;

public class Release10Chain implements ReleaseCurrencyChain{

    private ReleaseCurrencyChain chain;

    @Override
    public void release(Currency currency) {
        if(currency.getValue() >= 10){
            int num = currency.getValue() / 10;
            int rest = currency.getValue() % 10;
            System.out.println("Eliberare " + num + " bancnote de 10 Lei");
            if(rest > 0 )
                chain.release(new Currency(rest));
        }else {
            chain.release(currency);
        }
    }

    @Override
    public void setNextChain(ReleaseCurrencyChain nextChain) {
        this.chain = nextChain;
    }
}
