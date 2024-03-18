# Uçak Bileti Fiyat Hesaplama Uygulaması

Bu proje, kullanıcının girdiği mesafe, yaş ve yolculuk tipine göre uçak bileti fiyatını hesaplayan bir Java programını içermektedir.

## Kullanım

1. Mesafeyi kilometre cinsinden girin.
2. Yaşınızı girin.
3. Yolculuk tipini belirtin (1 => Tek Yön, 2 => Gidiş Dönüş).
4. Program, hesapladığı toplam tutarı görüntüler.

## Detaylar

Bu program, kullanıcının verdiği mesafe, yaş ve yolculuk tipine göre uçak bileti fiyatını hesaplar. İlk olarak mesafe, yaş ve yolculuk tipi girdileri alınır. Ardından, belirli yaş aralıklarına ve yolculuk tipine göre indirimler hesaplanır ve uygulanır. Sonuç olarak, toplam indirimli bilet fiyatı ekrana yazdırılır.

## Senaryolar

**Senaryo 1:**
Mesafeyi km türünden giriniz: 1500
Yaşınızı giriniz: 20
Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): 2

Toplam Tutar = 216.0 TL

**Senaryo 2:**
Mesafeyi km türünden giriniz: -500
Yaşınızı giriniz: 1
Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): 77

Hatalı Veri Girdiniz !

**Senaryo 3:**
Mesafeyi km türünden giriniz: 200
Yaşınızı giriniz: 35
Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): 1

Toplam Tutar = 20.0 TL 

