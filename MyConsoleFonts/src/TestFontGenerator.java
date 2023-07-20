public class TestFontGenerator {

    private final int A = 0;
    private final String a1 = " ▄▄▄▄▄▄  ";
    private final String a2 = "█      █ ";
    private final String a3 = "█  ▄   █ ";
    private final String a4 = "█ █▄█  █ ";
    private final String a5 = "█      █ ";
    private final String a6 = "█  ▄   █ ";
    private final String a7 = "█▄█ █▄▄█ ";

    private final int B = 1;
    private final String b1 = " ▄▄▄▄▄▄▄  ";
    private final String b2 = "█  ▄    █ ";
    private final String b3 = "█ █▄█   █ ";
    private final String b4 = "█       █ ";
    private final String b5 = "█  ▄   █  ";
    private final String b6 = "█ █▄█   █ ";
    private final String b7 = "█▄▄▄▄▄▄▄█ ";

    private final int C = 2;
    private final String c1 = " ▄▄▄▄▄▄▄  ";
    private final String c2 = "█       █ ";
    private final String c3 = "█       █ ";
    private final String c4 = "█     ▄▄█ ";
    private final String c5 = "█    █    ";
    private final String c6 = "█    █▄▄  ";
    private final String c7 = "█▄▄▄▄▄▄▄█ ";

    private final int D = 3;
    private final String d1 = " ▄▄▄▄▄▄   ";
    private final String d2 = "█      █  ";
    private final String d3 = "█  ▄    █ ";
    private final String d4 = "█ █ █   █ ";
    private final String d5 = "█ █▄█   █ ";
    private final String d6 = "█       █ ";
    private final String d7 = "█▄▄▄▄▄▄█  ";

    private final int E = 4;
    private final String e1 = " ▄▄▄▄▄▄▄  ";
    private final String e2 = "█       █ ";
    private final String e3 = "█    ▄▄▄█ ";
    private final String e4 = "█   █▄▄▄  ";
    private final String e5 = "█    ▄▄▄█ ";
    private final String e6 = "█   █▄▄▄  ";
    private final String e7 = "█▄▄▄▄▄▄▄█ ";

    private final int F = 5;
    private final String f1 = " ▄▄▄▄▄▄▄  ";
    private final String f2 = "█       █ ";
    private final String f3 = "█    ▄▄▄█ ";
    private final String f4 = "█   █▄▄▄  ";
    private final String f5 = "█    ▄▄▄█ ";
    private final String f6 = "█   █     ";
    private final String f7 = "█▄▄▄█     ";

    private final int G = 6;
    private final String g1 = " ▄▄▄▄▄▄▄  ";
    private final String g2 = "█       █ ";
    private final String g3 = "█   ▄▄▄▄█ ";
    private final String g4 = "█  █  ▄▄  ";
    private final String g5 = "█  █ █  █ ";
    private final String g6 = "█  █▄▄█ █ ";
    private final String g7 = "█▄▄▄▄▄▄▄█ ";

    private final int H = 7;
    private final String h1 = " ▄▄   ▄▄  ";
    private final String h2 = "█  █ █  █ ";
    private final String h3 = "█  █▄█  █ ";
    private final String h4 = "█       █ ";
    private final String h5 = "█   ▄   █ ";
    private final String h6 = "█  █ █  █ ";
    private final String h7 = "█▄▄█ █▄▄█ ";

    private final int I = 8;
    private final String i1 = " ▄▄▄  ";
    private final String i2 = "█   █ ";
    private final String i3 = "█   █ ";
    private final String i4 = "█   █ ";
    private final String i5 = "█   █ ";
    private final String i6 = "█   █ ";
    private final String i7 = "█▄▄▄█ ";

    private final int J = 9;
    private final String j1 = "     ▄▄▄  ";
    private final String j2 = "    █   █ ";
    private final String j3 = "    █   █ ";
    private final String j4 = " ▄  █   █ ";
    private final String j5 = "█ █▄█   █ ";
    private final String j6 = "█       █ ";
    private final String j7 = "█▄▄▄▄▄▄▄█ ";

    private final int K = 10;
    private final String k1 = " ▄▄▄   ▄  ";
    private final String k2 = "█   █ █ █ ";
    private final String k3 = "█   █▄█ █ ";
    private final String k4 = "█      ▄█ ";
    private final String k5 = "█     █▄  ";
    private final String k6 = "█    ▄  █ ";
    private final String k7 = "█▄▄▄█ █▄█ ";

    private final int L = 11;
    private final String l1 = " ▄▄▄      ";
    private final String l2 = "█   █     ";
    private final String l3 = "█   █     ";
    private final String l4 = "█   █     ";
    private final String l5 = "█   █▄▄▄  ";
    private final String l6 = "█       █ ";
    private final String l7 = "█▄▄▄▄▄▄▄█ ";

    private final int M = 12;
    private final String m1 = " ▄▄   ▄▄  ";
    private final String m2 = "█  █▄█  █ ";
    private final String m3 = "█       █ ";
    private final String m4 = "█       █ ";
    private final String m5 = "█       █ ";
    private final String m6 = "█ ██▄██ █ ";
    private final String m7 = "█▄█   █▄█ ";

    private final int N = 13;
    private final String n1 = " ▄▄    ▄  ";
    private final String n2 = "█  █  █ █ ";
    private final String n3 = "█   █▄█ █ ";
    private final String n4 = "█       █ ";
    private final String n5 = "█  ▄    █ ";
    private final String n6 = "█ █ █   █ ";
    private final String n7 = "█▄█  █▄▄█ ";

    private final int O = 14;
    private final String o1 = " ▄▄▄▄▄▄▄  ";
    private final String o2 = "█       █ ";
    private final String o3 = "█   ▄   █ ";
    private final String o4 = "█  █ █  █ ";
    private final String o5 = "█  █▄█  █ ";
    private final String o6 = "█       █ ";
    private final String o7 = "█▄▄▄▄▄▄▄█ ";

    private final int P = 15;
    private final String p1 = " ▄▄▄▄▄▄▄  ";
    private final String p2 = "█       █ ";
    private final String p3 = "█    ▄  █ ";
    private final String p4 = "█   █▄█ █ ";
    private final String p5 = "█    ▄▄▄█ ";
    private final String p6 = "█   █     ";
    private final String p7 = "█▄▄▄█     ";

    private final int Q = 16;
    private final String q1 = " ▄▄▄▄▄▄▄  ";
    private final String q2 = "█       █ ";
    private final String q3 = "█   ▄   █ ";
    private final String q4 = "█  █ █  █ ";
    private final String q5 = "█  █▄█  █ ";
    private final String q6 = "█      █  ";
    private final String q7 = "█▄▄▄▄██▄█ ";

    private final int R = 17;
    private final String r1 = " ▄▄▄▄▄▄    ";
    private final String r2 = "█   ▄  █   ";
    private final String r3 = "█  █ █ █   ";
    private final String r4 = "█   █▄▄█▄  ";
    private final String r5 = "█    ▄▄  █ ";
    private final String r6 = "█   █  █ █ ";
    private final String r7 = "█▄▄▄█  █▄█ ";

    private final int S = 18;
    private final String s1 = " ▄▄▄▄▄▄▄  ";
    private final String s2 = "█       █ ";
    private final String s3 = "█  ▄▄▄▄▄█ ";
    private final String s4 = "█ █▄▄▄▄▄  ";
    private final String s5 = "█▄▄▄▄▄  █ ";
    private final String s6 = " ▄▄▄▄▄█ █ ";
    private final String s7 = "█▄▄▄▄▄▄▄█ ";

    private final int T = 19;
    private final String t1 = " ▄▄▄▄▄▄▄  ";
    private final String t2 = "█       █ ";
    private final String t3 = "█▄     ▄█ ";
    private final String t4 = "  █   █   ";
    private final String t5 = "  █   █   ";
    private final String t6 = "  █   █   ";
    private final String t7 = "  █▄▄▄█   ";

    private final int U = 20;
    private final String u1 = " ▄▄   ▄▄  ";
    private final String u2 = "█  █ █  █ ";
    private final String u3 = "█  █ █  █ ";
    private final String u4 = "█  █▄█  █ ";
    private final String u5 = "█       █ ";
    private final String u6 = "█       █ ";
    private final String u7 = "█▄▄▄▄▄▄▄█ ";

    private final int V = 21;
    private final String v1 = " ▄▄   ▄▄  ";
    private final String v2 = "█  █ █  █ ";
    private final String v3 = "█  █▄█  █ ";
    private final String v4 = "█       █ ";
    private final String v5 = "█       █ ";
    private final String v6 = " █     █  ";
    private final String v7 = "  █▄▄▄█   ";

    private final int W = 22;
    private final String w1 = " ▄     ▄  ";
    private final String w2 = "█ █ ▄ █ █ ";
    private final String w3 = "█ ██ ██ █ ";
    private final String w4 = "█       █ ";
    private final String w5 = "█       █ ";
    private final String w6 = "█   ▄   █ ";
    private final String w7 = "█▄▄█ █▄▄█ ";

    private final int X = 23;
    private final String x1 = " ▄▄   ▄▄  ";
    private final String x2 = "█  █▄█  █ ";
    private final String x3 = "█       █ ";
    private final String x4 = "█       █ ";
    private final String x5 = " █     █  ";
    private final String x6 = "█   ▄   █ ";
    private final String x7 = "█▄▄█ █▄▄█ ";

    private final int Y = 24;
    private final String y1 = " ▄▄   ▄▄  ";
    private final String y2 = "█  █ █  █ ";
    private final String y3 = "█  █▄█  █ ";
    private final String y4 = "█       █ ";
    private final String y5 = "█▄     ▄█ ";
    private final String y6 = "  █   █   ";
    private final String y7 = "  █▄▄▄█   ";

    private final int Z = 25;
    private final String z1 = " ▄▄▄▄▄▄▄  ";
    private final String z2 = "█       █ ";
    private final String z3 = "█▄▄▄▄   █ ";
    private final String z4 = " ▄▄▄▄█  █ ";
    private final String z5 = "█ ▄▄▄▄▄▄█ ";
    private final String z6 = "█ █▄▄▄▄▄  ";
    private final String z7 = "█▄▄▄▄▄▄▄█ ";

    private void createFontMatrix() {
        FONT_MATRIX[A][0] = a1;
        FONT_MATRIX[A][1] = a2;
        FONT_MATRIX[A][2] = a3;
        FONT_MATRIX[A][3] = a4;
        FONT_MATRIX[A][4] = a5;
        FONT_MATRIX[A][5] = a6;
        FONT_MATRIX[A][6] = a7;

        FONT_MATRIX[B][0] = b1;
        FONT_MATRIX[B][1] = b2;
        FONT_MATRIX[B][2] = b3;
        FONT_MATRIX[B][3] = b4;
        FONT_MATRIX[B][4] = b5;
        FONT_MATRIX[B][5] = b6;
        FONT_MATRIX[B][6] = b7;

        FONT_MATRIX[C][0] = c1;
        FONT_MATRIX[C][1] = c2;
        FONT_MATRIX[C][2] = c3;
        FONT_MATRIX[C][3] = c4;
        FONT_MATRIX[C][4] = c5;
        FONT_MATRIX[C][5] = c6;
        FONT_MATRIX[C][6] = c7;

        FONT_MATRIX[D][0] = d1;
        FONT_MATRIX[D][1] = d2;
        FONT_MATRIX[D][2] = d3;
        FONT_MATRIX[D][3] = d4;
        FONT_MATRIX[D][4] = d5;
        FONT_MATRIX[D][5] = d6;
        FONT_MATRIX[D][6] = d7;

        FONT_MATRIX[E][0] = e1;
        FONT_MATRIX[E][1] = e2;
        FONT_MATRIX[E][2] = e3;
        FONT_MATRIX[E][3] = e4;
        FONT_MATRIX[E][4] = e5;
        FONT_MATRIX[E][5] = e6;
        FONT_MATRIX[E][6] = e7;

        FONT_MATRIX[F][0] = f1;
        FONT_MATRIX[F][1] = f2;
        FONT_MATRIX[F][2] = f3;
        FONT_MATRIX[F][3] = f4;
        FONT_MATRIX[F][4] = f5;
        FONT_MATRIX[F][5] = f6;
        FONT_MATRIX[F][6] = f7;

        FONT_MATRIX[G][0] = g1;
        FONT_MATRIX[G][1] = g2;
        FONT_MATRIX[G][2] = g3;
        FONT_MATRIX[G][3] = g4;
        FONT_MATRIX[G][4] = g5;
        FONT_MATRIX[G][5] = g6;
        FONT_MATRIX[G][6] = g7;

        FONT_MATRIX[H][0] = h1;
        FONT_MATRIX[H][1] = h2;
        FONT_MATRIX[H][2] = h3;
        FONT_MATRIX[H][3] = h4;
        FONT_MATRIX[H][4] = h5;
        FONT_MATRIX[H][5] = h6;
        FONT_MATRIX[H][6] = h7;

        FONT_MATRIX[I][0] = i1;
        FONT_MATRIX[I][1] = i2;
        FONT_MATRIX[I][2] = i3;
        FONT_MATRIX[I][3] = i4;
        FONT_MATRIX[I][4] = i5;
        FONT_MATRIX[I][5] = i6;
        FONT_MATRIX[I][6] = i7;

        FONT_MATRIX[J][0] = j1;
        FONT_MATRIX[J][1] = j2;
        FONT_MATRIX[J][2] = j3;
        FONT_MATRIX[J][3] = j4;
        FONT_MATRIX[J][4] = j5;
        FONT_MATRIX[J][5] = j6;
        FONT_MATRIX[J][6] = j7;

        FONT_MATRIX[K][0] = k1;
        FONT_MATRIX[K][1] = k2;
        FONT_MATRIX[K][2] = k3;
        FONT_MATRIX[K][3] = k4;
        FONT_MATRIX[K][4] = k5;
        FONT_MATRIX[K][5] = k6;
        FONT_MATRIX[K][6] = k7;

        FONT_MATRIX[L][0] = l1;
        FONT_MATRIX[L][1] = l2;
        FONT_MATRIX[L][2] = l3;
        FONT_MATRIX[L][3] = l4;
        FONT_MATRIX[L][4] = l5;
        FONT_MATRIX[L][5] = l6;
        FONT_MATRIX[L][6] = l7;

        FONT_MATRIX[M][0] = m1;
        FONT_MATRIX[M][1] = m2;
        FONT_MATRIX[M][2] = m3;
        FONT_MATRIX[M][3] = m4;
        FONT_MATRIX[M][4] = m5;
        FONT_MATRIX[M][5] = m6;
        FONT_MATRIX[M][6] = m7;

        FONT_MATRIX[N][0] = n1;
        FONT_MATRIX[N][1] = n2;
        FONT_MATRIX[N][2] = n3;
        FONT_MATRIX[N][3] = n4;
        FONT_MATRIX[N][4] = n5;
        FONT_MATRIX[N][5] = n6;
        FONT_MATRIX[N][6] = n7;

        FONT_MATRIX[O][0] = o1;
        FONT_MATRIX[O][1] = o2;
        FONT_MATRIX[O][2] = o3;
        FONT_MATRIX[O][3] = o4;
        FONT_MATRIX[O][4] = o5;
        FONT_MATRIX[O][5] = o6;
        FONT_MATRIX[O][6] = o7;

        FONT_MATRIX[P][0] = p1;
        FONT_MATRIX[P][1] = p2;
        FONT_MATRIX[P][2] = p3;
        FONT_MATRIX[P][3] = p4;
        FONT_MATRIX[P][4] = p5;
        FONT_MATRIX[P][5] = p6;
        FONT_MATRIX[P][6] = p7;

        FONT_MATRIX[Q][0] = q1;
        FONT_MATRIX[Q][1] = q2;
        FONT_MATRIX[Q][2] = q3;
        FONT_MATRIX[Q][3] = q4;
        FONT_MATRIX[Q][4] = q5;
        FONT_MATRIX[Q][5] = q6;
        FONT_MATRIX[Q][6] = q7;

        FONT_MATRIX[R][0] = r1;
        FONT_MATRIX[R][1] = r2;
        FONT_MATRIX[R][2] = r3;
        FONT_MATRIX[R][3] = r4;
        FONT_MATRIX[R][4] = r5;
        FONT_MATRIX[R][5] = r6;
        FONT_MATRIX[R][6] = r7;

        FONT_MATRIX[S][0] = s1;
        FONT_MATRIX[S][1] = s2;
        FONT_MATRIX[S][2] = s3;
        FONT_MATRIX[S][3] = s4;
        FONT_MATRIX[S][4] = s5;
        FONT_MATRIX[S][5] = s6;
        FONT_MATRIX[S][6] = s7;

        FONT_MATRIX[T][0] = t1;
        FONT_MATRIX[T][1] = t2;
        FONT_MATRIX[T][2] = t3;
        FONT_MATRIX[T][3] = t4;
        FONT_MATRIX[T][4] = t5;
        FONT_MATRIX[T][5] = t6;
        FONT_MATRIX[T][6] = t7;

        FONT_MATRIX[U][0] = u1;
        FONT_MATRIX[U][1] = u2;
        FONT_MATRIX[U][2] = u3;
        FONT_MATRIX[U][3] = u4;
        FONT_MATRIX[U][4] = u5;
        FONT_MATRIX[U][5] = u6;
        FONT_MATRIX[U][6] = u7;

        FONT_MATRIX[V][0] = v1;
        FONT_MATRIX[V][1] = v2;
        FONT_MATRIX[V][2] = v3;
        FONT_MATRIX[V][3] = v4;
        FONT_MATRIX[V][4] = v5;
        FONT_MATRIX[V][5] = v6;
        FONT_MATRIX[V][6] = v7;

        FONT_MATRIX[W][0] = w1;
        FONT_MATRIX[W][1] = w2;
        FONT_MATRIX[W][2] = w3;
        FONT_MATRIX[W][3] = w4;
        FONT_MATRIX[W][4] = w5;
        FONT_MATRIX[W][5] = w6;
        FONT_MATRIX[W][6] = w7;

        FONT_MATRIX[X][0] = x1;
        FONT_MATRIX[X][1] = x2;
        FONT_MATRIX[X][2] = x3;
        FONT_MATRIX[X][3] = x4;
        FONT_MATRIX[X][4] = x5;
        FONT_MATRIX[X][5] = x6;
        FONT_MATRIX[X][6] = x7;

        FONT_MATRIX[Y][0] = y1;
        FONT_MATRIX[Y][1] = y2;
        FONT_MATRIX[Y][2] = y3;
        FONT_MATRIX[Y][3] = y4;
        FONT_MATRIX[Y][4] = y5;
        FONT_MATRIX[Y][5] = y6;
        FONT_MATRIX[Y][6] = y7;

        FONT_MATRIX[Z][0] = z1;
        FONT_MATRIX[Z][1] = z2;
        FONT_MATRIX[Z][2] = z3;
        FONT_MATRIX[Z][3] = z4;
        FONT_MATRIX[Z][4] = z5;
        FONT_MATRIX[Z][5] = z6;
        FONT_MATRIX[Z][6] = z7;
    }

    private final int AMOUNT_OF_LETTERS = 26;
    private final int AMOUNT_OF_ROWS = 7;
    private final String[][] FONT_MATRIX = new String[AMOUNT_OF_LETTERS][AMOUNT_OF_ROWS];

    public TestFontGenerator() {
        createFontMatrix();
    }

    public String convert(String requestedString) {
        String result = "";
        for (int rowNumber = 0; rowNumber < AMOUNT_OF_ROWS; rowNumber++) {
            for (char stringCharacter : requestedString.toUpperCase().toCharArray()) {
                result += appendFragment(stringCharacter, rowNumber);
            }
            result += "\n";
        }
        return result;
    }

    private String appendFragment(char c, int rowNumber) {
        String requestedFragment = switch (c) {
            case 'A' -> FONT_MATRIX[A][rowNumber];
            case 'B' -> FONT_MATRIX[B][rowNumber];
            case 'C' -> FONT_MATRIX[C][rowNumber];
            case 'D' -> FONT_MATRIX[D][rowNumber];
            case 'E' -> FONT_MATRIX[E][rowNumber];
            case 'F' -> FONT_MATRIX[F][rowNumber];
            case 'G' -> FONT_MATRIX[G][rowNumber];
            case 'H' -> FONT_MATRIX[H][rowNumber];
            case 'I' -> FONT_MATRIX[I][rowNumber];
            case 'J' -> FONT_MATRIX[J][rowNumber];
            case 'K' -> FONT_MATRIX[K][rowNumber];
            case 'L' -> FONT_MATRIX[L][rowNumber];
            case 'M' -> FONT_MATRIX[M][rowNumber];
            case 'N' -> FONT_MATRIX[N][rowNumber];
            case 'O' -> FONT_MATRIX[O][rowNumber];
            case 'P' -> FONT_MATRIX[P][rowNumber];
            case 'Q' -> FONT_MATRIX[Q][rowNumber];
            case 'R' -> FONT_MATRIX[R][rowNumber];
            case 'S' -> FONT_MATRIX[S][rowNumber];
            case 'T' -> FONT_MATRIX[T][rowNumber];
            case 'U' -> FONT_MATRIX[U][rowNumber];
            case 'V' -> FONT_MATRIX[V][rowNumber];
            case 'W' -> FONT_MATRIX[W][rowNumber];
            case 'X' -> FONT_MATRIX[X][rowNumber];
            case 'Y' -> FONT_MATRIX[Y][rowNumber];
            case 'Z' -> FONT_MATRIX[Z][rowNumber];
            default -> " ";
        };
        return requestedFragment;
    }
}
