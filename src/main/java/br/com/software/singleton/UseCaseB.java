package br.com.software.singleton;

public class UseCaseB {

    public void adicionarNota() {
        MediaNotaSystem mediaNotaSystem = MediaNotaSystem.getInstance();
        mediaNotaSystem.addGrade("123", 5.0);
    }
}