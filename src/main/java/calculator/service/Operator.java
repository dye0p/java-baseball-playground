package calculator.service;

import calculator.business.Divide;
import calculator.business.Minus;
import calculator.business.Multi;
import calculator.business.Plus;

public class Operator {

    public int operate(String[] separate) {
        int result = Integer.parseInt(separate[0]);

        for (int i = 1; i < separate.length; i++) {
            result = operate(separate, i, result);
        }
        return result;
    }

    private int operate(String[] separate, int i, int result) {
        if (separate[i].equals("+")) {
            result = new Plus(result, separate[i + 1]).plus();
        }
        if (separate[i].equals("-")) {
            result = new Minus(result, separate[i + 1]).minus();
        }
        if (separate[i].equals("*")) {
            result = new Multi(result, separate[i + 1]).multi();
        }
        if (separate[i].equals("/")) {
            result = new Divide(result, separate[i + 1]).divide();
        }
        return result;
    }
}
