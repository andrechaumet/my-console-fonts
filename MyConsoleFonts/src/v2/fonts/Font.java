package v2.fonts;

import v2.exception.NoSuchKeyException;

import java.util.HashMap;
import java.util.Map;

/**
 * <head>This class handles common Fonts hierarchy mapping logic.</head>
 *
 * @author André Chaumet - github.com/andrechc
 * @version 0.1
 * @since 20th July 2023
 */
public abstract class Font {

    private static final int CHAR_KEY_POSITION = 0;
    private static final int CHAR_KEY_LENGTH_POSITION = 0;

    private final Map<Character, String[]> CHARACTERS_MAP;
    private final int AMOUNT_OF_ROWS_PER_CHAR;

    //TODO: Create " public String [][] unifyMatrices(String[][]..., String[][])"
    // to start coupling them as they go up

    protected Font(final String[][] fontCharsMatrix) {
        CHARACTERS_MAP = new HashMap<>(fontCharsMatrix.length);
        AMOUNT_OF_ROWS_PER_CHAR = calculateAmountOfRows(fontCharsMatrix);
        mapFontDesigns(fontCharsMatrix);
    }

    protected Font(final String[][]... fontCharsMatrices) {
        CHARACTERS_MAP = new HashMap<>(countAmountOfChars(fontCharsMatrices));
        //TODO: Write it more descriptive
        AMOUNT_OF_ROWS_PER_CHAR = calculateExpectedRowsPerChar(fontCharsMatrices);
        mapFontDesigns(fontCharsMatrices);
    }


    private void mapFontDesigns(final String[][] fontCharsMatrix) {
        for (final String[] rowsArray : fontCharsMatrix) {
            Character charKey = rowsArray[CHAR_KEY_POSITION].charAt(CHAR_KEY_LENGTH_POSITION);
            String[] stringValues = new String[AMOUNT_OF_ROWS_PER_CHAR];
            System.arraycopy(rowsArray, 1, stringValues, 0, stringValues.length);
            CHARACTERS_MAP.put(charKey, stringValues);
        }
    }
    //TODO: Create submethod for mapFontDesigns function overloading methods
    private void mapFontDesigns(final String[][]... fontCharsMatrices) {
        for (final String[][] fontsArray : fontCharsMatrices) {
            mapFontDesigns(fontsArray);
            /*for (final String[] rowsArray : fontsArray) {
                Character charKey = rowsArray[CHAR_KEY_POSITION].charAt(CHAR_KEY_LENGTH_POSITION);
                String[] stringValues = new String[AMOUNT_OF_ROWS_PER_CHAR];
                System.arraycopy(rowsArray, 1, stringValues, 0, stringValues.length);
                CHARACTERS_MAP.put(charKey, stringValues);
            }*/
        }
    }

    private int countAmountOfChars(final String[][]... fontCharsMatrices) {
        int amountOfChars = 0;
        for (String[][] matrix : fontCharsMatrices) {
            amountOfChars += matrix.length;
        }
        return amountOfChars;
    }

    private int calculateExpectedRowsPerChar(final String[][]... fontCharsMatrices) {
        return fontCharsMatrices[CHAR_KEY_POSITION][CHAR_KEY_LENGTH_POSITION].length - 1;
    }

    private int calculateAmountOfRows(final String[][] fontCharsMatrix) {
        final int MINUS_KEY_STORE_SPACE = -1;
        return fontCharsMatrix[0].length + MINUS_KEY_STORE_SPACE;
    }

    //TODO: Not char key found exception handling
    public String getCharFragment(final char character, final int rowNumber) {
        return CHARACTERS_MAP.get(Character.toUpperCase(character))[rowNumber];
    }

    //TODO:
/*    private String[][] matrixUnifier(String[][]... matrices) {
        return null;
    }*/

    //TODO: Not char key found exception handling
    public String[] getCharFragments(final char character) throws NoSuchKeyException {
        return CHARACTERS_MAP.get(character);
    }

    public int getAmountOfRowsPerChar() {
        return AMOUNT_OF_ROWS_PER_CHAR;
    }

    public int getAmountOfChars() {
        return CHARACTERS_MAP.size();
    }
}

