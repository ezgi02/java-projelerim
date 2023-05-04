package projeler;
import java.util.Scanner;

public class elmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavye=new Scanner(System.in);
		 System.out.println("Bir Sayı Giriniz");
	        int n=klavye.nextInt();
	        for (int x = 0; x <= n ; x++) {
	            for (int t = 0; t < (n - x); t++) {
	                System.out.print(" ");
	            }
	            for (int m = 1; m <= (2 * x + 1); m++) {
	                System.out.print("*");
	            }
	            System.out.println(" ");
	        }
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<=i;j++){
	                System.out.print(" ");
	            }   
	            for(int k=2*n-1;k>=(2*i+1);k--){
	                System.out.print("*");
	                
	            }
	                System.out.println();   

	        }

	}

}
