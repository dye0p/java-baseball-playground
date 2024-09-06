package baseball.model.domain.util;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegerListConvertor {
    private static final int START_INDEX = 0;

    private final List<Integer> convertNubmer = new ArrayList<>();

    public List<Integer> converte(String playerInputNumber) {
        convertInputToNumberList(playerInputNumber);
        return convertNubmer;
    }

    private void convertInputToNumberList(String playerInputNumber) {
        for (int index = START_INDEX; index < playerInputNumber.length(); index++) {
            char c = getCharacterAt(playerInputNumber, index);
            int num = convertCharToInt(c);
            convertNubmer.add(num);
        }
    }

    private int convertCharToInt(char c) {
        return Integer.parseInt(convertCharToString(c));
    }

    private String convertCharToString(char c) {
        return String.valueOf(c);
    }

    private char getCharacterAt(String playerInputNumber, int index) {
        return playerInputNumber.charAt(index);
    }
}
