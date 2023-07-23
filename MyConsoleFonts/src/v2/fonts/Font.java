package v2.fonts;

import java.util.HashMap;
import java.util.Map;

public abstract class Font {

    private final Map<Character, String[]> CHARACTERS_MAP;
    private final int AMOUNT_OF_ROWS;

    public Font(String[][] fontCharsMatrix, int amountOfRows) {
        CHARACTERS_MAP = new HashMap<>(fontCharsMatrix.length);
        final int MINUS_CHAR_KEY_STORE_SPACE = - 1;
        AMOUNT_OF_ROWS = amountOfRows + MINUS_CHAR_KEY_STORE_SPACE;
        mapCharactersDesigns(fontCharsMatrix);
    }

    private void mapCharactersDesigns(String[][] fontCharsMatrix) {
        for (String[] rowsArray : fontCharsMatrix) {
            Character charKey = rowsArray[0].toUpperCase().charAt(0);
            String[] stringValues = new String[AMOUNT_OF_ROWS];
            for (int currentCharRow = 0; currentCharRow < stringValues.length; currentCharRow++) {
                stringValues[currentCharRow] = rowsArray[currentCharRow + 1];
            }
            CHARACTERS_MAP.put(charKey, stringValues);
        }
    }

    //TODO: Not char key found exception handling
    public String getCharFragment(char character, int rowNumber) {
        return CHARACTERS_MAP.get(Character.toUpperCase(character))[rowNumber];
    }

    //TODO: Not char key found exception handling
    //TODO: Shouldn't have toUpperCase ?? maybe add "diffByMayusOn" boolean?
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
