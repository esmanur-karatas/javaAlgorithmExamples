# Dövüşçü ve Maç Simülasyonu
Bu Java programı, iki dövüşçünün bir maçta birbirlerine karşı dövüşmelerini simüle eder. Dövüşçülerin isimleri, hasarları, sağlık puanları, ağırlıkları ve kaçma şansları özelliklerine göre belirlenir.

## Fighter Sınıfı
Bu sınıf, dövüşçülerin özelliklerini tanımlar.

##Özellikler:
-name: Dövüşçünün adı.

-damage: Dövüşçünün saldırı hasarı.

-health: Dövüşçünün sağlık puanı.

-weight: Dövüşçünün ağırlığı.

-dodge: Dövüşçünün kaçma şansı yüzdesi.

##Metodlar:

hit(Fighter foe): Dövüşçünün rakibine saldırması için kullanılır. Saldırı yapıldığında, rakibin sağlık puanı azaltılır.

isDodge(): Dövüşçünün saldırıdan kaçıp kaçmadığını belirlemek için kullanılır.

Match Sınıfı
Bu sınıf, dövüşçüler arasındaki maçı simüle eder.

## Özellikler:
f1: Birinci dövüşçü.

f2: İkinci dövüşçü.

minWeight: Maçın geçerli olabilmesi için gereken minimum ağırlık.

maxWeight: Maçın geçerli olabilmesi için gereken maksimum ağırlık.

Metodlar:

run(): Maçı başlatır ve devam ettirir.

isCheck(): Dövüşçülerin maç için uygun ağırlıkta olup olmadığını kontrol eder.

isWin(): Maçın kazananını belirler.

Main Sınıfı

Bu sınıf, programın başlangıç noktasını içerir.


## Katkıda Bulunma
Herhangi bir katkı veya geri bildirimde bulunmak isterseniz, lütfen bir pull talebi açın veya bir sorun bildirin. Katkılarınızı bekliyoruz!

