package br.com.software.singleton;

/**
 * Classe implementada com o padrão Singleton, garantindo que apenas uma instância exista durante a execução do programa.
 */
public class MediaNotaSystem {

    // Instância privada e estática da classe
    private static MediaNotaSystem instance;

    // Construtor Privado para evitar instaciação externas
    private MediaNotaSystem() {

    }

    // Método público e estático para acessar a instância da classe
    public static synchronized MediaNotaSystem getInstance() {
        if (instance == null) {
            instance = new MediaNotaSystem();
        }

        return instance;
    }

    public void addGrade(String pStudentId, Double pGrade) {

    }

    public Double getAverageGrade(String pStudentId) {
        return 0.0;
    }
}