import java.util.Scanner;

public class Toplama {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		long total=0;
		while(true) {
			int x= scanner.nextInt();
			if(x==0) {
				break;
			}
			total +=x;
			
		}
		System.out.println("Girilen Değerlerin Toplamı: "+total);

	}

}
