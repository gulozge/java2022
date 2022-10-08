package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//değişken isimleri camelCase yazılır
		String ortaMetin="ilginizi çekebilir";
		String altMetin="vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade= 12;
		double dolarDun=18.14;
		double dolarBugun=18.10;
		
        boolean dolarDuştuMu =true;
        
        String okYonu="";
        
        if (dolarBugun<dolarDun) {
        	
        	okYonu="down.svg";
        	System.out.println(okYonu);
        } 
        else if(dolarBugun>dolarDun) {
        	okYonu="up.svg";
        	System.out.println(okYonu);
        }
        else {
        	okYonu="equal.svg";
        	System.out.println(okYonu);
        }
		
        String[] krediler= {"hızlı kredi","maaşını halk bantan alanlar","mutlu emekli"};
		
        for(int i=0; i< krediler.length; i++) {
        	
        	System.out.println(krediler[i]);
        }
	

	}

}
