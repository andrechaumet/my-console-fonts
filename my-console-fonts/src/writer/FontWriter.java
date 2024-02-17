package writer;

import exception.NoFontLoadedException;
import font.Font;

import java.io.Console;

/**
 * <head>This class converts text requests to the loaded font chars.</head>
 *
 * @author André Chaumet - github.com/andrechaumet
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
        final char[] textChars = text.toCharArray();
        final StringBuilder result = new StringBuilder(calculateRequiredSpace(text));
        for (int rowNumber = 0; rowNumber < font.getAmountOfRowsPerChar(); rowNumber++) {
            for (char textChar : textChars) {
                result.append(obtainCharFragment(textChar, rowNumber));
            }
            skipLine(result);
        }
        return result.toString();
    }

    private void skipLine(final StringBuilder builder) {
        final String nextLine = "\n";
        builder.append(nextLine);
    }

    private int calculateRequiredSpace(final String requiredText) {
        return this.font.getAmountOfRowsPerChar() * requiredText.length();
    }

    private String obtainCharFragment(final char character, final int rowNumber) {
        return font.getCharFragment(character, rowNumber);
    }

    private void failIfNoFontIsLoaded() {
        if (font == null) {
            throw new NoFontLoadedException();
        }
    }

    public void writeText(final String text) {
        System.out.println(generateText(text));
    }

    public Font getFont() {
        return font;
    }

    public void setFont(final Font font) {
        this.font = font;
    }
}
