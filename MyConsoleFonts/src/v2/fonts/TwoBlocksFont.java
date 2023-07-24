package v2.fonts;

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

    /*//TODO: Support multiple inherited fonts
    protected TwoBlocksFont(String[][] fontCharsMatrix) {
        //TODO: Pass the size
        super();
        //TODO:
        super(super.matrixUnifier(FONT_CHARS_MATRIX, fontCharsMatrix));
    }*/
}
