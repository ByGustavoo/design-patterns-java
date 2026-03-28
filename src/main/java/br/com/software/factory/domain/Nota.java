package br.com.software.factory.domain;

public abstract class Nota {

    protected double value;

    public Nota(double pValue) {
        this.value = pValue;
    }

    public double getValue() {
        return value;
    }

    public abstract String getType();

}