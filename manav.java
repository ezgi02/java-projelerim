package projeler;

import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
		double toplam=0.0;
		System.out.println("manav fiyatları su şekildedir");
		System.out.println("armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00");
		
		System.out.println("Armut kg giriniz");
		armut=input.nextDouble();
		
		System.out.println("elma kg giriniz");
		elma=input.nextDouble();
		
		System.out.println("domates kg giriniz");
		domates=input.nextDouble();
		
		System.out.println("muz kg giriniz");
		muz=input.nextDouble();
		
		System.out.println("patlican kg giriniz");
		patlican=input.nextDouble();
		toplam=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00;
		System.out.println(toplam);
	}

}
