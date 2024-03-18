import java.util.Scanner;

public class minMaxDegeriBulma {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n, a;
	int max= Integer.MIN_VALUE;
	int min= Integer.MAX_VALUE;
	
	
	System.out.print("Kaç tane sayı gireceksiniz: ");
    n= scan.nextInt();
    
    for (int i = n; i <=n; i++) {
    	for (int j =1 ; j <=n; j++) {
			System.out.print(j+". Sayıyı Giriniz:");
			a=scan.nextInt();
			
			if (a > max) {
				max = a;
				
				if (a < min) {
				min= a ;
			}
			
			}
		}
		
    	System.out.println("En Büyük Sayı: "+ max);
    	System.out.print("En Küçük Sayı: "+min);
		
		
	}
	}

}
