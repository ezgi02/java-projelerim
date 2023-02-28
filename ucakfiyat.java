package projeler;
import java.util.Scanner;
public class ucakfiyat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double tutar1=0,tutar2;
		System.out.println("Mesafeyi km turunden giriniz");
		int msf=input.nextInt();
		if(msf<0) {
			System.out.println("Hatali veri girdiniz");
		}
		System.out.println("yolculuk tipini girinizTek Yon=>1, Gidis-Donus=>2");
		int secim=input.nextInt();
		System.out.println("Yasinizi girin");
		int yas=input.nextInt();
		if(yas<0) {
			System.out.println("Hatali veri girdiniz");
		}
		else {
			if(yas<12) {
				tutar1=(msf*0.1)*0.5;
			}
			else if(yas>12 && yas<24) {
				tutar1=(msf*0.1)*0.9;
			}
			else if(yas>65) {
				tutar1=(msf*0.1)*0.7;
			}
			else {
				tutar1=(msf*0.1);
			}
		}
		switch(secim){
			case 1:
				tutar2=tutar1;
				System.out.println(tutar2);
				break;
			case 2:
				tutar2=tutar1*0.8*2;
				System.out.println(tutar2);
				break;
			default:System.out.println("hatali giris yaptiniz");
				
		}
	}

}
