package br.com.software.factory;

import br.com.software.factory.domain.Nota;

public abstract class NotaFactory {

    public abstract Nota criarNota(double pValue);

}