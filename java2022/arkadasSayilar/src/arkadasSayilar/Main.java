package arkadasSayilar;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		/*
		 * arkadaş sayılar 220-284 1 den başlayıp 220'ye kadar bölrn tğm sayıların
		 * toplamı 284 ve 1'den başlayıp 284'e kadar bölen tüm ayıların toplamı 220 ise
		 */
		//HOCA İLE AYNI ÇÖZÜM 
		int sayı1=220;
		int sayı2=281;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int i = 1; i < sayı1; i++) {
			if(sayı1%i==0) {
			toplam1=toplam1+i;
			}
		}
		for (int i = 1; i < sayı2; i++) {
			if(sayı2%i==0) {
			toplam2=toplam2+i;	
		}
		}	
		
		if(toplam1==sayı2 || toplam2==sayı1) {
			System.out.println("arkadaş sayılardır");
		}else {
			System.out.println("arkadaş sayı değillerdir");
		}
		
	}

}
