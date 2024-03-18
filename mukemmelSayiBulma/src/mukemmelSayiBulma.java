import java.util.Scanner;

public class mukemmelSayiBulma {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int number, sum=0;
		System.out.print("Lütfen Bir Sayı Giriniz: ");
		number= scan.nextInt();
		
		for (int i = 1; i < number; i++) {
			if (number % i==0) {
				sum +=i;
			}
		}
		if (sum==number) {
			System.out.println(number +" Bir Mükemmel Sayıdır.");
		}else {
			System.out.print(number + " Bir Mükemmel Sayı Değildir.");
		}
		

	}

}
