package br.com.software.strategy.strategies;

public class MediaAritmeticaStrategy implements NotaStrategy {

    @Override
    public double calculateAverage(double[] grades) {
        double sum = 0.0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }
}