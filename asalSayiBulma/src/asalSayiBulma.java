import java.util.Scanner;
public class asalSayiBulma {

	public static void main(String[] args) {
		System.out.print("Sayı Giriniz : ");
		int sayi = new Scanner(System.in).nextInt();
		boolean durum = true;
		for (int i = 2; i < sayi; i++) 
		{
			if (sayi % i == 0) 
			{
				durum=false;
				break;
			}
		}
		
		if (durum==true) 
		{
			System.out.println(sayi+" Asal sayıdır.");
		}
		else 
		{
			System.out.println(sayi+" Asal Sayı Değildir.");
		}
	}
}


