package br.com.software.decorator.notas;

import br.com.software.decorator.Nota;

public class NotaComPesoDecorator extends NotaDecorator {

    private double peso;

    public NotaComPesoDecorator(Nota nota, double peso) {
        super(nota);
        this.peso = peso;
    }

    @Override
    public double getValue() {
        return nota.getValue() * peso;
    }

    @Override
    public String getDescription() {
        return nota.getDescription() + " com peso";
    }
}