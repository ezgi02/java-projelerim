package projeler;
import java.util.Scanner;

public class notortalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int physics, chemistry, Turkish, history,music;
	    Scanner input=new Scanner(System.in);
	    System.out.println("please enter physics exam grade: ");
	    physics=input.nextInt();
	    System.out.println("please enter Turkish exam grade: ");
	    Turkish=input.nextInt();
	    System.out.println("please enter chemistry exam grade: ");
	    chemistry=input.nextInt();
	    System.out.println("please enter history exam grade: ");
	    history=input.nextInt();
	    System.out.println("please enter music exam grade: ");
	    music=input.nextInt();
	    int exam=Turkish+physics+music+history+chemistry;
	    float ort=exam/5;
	    System.out.println("avarege of all exam is =>");
	    System.out.println(ort);
	    
	    if(ort>60) {
	    	System.out.println("Sınıfı geçtiniz :)");
	    }
	    else {
	    	System.out.println("malesef kaldiniz :(");
	    }

	}

}
