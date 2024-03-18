package daireninAlanıVeÇevresi;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class daire {

	public static void main(String[] args) {
		double alan,cevre, pi=3.14, r  ;
		Scanner input = new Scanner(System.in);
		System.out.print("Yarıçapı giriniz: ");
		r= input.nextDouble();
		alan=pi*r*r;
		cevre=2*pi*r;
		System.out.println("Dairenin Alanı: "+alan);
		System.out.println("Dairenin Çevresi:"+cevre);

	}

}
