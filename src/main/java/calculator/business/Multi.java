package calculator.business;

public class Multi {

    private int result;
    private int num;

    public Multi(int result, String num) {
        this.result = result;
        this.num = Integer.parseInt(num);
    }

    public int multi() {
        return result *= num;
    }
}
