package writer;

import exception.NoFontLoadedException;
import font.Font;

/**
 * <head>This class converts text requests to the loaded font chars.</head>
 * @author André Chaumet - github.com/andrechc
 * @version 0.1
 * @since 20th July 2023
 */
public class FontWriter {

    private Font font;

    public FontWriter() {
    }

    public FontWriter(final Font font) {
        this.font = font;
    }

    public String generateText(final String text) {
        failIfNoFontIsLoaded();
        final char[] stringCharacters = text.toCharArray();
        final int amountOfRows = font.getAmountOfRowsPerChar();
        final String nextLine = "\n";
        final StringBuilder result = new StringBuilder(calculateRequiredHeapSpace(text));
        for (int rowNumber = 0; rowNumber < amountOfRows; rowNumber++) {
            for (char stringCharacter : stringCharacters) {
                result.append(obtainCharFragment(stringCharacter, rowNumber));
            }
            result.append(nextLine);
        }
        return result.toString();
    }

    private void failIfNoFontIsLoaded() {
        if(font == null) {
            throw new NoFontLoadedException();
        }
    }

    private int calculateRequiredHeapSpace(final String requiredText) {
        return this.font.getAmountOfRowsPerChar() * requiredText.length();
    }

    public void writeText(final String text) {
        System.out.println(generateText(text));
    }

    private String obtainCharFragment(final char character, final int rowNumber) {
        return font.getCharFragment(character, rowNumber);
    }

    public Font getFont() {
        return font;
    }

    public void setFont(final Font font) {
        this.font = font;
    }
}
