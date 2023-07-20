package v2;

import java.util.HashMap;

public class TestFont extends Font {

    private final String[] A_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄  ",
            "█      █ ",
            "█  ▄   █ ",
            "█ █▄█  █ ",
            "█      █ ",
            "█  ▄   █ ",
            "█▄█ █▄▄█ "};

    private final String[] B_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█  ▄    █ ",
            "█ █▄█   █ ",
            "█       █ ",
            "█  ▄   █  ",
            "█ █▄█   █ ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] C_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█       █ ",
            "█     ▄▄█ ",
            "█    █    ",
            "█    █▄▄  ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] D_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄   ",
            "█      █  ",
            "█  ▄    █ ",
            "█ █ █   █ ",
            "█ █▄█   █ ",
            "█       █ ",
            "█▄▄▄▄▄▄█  "};

    private final String[] E_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█    ▄▄▄█ ",
            "█   █▄▄▄  ",
            "█    ▄▄▄█ ",
            "█   █▄▄▄  ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] F_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█    ▄▄▄█ ",
            "█   █▄▄▄  ",
            "█    ▄▄▄█ ",
            "█   █     ",
            "█▄▄▄█     "};

    private final String[] G_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█   ▄▄▄▄█ ",
            "█  █  ▄▄  ",
            "█  █ █  █ ",
            "█  █▄▄█ █ ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] H_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█   ▄   █ ",
            "█  █ █  █ ",
            "█▄▄█ █▄▄█ "};

    private final String[] I_LETTER_ROWS = new String[]{
            " ▄▄▄  ",
            "█   █ ",
            "█   █ ",
            "█   █ ",
            "█   █ ",
            "█   █ ",
            "█▄▄▄█ "};

    private final String[] J_LETTER_ROWS = new String[]{
            "     ▄▄▄  ",
            "    █   █ ",
            "    █   █ ",
            " ▄  █   █ ",
            "█ █▄█   █ ",
            "█       █ ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] K_LETTER_ROWS = new String[]{
            " ▄▄▄   ▄  ",
            "█   █ █ █ ",
            "█   █▄█ █ ",
            "█      ▄█ ",
            "█     █▄  ",
            "█    ▄  █ ",
            "█▄▄▄█ █▄█ "};

    private final String[] L_LETTER_ROWS = new String[]{
            " ▄▄▄      ",
            "█   █     ",
            "█   █     ",
            "█   █     ",
            "█   █▄▄▄  ",
            "█       █ ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] M_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █▄█  █ ",
            "█       █ ",
            "█       █ ",
            "█       █ ",
            "█ ██▄██ █ ",
            "█▄█   █▄█ "};

    private final String[] N_LETTER_ROWS = new String[]{
            " ▄▄    ▄  ",
            "█  █  █ █ ",
            "█   █▄█ █ ",
            "█       █ ",
            "█  ▄    █ ",
            "█ █ █   █ ",
            "█▄█  █▄▄█ "};

    private final String[] O_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█   ▄   █ ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] P_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█    ▄  █ ",
            "█   █▄█ █ ",
            "█    ▄▄▄█ ",
            "█   █     ",
            "█▄▄▄█     "};

    private final String[] Q_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█   ▄   █ ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█      █  ",
            "█▄▄▄▄██▄█ "};

    private final String[] R_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄    ",
            "█   ▄  █   ",
            "█  █ █ █   ",
            "█   █▄▄█▄  ",
            "█    ▄▄  █ ",
            "█   █  █ █ ",
            "█▄▄▄█  █▄█ "};

    private final String[] S_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█  ▄▄▄▄▄█ ",
            "█ █▄▄▄▄▄  ",
            "█▄▄▄▄▄  █ ",
            " ▄▄▄▄▄█ █ ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] T_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█▄     ▄█ ",
            "  █   █   ",
            "  █   █   ",
            "  █   █   ",
            "  █▄▄▄█   "};

    private final String[] U_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █ █  █ ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█       █ ",
            "█▄▄▄▄▄▄▄█ "};

    private final String[] V_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█       █ ",
            " █     █  ",
            "  █▄▄▄█   "};

    private final String[] W_LETTER_ROWS = new String[]{
            " ▄     ▄  ",
            "█ █ ▄ █ █ ",
            "█ ██ ██ █ ",
            "█       █ ",
            "█       █ ",
            "█   ▄   █ ",
            "█▄▄█ █▄▄█ "};

    private final String[] X_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █▄█  █ ",
            "█       █ ",
            "█       █ ",
            " █     █  ",
            "█   ▄   █ ",
            "█▄▄█ █▄▄█ "};

    private final String[] Y_LETTER_ROWS = new String[]{
            " ▄▄   ▄▄  ",
            "█  █ █  █ ",
            "█  █▄█  █ ",
            "█       █ ",
            "█▄     ▄█ ",
            "  █   █   ",
            "  █▄▄▄█   "};

    private final String[] Z_LETTER_ROWS = new String[]{
            " ▄▄▄▄▄▄▄  ",
            "█       █ ",
            "█▄▄▄▄   █ ",
            " ▄▄▄▄█  █ ",
            "█ ▄▄▄▄▄▄█ ",
            "█ █▄▄▄▄▄  ",
            "█▄▄▄▄▄▄▄█ "};

    public TestFont(int amountOfRows) {
        super(amountOfRows);
    }

    //TODO: force by constructor to choose and implement only and only one row length for all letters/chars
    private void createFontMap() {
        super.charactersMap = new HashMap<>();
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
        charactersMap.put('Z', Z_LETTER_ROWS);
    }
}
