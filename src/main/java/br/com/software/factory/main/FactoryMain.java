package br.com.software.factory.main;

import br.com.software.factory.domain.Nota;
import br.com.software.factory.NotaFactory;
import br.com.software.factory.NotaProvaFactory;
import br.com.software.factory.NotaTrabalhoFactory;

import java.util.List;

public class FactoryMain {
    static void main() {
        List<NotaFactory> notaFactories = List.of(new NotaProvaFactory(), new NotaTrabalhoFactory());

        for (NotaFactory notaFactory : notaFactories) {
            double notaRecebida = obterNota();
            Nota nota = notaFactory.criarNota(notaRecebida);

            System.out.println("Tipo de Nota: " + nota.getType() + ", Valor: " + nota.getValue());
        }
    }

    private static double obterNota() {
        return 0;
    }
}