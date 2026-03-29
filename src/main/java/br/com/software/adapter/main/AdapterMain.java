package br.com.software.adapter.main;

import br.com.software.adapter.*;

import java.util.List;

public class AdapterMain {
    static void main() {
        EmissorNotasGraduacaoExterna emissorNotasGraduacaoExterna = new EmissorNotasGraduacaoExterna(85);
        EmissorNotasPosGraduacaoExterna emissorNotasPosGraduacaoExterna = new EmissorNotasPosGraduacaoExterna(15);

        List<Nota> notas = List.of(new NotaGraduacaoAdapter(emissorNotasGraduacaoExterna), new NotaPosGraduacaoAdapter(emissorNotasPosGraduacaoExterna));

        for (Nota nota : notas) {
            System.out.println("Nota: " + nota.getValue());
            System.out.println("Descrição da Nota: " + nota.getTipoNota());
        }
    }
}