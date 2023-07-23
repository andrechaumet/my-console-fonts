package v2;

import java.util.HashMap;
import java.util.Map;

public abstract class Font {

    private final Map<Character, String[]> CHARACTERS_MAP;
    private final int AMOUNT_OF_ROWS;

    public Font(String[][] fontCharsMatrix, int amountOfRows) {
        CHARACTERS_MAP = new HashMap<>(fontCharsMatrix.length);
        AMOUNT_OF_ROWS = amountOfRows;
        for (String[] rowsArray : fontCharsMatrix) {
            Character charKey = rowsArray[0].toUpperCase().charAt(0);
            String[] stringValues = new String[AMOUNT_OF_ROWS];
            for (int currentCharRow = 1; currentCharRow < stringValues.length; currentCharRow++) {
                stringValues[currentCharRow - 1] = rowsArray[currentCharRow];
            }
            CHARACTERS_MAP.put(charKey, stringValues);
        }
    }

    public String getCharFragment(char character, int rowNumber) {
        return CHARACTERS_MAP.get(Character.toUpperCase(character))[rowNumber];
    }

    public int getAmountOfChars() {
        return CHARACTERS_MAP.size();
    }

    public int getAmountOfRowsPerChar() {
        return AMOUNT_OF_ROWS;
    }
}
