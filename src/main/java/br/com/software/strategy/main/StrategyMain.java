package br.com.software.strategy.main;

import br.com.software.strategy.NotaContext;
import br.com.software.strategy.strategies.MediaAritmeticaStrategy;
import br.com.software.strategy.strategies.MediaHarmonicaStrategy;
import br.com.software.strategy.strategies.MediaPonderadaStrategy;

public class StrategyMain {
    static void main() {

        NotaContext context = new NotaContext();

        double[] grades = { 85, 90, 78, 92, 88 };

        context.setStrategy(new MediaAritmeticaStrategy());
        System.out.println("Media Aritmética: " + context.executeStrategy(grades));

        double[] weights = { 0.1, 0.2, 0.3, 0.2, 0.2 };
        context.setStrategy(new MediaPonderadaStrategy(weights));
        System.out.println("Media Ponderada: " + context.executeStrategy(grades));

        context.setStrategy(new MediaHarmonicaStrategy());
        System.out.println("Media Harmônica: " + context.executeStrategy(grades));
    }
}