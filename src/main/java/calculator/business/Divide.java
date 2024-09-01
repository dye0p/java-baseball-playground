package calculator.business;

public class Divide {

    private int result;
    private int num;

    public Divide(int result, String num) {
        this.result = result;
        this.num = Integer.parseInt(num);
    }

    public int divide() {
        return result /= num;
    }
}
