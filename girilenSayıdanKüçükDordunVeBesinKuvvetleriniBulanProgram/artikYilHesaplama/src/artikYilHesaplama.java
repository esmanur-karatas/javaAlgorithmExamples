import java.util.Scanner;

public class artikYilHesaplama {

	public static void main(String[] args) {
		 int yil, kalanY, kalanD, kalan;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Yıl Giriniz : ");
	        yil = input.nextInt();

	        kalanY = yil % 100;
	        kalanD = yil % 4;

	        if (kalanD == 0) {
	            if (kalanY == 0) {
	                kalan = yil % 400;
	                if (kalan == 0) {
	                    System.out.print(yil + " bir artık yıldır !");
	                } else {
	                    System.out.print(yil + " bir artık yıl değildir !");
	                }
	            } else {
	                System.out.print(yil + " bir artık yıldır !");
	            }
	        } else {
	            System.out.print(yil + " bir artık yıl değildir !");
	        }

	}

}
