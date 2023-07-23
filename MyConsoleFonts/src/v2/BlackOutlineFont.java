package v2;

public final class BlackOutlineFont extends Font {

    private static final String[][] FONT_CHARS_MATRIX = new String[][]{
            {"A",
                    " ▄▄▄▄▄▄  ",
                    "█      █ ",
                    "█  ▄   █ ",
                    "█ █▄█  █ ",
                    "█      █ ",
                    "█  ▄   █ ",
                    "█▄█ █▄▄█ "},

            {"B",
                    " ▄▄▄▄▄▄▄  ",
                    "█  ▄    █ ",
                    "█ █▄█   █ ",
                    "█       █ ",
                    "█  ▄   █  ",
                    "█ █▄█   █ ",
                    "█▄▄▄▄▄▄▄█ "},

            {"C",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█       █ ",
                    "█     ▄▄█ ",
                    "█    █    ",
                    "█    █▄▄  ",
                    "█▄▄▄▄▄▄▄█ "},

            {"D",
                    " ▄▄▄▄▄▄   ",
                    "█      █  ",
                    "█  ▄    █ ",
                    "█ █ █   █ ",
                    "█ █▄█   █ ",
                    "█       █ ",
                    "█▄▄▄▄▄▄█  "},

            {"E",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█    ▄▄▄█ ",
                    "█   █▄▄▄  ",
                    "█    ▄▄▄█ ",
                    "█   █▄▄▄  ",
                    "█▄▄▄▄▄▄▄█ "},

            {"F",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█    ▄▄▄█ ",
                    "█   █▄▄▄  ",
                    "█    ▄▄▄█ ",
                    "█   █     ",
                    "█▄▄▄█     "},

            {"G",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█   ▄▄▄▄█ ",
                    "█  █  ▄▄  ",
                    "█  █ █  █ ",
                    "█  █▄▄█ █ ",
                    "█▄▄▄▄▄▄▄█ "},

            {"H",
                    " ▄▄   ▄▄  ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█   ▄   █ ",
                    "█  █ █  █ ",
                    "█▄▄█ █▄▄█ "},

            {"I",
                    " ▄▄▄  ",
                    "█   █ ",
                    "█   █ ",
                    "█   █ ",
                    "█   █ ",
                    "█   █ ",
                    "█▄▄▄█ "},

            {"J",
                    "     ▄▄▄  ",
                    "    █   █ ",
                    "    █   █ ",
                    " ▄  █   █ ",
                    "█ █▄█   █ ",
                    "█       █ ",
                    "█▄▄▄▄▄▄▄█ "},

            {"K",
                    " ▄▄▄   ▄  ",
                    "█   █ █ █ ",
                    "█   █▄█ █ ",
                    "█      ▄█ ",
                    "█     █▄  ",
                    "█    ▄  █ ",
                    "█▄▄▄█ █▄█ "},

            {"L",
                    " ▄▄▄      ",
                    "█   █     ",
                    "█   █     ",
                    "█   █     ",
                    "█   █▄▄▄  ",
                    "█       █ ",
                    "█▄▄▄▄▄▄▄█ "},

            {"M",
                    " ▄▄   ▄▄  ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█       █ ",
                    "█       █ ",
                    "█ ██▄██ █ ",
                    "█▄█   █▄█ "},

            {"N",
                    " ▄▄    ▄  ",
                    "█  █  █ █ ",
                    "█   █▄█ █ ",
                    "█       █ ",
                    "█  ▄    █ ",
                    "█ █ █   █ ",
                    "█▄█  █▄▄█ "},

            {"O",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█   ▄   █ ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█▄▄▄▄▄▄▄█ "},

            {"P",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█    ▄  █ ",
                    "█   █▄█ █ ",
                    "█    ▄▄▄█ ",
                    "█   █     ",
                    "█▄▄▄█     "},

            {"Q",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█   ▄   █ ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█      █  ",
                    "█▄▄▄▄██▄█ "},

            {"R",
                    " ▄▄▄▄▄▄    ",
                    "█   ▄  █   ",
                    "█  █ █ █   ",
                    "█   █▄▄█▄  ",
                    "█    ▄▄  █ ",
                    "█   █  █ █ ",
                    "█▄▄▄█  █▄█ "},

            {"S",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█  ▄▄▄▄▄█ ",
                    "█ █▄▄▄▄▄  ",
                    "█▄▄▄▄▄  █ ",
                    " ▄▄▄▄▄█ █ ",
                    "█▄▄▄▄▄▄▄█ "},

            {"T",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█▄     ▄█ ",
                    "  █   █   ",
                    "  █   █   ",
                    "  █   █   ",
                    "  █▄▄▄█   "},

            {"U",
                    " ▄▄   ▄▄  ",
                    "█  █ █  █ ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█       █ ",
                    "█▄▄▄▄▄▄▄█ "},

            {"V",
                    " ▄▄   ▄▄  ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█       █ ",
                    " █     █  ",
                    "  █▄▄▄█   "},

            {"W",
                    " ▄     ▄  ",
                    "█ █ ▄ █ █ ",
                    "█ ██ ██ █ ",
                    "█       █ ",
                    "█       █ ",
                    "█   ▄   █ ",
                    "█▄▄█ █▄▄█ "},

            {"X",
                    " ▄▄   ▄▄  ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█       █ ",
                    " █     █  ",
                    "█   ▄   █ ",
                    "█▄▄█ █▄▄█ "},

            {"Y",
                    " ▄▄   ▄▄  ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█▄     ▄█ ",
                    "  █   █   ",
                    "  █▄▄▄█   "},

            {"Z",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█▄▄▄▄   █ ",
                    " ▄▄▄▄█  █ ",
                    "█ ▄▄▄▄▄▄█ ",
                    "█ █▄▄▄▄▄  ",
                    "█▄▄▄▄▄▄▄█ "},

            {
                    " ",
                    "   ",
                    "   ",
                    "   ",
                    "   ",
                    "   ",
                    "   ",
                    "   "
            }};

    public BlackOutlineFont() {
        super(FONT_CHARS_MATRIX, FONT_CHARS_MATRIX[0].length);
    }
}