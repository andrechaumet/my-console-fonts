
public class MyConsoleFonts {
	
	private final BlackOutline BlackOutline = new BlackOutline();
	private final TwoBlocks TwoBlocks = new TwoBlocks();
	private final Splash Splash = new Splash();
	private final Blackie Blackie = new Blackie();
	private final Melting Melting = new Melting();
	
	public MyConsoleFonts(){	
		/*
		 * by André Chaumet. 6 may 2022
		 */
	}
	
	public String BlackOutline(String string) {
		
		/*
		  ▄▄▄▄▄▄▄   ▄▄▄▄▄▄   ▄▄   ▄▄   ▄▄▄▄▄▄▄   ▄▄▄       ▄▄▄▄▄▄▄  
		 █       █ █      █ █  █▄█  █ █       █ █   █     █       █ 
		 █  ▄▄▄▄▄█ █  ▄   █ █       █ █    ▄  █ █   █     █    ▄▄▄█ 
		 █ █▄▄▄▄▄  █ █▄█  █ █       █ █   █▄█ █ █   █     █   █▄▄▄  
		 █▄▄▄▄▄  █ █      █ █       █ █    ▄▄▄█ █   █▄▄▄  █    ▄▄▄█ 
		  ▄▄▄▄▄█ █ █  ▄   █ █ ██▄██ █ █   █     █       █ █   █▄▄▄  
		 █▄▄▄▄▄▄▄█ █▄█ █▄▄█ █▄█   █▄█ █▄▄▄█     █▄▄▄▄▄▄▄█ █▄▄▄▄▄▄▄█ 
		*/
		String generated = BlackOutline.generator(string.toLowerCase());
		return generated;
	}
	
	public void SampleBlackOutline() {
		System.out.println("		  ▄▄▄▄▄▄▄   ▄▄▄▄▄▄   ▄▄   ▄▄   ▄▄▄▄▄▄▄   ▄▄▄       ▄▄▄▄▄▄▄  "
				+ "		 █       █ █      █ █  █▄█  █ █       █ █   █     █       █ "
				+ "		 █  ▄▄▄▄▄█ █  ▄   █ █       █ █    ▄  █ █   █     █    ▄▄▄█ "
				+ "		 █ █▄▄▄▄▄  █ █▄█  █ █       █ █   █▄█ █ █   █     █   █▄▄▄  "
				+ "		 █▄▄▄▄▄  █ █      █ █       █ █    ▄▄▄█ █   █▄▄▄  █    ▄▄▄█ "
				+ "		  ▄▄▄▄▄█ █ █  ▄   █ █ ██▄██ █ █   █     █       █ █   █▄▄▄  "
				+ "		 █▄▄▄▄▄▄▄█ █▄█ █▄▄█ █▄█   █▄█ █▄▄▄█     █▄▄▄▄▄▄▄█ █▄▄▄▄▄▄▄█ ");
	}
	
	public String TwoBlocks(String string) {
		/*
		▄▀▀ ▄▀▄ █▄ ▄█ █▀▄ █   ██▀ 
		▄██ █▀█ █ ▀ █ █▀  █▄▄ █▄▄ 
		*/
		String generated = TwoBlocks.generator(string.toLowerCase());
		return generated;
	}
	
	public void SampleTwoBlocks() {
		System.out.println("		▄▀▀ ▄▀▄ █▄ ▄█ █▀▄ █   ██▀ "
				+ "		▄██ █▀█ █ ▀ █ █▀  █▄▄ █▄▄");
	}
	
	public String Splash(String string) {
		/*
		 .▄▄ ·  ▄▄▄· • ▌ ▄ ·.  ▄▄▄· ▄▄▌  ▄▄▄ .
		▐█ ▀. ▐█ ▀█ ·██ ▐███▪▐█ ▄█ ██•  ▀▄.▀·
		▄▀▀▀█▄▄█▀▀█ ▐█ ▌▐▌▐█· ██▀· ██ ▪  ▐▀▀▪▄
		▐█▄▪▐█▐█▪ ▐▌██ ██▌▐█▌▐█▪·• ▐█▌ ▄▐█▄▄▌
		 ▀▀▀▀  ▀  ▀ ▀▀  █▪▀▀▀.▀   . ▀▀▀  ▀▀▀ 
		 */
		String generated = Splash.generator(string.toLowerCase());
		return generated;
	}
	
	public void SampleSplash() {
		System.out.println("		 .▄▄ ·  ▄▄▄· • ▌ ▄ ·.  ▄▄▄· ▄▄▌  ▄▄▄ ."
				+ "		▐█ ▀. ▐█ ▀█ ·██ ▐███▪▐█ ▄█ ██•  ▀▄.▀·"
				+ "		▄▀▀▀█▄▄█▀▀█ ▐█ ▌▐▌▐█· ██▀· ██ ▪  ▐▀▀▪▄"
				+ "		▐█▄▪▐█▐█▪ ▐▌██ ██▌▐█▌▐█▪·• ▐█▌ ▄▐█▄▄▌"
				+ "		 ▀▀▀▀  ▀  ▀ ▀▀  █▪▀▀▀.▀   . ▀▀▀  ▀▀▀ ");
	}
	
