package projeler;
import java.util.Scanner;
public class recursive {
	static void dondur () {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        int n = inp.nextInt();

      int ilkSayi = n;
      System.out.print("Çıktı :" +n+" ");

      for (int i=n; i>0;i-=5){
          ilkSayi-=5;
          System.out.print(ilkSayi+" ");
      }
      
      int sonSayi =ilkSayi;
      for (int i=sonSayi;i<n;i+=5){
          sonSayi+=5;
          System.out.print(sonSayi+" ");

      }

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        dondur();
	}

}
