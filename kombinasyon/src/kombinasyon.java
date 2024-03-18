import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
		int n,r;
		int total=1;
		Scanner scan= new Scanner(System.in);
		System.out.print("Lütfen n sayısını giriniz: ");
		n= scan.nextInt();
		System.out.print("Lütfen r sayısını giriniz: ");
		r= scan.nextInt();
		
		int nFaktoriyel = 1;
        int rFaktoriyel = 1;
        int nMinusRFaktoriyel = 1;
		
		  int i = 1;
	        while (i <= n) {
	            nFaktoriyel *= i;
	            if (i <= r) {
	                rFaktoriyel *= i;
	            }
	            if (i <= n - r) {
	                nMinusRFaktoriyel *= i;
	            }
	            i++;
	        }
	        int kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);

	        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
			
			
		}

	}


