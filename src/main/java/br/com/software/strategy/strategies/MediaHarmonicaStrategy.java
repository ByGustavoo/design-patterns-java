package br.com.software.strategy.strategies;

public class MediaHarmonicaStrategy implements NotaStrategy {

    @Override
    public double calculateAverage(double[] grades) {
        double sum = 0.0;

        for (double grade : grades) {
            sum += 1.0 / grade;
        }

        return grades.length / sum;
    }
}