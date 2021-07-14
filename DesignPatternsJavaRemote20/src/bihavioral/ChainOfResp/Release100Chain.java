package bihavioral.ChainOfResp;

public class Release100Chain implements ReleaseCurrencyChain{

    private ReleaseCurrencyChain chain; //next chain that get the responsibility

    @Override
    public void release(Currency currency) {
        if(currency.getValue() >= 100){
            int num = currency.getValue() / 100;
            int rest = currency.getValue() % 100;
            System.out.println("Eliberare " + num + " bancnote de 100 Lei");
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
