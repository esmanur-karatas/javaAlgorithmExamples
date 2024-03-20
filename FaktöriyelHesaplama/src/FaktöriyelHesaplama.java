import java.util.Scanner;

public class FaktöriyelHesaplama {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Lütfen Bir Sayı Giriniz: ");
		int number = scanner.nextInt();
		
		int faktöriyel=number;
		for(int i=number-1; i>0; i-- ) {
			faktöriyel*=i;
			
		}
		System.out.println(number+"!=  "+faktöriyel );

	}

}
