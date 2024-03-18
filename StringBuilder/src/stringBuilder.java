import java.util.Scanner;

public class stringBuilder {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Lütfen bir değer giriniz: ");
		String userInput= scanner.nextLine();
		System.out.println("Girilen değer= " +userInput);
		
		//StringBuffer Metodu Kullanımı
		StringBuffer buffer=new StringBuffer();
		System.out.print("Adınız: ");
		buffer.append(scanner.nextLine());
		System.out.print("Soyadınız: ");
		buffer.append(scanner.nextLine());
		System.out.println(buffer.toString());
		
		

	}

}
