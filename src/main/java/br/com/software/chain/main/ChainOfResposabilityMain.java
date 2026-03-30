package br.com.software.chain.main;

import br.com.software.chain.BaseRule;
import br.com.software.chain.rules.AprovadorAutomaticoRule;
import br.com.software.chain.rules.RejeicaoRule;
import br.com.software.chain.rules.RevisorRule;

public class ChainOfResposabilityMain {
    static void main() {

        BaseRule aprovadorAutomaticoRule = new AprovadorAutomaticoRule();
        BaseRule revisorRule = new RevisorRule();
        BaseRule rejeicaoRule = new RejeicaoRule();

        aprovadorAutomaticoRule.setNextHandler(revisorRule);
        revisorRule.setNextHandler(rejeicaoRule);

        double[] grades = { 95, 85, 65 };

        for (double grade : grades) {
            aprovadorAutomaticoRule.check(grade);
        }

        System.out.println("Fim!");
    }
}