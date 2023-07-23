package v2;

import java.util.HashMap;
import java.util.Map;

public abstract class Font {

    private final Map<Character, String[]> CHARACTERS_MAP;
    private final int AMOUNT_OF_ROWS;

    public Font(String[][] fontCharsMatrix, int amountOfRows) {
        CHARACTERS_MAP = new HashMap<>(fontCharsMatrix.length);
        final int MINUS_CHAR_KEY_STORE_SPACE = -1;
        AMOUNT_OF_ROWS = amountOfRows + MINUS_CHAR_KEY_STORE_SPACE;
        mapCharactersDesigns(fontCharsMatrix);
    }

    private void mapCharactersDesigns(String[][] fontCharsMatrix) {
        for (String[] charRowsArray : fontCharsMatrix) {
            Character charKey = charRowsArray[0].toUpperCase().charAt(0);
            String[] charValues = new String[AMOUNT_OF_ROWS];
            System.arraycopy(charRowsArray, 1, charValues, 0, charValues.length);
            CHARACTERS_MAP.put(charKey, charValues);
        }
    }

    //TODO: Not char key found exception handling
    public String getCharFragment(char character, int rowNumber) {
        return CHARACTERS_MAP.get(Character.toUpperCase(character))[rowNumber];
    }

    //TODO: Not char key found exception handling
    public String[] getCharFragments(char character) {
        return CHARACTERS_MAP.get(Character.toUpperCase(character));
    }

    public int getAmountOfRowsPerChar() {
        return AMOUNT_OF_ROWS;
    }

    public int getAmountOfChars() {
        return CHARACTERS_MAP.size();
    }
}
