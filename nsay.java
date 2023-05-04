package projeler;

import java.util.Scanner;

public class nsay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("kaç tane sayi girmek istiyorsaniz giriniz");
		int n=input.nextInt();
		int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
		for(int i=1;i<=n;i++) {
			System.out.print(i+".sayiyi giriniz");
			int x=input.nextInt();
			if(x>max) max=x;
			else if(x<min) min=x;
			
		}
		 System.out.println("en büyük değer: "+max);
	     System.out.println("en küçük değer: "+min);
	
	}

}
