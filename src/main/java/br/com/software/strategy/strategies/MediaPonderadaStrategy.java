package br.com.software.strategy.strategies;

public class MediaPonderadaStrategy implements NotaStrategy {

    private double[] weights;

    public MediaPonderadaStrategy(double[] weights) {
        this.weights = weights;
    }

    @Override
    public double calculateAverage(double[] grades) {
        double sum = 0.0;
        double weightsSum = 0.0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i] * weights[i];
            weightsSum += weights[i];
        }

        return sum / weightsSum;
    }
}