import java.util.Scanner;

//		System.out.println("")

public class Main {

	public static void main(String[] args) {
		// Mayin Tarlasi
		Scanner scan=new Scanner(System.in);
		int row,column;
		System.out.println("Mayin tarlasina hosgeldiniz");
		System.out.println("Lutfen oynamak istediginiz boutlari giriniz");
		System.out.println("Satir sayisi:");
		row=scan.nextInt();
		System.out.println("Sutun sayisi");
		column=scan.nextInt();
		MayinTarlasi mayin=new MayinTarlasi(row,column);
		mayin.run();
}
	
}
