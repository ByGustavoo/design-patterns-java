package br.com.software.adapter.exemplo01.main;

import br.com.software.adapter.exemplo01.*;
import br.com.software.adapter.exemplo01.adapters.NotaGraduacaoAdapter;
import br.com.software.adapter.exemplo01.adapters.NotaPosGraduacaoAdapter;
import br.com.software.adapter.exemplo01.externo.EmissorNotasGraduacaoExterna;
import br.com.software.adapter.exemplo01.externo.EmissorNotasPosGraduacaoExterna;
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