package projeler;
import java.util.Scanner;

public class burcbulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("dogdunuz ayi girin ve gunude yazin");
		int ay=input.nextInt();
		int gun=input.nextInt();
		if(ay==1) {
			if(gun<=21) {
				System.out.println("oglak");			}
			else {
				System.out.println("kova");
				}
		}
		else if(ay==2) {
			if(gun<=19) {
				System.out.println("kova");}
			else {
				System.out.println("balik");
			}
		}
		else if(ay==3) {
			if(gun<20) {				
				System.out.println("balik");
			}
			else {				
				System.out.println("koç");
			}
		}
		else if(ay==4) {
			if(gun<20) {
				System.out.println("koç");
				}
			else {
				System.out.println("boga");
			}
		}
		else if(ay==5) {
			if(gun<22) {
				System.out.println("boga");
				}
			else {
				System.out.println("ikizler");
			}
		}
		else if(ay==6) {
			if(gun<22) {
				System.out.println("ikizler");
				}
			else {
				System.out.println("yengec");
			}
		}
		else if(ay==7) {
			if(gun<22) {
				System.out.println("yengec");
				}
			else {
				System.out.println("aslan");
			}
		}
		else if(ay==8) {
			if(gun<23) {
				System.out.println("aslan");
				}
			else {
				System.out.println("basak");
			}
		}
		else if(ay==9) {
			if(gun<23) {
				System.out.println("basak");
				}
			else {
				System.out.println("terazi");
			}
		}
		else if(ay==10) {
			if(gun<23) {
				System.out.println("terazi");
				}
			else {
				System.out.println("akrep");
			}
		}
		else if(ay==11) {
			if(gun<22) {
				System.out.println("akrep");
				}
			else {
				System.out.println("yay");
			}
		}		
		else if(ay==12) {
			if(gun<22) {
				System.out.println("yay");
				}
			else {
				System.out.println("oglak");
			}
		}







		
		
	}

}
