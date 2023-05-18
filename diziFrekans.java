package projeler;

public class diziFrekans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi= {10, 20, 20, 10, 10, 20, 5, 20};
		int sayi=0;
		int sayi2=0;
		int sayi3=0;
		for(int i=0;i<dizi.length;i++) {
			if(dizi[i]==10) {
				sayi++;}
			if(dizi[i]==5) {
				sayi2++;
			}
			if(dizi[i]==20) {
				sayi3++;
			}
		
		}
		System.out.print("10 sayisi "+sayi+"kere tekrar edildi");
		System.out.print("\n 5 sayisi "+sayi2+"kere tekrar edildi");
		System.out.print("\n 20 sayisi "+sayi3+"kere tekrar edildi");
		
	}

}
