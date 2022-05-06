# MyConsoleFonts
MyConsoleFonts is a font generator that will return you the same String converted to a font of your own choice. Useful for people who are looking to develop their own console game involving ASCII drawings.

Currently, MyConsoleFonts contains 5 different fonts. Each one of this fonts has been reorganized by it's letters which had to be splitted line by line into pieces in order 
to display letter by letter on the console, forming whichever words or phrases of your own choice. 

A showcase of how each single letter is cutted. Font "Blackie"

	private final String a1 = "    █     "; private final String b1 = "▀██▀▀█▄   "; private final String c1 = "▄▄█▀▀▀▄█   ";
	private final String a2 = "   ███    "; private final String b2 = " ██   ██  "; private final String c2 = "▄█▀     ▀  ";
	private final String a3 = "  █  ██   "; private final String b3 = " ██▀▀▀█▄  "; private final String c3 = "██         ";
	private final String a4 = " ▄▀▀▀▀█▄  "; private final String b4 = " ██    ██ "; private final String c4 = "▀█▄      ▄ ";
	private final String a5 = "▄█▄  ▄██▄ "; private final String b5 = "▄██▄▄▄█▀  "; private final String c5 = " ▀▀█▄▄▄▄▀  ";
  
  After the first line of the passed String is generated, the program continues to make the second line, third line, and so until all the containing letters are formed.
