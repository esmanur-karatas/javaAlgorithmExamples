# Sieve Of Eratosthenes Algoritması ile Asal Sayıların Sayısını Hesaplama
Bu Java programı, Eratosthenes'in elekleri algoritmasını kullanarak belirli bir sayıya kadar olan asal sayıların sayısını hesaplar.

## Nasıl Çalışır?
-Kullanıcıdan bir pozitif sayı (n) alınır.

-n'e kadar olan tüm sayılar için bir boolean dizisi oluşturulur. Dizinin tüm elemanları başlangıçta true değeri alır.

-Dizideki 0 ve 1 indeksli elemanlar (0 ve 1 sayıları) false olarak işaretlenir, çünkü bu sayılar asal değildir.

-Dizideki her bir asal sayı için, sayının katları (i * j) false olarak işaretlenir. Bu işlem, asal olmayan sayıları eler.

-Kalan tüm true değerler asal sayıları temsil eder.

-Dizideki true değerlerin sayısı hesaplanarak, belirli bir sayıya kadar olan asal sayıların toplam sayısı bulunur.

-Bulunan asal sayıların sayısı ekrana yazdırılır.

## Kullanım
-Programı çalıştırın.

-Program, bir pozitif sayı girmenizi isteyecektir.

-Girilen sayıya kadar olan tüm asal sayıların sayısı ekrana yazdırılacaktır.

## Örnek

![image](https://github.com/esmanur-karatas/javaAlgorithmExamples/assets/83882274/8f9df8c0-cc57-4135-a5f0-47456632126d)
