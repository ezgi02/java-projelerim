package projeler;
import java.util.Scanner;
public class kullanicigiris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String username,password,cevap;
		System.out.println("kullanici adini girin");
		username=input.nextLine();
		System.out.println("sifrenizi girin");
		password=input.nextLine();
		if(username.equals("patika")&& password.equals("java123")) {
			System.out.println("giris yapitiniz");
		}
		else {
			System.out.println("hatali giris sifreyi sifirlamak istermisin");
			cevap=input.nextLine();
			if(cevap.equals("evet")) {
				password="";
				password=input.nextLine();
				if(password.equals("java123")) {
					System.out.println("sifre olusturulamadi tekrar deneyiniz");
				}
				else {
					System.out.println("sifre yenilendi");
				}
			}
		}
	}

}
