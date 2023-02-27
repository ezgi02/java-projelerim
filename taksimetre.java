package projeler;
import java.util.Scanner;
public class taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int km;
		double toplam;
		System.out.println("toplam gittiginiz yolun km yaziniz");
		km=input.nextInt();
		toplam=10+km*2.20;
		if(toplam<20) {
			toplam=20;
		}
		
		System.out.println(toplam);
	}

}
