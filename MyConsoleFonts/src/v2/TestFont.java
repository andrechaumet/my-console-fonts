package v2;

import java.util.Map;

public final class TestFont extends Font {

    //Map<Character, String[]> charactersMap2 = Map.of('A', A_LETTER_ROWS);

    private static final String[] A_LETTER_ROWS = new String[]{
            "A",
            " ▄▄▄▄▄▄  ",
            "█      █ ",
            "█  ▄   █ ",
            "█ █▄█  █ ",
            "█      █ ",
            "█  ▄   █ ",
            "█▄█ █▄▄█ "};

    private static final String[] B_LETTER_ROWS = new String[]{
            "B",
            " ▄▄▄▄▄▄▄  ",
            "█  ▄    █ ",
            "█ █▄█   █ ",
            "█       █ ",
            "█  ▄   █  ",
            "█ █▄█   █ ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] C_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█       █ ",
            "█     ▄▄█ ",
            "█    █    ",
            "█    █▄▄  ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] D_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄   ",
            "█      █  ",
            "█  ▄    █ ",
            "█ █ █   █ ",
            "█ █▄█   █ ",
            "█       █ ",
            "█▄▄▄▄▄▄█  "};

    private static final String[] E_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█    ▄▄▄█ ",
            "█   █▄▄▄  ",
            "█    ▄▄▄█ ",
            "█   █▄▄▄  ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] F_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█    ▄▄▄█ ",
            "█   █▄▄▄  ",
            "█    ▄▄▄█ ",
            "█   █     ",
            "█▄▄▄█     "};

    private static final String[] G_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█   ▄▄▄▄█ ",
            "█  █  ▄▄  ",
            "█  █ █  █ ",
            "█  █▄▄█ █ ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] H_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█   ▄   █ ",
            "█  █ █  █ ",
            "█▄▄█ █▄▄█ "};

    private static final String[] I_LETTER_ROWS = new String[]{
            " ▄▄▄  ",
            "█   █ ",
            "█   █ ",
            "█   █ ",
            "█   █ ",
            "█   █ ",
            "█▄▄▄█ "};

    private static final String[] J_LETTER_ROWS = new String[]{
            "     ▄▄▄  ",
            "    █   █ ",
            "    █   █ ",
            " ▄  █   █ ",
            "█ █▄█   █ ",
            "█       █ ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] K_LETTER_ROWS = new String[]{
            " ▄▄▄   ▄  ",
            "█   █ █ █ ",
            "█   █▄█ █ ",
            "█      ▄█ ",
            "█     █▄  ",
            "█    ▄  █ ",
            "█▄▄▄█ █▄█ "};

    private static final String[] L_LETTER_ROWS = new String[]{
            " ▄▄▄      ",
            "█   █     ",
            "█   █     ",
            "█   █     ",
            "█   █▄▄▄  ",
            "█       █ ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] M_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █▄█  █ ",
            "█       █ ",
            "█       █ ",
            "█       █ ",
            "█ ██▄██ █ ",
            "█▄█   █▄█ "};

    private static final String[] N_LETTER_ROWS = new String[]{
            " ▄▄    ▄  ",
            "█  █  █ █ ",
            "█   █▄█ █ ",
            "█       █ ",
            "█  ▄    █ ",
            "█ █ █   █ ",
            "█▄█  █▄▄█ "};

    private static final String[] O_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█   ▄   █ ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] P_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█    ▄  █ ",
            "█   █▄█ █ ",
            "█    ▄▄▄█ ",
            "█   █     ",
            "█▄▄▄█     "};

    private static final String[] Q_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█   ▄   █ ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█      █  ",
            "█▄▄▄▄██▄█ "};

    private static final String[] R_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄    ",
            "█   ▄  █   ",
            "█  █ █ █   ",
            "█   █▄▄█▄  ",
            "█    ▄▄  █ ",
            "█   █  █ █ ",
            "█▄▄▄█  █▄█ "};

    private static final String[] S_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█  ▄▄▄▄▄█ ",
            "█ █▄▄▄▄▄  ",
            "█▄▄▄▄▄  █ ",
            " ▄▄▄▄▄█ █ ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] T_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█▄     ▄█ ",
            "  █   █   ",
            "  █   █   ",
            "  █   █   ",
            "  █▄▄▄█   "};

    private static final String[] U_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █ █  █ ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█       █ ",
            "█▄▄▄▄▄▄▄█ "};

    private static final String[] V_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█       █ ",
            " █     █  ",
            "  █▄▄▄█   "};

    private static final String[] W_LETTER_ROWS = new String[]{
            " ▄     ▄  ",
            "█ █ ▄ █ █ ",
            "█ ██ ██ █ ",
            "█       █ ",
            "█       █ ",
            "█   ▄   █ ",
            "█▄▄█ █▄▄█ "};

    private static final String[] X_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █▄█  █ ",
            "█       █ ",
            "█       █ ",
            " █     █  ",
            "█   ▄   █ ",
            "█▄▄█ █▄▄█ "};

    private static final String[] Y_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█▄     ▄█ ",
            "  █   █   ",
            "  █▄▄▄█   "};

    private static final String[] Z = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█▄▄▄▄   █ ",
            " ▄▄▄▄█  █ ",
            "█ ▄▄▄▄▄▄█ ",
            "█ █▄▄▄▄▄  ",
            "█▄▄▄▄▄▄▄█ "};

    private Map<Character, String[]> charactersMap;
    private final int AMOUNT_OF_CHARS = 26;
    private final int AMOUNT_OF_ROWS = 7;

    public TestFont() {
        Z.getClass().getFields();
        charactersMap.put('A', A_LETTER_ROWS);
        charactersMap.put('B', B_LETTER_ROWS);
        charactersMap.put('C', C_LETTER_ROWS);
        charactersMap.put('D', D_LETTER_ROWS);
        charactersMap.put('E', E_LETTER_ROWS);
        charactersMap.put('F', F_LETTER_ROWS);
        charactersMap.put('G', G_LETTER_ROWS);
        charactersMap.put('H', H_LETTER_ROWS);
        charactersMap.put('I', I_LETTER_ROWS);
        charactersMap.put('J', J_LETTER_ROWS);
        charactersMap.put('K', K_LETTER_ROWS);
        charactersMap.put('L', L_LETTER_ROWS);
        charactersMap.put('M', M_LETTER_ROWS);
        charactersMap.put('N', N_LETTER_ROWS);
        charactersMap.put('O', O_LETTER_ROWS);
        charactersMap.put('P', P_LETTER_ROWS);
        charactersMap.put('Q', Q_LETTER_ROWS);
        charactersMap.put('R', R_LETTER_ROWS);
        charactersMap.put('S', S_LETTER_ROWS);
        charactersMap.put('T', T_LETTER_ROWS);
        charactersMap.put('U', U_LETTER_ROWS);
        charactersMap.put('V', V_LETTER_ROWS);
        charactersMap.put('W', W_LETTER_ROWS);
        charactersMap.put('X', X_LETTER_ROWS);
        charactersMap.put('Y', Y_LETTER_ROWS);
        charactersMap.put('Z', Z);
    }

    @Override
    public String getCharRowFragment(char characterKey, int rowNumber) {
        return charactersMap.get(characterKey)[rowNumber];
    }

    /*@Override
    public int getAmountOfChars() {
        return AMOUNT_OF_CHARS;
    }

    @Override
    public int getAmountOfRows() {
        return AMOUNT_OF_ROWS;
    }*/
}
