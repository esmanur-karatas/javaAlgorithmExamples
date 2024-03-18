import java.util.Iterator;
import java.util.Scanner;

public class usluSayiBulanProgram {

	public static void main(String[] args) {
		int n,k;
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen üssü heseplanacak sayıyı giriniz: ");
		n= scan.nextInt();
		System.out.print("Lütfen hesaplanacak sayının üssünü giriniz: ");
		k=scan.nextInt();
		
		int total=1;
	
		for (int i=1; i<=k; i++) {
			total*=n;	
		}
		 System.out.println(n + "^" + k + " = " + total);
		

	}

}
