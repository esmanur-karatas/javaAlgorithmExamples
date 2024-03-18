import java.util.Scanner;
public class basamakSayiToplami {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Bir sayı girin: ");
		        int sayi = input.nextInt();

		        int toplam = 0;
		        int temp = sayi;

		        while (temp != 0) {
		            int basamak = temp % 10;
		            toplam += basamak;
		            temp /= 10;
		        }

		        System.out.println("Sayının basamakları toplamı: " + toplam);


	}

}
