package br.com.software.chain;

public abstract class BaseRule {

    protected BaseRule nextRule;

    public void setNextHandler(BaseRule nextRule) {
        this.nextRule = nextRule;
    }

    public abstract void check(double grade);

}