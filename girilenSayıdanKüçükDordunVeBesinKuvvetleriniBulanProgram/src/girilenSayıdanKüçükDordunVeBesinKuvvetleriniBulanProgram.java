import java.util.Scanner;

public class girilenSayıdanKüçükDordunVeBesinKuvvetleriniBulanProgram {

	public static void main(String[] args) {
		int n, kuvvet4=1, kuvvet5=1, i=1;
		Scanner scan= new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		n=scan.nextInt();
		
		do {
		
		kuvvet4 *=4;
		System.out.println("4^" + i + " = " +kuvvet4);
		i++;
		kuvvet5 *=5;
		System.out.println("5^" + i +" = " +kuvvet5);
		i++;
		
		} while (i<=n);
}
}

	


