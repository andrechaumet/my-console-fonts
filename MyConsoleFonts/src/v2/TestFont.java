package v2;

import java.util.HashMap;
import java.util.Map;

public final class TestFont extends Font {

    //Map<Character, String[]> charactersMap2 = Map.of('A', A_LETTER_ROWS);


    //private static final String[] A_LETTER_ROWS = new String[]{
    //private static final String[][] A_LETTER_ROWS = new String[][]{{"asd", "asda"}};
    private static final String[][] FONT_CHARS_MATRIX = new String[][]{
            {"A",
                    " ▄▄▄▄▄▄  ",
                    "█      █ ",
                    "█  ▄   █ ",
                    "█ █▄█  █ ",
                    "█      █ ",
                    "█  ▄   █ ",
                    "█▄█ █▄▄█ "},

            //private static final String[] B_LETTER_ROWS = new String[]{
            {"B",
                    " ▄▄▄▄▄▄▄  ",
                    "█  ▄    █ ",
                    "█ █▄█   █ ",
                    "█       █ ",
                    "█  ▄   █  ",
                    "█ █▄█   █ ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] C_LETTER_ROWS = new String[]{
            {"C",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█       █ ",
                    "█     ▄▄█ ",
                    "█    █    ",
                    "█    █▄▄  ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] D_LETTER_ROWS = new String[]{
            {"D",
                    " ▄▄▄▄▄▄   ",
                    "█      █  ",
                    "█  ▄    █ ",
                    "█ █ █   █ ",
                    "█ █▄█   █ ",
                    "█       █ ",
                    "█▄▄▄▄▄▄█  "},

            //private static final String[] E_LETTER_ROWS = new String[]{
            {"E",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█    ▄▄▄█ ",
                    "█   █▄▄▄  ",
                    "█    ▄▄▄█ ",
                    "█   █▄▄▄  ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] F_LETTER_ROWS = new String[]{
            {"F",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█    ▄▄▄█ ",
                    "█   █▄▄▄  ",
                    "█    ▄▄▄█ ",
                    "█   █     ",
                    "█▄▄▄█     "},

            //private static final String[] G_LETTER_ROWS = new String[]{
            {"G",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█   ▄▄▄▄█ ",
                    "█  █  ▄▄  ",
                    "█  █ █  █ ",
                    "█  █▄▄█ █ ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] H_LETTER_ROWS = new String[]{
            {"H",
                    " ▄▄   ▄▄  ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█   ▄   █ ",
                    "█  █ █  █ ",
                    "█▄▄█ █▄▄█ "},

            //private static final String[] I_LETTER_ROWS = new String[]{
            {"I",
                    " ▄▄▄  ",
                    "█   █ ",
                    "█   █ ",
                    "█   █ ",
                    "█   █ ",
                    "█   █ ",
                    "█▄▄▄█ "},

            //private static final String[] J_LETTER_ROWS = new String[]{
            {"J",
                    "     ▄▄▄  ",
                    "    █   █ ",
                    "    █   █ ",
                    " ▄  █   █ ",
                    "█ █▄█   █ ",
                    "█       █ ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] K_LETTER_ROWS = new String[]{
            {"K",
                    " ▄▄▄   ▄  ",
                    "█   █ █ █ ",
                    "█   █▄█ █ ",
                    "█      ▄█ ",
                    "█     █▄  ",
                    "█    ▄  █ ",
                    "█▄▄▄█ █▄█ "},

            //private static final String[] L_LETTER_ROWS = new String[]{
            {"L",
                    " ▄▄▄      ",
                    "█   █     ",
                    "█   █     ",
                    "█   █     ",
                    "█   █▄▄▄  ",
                    "█       █ ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] M_LETTER_ROWS = new String[]{
            {"M",
                    " ▄▄   ▄▄  ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█       █ ",
                    "█       █ ",
                    "█ ██▄██ █ ",
                    "█▄█   █▄█ "},

            //private static final String[] N_LETTER_ROWS = new String[]{
            {"N",
                    " ▄▄    ▄  ",
                    "█  █  █ █ ",
                    "█   █▄█ █ ",
                    "█       █ ",
                    "█  ▄    █ ",
                    "█ █ █   █ ",
                    "█▄█  █▄▄█ "},

            //private static final String[] O_LETTER_ROWS = new String[]{
            {"O",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█   ▄   █ ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] P_LETTER_ROWS = new String[]{
            {"P",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█    ▄  █ ",
                    "█   █▄█ █ ",
                    "█    ▄▄▄█ ",
                    "█   █     ",
                    "█▄▄▄█     "},

            //private static final String[] Q_LETTER_ROWS = new String[]{
            {"Q",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█   ▄   █ ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█      █  ",
                    "█▄▄▄▄██▄█ "},

            //private static final String[] R_LETTER_ROWS = new String[]{
            {"R",
                    " ▄▄▄▄▄▄    ",
                    "█   ▄  █   ",
                    "█  █ █ █   ",
                    "█   █▄▄█▄  ",
                    "█    ▄▄  █ ",
                    "█   █  █ █ ",
                    "█▄▄▄█  █▄█ "},

            //private static final String[] S_LETTER_ROWS = new String[]{
            {"S",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█  ▄▄▄▄▄█ ",
                    "█ █▄▄▄▄▄  ",
                    "█▄▄▄▄▄  █ ",
                    " ▄▄▄▄▄█ █ ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] T_LETTER_ROWS = new String[]{
            {"T",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█▄     ▄█ ",
                    "  █   █   ",
                    "  █   █   ",
                    "  █   █   ",
                    "  █▄▄▄█   "},

            //private static final String[] U_LETTER_ROWS = new String[]{
            {"U",
                    " ▄▄   ▄▄  ",
                    "█  █ █  █ ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█       █ ",
                    "█▄▄▄▄▄▄▄█ "},

            //private static final String[] V_LETTER_ROWS = new String[]{
            {"V",
                    " ▄▄   ▄▄  ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█       █ ",
                    " █     █  ",
                    "  █▄▄▄█   "},

            //private static final String[] W_LETTER_ROWS = new String[]{
            {"W",
                    " ▄     ▄  ",
                    "█ █ ▄ █ █ ",
                    "█ ██ ██ █ ",
                    "█       █ ",
                    "█       █ ",
                    "█   ▄   █ ",
                    "█▄▄█ █▄▄█ "},

            //private static final String[] X_LETTER_ROWS = new String[]{
            {"X",
                    " ▄▄   ▄▄  ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█       █ ",
                    " █     █  ",
                    "█   ▄   █ ",
                    "█▄▄█ █▄▄█ "},

            //private static final String[] Y_LETTER_ROWS = new String[]{
            {"Y",
                    " ▄▄   ▄▄  ",
                    "█  █ █  █ ",
                    "█  █▄█  █ ",
                    "█       █ ",
                    "█▄     ▄█ ",
                    "  █   █   ",
                    "  █▄▄▄█   "},

            //private static final String[] Z = new String[]{
            {"Z",
                    " ▄▄▄▄▄▄▄  ",
                    "█       █ ",
                    "█▄▄▄▄   █ ",
                    " ▄▄▄▄█  █ ",
                    "█ ▄▄▄▄▄▄█ ",
                    "█ █▄▄▄▄▄  ",
                    "█▄▄▄▄▄▄▄█ "}};

    public TestFont() {
        this.generateFontMap(FONT_CHARS_MATRIX, );
    /*    int AMOUNT_OF_ROWS = 7;
        charactersMap = new HashMap<>(AMOUNT_OF_ROWS);
        for (String[] fontCharsMatrix : FONT_CHARS_MATRIX) {
            Character charKey = fontCharsMatrix[0].charAt(0);
            String[] stringValues = new String[AMOUNT_OF_ROWS];
            for (int currentCharRow = 1; currentCharRow < stringValues.length; currentCharRow++) {
                stringValues[currentCharRow] = fontCharsMatrix[currentCharRow];
            }
            charactersMap.put(charKey, stringValues);
        }*/
    }

    /*@Override
    public String getCharRowFragment(char characterKey, int rowNumber) {
        return charactersMap.get(characterKey)[rowNumber];
    }*/

    /*@Override
    public int getAmountOfChars() {
        return AMOUNT_OF_CHARS;
    }

    @Override
    public int getAmountOfRows() {
        return AMOUNT_OF_ROWS;
    }*/
}
