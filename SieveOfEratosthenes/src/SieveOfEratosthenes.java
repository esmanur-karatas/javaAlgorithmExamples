import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		SieveOfEratosthenes seo= new SieveOfEratosthenes();
		System.out.println("Lütfen Pozitiv Bir Sayı Giriniz:" );
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		seo.countNumberOfPrimesUpTo(n);
	}
	
	void countNumberOfPrimesUpTo(int n ) {
		boolean[] list= new boolean[n+1];
		Arrays.fill(list, true);
		list[0]=false;
		list[1]=false;
		
		for(int i=2; i<=n ; i++) {
			if(list[i]==true)
				for(int j=2; i*j<=n;j++)
					list[i*j]=false;
		}
		int numberOfPrimes=0;
		for (boolean b:list) {
			if(b)
				numberOfPrimes++;
		}
		System.out.println(n+ " sayısına kadar "+ numberOfPrimes+ " tane asal sayı vardır.");
	}

}
