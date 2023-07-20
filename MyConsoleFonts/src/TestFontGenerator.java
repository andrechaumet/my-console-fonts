import java.util.HashMap;
import java.util.Map;

public class TestFontGenerator {

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

    Map<Character, String[]> lettersMap;
    //TODO: force by constructor to choose and implement only and only one row amount for all letters/chars
    private void createFontMatrixMap() {
        lettersMap = new HashMap<>();
        lettersMap.put('A', A_LETTER_ROWS);
        lettersMap.put('B', B_LETTER_ROWS);
        lettersMap.put('C', C_LETTER_ROWS);
        lettersMap.put('D', D_LETTER_ROWS);
        lettersMap.put('E', E_LETTER_ROWS);
        lettersMap.put('F', F_LETTER_ROWS);
        lettersMap.put('G', G_LETTER_ROWS);
        lettersMap.put('H', H_LETTER_ROWS);
        lettersMap.put('I', I_LETTER_ROWS);
        lettersMap.put('J', J_LETTER_ROWS);
        lettersMap.put('K', K_LETTER_ROWS);
        lettersMap.put('L', L_LETTER_ROWS);
        lettersMap.put('M', M_LETTER_ROWS);
        lettersMap.put('N', N_LETTER_ROWS);
        lettersMap.put('O', O_LETTER_ROWS);
        lettersMap.put('P', P_LETTER_ROWS);
        lettersMap.put('Q', Q_LETTER_ROWS);
        lettersMap.put('R', R_LETTER_ROWS);
        lettersMap.put('S', S_LETTER_ROWS);
        lettersMap.put('T', T_LETTER_ROWS);
        lettersMap.put('U', U_LETTER_ROWS);
        lettersMap.put('V', V_LETTER_ROWS);
        lettersMap.put('W', W_LETTER_ROWS);
        lettersMap.put('X', X_LETTER_ROWS);
        lettersMap.put('Y', Y_LETTER_ROWS);
        lettersMap.put('Z', Z_LETTER_ROWS);
    }
}
