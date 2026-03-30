package br.com.software.chain.rules;

import br.com.software.chain.BaseRule;

public class RevisorRule extends BaseRule {

    @Override
    public void check(double grade) {
        if (grade >= 70 && grade < 90) {
            System.out.println("Nota " + grade + " precisa de revisão!");
        } else if (nextRule != null){
            nextRule.check(grade);
        }
    }
}