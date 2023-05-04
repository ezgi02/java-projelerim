package projeler;

public class asalsayi {

	public static void main(String[] args) {
		// 1-100 arasinda asal sayi bulma 
		
		for(int i=2;i<100;i++) {
			boolean asalmi=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					asalmi=false;
					break;
					
				}
			}
			if(asalmi) {
				System.out.println(i);
			}
		}

	}

}
