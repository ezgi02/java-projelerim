package projeler;
import java.util.Scanner;
public class artikyil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Yil Giriniz");
		int yil=input.nextInt();
		if(yil%4==0) {
			System.out.println(yil+"bir artik yildir");
		}
		else {
			System.out.println(yil+"bir artik yil degildir");
		}

	}

}
