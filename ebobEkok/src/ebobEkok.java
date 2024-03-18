import java.util.Scanner;
public class ebobEkok {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        
	        // İki sayıyı kullanıcıdan alıyoruz
	        System.out.print("Birinci sayıyı giriniz: ");
	        int num1 = input.nextInt();
	        
	        System.out.print("İkinci sayıyı giriniz: ");
	        int num2 = input.nextInt();
	        
	        int ebob = 0;
	        int ekok = 0;
	        int i = 1;
	        
	        // Ebob bulma
	        while (i <= num1 && i <= num2) {
	            if (num1 % i == 0 && num2 % i == 0) {
	                ebob = i;  // i, num1 ve num2'nin ortak bölenidir
	            }
	            i++;
	        }
	        
	        // Ekok bulma
	        int max = Math.max(num1, num2);
	        while (true) {
	            if (max % num1 == 0 && max % num2 == 0) {
	                ekok = max;  // max, num1 ve num2'nin ortak katıdır
	                break;
	            }
	            max++;
	        }
	        
	        // Sonuçları ekrana yazdırma
	        System.out.println("Girilen sayıların Ebob'u: " + ebob);
	        System.out.println("Girilen sayıların Ekok'u: " + ekok);

	}
}
