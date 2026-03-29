package br.com.software.adapter.exemplo01.adapters;

import br.com.software.adapter.exemplo01.externo.EmissorNotasGraduacaoExterna;
import br.com.software.adapter.exemplo01.Nota;

public class NotaGraduacaoAdapter implements Nota {

    private EmissorNotasGraduacaoExterna emissorNotasGraduacaoExterna;

    public NotaGraduacaoAdapter(EmissorNotasGraduacaoExterna emissorNotasGraduacaoExterna) {
        this.emissorNotasGraduacaoExterna = emissorNotasGraduacaoExterna;
    }

    @Override
    public double getValue() {
        return emissorNotasGraduacaoExterna.getNota();
    }

    @Override
    public String getTipoNota() {
        return emissorNotasGraduacaoExterna.getNotaDescricao();
    }
}