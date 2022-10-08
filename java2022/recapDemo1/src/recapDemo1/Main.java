package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		int enBüyükSayi;
		
		if(sayi1<sayi2) {
			enBüyükSayi=sayi2;
			if(sayi2<sayi3) {
				enBüyükSayi=sayi3;
			}
		}else if(sayi1<sayi3) {
			enBüyükSayi=sayi3;
		}else {
			enBüyükSayi=sayi1;	
		}
		System.out.println(enBüyükSayi);

	}

}
