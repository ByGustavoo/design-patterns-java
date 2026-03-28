package br.com.software.factory.domain;

public class NotaTrabalho extends Nota {

    public NotaTrabalho(double pValue) {
        super(pValue);
    }

    @Override
    public String getType() {
        return "Trabalho";
    }
}