package projeler;

import java.util.Random;
import java.util.Scanner;

public class sayiTahmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int number=rand.nextInt(100);
		
		//int number=(int)(Math.random()*100);
		Scanner input=new Scanner(System.in);
		//System.out.println(number);
		int right=0;
		int selected;
		while(right<5) {
			System.out.println("lutfen tahmininizi giriniz");
			selected=input.nextInt();
			if(selected<0|| selected>99) {
				System.out.println("Lutfen 0-100 arasinda bir deger giriniz");
				continue;
			}
			if(selected==number) {
				System.out.println("tebrikler dogru tahmin!Tahmin ettiginiz sayi:"+number);
				break;
			}
			else {
				right++;
				System.out.println("Hatali bir sayi girdiniz");
				if(selected>number) {
					System.out.println(selected+"sayisi gizli sayidan büyüktür");
				}
				else {
					System.out.println(selected+"sayisi gizli sayidan kücüktür");
				}
			}
			System.out.println("kalan hak:"+(5-right));
			
		}

	}

}
