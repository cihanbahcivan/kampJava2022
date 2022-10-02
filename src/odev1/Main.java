package odev1;

public class Main {

	public static void main(String[] args) {
		
		//////////////////////// DERS 6
		int ogrenciSayisi = 12;
		String mesaj="Öğrenci sayısı : ";
		
		System.out.println(mesaj+ogrenciSayisi);
		System.out.println(mesaj+ogrenciSayisi);
		System.out.println("Öğrenci sayım :"+ogrenciSayisi);
		
		
		//////////////////// DERS 7
		int sayi=10;
		sayi=13;
		sayi=15;
		 //sayi=11111111111; yanlış
		
		byte sayii = 12;
		//sayii = 128 yanlış
		
		//sayi = 12.5; yanlış
		
		char karakter = 'A';
		//karakter="A" yanlış
		//karakter='AB' yanlış
		
		boolean dogruMu = true;
		dogruMu = false;
		
		/////////////////////////// DERS 8
		
		sayi= 14;
		
		if(sayi < 20)
		{
			System.out.println("Sayı 20'den küçüktür.");
		}
		else if(sayi == 20)
		{
			System.out.println("Sayı 20'ye eşittir.");
		}
		else 
		{
			System.out.println("Sayı 20'den büyüktür.");
		}
		
		
		///////////////////////////// DERS 9
		
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) 
		{
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3)
		{
			enBuyuk = sayi3;
		}
		
		System.out.println("En buyuk = "+enBuyuk);
		
		
		////////////////////////////// DERS 10
		
		char grade = 'A';
		
		switch(grade)
		{
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
			
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
			break;
			
			
			
			
		}
	
			/////////////////////////////////////// DERS 11
			
		
		
		// For
		
		for(int i=2;i<10;i+=2)
		{
			System.out.println(i);
		}
		
		System.out.println("For Döngüsü bitti");
		
		
		// While
		int i=1; 
		while(i<10)
		{
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü bitti");
		
		//Do-While
		int j=1;
		do 
		{
			System.out.println(j);
			j+=2;
		} 
		while(j<10);
		System.out.println("Do-While Döngüsü bitti");
		
		
		/////////////////////////////////////// DERS 14
		String ogrenci1 = "A";
		String ogrenci2 = "B";
		String ogrenci3 = "C";
		String ogrenci4 = "D";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------------------------------------");
		
		String[] ogrenciler = new String[4];
		
		ogrenciler[0]= "Engin";
		ogrenciler[1]= "Derin";
		ogrenciler[2]= "Salih";
		ogrenciler[3]= "Ahmet";
		//ogrenciler[4]= "Ali";
		for(int a = 0; i<ogrenciler.length; a++)
		{
			System.out.println(ogrenciler[a]);
		}
		
		for(String ogrenci:ogrenciler)
		{
			System.out.println(ogrenci);
		}
		
		
		////////////////////////////////////// DERS 15
		
		double[] myList = {1.2,1.3,4.3,5.6};
		double total=0;
		double max = myList[0];
		
		for(double number:myList)
		{
			if(max<number)
			{
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);
		
		
		////////////////////////////////////////// DERS 16
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbakır";
		sehirler[2][1]="Şanlıurfa";
		sehirler[2][2]="Gaziantep";

		for(int x = 0; x <= 2; x++)
		{
			System.out.println("----------------------------------");
			for(int y = 0; y <= 2; y++) 
			{
				System.out.println(sehirler[x][y]);
			}
		}
		
		///////////////////////////////////////////// DERS 17
		
		
		String message = "Bugün hava çok güzel";
		System.out.println(message);
		
		System.out.println("Eleman sayısı : "+message.length());
		System.out.println("5. eleman : " +message.charAt(4));
		System.out.println(message.concat(" Yaşasın!"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("."));
		char[] karakterler = new char[5];
		message.getChars(0, 5, karakterler,0);
		System.out.println(karakterler);
		System.out.println(message.indexOf("av"));
		System.out.println(message.lastIndexOf("a"));
		 
		
		//////////////////////////////////////////// DERS 18
		
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		
		System.out.println(message.substring(2));
		System.out.println(message.substring(2,5));
		
		for(String kelime:message.split(" "))
		{
			System.out.println(kelime);
		}
		
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		System.out.println(message.trim());
		
		
		
		/////////////////////////////////////////////// DERS 19
		
		
		int number = 25;
		boolean isPrime = true;
		
		if(number < 2)
		{
			System.out.println("Geçersiz sayı");
			return;
		}
		else if(number==1)
		{
			System.out.println("Sayı Asal değildir.");
		}
		else
		{
			for(int x = 1; x < number; x++)
			{
				if(number % x == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.println("Sayı Asaldır.");
			}
			else
			{
				System.out.println("Sayı Asal değildir.");
			}
		}
		
		////////////////////////////////////////////////// DERS 20

		
		char harf='E';
		
		switch(harf)
		{
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli harf");
				break;
			default:
				System.out.println("İnce sesli harf");
		}
		
		
		/////////////////////////////////////////////// DERS 21
		
		// 6 -> 1,2,3   =>  1+2+3 = 6
		
		number = 6;
		total = 0;
		
		for(int x = 1; x < number; x++)
		{
			if(number % x == 0)
			{
				total += x;
			}
		}
		
		if(total == number)
		{
			System.out.println(number + " Mükemmel Sayıdır.");
		}
		else
		{
			System.out.println(number + " Mükemmel Sayı Değildir.");
		}
		
		
		///////////////////////////////////////// DERS 22
		
		int number1=220, number2=284, total1=0, total2=0;
		
		
		for(int x = 1; x < number1; x++)
		{
			if(number1 % x == 0)
			{
				total1 += x;
			}
		}
		
		for(int x = 1; x < number2; x++)
		{
			if(number2 % x == 0)
			{
				total2 += x;
			}
		}
		
		if(number1==total2 && number2 == total1)
		{
			System.out.println(number1+" ve "+number2+" sayıları Arkadaştır.");
		}
		else
		{
			System.out.println(number1+" ve "+number2+" sayıları Arkadaş DEĞİLDİR.");
		}
		
		/////////////////////////////////////////////////////// DERS 23
		
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
		
		for(int index:sayilar)
		{
			if(index == aranacak)
			{
				varMi = true;
			}
		}
		
		if(varMi)
		{
			System.out.println("Sayı mevcuttur.");
		}
		else
		{
			System.out.println("Sayı mevcut değildir.");
		}
		
		
	}
}
