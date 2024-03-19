import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Lütfen Bir Sayı Giriniz: ");
		int number=scanner.nextInt();
		
		  int reversedNumber = reverseDigits(number);
	        
	        System.out.println("Girilen Sayının Tersi: " + reversedNumber);
	    }
	    
	  
	    public static int reverseDigits(int number) {
	        int reversedNumber = 0;
	        
	       
	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }
	        
	        return reversedNumber;
	    }
		

	}


