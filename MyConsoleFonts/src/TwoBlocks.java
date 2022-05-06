
public class TwoBlocks {
	
	private final  String a1 = "▄▀▄ ";
	private final  String a2 = "█▀█ ";
	
	private final  String b1 = "██▄ ";
	private final  String b2 = "█▄█ ";
	
	private final  String c1 = "▄▀▀ ";
	private final  String c2 = "▀▄▄ ";
	
	private final  String d1 = "█▀▄ ";
	private final  String d2 = "█▄▀ ";
	
	private final  String e1 = "██▀ ";
	private final  String e2 = "█▄▄ ";
	
	private final  String f1 = "█▀ ";
	private final  String f2 = "█▀ ";
	
	private final  String g1 = "▄▀  ";
	private final  String g2 = "▀▄█ ";
	
	private final  String h1 = "█▄█ ";
	private final  String h2 = "█ █ ";
	
	private final  String i1 = "█ ";
	private final  String i2 = "█ ";
	
	private final  String j1 = "  █ ";
	private final  String j2 = "▀▄█ ";
	
	private final  String k1 = "█▄▀ ";
	private final  String k2 = "█ █ ";
	
	private final  String l1 = "█   ";
	private final  String l2 = "█▄▄ ";
	
	private final  String m1 = "█▄ ▄█ ";
	private final  String m2 = "█ ▀ █ ";
	
	private final  String n1 = "█▄ █ ";
	private final  String n2 = "█ ▀█ ";
	
	private final  String o1 = "▄▀▄ ";
	private final  String o2 = "▀▄▀ ";
	
	private final  String p1 = "█▀▄ ";
	private final  String p2 = "█▀  ";
	
	private final  String q1 = "▄▀▄ ";
	private final  String q2 = "▀▄█ ";
	
	private final  String r1 = "█▀▄ ";
	private final  String r2 = "█▀▄ ";
	
	private final  String s1 = "▄▀▀ ";
	private final  String s2 = "▄██ ";
	
	private final  String t1 = "▀█▀ ";
	private final  String t2 = " █  ";
	
	private final  String u1 = "█ █ ";
	private final  String u2 = "▀▄█ ";
	
	private final  String v1 = "█ █ ";
	private final  String v2 = "▀▄▀ ";
	
	private final  String w1 = "█   █ ";
	private final  String w2 = "▀▄▀▄▀ ";
	
	private final  String x1 = "▀▄▀ ";
	private final  String x2 = "█ █ ";
	
	private final  String y1 = "▀▄▀ ";
	private final  String y2 = " █ ";
	
	private final  String z1 = "▀▀█ ";
	private final  String z2 = "█▄▄ ";
	
	
	TwoBlocks() {
	}
	
	private void sample(String name) {
		
		String floor1 = "";
		String floor2 = "";
		
		for(int i = 0; i < name.length(); i++) {
			floor1 += conversorLetra1(name.charAt(i));
		}
		for(int i = 0; i < name.length(); i++) {
			floor2 += conversorLetra2(name.charAt(i));
		}
				
		System.out.println(floor1);
		System.out.println(floor2);
	
	}
	
	public String generator(String name) {
		
		String floor1 = "";
		String floor2 = "";
		
		for(int i = 0; i < name.length(); i++) {
			floor1 += conversorLetra1(name.charAt(i));
		}
		for(int i = 0; i < name.length(); i++) {
			floor2 += conversorLetra2(name.charAt(i));
		}
		String devolucion = floor1 + "\n" + floor2;
		return devolucion;
	}
	
	
	
	// CONVERSOR DE LETRA 1/2
	private String conversorLetra1(char letra) {
		String diseno = "";
		switch (letra) {
		case 'a':		
			diseno = a1;	
			break;
		case 'b':
			diseno = b1;
			break;
		case 'c':
			diseno = c1;
			break;
		case 'd':
			diseno = d1;
			break;
		case 'e':
			diseno = e1;
			break;
		case 'f':
			diseno = f1;
			break;
		case 'g':
			diseno = g1;
			break;
		case 'h':
			diseno = h1;
			break;
		case 'i':
			diseno = i1;
			break;
		case 'j':
			diseno = j1;
			break;
		case 'k':
			diseno = k1;
			break;
		case 'l':
			diseno = l1;
			break;
		case 'm':
			diseno = m1;
			break;
		case 'n':
			diseno = n1;
			break;
		case 'ñ':
			diseno = n1;
			break;
		case 'o':
			diseno = o1;
			break;
		case 'p':
			diseno = p1;
			break;
		case 'q':
			diseno = q1;
			break;
		case 'r':
			diseno = r1;
			break;
		case 's':
			diseno = s1;
			break;
		case 't':
			diseno = t1;
			break;
		case 'u':
			diseno =  u1;
			break;
		case 'v':
			diseno =  v1;
			break;
		case 'w':
			diseno =  w1;
			break;
		case 'x':
			diseno =  x1;
			break;
		case 'y':
			diseno =  y1;
			break;
		case 'z':
			diseno =  z1;
			break;
		case ' ':
			diseno = " ";
		}
		return diseno;
	}
	
	// CONVERSOR DE LETRA 2/2
	private String conversorLetra2(char letra) {
			String diseno = "";
			switch (letra) {
			case 'a':
				diseno = a2;
				break;
			case 'b':
				diseno = b2;
				break;
			case 'c':
				diseno = c2;
				break;
			case 'd':
				diseno = d2;
				break;
			case 'e':
				diseno = e2;
				break;
			case 'f':
				diseno = f2;
				break;
			case 'g':
				diseno = g2;
				break;
			case 'h':
				diseno = h2;
				break;
			case 'i':
				diseno = i2;
				break;
			case 'j':
				diseno = j2;
				break;
			case 'k':
				diseno = k2;
				break;
			case 'l':
				diseno = l2;
				break;
			case 'm':
				diseno = m2;
				break;
			case 'n':
				diseno = n2;
				break;
			case 'ñ':
				diseno = n2;
				break;
			case 'o':
				diseno = o2;
				break;
			case 'p':
				diseno = p2;
				break;
			case 'q':
				diseno = q2;
				break;
			case 'r':
				diseno = r2;
				break;
			case 's':
				diseno = s2;
				break;
			case 't':
				diseno = t2;
				break;
			case 'u':
				diseno = u2;
				break;
			case 'v':
				diseno = v2;
				break;
			case 'w':
				diseno = w2;
				break;
			case 'x':
				diseno = x2;
				break;
			case 'y':
				diseno = y2;
				break;
			case 'z':
				diseno = z2;
				break;
			case ' ':
				diseno = " ";
			}			
			return diseno;
		}
}
