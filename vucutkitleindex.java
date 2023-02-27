package projeler;
import java.util.Scanner;
public class vucutkitleindex {
	public static void main(String[] args) {
		int kilo;
		double boy;
		double vucut_indexi;
		System.out.println("boyunuzu ve kilonuzu giriniz");
		Scanner input=new Scanner(System.in);
		boy=input.nextDouble();
		kilo=input.nextInt();
		vucut_indexi=kilo/(boy*boy);
		System.out.println(vucut_indexi);
		}
}
