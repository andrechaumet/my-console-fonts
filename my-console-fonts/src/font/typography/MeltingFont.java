package font.typography;

import font.Font;

public class MeltingFont extends Font {

    private static final String[][] FONT_CHARS_MATRIX = new String[][]{
            {"A",
                    " ▒████▄   ",
                    "▒██  ▀█▄  ",
                    "░██▄▄▄▄██ ",
                    "▒▓█   ▓██ ",
                    "░▒▒   ▓▒█ ",
                    "░ ░   ▒▒  ",
                    "░    ▒▒   ",
                    "      ░   "},

            {"B",
                    "▓█████▄  ",
                    "▒██▒ ▄██ ",
                    "▒██░█▀   ",
                    "░▓█  ▀█▓ ",
                    "░▒▓███▀▒ ",
                    "▒░▒   ░  ",
                    " ░       ",
                    " ░       "},

            {"C",
                    "  ▄████▄  ",
                    " ▒██▀ ▀█  ",
                    " ▒▓█    ▄ ",
                    "▒▒▓▓▄ ▄██ ",
                    " ░▒ ▓███▀ ",
                    "░░ ░▒ ▒   ",
                    "   ░  ▒   ",
                    "	  ░	   "},

            {"D",
                    "▓█████▄  ",
                    "▒██▀ ██▌ ",
                    "░██   █▌ ",
                    "░▓█▄   ▌ ",
                    "░▒████▓  ",
                    " ▒▒▓  ▒  ",
                    " ░ ▒  ▒  ",
                    "   ░     "},

            {"E",
                    "▓█████  ",
                    "▓█   ▀  ",
                    "▒███    ",
                    "▒▓█  ▄  ",
                    "▒░▒████ ",
                    "░░░ ▒░  ",
                    "░ ░ ░   ",
                    "░   ░   "},

            {"F",
                    "▒ ████▒ ",
                    "▒▓██    ",
                    "░▒████  ",
                    " ░░▓█▒  ",
                    "  ░▒█░  ",
                    "   ▒ ░  ",
                    "   ░    ",
                    "   ░ ░  "},

            {"G",
                    " ▄████  ",
                    " ██▒ ▀█ ",
                    "▒██░▄▄▄ ",
                    "░▓█  ██ ",
                    "▒▓███▀▒ ",
                    "░▒   ▒  ",
                    " ░   ░  ",
                    "     ░  "},

            {"H",
                    "▄██  ▄██  ",
                    "▒▓██░ ██  ",
                    "░▒██▀▀██  ",
                    " ░▓█ ░██  ",
                    " ░▓█▒░██▓ ",
                    "  ▒ ░░▒░▒ ",
                    "  ▒ ░▒░ ░ ",
                    "  ░  ░  ░ "},

            {"I",
                    "██▓   ",
                    "▒▓██▒ ",
                    "▒▒██▒ ",
                    "░░██░ ",
                    "░░██░ ",
                    " ░▓   ",
                    "░ ▒ ░ ",
                    "  ░   "},

            {"J",
                    " ▄▄▄██▀ ",
                    "   ▒██  ",
                    "   ░██  ",
                    "▓██▄██▓ ",
                    " ▓███▒  ",
                    "▒▓▒▒░   ",
                    "░ ░ ░   ",
                    "░   ░   "},

            {"K",
                    " ██ ▄█▀ ",
                    " ██▄█▒  ",
                    "▓███▄░  ",
                    "▓██ █▄  ",
                    "▒██▒ █▄ ",
                    "▒ ▒▒ ▓▒ ",
                    "░ ░▒ ▒░ ",
                    "░ ░░ ░  "},

            {"L",
                    "██▓      ",
                    "▓██▒     ",
                    "▒██░     ",
                    "▒██░     ",
                    "▒██░     ",
                    "▒░██████ ",
                    "░░ ▒░▓   ",
                    "  ░ ░    "},

            {"M",
                    " ███▄▄███▓  ",
                    "▓██▒▀█▀ ██▒ ",
                    "▓██    ▓██░ ",
                    "▒██    ▒██  ",
                    "▒██▒   ░██▒ ",
                    " ░ ▒░   ░  ░",
                    "░  ░      ░ ",
                    " ░          "},

            {"N",
                    " ███▄    █  ",
                    " ██ ▀█   █  ",
                    "▓██  ▀█ ██▒ ",
                    "▓██▒  ▐▌██▒ ",
                    "▒██░   ▓██░ ",
                    "░ ▒░   ▒ ▒  ",
                    "   ░   ░ ░  ",
                    "         ░  "},

            {"O",
                    "▒█████    ",
                    "▒██▒  ██▒ ",
                    "▒██░  ██▒ ",
                    "▒██   ██░ ",
                    "░ ████▓▒░ ",
                    "  ▒░▒░▒░  ",
                    "░ ░ ░ ▒   ",
                    "    ░ ░   "},

            {"P",
                    "██▓███    ",
                    "▓██░  ██  ",
                    "▓██░ ██▓▒ ",
                    "▒██▄█▓▒ ▒ ",
                    "▒██▒ ░  ░ ",
                    "▒▓▒░ ░  ░ ",
                    "░▒ ░      ",
                    "░░        "},

            {"Q",
                    "█████     ",
                    "▒██▓  ██▒ ",
                    "▒██▒  ██░ ",
                    "░██  █▀ ░ ",
                    "░▒███▒█▄  ",
                    "░░ ▒▒░ ▒  ",
                    " ░ ▒░  ░  ",
                    "   ░   ░  "},

            {"R",
                    " ██▀███   ",
                    "▓██ ▒ ██▒ ",
                    "▓██ ░▄█ ▒ ",
                    "▒██▀▀█▄   ",
                    "░██▓ ▒██▒ ",
                    "░ ▒▓ ░▒▓░ ",
                    "  ░▒ ░ ▒  ",
                    "   ░      "},

            {"S",
                    "██████    ",
                    "▒██    ▒  ",
                    "░ ▓██▄    ",
                    "  ▒   ██▒ ",
                    "▒██████▒▒ ",
                    "▒ ▒▓▒ ▒ ░ ",
                    "░ ░▒  ░ ░ ",
                    "   ░      "},

            {"T",
                    "▄▄▄█████▓",
                    "▓  ██▒ ▓▒",
                    "▒ ▓██░ ▒░",
                    "░ ▓██▓ ░ ",
                    "  ▒██▒ ░ ",
                    "  ▒ ░░   ",
                    "    ░    ",
                    "   ░     "},

            {"U",
                    " █    ██  ",
                    " ██  ▓██▒ ",
                    "▓██  ▒██░ ",
                    "▓▓█  ░██░ ",
                    "▒▒█████▓  ",
                    "░▒▓▒ ▒ ▒  ",
                    " ░░░ ░ ░  ",
                    "   ░      "},

            {"V",
                    "██▒   █▓  ",
                    "▓██░   █▒ ",
                    " ▓██  █▒░ ",
                    "  ▒██ █░░ ",
                    "   ▒▀█░   ",
                    "   ░ ▐░   ",
                    "   ░ ░░   ",
                    "      ░   "},

            {"W",
                    " █     █░ ",
                    "▓█░ █ ░█░ ",
                    "▒█░ █ ░█  ",
                    "░█░ █ ░█  ",
                    "░░██▒██▓  ",
                    "░ ▓░▒ ▒   ",
                    "  ▒   ░   ",
                    "   ░      "},

            {"X",
                    "▒██   ██▒ ",
                    "▒▒ █ █ ▒░ ",
                    "░░  █   ░ ",
                    " ░ █ █ ▒  ",
                    "▒██▒ ▒██▒ ",
                    "▒▒ ░ ░▓ ░ ",
                    "░░   ░▒ ░ ",
                    " ░    ░   "},

            {"Y",
                    "▓██   ██▓ ",
                    " ▒██  ██▒ ",
                    "  ▒██ ██░ ",
                    "  ░ ▐██▓░ ",
                    "  ░ ██▒▓░ ",
                    "   ██▒▒▒  ",
                    " ▓██ ░▒░  ",
                    " ▒ ▒ ░░   "},

            {"Z",
                    "▒███████▒ ",
                    "▒ ▒ ▒ ▄▀░ ",
                    "░ ▒ ▄▀▒░  ",
                    "  ▄▀▒   ░ ",
                    "▒███████▒ ",
                    "░▒▒ ▓░▒░▒ ",
                    " ░▒ ▒ ░ ▒ ",
                    "  ░ ░     "},

            {
                    " ",
                    "   ",
                    "   ",
                    "   ",
                    "   ",
                    "   ",
                    "   ",
                    "   ",
                    "   "
            }};

    public MeltingFont() {
        super(false, FONT_CHARS_MATRIX);
    }
}