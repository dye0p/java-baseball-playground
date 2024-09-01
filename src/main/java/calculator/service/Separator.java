package calculator.service;

public class Separator {
    public static final String REGEX = " ";

    public String[] separate(String inputRequest) {
        return inputRequest.split(REGEX);
    }
}
