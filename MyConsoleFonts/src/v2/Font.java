package v2;

import java.util.HashMap;
import java.util.Map;

public abstract class Font {

   private Map<Character, String[]> charactersMap;


   public void generateFontMap(String[][] fontCharsMatrix, int amountOfRows) {
       charactersMap = new HashMap<>(amountOfRows);
       for (String[] rowsArray : fontCharsMatrix) {
           Character charKey = rowsArray[0].charAt(0);
           String[] stringValues = new String[amountOfRows];
           for (int currentCharRow = 1; currentCharRow < stringValues.length; currentCharRow++) {
               stringValues[currentCharRow] = rowsArray[currentCharRow];
           }
           charactersMap.put(charKey, stringValues);
       }
   }
}
