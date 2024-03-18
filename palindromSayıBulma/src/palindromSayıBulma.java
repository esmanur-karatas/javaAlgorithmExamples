import java.util.Scanner;
public class palindromSayıBulma {
     static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
     
        
        return originalNumber == reverse;
     }
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        
	        System.out.print("Bir sayı giriniz: ");
	        int number = input.nextInt();
	        
	        if (isPalindrome(number)) {
	            System.out.println(number + " bir palindromik sayıdır.");
	        } else {
	            System.out.println(number + " bir palindromik sayı değildir.");
	        }
	    }
		

	}


