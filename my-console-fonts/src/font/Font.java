package font;

import exception.NoSuchKeyException;

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
    private final Boolean CASE_SENSISTIVE;

    protected Font(final Boolean caseSensistive, final String[][] fontCharsMatrix) {
        CHARACTERS_MAP = new HashMap<>(fontCharsMatrix.length);
        AMOUNT_OF_ROWS_PER_CHAR = calculateAmountOfRows(fontCharsMatrix);
        CASE_SENSISTIVE = caseSensistive;
        mapFontDesigns(fontCharsMatrix);
    }

    protected Font(final Boolean caseSensistive, final String[][]... fontCharsMatrices) {
        CASE_SENSISTIVE = caseSensistive;
        CHARACTERS_MAP = new HashMap<>(countAmountOfChars(fontCharsMatrices));
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

    private void mapFontDesigns(final String[][]... fontCharsMatrices) {
        for (final String[][] fontsArray : fontCharsMatrices) {
            mapFontDesigns(fontsArray);
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

    public String getCharFragment(final char character, final int rowNumber) {
        final String fragment = CHARACTERS_MAP.get(character)[rowNumber];
        if(fragment == null) {
            throw new NoSuchKeyException();
        }
        return fragment;
    }

    public String[] getCharFragments(final char character) {
        final String[] fragments = CHARACTERS_MAP.get(character);
        if(fragments == null) {
            throw new NoSuchKeyException();
        }
        return fragments;
    }

    public int getAmountOfRowsPerChar() {
        return AMOUNT_OF_ROWS_PER_CHAR;
    }

    public int getAmountOfChars() {
        return CHARACTERS_MAP.size();
    }
}

