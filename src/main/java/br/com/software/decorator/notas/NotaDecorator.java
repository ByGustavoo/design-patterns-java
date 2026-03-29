package br.com.software.decorator.notas;

import br.com.software.decorator.Nota;

public abstract class NotaDecorator implements Nota {

    protected Nota nota;

    public NotaDecorator(Nota nota) {
        this.nota = nota;
    }

    @Override
    public double getValue() {
        return nota.getValue();
    }

    @Override
    public String getDescription() {
        return nota.getDescription();
    }
}