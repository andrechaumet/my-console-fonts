package font;

public class TwoBlocksFont extends Font {
    private static final String[][] FONT_CHARS_MATRIX = new String[][]{
            {"A",
                    "▄▀▄ ",
                    "█▀█ "},

            {"B",
                    "██▄ ",
                    "█▄█ "},

            {"C",
                    "▄▀▀ ",
                    "▀▄▄ "},

            {"D",
                    "█▀▄ ",
                    "█▄▀ "},

            {"E",
                    "██▀ ",
                    "█▄▄ "},

            {"F",
                    "█▀ ",
                    "█▀ "},

            {"G",
                    "▄▀  ",
                    "▀▄█ "},

            {"H",
                    "█▄█ ",
                    "█ █ "},

            {"I",
                    "█ ",
                    "█ "},

            {"J",
                    "  █ ",
                    "▀▄█ "},

            {"K",
                    "█▄▀ ",
                    "█ █ "},

            {"L",
                    "█   ",
                    "█▄▄ "},

            {"M",
                    "█▄ ▄█ ",
                    "█ ▀ █ "},

            {"N",
                    "█▄ █ ",
                    "█ ▀█ "},

            {"O",
                    "▄▀▄ ",
                    "▀▄▀ "},

            {"P",
                    "█▀▄ ",
                    "█▀  "},

            {"Q",
                    "▄▀▄ ",
                    "▀▄█ "},

            {"R",
                    "█▀▄ ",
                    "█▀▄ "},

            {"S",
                    "▄▀▀ ",
                    "▄██ "},

            {"T",
                    "▀█▀ ",
                    " █  "},

            {"U",
                    "█ █ ",
                    "▀▄█ "},

            {"V",
                    "█ █ ",
                    "▀▄▀ "},

            {"W",
                    "█   █ ",
                    "▀▄▀▄▀ "},

            {"X",
                    "▀▄▀ ",
                    "█ █ "},

            {"Y",
                    "▀▄▀ ",
                    " █  "},

            {"Z",
                    "▀▀█ ",
                    "█▄▄ "},

            {" ",
                    "  ",
                    "  "
            }};

    public TwoBlocksFont() {
        super(FONT_CHARS_MATRIX);
    }

    //TODO: Support multiple inherited font
    protected TwoBlocksFont(String[][]... fontCharsMatrix) {
        super(FONT_CHARS_MATRIX, fontCharsMatrix[0]);
    }
}
