package projeler;
import java.util.Scanner;

public class ciftsayibulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		int sayi1=input.nextInt();
		for(i=0;i<sayi1;i++) {
			if(i%3==0 && i%4==0) {
				System.out.println(i);
			}
		}
		
	}

}
