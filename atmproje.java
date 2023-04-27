package projeler;
import java.util.Scanner;

public class atmproje {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String userName,password;
		int sayi;
		int right=3;
		int balance=1500;
		while(right>0) {
			System.out.print("kullanici Adiniz");
			userName=input.nextLine();
			System.out.println("Sifreniz:");
			password=input.nextLine();
			if(userName.equals("patika")&& password.equals("dev123")) {
				System.out.println("Kodluyoruz bankasina hosgeldiniz");
				System.out.println("1-Para yatirma\n" +
                        "2-Para Cekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Cikiş Yap");
				System.out.println("lutfen yapmak istediginiz işlemi seciniz");
				sayi=input.nextInt();
				switch(sayi) {
				case 1:System.out.println("yatirmak istediginiz para miktarini giriniz");
				int miktar=input.nextInt();
				break;
				case 2:System.out.println("Çekeceginiz para mitarini giriniz");
				int cek=input.nextInt();
				if(cek>1500) {
					System.out.println("Malesef yeterli bakiyeniz yok");
				}
				break;
				case 3:System.out.println("Bakiyeniz:"+balance);
				break;
				case 4:System.out.println("Çikis yapildi bizi tercih ettiginiz için teşekürler");
				default:System.out.println("lutfen verilen aralikta secim yapiniz");
				}
			}
			else {
				right--;
				System.out.println("Hatali kullanici adi veya sifre.Tekar giris yapiniz");
				if(right==0) {
					System.out.println("kartiniz bloke olmustur");
				}
				System.out.println("kalan hakkiniz:"+ right);
			}
		}
		
		


		
	}
	
}
