package font;

public class TwoBlocksSpanishFont extends TwoBlocksFont {

    private static final String[][] FONT_CHARS_MATRIX_TEST = new String[][]{
            {"Ñ",
                    "█▄▀█ ",
                    "█ ▀█ "}};

    public TwoBlocksSpanishFont() {
        super(false, FONT_CHARS_MATRIX_TEST);
    }
}
