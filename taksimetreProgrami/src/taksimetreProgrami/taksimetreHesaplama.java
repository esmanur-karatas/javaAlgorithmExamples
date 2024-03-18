package taksimetreProgrami;

import java.util.Scanner;

public class taksimetreHesaplama {

	public static void main(String[] args) {
		double km,perKm=2.20, total, minTotal=20, startPrice=10;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Kaç Kilometre Gittiğinizi Giriniz:");
		km= input.nextDouble();
		total= km * perKm;
		total+=startPrice;
		total= (total<20) ? 20: total;
		System.out.println("taksimetre tutarı : "+total );
		
 
	}
}
