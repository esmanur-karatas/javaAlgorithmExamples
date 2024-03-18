import java.util.Scanner;
public class recursiveUsAlma {
	 public static int usAl(int taban, int us) {
	        if (taban == 0) {
	            return 0;
	        } else if (us == 0) {
	            return 1;
	        } else {
	            return taban * usAl (taban, us - 1);
	        }
	 }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Tabanı girin: ");
	        int taban = scanner.nextInt();
	        
	        System.out.print("Üssü girin: ");
	        int us = scanner.nextInt();
	        
	        int sonuc = usAl(taban, us);
	        System.out.println("Sonuç: " + sonuc);
	    

	}

}
