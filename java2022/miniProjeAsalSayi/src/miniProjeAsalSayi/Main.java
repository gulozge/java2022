package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		//BENİM YAZDIĞIM
		
//		int number = 0;
//		int remainder;
//		boolean karar = true;
//		
//		if(number<2) {
//			System.out.println("en küçük asal sayı 2'dir:  geçersiz sayı ");
//			System.exit(0);
//		}
//		
//		
//		for (int i = 2; i < number/2 ; i++) {
//			remainder = number%i;
//			 if(remainder==0) {
//				 karar = false;
//			    	break;
//			    }else {
//			    	karar= true;
//			    }
//	
//			}
//		
//		if(karar== false) {
//			System.out.println("sayı asal değil");
//		}else {
//		    System.out.println("sayı asal");
//		}
		// HOCANIN YAZDIĞI
		
		int number = -2;
		int remainder;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("sayı asal değildir");
			return;
		}
		if(number<1) {
			System.out.println("geçersiz sayı");
			return;
		}
		for (int i = 2; i <number; i++) {
			if(number%2 == 0) {
				isPrime= false;
			}
		}
		if(isPrime) {
			System.out.println("sayı asaldır");
		}else {
			System.out.println("sayı asal değildir");
		}
		
		
	}

}
