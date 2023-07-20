package v2;

import java.util.Map;

public abstract class Font {

    public Map<Character, String[]> charactersMap;

    private final int AMOUNT_OF_ROWS;

    public Font(int amountOfRows) {
        this.AMOUNT_OF_ROWS = amountOfRows;
    }

    public String[] getCharRows(char character) {
        return charactersMap.get(character);
    }

    public String getCharRowFragment(char character, int rowNumber) {
        return charactersMap.get(character)[rowNumber];
    }

    public int getAmountOfRows() {
        return AMOUNT_OF_ROWS;
    }

    public int getAmountOfChars() {
        return charactersMap.size();
    }

}
