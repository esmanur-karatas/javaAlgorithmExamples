import java.util.Scanner;

public class harmonikSayiBulma {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n;
		System.out.print("Lütfen Bir n Sayısı giriniz: ");
		n= scan.nextInt();
		
		double result=0;
		for (double i=1; i<=n; i++) {
			result += (1/i);
			
		}
		System.out.print(result);

	}

}
