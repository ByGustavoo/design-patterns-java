package br.com.software.adapter.exemplo01.adapters;

import br.com.software.adapter.exemplo01.externo.EmissorNotasPosGraduacaoExterna;
import br.com.software.adapter.exemplo01.Nota;

public class NotaPosGraduacaoAdapter implements Nota {

    private EmissorNotasPosGraduacaoExterna emissorNotasPosGraduacaoExterna;

    public NotaPosGraduacaoAdapter(EmissorNotasPosGraduacaoExterna emissorNotasPosGraduacaoExterna) {
        this.emissorNotasPosGraduacaoExterna = emissorNotasPosGraduacaoExterna;
    }

    @Override
    public double getValue() {
        return emissorNotasPosGraduacaoExterna.getNota();
    }

    @Override
    public String getTipoNota() {
        return emissorNotasPosGraduacaoExterna.getNotaDescricao();
    }
}