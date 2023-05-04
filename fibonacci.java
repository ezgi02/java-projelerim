package projeler;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// fibonacci sersi 
		Scanner input=new Scanner(System.in);

		int n1=0,n2=1,n3,i,n;
		System.out.print("N Sayısını Girin:");
        n = input.nextInt();
       // System.out.print(n1);
        for(i=2;i<n;i++) {
        	n3=n1+n2;
        	System.out.println(n1+"+"+n2+"="+n3);
        	n1=n2;
        	n2=n3;
        	
        }
	}

}
