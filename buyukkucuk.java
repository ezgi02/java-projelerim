package projeler;
import java.util.Scanner;

public class buyukkucuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 sayi içerisinden en buyuk sayiyi girme
		Scanner input = new Scanner(System.in);
		System.out.println("3 tane sayi giriniz");
		int max,min,midtterm;
		int sayi1,sayi2,sayi3;
		sayi1=input.nextInt();
		sayi2=input.nextInt();
		sayi3=input.nextInt();
		if (sayi1>sayi2 && sayi1>sayi3) {
            if (sayi2>sayi3){
                System.out.println("Kucukten buyuge sıralama : "+sayi3 + sayi2 + sayi1);

            }
            else {
                System.out.println("Kucukten buyuge sıralama :"+sayi2 + sayi3 + sayi1 );
            }

        } else if (sayi2>sayi1 && sayi2>sayi3) {
            if (sayi1>sayi3){
                System.out.println("Kucukten buyuge sıralama : "+sayi3 + sayi2 + sayi2);

            }
            else {
                System.out.println("Kucukten buyuge sıralama :" +sayi1 + sayi3 + sayi2);
            }

        }
        else if (sayi3>sayi1 && sayi3>sayi2) {
            if (sayi1>sayi2){
                System.out.println("Kucukten buyuge sıralama : "+sayi2 + sayi1 + sayi3);

            }
            else {
                System.out.println("Kucukten buyuge sıralama : "+sayi1 + sayi2 + sayi3);
            }

        }

	}

}
