import java.util.Scanner;

public class StarBetweenLetters {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.print("Lütfen Bir Kelime Giriniz: ");
	String word= scanner.nextLine();
    
	
	String newWord = "";
    for (int i = 0; i < word.length(); i++) {
        newWord += word.charAt(i);
        if (i != word.length() - 1) {
            newWord += "*";
        }
    }
    System.out.println(newWord);
	}
}

		
	
