package br.com.software.factory;

import br.com.software.factory.domain.Nota;
import br.com.software.factory.domain.NotaTrabalho;

public class NotaTrabalhoFactory extends NotaFactory {

    @Override
    public Nota criarNota(double pValue) {
        return new NotaTrabalho(pValue);
    }
}