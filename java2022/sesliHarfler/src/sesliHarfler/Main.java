package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		//BENİM ÇÖZÜMÜM
//		char[] kalınSesli ={'a','ı','o','u','A','I','O','U'};
//		char[] inceSesli ={'e','i','ö','ü','E','İ','Ö','Ü'};
//		boolean diger =true;
//		
//		 char harf ='ğ';
//		 
//		 for (int i = 0; i < inceSesli.length; i++) {
//			 if(harf== inceSesli[i]) {
//				 System.out.println("harf ince sesli");
//				 diger=false;
//			 }
//		}
//		 for (int i = 0; i < kalınSesli.length; i++) {
//			 if(harf== kalınSesli[i]) {
//				 System.out.println("harf kalın sesli");
//				 diger=false;
//		}
//		
//	}
//		 if(diger) {
//			 System.out.println("girilen harf sesli harf değil");
//		 }
   // HOCANIN ÇÖZÜMÜ
		char harf ='m';
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("kalın sesli harf");
				break;
			default:
				System.out.println("ince sesli harf");
		}
		
		
}}
