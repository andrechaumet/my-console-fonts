package v2;

import java.util.Map;

public abstract class Font {

    public Map<Character, String[]> charactersMap;

    private int AMOUNT_OF_CHARS;
    private int AMOUNT_OF_ROWS;

    public String getCharRowFragment(char character, int rowNumber) {
        return charactersMap.get(character)[rowNumber];
    }

    public String[] getCharRows(char character) {
        return charactersMap.get(character);
    }
}
