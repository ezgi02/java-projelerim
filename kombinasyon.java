package projeler;
import java.util.Scanner;
public class kombinasyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int total1=1;
		int total2=1;
		int total3=1;
		System.out.println("Kombinasyon için lutfen n ve r degerini girin");
		int n=input.nextInt();
		int r=input.nextInt();
		if(n>r) {
			for(int i=1;i<=n;i++) {
				total1*=i;
			}
			for(int z=1;z<=r;z++) {
				total2*=z;
			}
			int k=n-r;
			for(int y=1;y<=k;y++) {
				total3*=y;
			}
	}
		else {
			System.out.println("n r den daha buyuk olmalı");
		}
	int kom=total1/(total2*total3);
	System.out.print(kom);

}}
