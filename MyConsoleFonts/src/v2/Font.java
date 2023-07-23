package v2;

import java.util.HashMap;
import java.util.Map;

public abstract class Font {

    private final Map<Character, String[]> charactersMap;

    public Font(String[][] fontCharsMatrix, int amountOfRows) {
        charactersMap = new HashMap<>(fontCharsMatrix.length);
        for (String[] rowsArray : fontCharsMatrix) {
            Character charKey = rowsArray[0].toUpperCase().charAt(0);
            String[] stringValues = new String[amountOfRows];
            for (int currentCharRow = 1; currentCharRow < stringValues.length; currentCharRow++) {
                stringValues[currentCharRow - 1] = rowsArray[currentCharRow];
            }
            charactersMap.put(charKey, stringValues);
        }
    }

    public String getCharFragment(char character, int rowNumber) {
        return charactersMap.get(Character.toUpperCase(character))[rowNumber];
    }

    public int getAmountOfChars() {
        return charactersMap.size();
    }

}
