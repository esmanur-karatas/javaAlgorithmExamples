# Basamak Sayı Toplama Programı
Bu program, kullanıcıdan bir tam sayı alır ve bu sayının basamaklarındaki rakamların toplamını hesaplar.

## Nasıl Çalışır?
-İlk olarak, bir Scanner nesnesi oluşturulur ve kullanıcıdan bir tam sayı girmesi istenir.
-Girilen sayı bir değişkene (sayi) atanır.
-Bir döngü kullanılarak, sayının her basamağına erişilir:
-Her döngü adımında, temp adlı geçici bir değişkende sayının kalanı alınarak (temp % 10) ve bu kalan basamak adlı bir değişkene atanır.
-Bu basamak değeri toplam değişkenine eklenir.
-Ardından, temp değişkeni 10'a bölünerek bir sonraki basamağa geçilir (temp /= 10).
-Bu işlem, temp değişkeni sıfır olana kadar devam eder.
-Döngü bittikten sonra, basamakların toplamı ekrana yazdırılır.

## Örnek Kullanım:

![image](https://github.com/esmanur-karatas/javaAlgorithmExamples/assets/83882274/bf16be14-4001-49b0-8cfb-6905ce45e789)
