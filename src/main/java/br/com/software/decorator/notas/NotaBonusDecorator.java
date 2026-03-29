package br.com.software.decorator.notas;

import br.com.software.decorator.Nota;

public class NotaBonusDecorator extends NotaDecorator {

    private double bonus;

    public NotaBonusDecorator(Nota nota, double bonus) {
        super(nota);
        this.bonus = bonus;
    }

    @Override
    public double getValue() {
        return nota.getValue() + bonus;
    }

    @Override
    public String getDescription() {
        return nota.getDescription() + "com bônus";
    }
}