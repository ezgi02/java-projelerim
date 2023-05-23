package projeler;
import java.util.Scanner;

public class hesapmakinesi {
	static int sum(int a,int b) {
		int result=a+b;
		 System.out.println("toplam"+ result);
		 return result;
	}
	static int extraction(int a,int b) {
		int result=a-b;
		 System.out.println("cıkarma"+ result);
		 return result;
	}
	static int impact(int a,int b) {
		int result=a*b;
		 System.out.println("çarpma"+result);
		 return result;
	}
	static int divide(int a,int b) {
		int result=a/b;
		 System.out.println("bölme"+result);
		 return result;
	}
	static int exponentiation(int a,int b) {
		int result=1;
		for(int i=1;i<=b;i++) {
			result*=a;
		}
		 System.out.println("üslü sayi sonucu bulma"+result);
		 return result;
	}
	static int factoriel(int a,int b) {
		int result=1;
		int sonuc=1;
		for(int i=1;i<=a;i++) {
			result*=i;
		}
		for(int j=1;j<=b;j++) {
			sonuc*=b;
		}
		 System.out.println("sayilari factorielleri" + " "+result +" "+ sonuc);
		 
		 return result,sonuc;
	}
	static int modding(int a,int b) {
		
		System.out.println("modu"+a%b);
		return a%b;
		
	}
	static int rectangle(int a,int b) {
		int result=a*b;
		int cevre=2*(a+b);
		 System.out.println("alan"+result+cevre);
		 return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gir=new Scanner(System.in);
		int select;
		String menu="1- Toplama Islemi\r\n"
				+ "2- Cikarma Islemi\r\n"
				+ "3- Carpma Islemi\r\n"
				+ "4- Bolme Islemi\r\n"
				+ "5- UslU Sayi Hesaplama\r\n"
				+ "6- Faktoriyel Hesaplama\r\n"
				+ "7- Mod Alma\r\n"
				+ "8- Dikdortgen Alan ve Cevre Hesabı\n"
				+ "9- Cikis yap";
		do {
			System.out.println("bir islem seciniz"+menu);
			select=gir.nextInt();
			System.out.println("bir sayi giriniz");
			int a=gir.nextInt();
			System.out.println("ikinci sayi giriniz");
			int b=gir.nextInt();
			switch(select) {
			case 1:sum(a,b);
			break;
			case 2:extraction(a,b);
			break;
			case 3:impact(a,b);
			break;
			case 4:divide(a,b);
			break;
			case 5:exponentiation(a,b);
			break;
			case 6:factoriel(a,b);
			break;
			case 7:modding(a,b);
			break;
			case 8:rectangle(a,b);
			break;
			}
		}while(select!=0);

	}

}
