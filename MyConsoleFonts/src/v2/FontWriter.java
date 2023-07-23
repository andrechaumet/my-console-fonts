package v2;

public class FontWriter {

    private final Font font;

    public FontWriter(Font font) {
        this.font = font;
    }

    public String generateText(String text) {
        char[] stringCharacters = text.toCharArray();
        StringBuilder result = new StringBuilder("\n");
        for(int rowNumber = 0; rowNumber < 7; rowNumber++) {
            for(char stringCharacter : stringCharacters) {
                result.append(obtainCharFragment(stringCharacter, rowNumber));
            }
            result.append("\n");
        }
        return result.toString();
    }

    //TODO: Differ it from generateText(String);
    public void writeText(String text) {
        System.out.println(generateText(text));
    }

    private String obtainCharFragment(char character, int rowNumber) {
        return font.getCharFragment(character, rowNumber);
    }
}
