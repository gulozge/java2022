package sayiBulma;

public class Main {

	public static void main(String[] args) {
//		int[] sayilar = new int[] {1,2,5,7,9};
//		int aranacak = 5;
//		boolean varMi=false;
//
//		for (int i = 0; i < sayilar.length; i++) {
//			if(aranacak==sayilar[i]) {
//				 varMi=true;
//				 break;
//			}
//		}
//		if(varMi) {
//			System.out.println("aranan sayı var");
//		}else {
//			System.out.println("aranan sayı yok");
//		}
		int[] sayilar = new int[] {1,2,5,7,9};
		int aranacak = 55;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("sayı mevcuttur");
		}else {
			System.out.println("sayı mevcut değildir");
		}
	}

}
