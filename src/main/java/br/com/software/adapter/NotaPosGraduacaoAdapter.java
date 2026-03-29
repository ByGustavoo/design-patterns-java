package br.com.software.adapter;

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