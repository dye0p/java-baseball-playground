package calculator.business;

public class Plus {

    private int result;
    private int num;

    public Plus(int result, String num) {
        this.result = result;
        this.num = Integer.parseInt(num);
    }

    public int plus() {
        return result += num;
    }
}
