package br.com.software.adapter;

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