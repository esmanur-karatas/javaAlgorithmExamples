package hipotenüsHesaplama;

import java.util.Scanner;

public class hipo {

	public static void main(String[] args) {
		int a,b;
		double c;
		Scanner input= new Scanner(System.in);
		System.out.println("üçgenin a kenarını giriniz:");
		a=input.nextInt();
		System.out.println("üçgenin b kenarını giriniz:");
		b= input.nextInt();
		c=Math.sqrt((a*a) + (b*b));
		System.out.println("üçgenin hipotenüsü: "+c);
		
		

	}

}
