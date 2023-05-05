package projeler;

public class polindrom {
	static String isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return number + " palindrom bir sayıdır.";
        }else {
            return number + " palindrom bir sayı değildir.";
        }

    }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isPalindrom(558));

	}

}
