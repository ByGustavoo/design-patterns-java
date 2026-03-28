package br.com.software.factory;

import br.com.software.factory.domain.Nota;
import br.com.software.factory.domain.NotaProva;

public class NotaProvaFactory extends NotaFactory {

    @Override
    public Nota criarNota(double pValue) {
        return new NotaProva(pValue);
    }
}