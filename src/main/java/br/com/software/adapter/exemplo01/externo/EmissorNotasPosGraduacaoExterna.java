package br.com.software.adapter.exemplo01.externo;

public class EmissorNotasPosGraduacaoExterna {

    private Integer score;

    public EmissorNotasPosGraduacaoExterna(Integer score) {
        this.score = score;
    }

    public Integer getNota() {
        return score;
    }

    public String getNotaDescricao() {

        System.out.println("Obtendo descrição da nota de pós-graduação externa...");

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}