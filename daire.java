package projeler;
import java.util.Scanner;
public class daire {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int yaricap;
			System.out.println("dairenin yarıcapını bulunuz");
			yaricap=input.nextInt();
			double daire_cevre=2*3.14*yaricap;
			double daire_alanı=3.1*yaricap*yaricap;
			System.out.println("dairenin alanu ve cevresi");
			System.out.println(daire_alanı);
			System.out.println(daire_cevre);
	
	}
}
