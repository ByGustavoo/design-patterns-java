package br.com.software.strategy;

import br.com.software.strategy.strategies.NotaStrategy;

public class NotaContext {

    private NotaStrategy strategy;

    public void setStrategy(NotaStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double[] grades) {
        return strategy.calculateAverage(grades);
    }
}