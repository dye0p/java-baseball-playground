package calculator.business;

public class Minus {

    private int result;
    private int num;

    public Minus(int result, String num) {
        this.result = result;
        this.num = Integer.parseInt(num);
    }

    public int minus() {
        return result -= num;
    }
}
