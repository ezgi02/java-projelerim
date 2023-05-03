package projeler;
import java.util.Scanner;
public class ebobEkok {

	public static void main(String[] args) {
		// Ebob ve Ekok kullanalim
		Scanner input = new Scanner(System.in);
		int i=1,eb=0;
		System.out.println("bir sayi giriniz");
		int sayi1=input.nextInt();
		
		System.out.println("tekrar  bir sayi giriniz");
		int sayi2=input.nextInt();
		System.out.println("sayilari ebobu sudur");
		
		
		while(i<=sayi1) {
			
			if(sayi1%i==0 && sayi2%i==0) {
				eb=i;
			}
			i++;
		}
		System.out.println(eb);
		int ekok=(sayi1*sayi2)/eb;
		System.out.println("sayilarin ekoku sudur");
		System.out.println(ekok);
		
		
	}

}
