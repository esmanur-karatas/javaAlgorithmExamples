import java.util.Scanner;

public class tekSayilerinToplaminiBulanProgram {

	public static void main(String[] args) {
		int n;
		int total=0;
		Scanner scan= new Scanner(System.in);
		
		do {
			System.out.print("Lütfen bir sayı giriniz: ");
			n = scan.nextInt();
			if (n % 2==0 && n % 4 == 0) {
				total +=n;
			}
			
		} while (n % 2 !=1);
		System.out.println("Toplam: "+total);

	}

}
