package boksMaci;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fighter f1=new fighter("A",10,120,100);
		fighter f2=new fighter("B",20,85,85);
		Match match=new Match(f1,f2,85,100);
		match.run();
}
	}
