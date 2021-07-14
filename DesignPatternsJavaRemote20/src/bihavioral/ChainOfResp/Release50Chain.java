package bihavioral.ChainOfResp;

public class Release50Chain implements ReleaseCurrencyChain{

    private ReleaseCurrencyChain chain;

    @Override
    public void release(Currency currency) {
        if(currency.getValue() >= 50){
            int num = currency.getValue() / 50;
            int rest = currency.getValue() % 50;
            System.out.println("Eliberare " + num + " bancnote de 50 Lei");
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

