package projeler;
import java.util.Scanner;

public class diziminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] list = {15,12,788,1,-1,-778,2,0};
			Scanner input = new Scanner(System.in);
			int sayi=input.nextInt();
	        int min=0,max=0;
	        for (int i : list) {
	            if (i < sayi) {
	                min = i;
	                break;
	            }
	           
	        }
	        for(int i:list) {
	        	if(i>sayi) {
	        		max=i;
	        		break;
	        	}
	        }

	        System.out.println("Minimum Değer " + min);
	        System.out.println("Maximum Değer " + max);

		
	}

}
