package br.com.software.chain.rules;

import br.com.software.chain.BaseRule;

public class RejeicaoRule extends BaseRule {

    @Override
    public void check(double grade) {
        if (grade < 70) {
            System.out.println("Nota " + grade + " reprovado!");
        } else if (nextRule != null) {
            nextRule.check(grade);
        }
    }
}