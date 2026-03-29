package br.com.software.decorator.notas;

import br.com.software.decorator.Nota;

public class NotaBasica implements Nota {

    private Double value;

    public NotaBasica(Double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getDescription() {
        return "Nota Básica";
    }
}