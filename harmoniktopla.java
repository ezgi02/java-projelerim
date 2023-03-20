package projeler;
import java.util.Scanner;
public class harmoniktopla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find harmonic series
		double toplam=0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x=input.nextInt();
		for(int i=1;i<=x;i++) {
			toplam+=(1.0/i);
		}
		System.out.println(toplam);
	}

}
