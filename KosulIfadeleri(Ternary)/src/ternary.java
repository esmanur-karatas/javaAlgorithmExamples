import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Lütfen Yaşınızı Giriniz: ");
	int age= scanner.nextInt();
	System.out.println(age>=18 ? "Ehliyet Alabilirsiniz." : "Ehliyet Alamazsınız.");

	}

}
