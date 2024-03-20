import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomOrtalamaHesaplama {

	public static void main(String[] args) {
		Random random= new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Sayı Adedi Giriniz: ");
		int number= scanner.nextInt();
		
		int[] numbers= new int[number];
		
		for (int i=0; i<numbers.length;i++) {
			numbers[i]=random.nextInt(100);
		}
		System.out.println(Arrays.toString(numbers));
		
		float toplam=0.0f;
		for(int i=0;i<numbers.length;i++) {
			toplam += numbers[i];
		}
		
		float ortalama= toplam /number;
		System.out.println("Ortalama: "+ortalama);

	}

}
