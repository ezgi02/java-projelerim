package projeler;
import java.util.Scanner;
public class üslüsayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int carpim=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Taban sayiyi giriniz");
		int taban=input.nextInt();
		System.out.println("Üs sayiyi giriniz");
		int us=input.nextInt();
		for(i=1;i<=us;i++) {
			carpim*=taban;
		}
		System.out.println(carpim);
		
	}

}
