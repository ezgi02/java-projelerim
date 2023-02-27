package projeler;
import java.util.Scanner;
public class hesapmakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 int toplam=0;
		 System.out.println("lutfen sayilari giriniz");
		 int sayi1=input.nextInt();
		 int sayi2=input.nextInt();
		 System.out.println("Hesap Makinesine hoşgeldin");
		 System.out.println("toplam:1,carpma:2,cıkarma:3,bolme:4");
		 int secim=input.nextInt();
		 switch(secim) {
		 case 1:
			 toplam=sayi1+sayi2;
		 	 break;
		 case 2:
			toplam=sayi1*sayi2;
			break;
		case 3:
			toplam=sayi1-sayi2;
			break;
		case 4:
			toplam=sayi1/sayi2;
			break;
		default:System.out.print("lutfen 1-4 arasinda secim yapiniz");
		 }
		 System.out.println(toplam);
	}

}
