import java.util.Scanner;

public class Ucgen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startCount=scanner.nextInt();
		int i= 1;
		while(i<=startCount) {
			int j =0;
			while (j<i) {
				System.out.print("  *");
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}

}
