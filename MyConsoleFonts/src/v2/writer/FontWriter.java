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
        //StringBuilder result = new StringBuilder("\n");
        String result = "";
        for (int rowNumber = 0; rowNumber < font.getAmountOfRowsPerChar(); rowNumber++) {
            for (char stringCharacter : stringCharacters) {
                result += obtainCharFragment(stringCharacter, rowNumber);
            }
            result += "\n";
        }
        return result.toString();
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
