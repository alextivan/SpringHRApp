package bihavioral.ChainOfResp;

public interface ReleaseCurrencyChain {

    void release(Currency currency);

    void setNextChain(ReleaseCurrencyChain nextChain);

}
