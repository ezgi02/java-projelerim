package projeler;
import java.util.Scanner;
public class notort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int toplam=0,count=0;
		System.out.println("Matematikten kac aldiniz");
		int mat=input.nextInt();
		System.out.println("fizikten kac aldiniz");
		int fiz=input.nextInt();
		System.out.println("turkceden kac aldiniz");
		int turk=input.nextInt();
		System.out.println("kimyadan kac aldiniz");
		int kim=input.nextInt();
		System.out.println("muzikten kac aldiniz");
		int muz=input.nextInt();
		if(muz>0 && muz<=100) {
			toplam+=muz;
			count++;
		}
		if(kim>0 && kim<=100) {
			toplam+=kim;
			count++;
		}
		if(turk>0 && turk<=100) {
			toplam+=turk;
			count++;
		}
		if(fiz>0 && fiz<=100) {
			toplam+=fiz;
			count++;
		}
		if(mat>0 && mat<=100) {
			toplam+=mat;
			count++;
		}
		int ort=toplam/count;
		if(ort>55) {
			System.out.println(ort+"Gectiniz tebrikler");
		}
		else {
			System.out.println("Kaldiniz Malesef:(");
		}
		
		
	}

}
