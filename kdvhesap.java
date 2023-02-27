package projeler;
import java.util.Scanner;

public class kdvhesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anapara;
		double kdv,kdv_fiyat;
		Scanner input=new Scanner(System.in);
		System.out.println("lutfen ana parayi gir");
		anapara=input.nextInt();
		System.out.println("kdv tutarini gir");
		kdv=input.nextDouble();
		System.out.println("toplam tutar");
		kdv_fiyat=anapara+(kdv/10);
		System.out.println(kdv_fiyat);
		
	}

}
