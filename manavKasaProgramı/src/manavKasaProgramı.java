import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class manavKasaProgramı {

	public static void main(String[] args) {
		double armut, elma, domates, muz, patlican, sonuc;
		
		
		Scanner input= new Scanner(System.in);
		System.out.print("Lütfen armutun kilosunu yazınız: ");
		armut= input.nextDouble();
		
		System.out.print("Lütfen elma kilosunu yazınız: ");
		elma= input.nextDouble();
		
		System.out.print("Lütfen domatesin kilosunu yazınız: ");
		domates= input.nextDouble();
		
		System.out.print("Lütfen muzun kilosunu yazınız: ");
		muz= input.nextDouble();
		
		System.out.print("Lütfen patlıcanın kilosunu yazınız: ");
		patlican= input.nextDouble();
		
		sonuc= armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00;
		System.out.print("TOPLAM TUTAR: "+sonuc+" TL");
	}

}
