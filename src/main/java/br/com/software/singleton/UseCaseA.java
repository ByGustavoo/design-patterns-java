package br.com.software.singleton;

public class UseCaseA {

    public void adicionarNota() {
        MediaNotaSystem mediaNotaSystem = MediaNotaSystem.getInstance();
        mediaNotaSystem.addGrade("123", 5.0);
    }
}