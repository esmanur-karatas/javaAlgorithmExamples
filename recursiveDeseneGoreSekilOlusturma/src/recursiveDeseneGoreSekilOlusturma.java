import java.util.Scanner;
public class recursiveDeseneGoreSekilOlusturma {
	 static void manipulateSayi(int sayi) {
	        System.out.println(sayi);

	        if (sayi > 0) {
	            manipulateSayi(sayi - 5);
	        } else if (sayi == 0 && sayi + 5 > 0) {
	            manipulateSayi(sayi + 5);
	        }
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        manipulateSayi(sayi);
    }

	}


