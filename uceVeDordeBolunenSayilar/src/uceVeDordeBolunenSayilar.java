import java.util.Scanner;

public class uceVeDordeBolunenSayilar {

	public static void main(String[] args) {
	    int k, toplam=0, adet=0;
	    Scanner input= new Scanner(System.in);
	    System.out.print("Lütfen bir sayı giriniz: ");
	    k=input.nextInt();
	    for ( int i=0 ; i<=k ; i++) {
	    	if (i%3==1 && i%4==0) {
	    		System.out.println(i);
	    		toplam += i;
                adet++;
	    	}
	    }
                if (adet > 0) {
	             double ortalama = (double) toplam / adet;
	             System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
			}else {
				System.out.println("3 ve 4' e tam bölünen sayı bulunamadı.");
			}
	    }
	    	 
	    }
	

	

	


