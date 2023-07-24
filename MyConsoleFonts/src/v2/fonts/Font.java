package v2.fonts;

import java.util.HashMap;
import java.util.Map;

public abstract class Font {

    private final Map<Character, String[]> CHARACTERS_MAP;
    private final int AMOUNT_OF_ROWS;

    public Font(String[][] fontCharsMatrix) {
        CHARACTERS_MAP = new HashMap<>(fontCharsMatrix.length);
        AMOUNT_OF_ROWS = calculateAmountOfRows(fontCharsMatrix);
        mapFontDesigns(fontCharsMatrix);
    }

/*    //TODO: Receive multiple, adjunt as one, -> mapFontDesigns();
    public Font(String[][]... fontCharsMatrix) {
        //CHARACTERS_MAP = new HashMap<>(Arrays.stream(fontCharsMatrix).map(matrix -> Integer.valueOf(matrix.length)));
        AtomicReference<Integer> test = new AtomicReference<>(0);
        Arrays.stream(fontCharsMatrix).forEach(matrix -> test.updateAndGet(v -> v + matrix.length));
        CHARACTERS_MAP = new HashMap<>(test.get());
    }*/

/*    public Font(String[][]... fontCharsMatrix) {
        //CHARACTERS_MAP = new HashMap<>(Arrays.stream(fontCharsMatrix).map(matrix -> Integer.valueOf(matrix.length)));
        AtomicReference<Integer> test = new AtomicReference<>(0);
        Arrays.stream(fontCharsMatrix).forEach(matrix -> test.updateAndGet(v -> v + matrix.length));
        CHARACTERS_MAP = new HashMap<>(test.get());
    }*/

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

    private int calculateAmountOfRows(String[][] fontCharsMatrix) {
        final int minusKeyStoreSpace = - 1;
        return fontCharsMatrix[0].length + minusKeyStoreSpace;
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
