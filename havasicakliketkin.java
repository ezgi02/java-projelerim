package projeler;
import java.util.Scanner;
public class havasicakliketkin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ifade="Sicaklik 5'dan kucuk ise 1";
		String ifade1="Sicaklik 5 ve 15 arasinda ise 2";
		String ifade2="Sicaklik 15 ve 25 arasinda ise 3";
		String ifade3="Sicaklik 25'ten buyuk ise 4";
		Scanner input = new Scanner(System.in);
		System.out.println("sicaklik degerlerine gore secim yapin");
		System.out.println(ifade + ifade1 + ifade2 + ifade3);
		int secim=input.nextInt();
		switch(secim) {
			case 1:System.out.println("kayak yap");
			break;
			case 2:System.out.println("sinema");
			break;
			case 3:System.out.println("piknik");
			break;
			case 4:System.out.println("yuzme");
			break;
			default:System.out.println("1-4 arasinda secim yap");
		}
	}

}
