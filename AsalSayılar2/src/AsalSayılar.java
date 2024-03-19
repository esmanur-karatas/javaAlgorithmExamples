import java.util.Scanner;

public class AsalSayılar {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen Bir Sayı Giriniz: ");
	        int number = scanner.nextInt();

	        for (int i = 2; i <= number; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.println(i);
	            }
	        }
	    }
	}