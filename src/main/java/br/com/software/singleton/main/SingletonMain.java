package br.com.software.singleton.main;

import br.com.software.singleton.MediaNotaSystem;
import br.com.software.singleton.UseCaseA;
import br.com.software.singleton.UseCaseB;

public class SingletonMain {
    static void main() {

        // Obtendo a única instância do MediaNotaSystem e adicionando uma nota para um aluno
        MediaNotaSystem mediaNotaSystem = MediaNotaSystem.getInstance();
        mediaNotaSystem.addGrade("123", 5.0);

        UseCaseA useCaseA = new UseCaseA();
        useCaseA.adicionarNota();

        UseCaseB useCaseB = new UseCaseB();
        useCaseB.adicionarNota();

        double average = mediaNotaSystem.getAverageGrade("123");
        System.out.println("Média do aluno 123: " + average);
    }
}