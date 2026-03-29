package br.com.software.decorator.main;

import br.com.software.decorator.Nota;
import br.com.software.decorator.notas.NotaBasica;
import br.com.software.decorator.notas.NotaBonusDecorator;
import br.com.software.decorator.notas.NotaComPesoDecorator;

public class DecoratorMain {
    static void main() {

        Nota notaBasica = new NotaBasica(85.0);
        System.out.println("Valor: " + notaBasica.getValue());
        System.out.println("Descricão: " + notaBasica.getDescription());

        Nota bonusGrade = new NotaBonusDecorator(notaBasica, 5.0);
        System.out.println("Valor com bônus: " + bonusGrade.getValue());
        System.out.println("Descrição com bônus: " + bonusGrade.getDescription());

        Nota notaComPeso = new NotaComPesoDecorator(bonusGrade, 1.5);
        System.out.println("Valor com peso: " + notaComPeso.getValue());
        System.out.println("Descrição com peso: " + notaComPeso.getDescription());
    }
}