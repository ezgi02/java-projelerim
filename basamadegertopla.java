package projeler;
import java.util.Scanner;
public class basamadegertopla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t=0;
		int y;
	System.out.println("Please enter a number");
	int x=input.nextInt();
	while(x>0) {
		y=x%10;
		x=x/10;
		t+=y;
	}
	System.out.print("Sum of numbers");
	System.out.print(t);

	}
	
}
