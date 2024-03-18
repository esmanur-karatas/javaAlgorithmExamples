import java.util.Scanner;

public class kullaniciGirisi {

	public static void main(String[] args) {
        final String userName = "esmanur karatas";
        final String password = "java123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Şifrenizi girin: ");
        String girisSifre = scanner.nextLine();

        switch (kullaniciAdi) {
            case userName:
                if (girisSifre.equals(password)) {
                    System.out.println("Giriş başarılı!");
                } else {
                    System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
                    String cevap = scanner.nextLine();

                    if (cevap.equalsIgnoreCase("evet")) {
                        System.out.print("Yeni şifrenizi girin: ");
                        String yeniSifre = scanner.nextLine();

                        if (!yeniSifre.equals(girisSifre) && !yeniSifre.equals(password)) {
                            System.out.println("Şifre oluşturuldu.");
                        } else {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }
                    } else {
                        System.out.println("Giriş başarısız!");
                    }
                }
                break;

            default:
                System.out.println("Geçersiz kullanıcı adı!");
                break;
        
    }


          } 

	}


