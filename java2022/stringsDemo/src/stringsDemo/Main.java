package stringsDemo;

public class Main {

	public static void main(String[] args) {
	String mesaj = "   Bugün hava çok güzel.   ";
	System.out.println(mesaj);
	/*
	 * System.out.println("eleman sayısı :  "+mesaj.length());
	 * System.out.println("5. eleman :  "+ mesaj.charAt(4));
	 * System.out.println(mesaj.concat("    yaşasın!."));
	 * System.out.println(mesaj.startsWith("a"));
	 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[25];
	 * mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
	 * System.out.println(mesaj.indexOf('a'));
	 * System.out.println(mesaj.lastIndexOf('a'));
	 */
	 String yeniMesaj= mesaj.replace(' ', '-');
	 System.out.println(yeniMesaj);
	 
	 System.out.println(mesaj.substring(2,4));
	 
	 for(String kelime:mesaj.split(" ")) {
		 System.out.println(kelime); 
	 }
	 
	 System.out.println(mesaj.toLowerCase());
	 System.out.println(mesaj.toUpperCase());
	 System.out.println(mesaj.trim());
	}

}