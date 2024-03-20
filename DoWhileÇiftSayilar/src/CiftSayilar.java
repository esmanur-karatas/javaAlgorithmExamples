import java.util.Scanner;

public class CiftSayilar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen 1. Sayıyı Giriniz: ");
		int oneNumber=scan.nextInt();
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Lütfen 2. Sayıyı Giriniz: ");
		int firstNumber = scanner.nextInt();
		
		while(oneNumber<firstNumber)
		{
			if(oneNumber%2==0) {
				System.out.println(oneNumber);
			}
			
			oneNumber++;
		}

	}

}
