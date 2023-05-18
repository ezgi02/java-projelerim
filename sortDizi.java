package projeler;
import java.util.Scanner;
import java.util.Arrays;
public class sortDizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dizinin boyutunu girniz");
		Scanner input=new Scanner(System.in);
		int boyut=input.nextInt();
		int[] dizi=new int[boyut];
		for(int i=0;i<5;i++) {
			dizi[i]=input.nextInt();
		}
		Arrays.sort(dizi);
		System.out.println("Siralama"+Arrays.toString(dizi));
	}

}
