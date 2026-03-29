package br.com.software.adapter;

public class EmissorNotasGraduacaoExterna {

    private Integer score;

    public EmissorNotasGraduacaoExterna(Integer score) {
        this.score = score;
    }

    public Integer getNota() {
        return score;
    }

    public String getNotaDescricao() {

        System.out.println("Obtendo descrição da nota de graduação externa...");

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