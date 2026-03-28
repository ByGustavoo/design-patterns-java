package br.com.software.factory.domain;

public class NotaProva extends Nota {

    public NotaProva(double pValue) {
        super(pValue);
    }

    @Override
    public String getType() {
        return "Prova";
    }
}