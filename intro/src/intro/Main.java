package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "Internet Subesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println( internetSubeButonu );
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar dustu resmi" );
			
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yukseldi resmi" );
		}else {
			System.out.println("Dolar esittir resmi" );
		}
		
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Ciftci kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		String[] krediler = {"H�zl� kredi", "Mutlu emekli kredisi" //dizi yap�s�
				, "Konut kredisi" , "Ciftci kredisi"
				, "Msb kredisi" , "Meb kredisi" };   
		for(String kredi : krediler) { //foreach yap�s�       
			System.out.println(kredi);
		}
		for(int i = 0; i< krediler.length; i++) { //sayac g�d�ml�d�r
			System.out.println(krediler[i]);
		}                                        
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1= sayi2;
		sayi2 = 100;
		System.out.println(sayi1); // STACK , deger atamas� yap�l�r ama diger degerlerle baglant�s� olmaz, ekrana 20 basar
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
        sayilar1=sayilar2; // sayilar1 in adresi sayilar2 nin adresidir demektir
        sayilar2[0] = 100; //sayilar2 nin adresinin 0. elaman�art�k 100 demektir
        System.out.println(sayilar1[0]); // HEAP , sayilar1 art�k sayilar2 nin adresine esitlendigi icin 100 basar ekrana
        
        
        String sehir1 = "Ankara";
        String sehir2 = "�stanbul";
        sehir1 = sehir2 ;
        sehir2 = "�zmir";
        System.out.println(sehir1); // istanbul yazar , istisnai bir durumdur, referans� degil degeri atam�st�r.
        
        

	}

}
