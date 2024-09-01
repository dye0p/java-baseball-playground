package calculator.service;

public class CalculateService {

    public int cal(String inputRequest) {
        Separator separator = new Separator();
        Operator operator = new Operator();

        String[] separate = separator.separate(inputRequest);
        return operator.operate(separate);
    }
}
