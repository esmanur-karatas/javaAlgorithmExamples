import java.util.Scanner;
public class notOrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int mat,fizik,kimya, turkce, tarih, muzik;
      Scanner inp = new Scanner(System.in);
      System.out.print("Matematik Notunuz: ");
      mat= inp.nextInt();
      
      System.out.print("Fizik Notunuz : ");
      fizik= inp.nextInt();
      
      System.out.print("Kimya Notunuz : ");
      kimya= inp.nextInt();
      
      System.out.print("Türkçe Notunuz : ");
      turkce= inp.nextInt();
      
      System.out.print("Tarih Notunuz : ");
      tarih= inp.nextInt();
      
      System.out.print("Müzik Notunuz : ");
      muzik=inp.nextInt();
      
      int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
      double sonuc= toplam/6;
      System.out.print("Ders Ortalamanız: " +sonuc);
      
      boolean sonuc1= ((sonuc<=59) || (sonuc>=60));
      String st = sonuc<=59 ? "Maalesef Kaldınız" : "Tebrikler Geçtiniz!!";
      System.out.println(st);
     
     
      
	}

}
