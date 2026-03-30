package br.com.software.chain.rules;

import br.com.software.chain.BaseRule;

public class AprovadorAutomaticoRule extends BaseRule {

    @Override
    public void check(double grade) {
        if (grade >= 90) {
            System.out.println("Nota " + grade + " aprovado automaticamente!");
        } else if (nextRule != null) {
            nextRule.check(grade);
        }
    }
}