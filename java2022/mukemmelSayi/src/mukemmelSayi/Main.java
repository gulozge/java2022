package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
	 // hocayla yanı çözüm 
		// 28=1+2+4+7+14 mükemmel sayı
	int sayı =28;
	int topla=0;
	
	
	for (int i = 1; i < sayı; i++) {
		if(sayı%i==0){
		topla=topla+i;
		}
	}
	if(topla==sayı) {
		System.out.println("mükemmel sayı");
	}else {
		System.out.println("mükemmel sayı değil");
	}

	}

}