	public String Blackie(String string) {
		/*		
		 ▄█▀▀▀▄█      █     ▀██    ██▀ ▀██▀▀█▄  ▀██▀      ▀██▀▀▀▀█  
		 ██▄▄  ▀     ███     ███  ███   ██   ██  ██        ██  ▄    
		  ▀▀███▄    █  ██    █▀█▄▄▀██   ██▄▄▄█▀  ██        ██▀▀█    
		▄     ▀██  ▄▀▀▀▀█▄   █ ▀█▀ ██   ██       ██        ██       
		█▀▄▄▄▄█▀  ▄█▄  ▄██▄ ▄█▄ █ ▄██▄ ▄██▄     ▄██▄▄▄▄▄█ ▄██▄▄▄▄▄█ 
		 */		                                                            
		String generated = Blackie.generator(string.toLowerCase());
		return generated;
	}
	
	public void SampleBlackie() {
		System.out.println("		 ▄█▀▀▀▄█      █     ▀██    ██▀ ▀██▀▀█▄  ▀██▀      ▀██▀▀▀▀█"
				+ "		 ██▄▄  ▀     ███     ███  ███   ██   ██  ██        ██  ▄    "
				+ "		  ▀▀███▄    █  ██    █▀█▄▄▀██   ██▄▄▄█▀  ██        ██▀▀█    "
				+ "		▄     ▀██  ▄▀▀▀▀█▄   █ ▀█▀ ██   ██       ██        ██       "
				+ "		█▀▄▄▄▄█▀  ▄█▄  ▄██▄ ▄█▄ █ ▄██▄ ▄██▄     ▄██▄▄▄▄▄█ ▄██▄▄▄▄▄█ ");
	}
	
	public String Melting(String string) {
		/*		
		 ███▄▄███▓  ▓█████  ██▓      ▄▄▄█████▓██▓    ███▄    █  ▄████  
		▓██▒▀█▀ ██▒ ▓█   ▀  ▓██▒     ▓  ██▒ ▓▒▒▓██▒  ██ ▀█   █  ██▒ ▀█ 
		▓██    ▓██░ ▒███    ▒██░     ▒ ▓██░ ▒░▒▒██▒ ▓██  ▀█ ██▒▒██░▄▄▄ 
		▒██    ▒██  ▒▓█  ▄  ▒██░     ░ ▓██▓ ░ ░░██░ ▓██▒  ▐▌██▒░▓█  ██ 
		▒██▒   ░██▒ ▒░▒████ ▒██░       ▒██▒ ░ ░░██░ ▒██░   ▓██░▒▓███▀▒ 
 		░ ▒░   ░  ░░░░ ▒░  ▒░██████   ▒ ░░    ░▓   ░ ▒░   ▒ ▒ ░▒   ▒  
		░  ░      ░ ░ ░ ░   ░░ ▒░▓       ░    ░ ▒ ░    ░   ░ ░  ░   ░  
 		 ░          ░   ░     ░ ░       ░       ░            ░      ░  
 
		 */		                                                            
		String generated = Melting.generator(string.toLowerCase());
		return generated;
	}
	
	public void SampleMelting() {
		System.out.println("		 ███▄▄███▓  ▓█████  ██▓      ▄▄▄█████▓██▓    ███▄    █  ▄████  "
				+ "		▓██▒▀█▀ ██▒ ▓█   ▀  ▓██▒     ▓  ██▒ ▓▒▒▓██▒  ██ ▀█   █  ██▒ ▀█ "
				+ "		▓██    ▓██░ ▒███    ▒██░     ▒ ▓██░ ▒░▒▒██▒ ▓██  ▀█ ██▒▒██░▄▄▄ "
				+ "		▒██    ▒██  ▒▓█  ▄  ▒██░     ░ ▓██▓ ░ ░░██░ ▓██▒  ▐▌██▒░▓█  ██ "
				+ "		▒██▒   ░██▒ ▒░▒████ ▒██░       ▒██▒ ░ ░░██░ ▒██░   ▓██░▒▓███▀▒ "
				+ " 		░ ▒░   ░  ░░░░ ▒░  ▒░██████   ▒ ░░    ░▓   ░ ▒░   ▒ ▒ ░▒   ▒  "
				+ "		░  ░      ░ ░ ░ ░   ░░ ▒░▓       ░    ░ ▒ ░    ░   ░ ░  ░   ░  "
				+ " 		 ░          ░   ░     ░ ░       ░       ░            ░      ░  "
				+ "");
	}
	
}
