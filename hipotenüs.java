package projeler;
import java.util.Scanner;
public class hipotenüs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kenar,kenar1;
		double hipo,c;
		Scanner input=new Scanner(System.in);
		System.out.println("kenarlari giriniz dik ucgenin");
		kenar=input.nextInt();
		kenar1=input.nextInt();
		c=kenar1*kenar1+kenar*kenar;
		hipo=Math.sqrt(c);
		System.out.println("dik ucgenin hipoteenusu");
		System.out.println(hipo);
	}

}
