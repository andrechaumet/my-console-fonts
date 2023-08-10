package v2.fonts;

import java.util.HashMap;
import java.util.Map;

public abstract class Font {

    private final Map<Character, String[]> CHARACTERS_MAP;
    private final int AMOUNT_OF_ROWS;

    //TODO: Create " public String [][] unifyMatrices(String[][]..., String[][])"
    // to start coupling them as they go up

    public Font(String[][] fontCharsMatrix) {
        CHARACTERS_MAP = new HashMap<>(fontCharsMatrix.length);
        AMOUNT_OF_ROWS = calculateAmountOfRows(fontCharsMatrix);
        mapFontDesigns(fontCharsMatrix);
    }

    public Font(String[][]... fontCharsMatrices) {
        CHARACTERS_MAP = new HashMap<>(countAmountOfChars(fontCharsMatrices));
        //TODO: Overwrite kinda style
        AMOUNT_OF_ROWS = fontCharsMatrices[0][0].length - 1;
        mapFontDesigns(fontCharsMatrices);
    }

    private int countAmountOfChars(String[][]... fontCharsMatrices) {
        int amountOfChars = 0;
        for (String[][] matrix : fontCharsMatrices) {
            amountOfChars += matrix.length;
        }
        return amountOfChars;
    }

    private void mapFontDesigns(String[][] fontCharsMatrix) {
        for (String[] rowsArray : fontCharsMatrix) {
            Character charKey = rowsArray[0].toUpperCase().charAt(0);
            String[] stringValues = new String[AMOUNT_OF_ROWS];
            for (int currentCharRow = 0; currentCharRow < stringValues.length; currentCharRow++) {
                stringValues[currentCharRow] = rowsArray[currentCharRow + 1];
            }
            CHARACTERS_MAP.put(charKey, stringValues);
        }
    }

    private void mapFontDesigns(String[][]... fontCharsMatrices) {
        for (String[][] fontsArray : fontCharsMatrices) {
            for (String[] rowsArray : fontsArray) {
                Character charKey = rowsArray[0].toUpperCase().charAt(0);
                String[] stringValues = new String[AMOUNT_OF_ROWS];
                for (int currentCharRow = 0; currentCharRow < stringValues.length; currentCharRow++) {
                    stringValues[currentCharRow] = rowsArray[currentCharRow + 1];
                }
                CHARACTERS_MAP.put(charKey, stringValues);
            }
        }
    }

    private int calculateAmountOfRows(String[][] fontCharsMatrix) {
        final int MINUS_KEY_STORE_SPACE = -1;
        return fontCharsMatrix[0].length + MINUS_KEY_STORE_SPACE;
    }

    //TODO: Not char key found exception handling
    public String getCharFragment(char character, int rowNumber) {
        return CHARACTERS_MAP.get(Character.toUpperCase(character))[rowNumber];
    }

    //TODO:
/*    private String[][] matrixUnifier(String[][]... matrix) {
        return null;
    }*/

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

