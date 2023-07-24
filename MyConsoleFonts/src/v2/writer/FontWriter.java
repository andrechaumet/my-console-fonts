package v2.writer;

import v2.fonts.Font;

public class FontWriter {

    private Font font;

    //TODO: Support empty FontWriter $ add EmptyWriterException (no font loaded)
    public FontWriter() {
    }

    public FontWriter(Font font) {
        this.font = font;
    }

    public String generateText(String text) {
        char[] stringCharacters = text.toCharArray();
        int amountOfRows = font.getAmountOfRowsPerChar();
        //TODO: Calculate required stack memory for result String
        //TODO: Create sub methods for this crap
        StringBuilder result = new StringBuilder(calculateRequiredHeapSpace(text));
        for (int rowNumber = 0; rowNumber < amountOfRows; rowNumber++) {
            for (char stringCharacter : stringCharacters) {
                result.append(obtainCharFragment(stringCharacter, rowNumber));
            }
            result.append("\n");
        }
        return result.toString().toString();
    }

    private int calculateRequiredHeapSpace(String requiredText) {
        return this.font.getAmountOfRowsPerChar() * requiredText.length();
    }

    public void writeText(String text) {
        System.out.println(generateText(text));
    }

    private String obtainCharFragment(char character, int rowNumber) {
        return font.getCharFragment(character, rowNumber);
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
}
