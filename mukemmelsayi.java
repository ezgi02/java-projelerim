package projeler;
import java.util.Scanner;
public class mukemmelsayi {

	public static void main(String[] args) {
		/*
		 Mükemmel Sayı Nedir ?
			Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) 
			toplamı kendisine eşit olan sayıya mükemmel sayı denir.
		  
		  */
		Scanner input = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int toplam=0;
		int sayi1;
		sayi1=input.nextInt();
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam+=i;
			}
		}
		if(sayi1==toplam) {
			System.out.print("sayi mukemmel sayidir");
			System.out.print(toplam);

		}
		else {
			System.out.print("sayi mukemmel degildir");
			System.out.print(toplam);
		}
	}

}
