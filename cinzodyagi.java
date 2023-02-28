package projeler;
import java.util.Scanner;
public class cinzodyagi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("dogum yiliinzi giriniz");
		int yil=input.nextInt();
		if(yil%12==0) {
			System.out.println("Cin zodyagi burcunuz Maymun");
		}
		else if(yil%12==1) {
			System.out.println("Cin zodyagi burcunuz Horoz");
		}
		else if(yil%12==2) {
			System.out.println("Cin zodyagi burcunuz köpek");
		}
		else if(yil%12==3) {
			System.out.println("Cin zodyagi burcunuz domuz");
		}
		else if(yil%12==4) {
			System.out.println("Cin zodyagi burcunuz fare");
		}
		else if(yil%12==5) {
			System.out.println("Cin zodyagi burcunuz öküz");
		}
		else if(yil%12==6) {
			System.out.println("Cin zodyagi burcunuz kaplan");
		}
		else if(yil%12==7) {
			System.out.println("Cin zodyagi burcunuz tavsan");
		}
		else if(yil%12==8) {
			System.out.println("Cin zodyagi burcunuz ejderha");
		}
		else if(yil%12==9) {
			System.out.println("Cin zodyagi burcunuz yilan");
		}
		else if(yil%12==10) {
			System.out.println("Cin zodyagi burcunuz at");
		}
		else {
			System.out.println("Cin zodyagi burcunuz koyun");
		}
	}

}
