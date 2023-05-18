package projeler;
import java.util.Arrays;
public class tekraredencift {

	public static void main(String[] args) {
		int[] numbers = {0,13,44,24,34,22,24,-135,44,22,56,34,0,-4,0};
        System.out.println("Dizi : " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println("Kucukten Buyuge Sirali : " + Arrays.toString(numbers));

        int counter=0;
        for(int i=0; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]){
                int aynisayi = numbers[i];
                if(aynisayi % 2 == 0){
                    counter++;
                    System.out.print(aynisayi + " ");
                }
            }
        }
        if(counter == 0){
            System.out.println("Birden fazla tekrar eden çift sayı yok.");
        }
			
	}

}
