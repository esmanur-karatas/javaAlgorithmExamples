import java.util.Scanner;

public class havaSicakligi {

	public static void main(String[] args) {
		int heat;
		Scanner input= new Scanner(System.in);
		System.out.print("Lütfen hava sıcaklığını giriniz: ");
		heat= input.nextInt();
		if (heat<5) {
			System.out.println("Kayak yapınız");
			
		}else if(heat<=25){
			if (heat<=15) {
				System.out.println("sinemaya gidiniz");
			}
			if (heat>=10) {
				System.out.println("piknik yapınız");
			}
		}else {
			System.out.println("yüzmeye gidebilirsin bebek");
		}
		

	}

}
