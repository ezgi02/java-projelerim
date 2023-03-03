package projeler;
import java.util.Scanner;
public class toplambul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int toplam=0;
		int n;
		do {
			n=input.nextInt();
			if(n%4==0) {
				toplam+=n;
			}
		}while(n%2==0);

		System.out.println(toplam);
	}

}
