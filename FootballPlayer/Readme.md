# Football Player Class Example

Bu örnek, bir futbol oyuncusunun temel bilgilerini ve performansını takip etmek için basit bir Java sınıfını içerir.

## FootballPlayerTest Sınıfı

`FootballPlayerTest` sınıfı, `FootballPlayer` sınıfını test etmek için kullanılmaktadır. Bu sınıf, bir futbol oyuncusunun performansını kaydetmek için örnek bir nesne oluşturur, oyuncunun dakika oynama ve gol atma işlemlerini simüle eder ve sonuçları ekrana yazdırır.

Örnek bir çalışma şu adımları içerir:
1. Bir futbol oyuncusu oluşturulur.
2. Oyuncunun numarası, adı, oynadığı dakikalar, attığı gol sayısı ve oyun durumu belirlenir.
3. Oyuncu sahaya girer ve gol atar.
4. Oyuncunun attığı gol sayısı ve oynadığı dakika sayısı ekrana yazdırılır.
5. Oyuncu daha fazla süre oynar ve bir gol daha atar.
6. Yeniden gol sayısı ve oynadığı dakika sayısı ekrana yazdırılır.

## FootballPlayer Sınıfı

`FootballPlayer` sınıfı, bir futbol oyuncusunun temel özelliklerini ve performansını saklar. Bu sınıf, oyuncunun numarası, adı, oynadığı dakikalar, attığı gol sayısı gibi özellikler ile oynama ve gol atma gibi işlevleri içerir.

### Özellikler (Properties)

- `no`: Futbol oyuncusunun numarasını tutar.
- `name`: Futbol oyuncusunun adını tutar.
- `minutes`: Oyuncunun oynadığı toplam dakikayı tutar.
- `numberOfGoals`: Oyuncunun attığı toplam gol sayısını tutar.
- `inPlay`: Oyuncunun oyun içinde olup olmadığını belirten bir boolean değerdir.

### Metodlar (Methods)

- `play(int minutesToPlay)`: Oyuncunun belirtilen dakika kadar oynamasını sağlar.
- `score()`: Oyuncunun bir gol atmış olduğunu işaretler.

## Nasıl Çalıştırılır

Java derleyicisi ve çalıştırıcısı kullanılarak `FootballPlayerTest` sınıfı çalıştırılabilir. Öncelikle `FootballPlayerTest.java` dosyası derlenir ve ardından oluşturulan `.class` dosyası çalıştırılır.

Örnek çalıştırmak için aşağıdaki adımları izleyebilirsiniz:

1. Terminal veya komut istemcisini açın.
2. Proje dizinine gitmek için `cd` komutunu kullanın.
3. `javac FootballPlayerTest.java` komutunu kullanarak kodu derleyin.
4. `java FootballPlayerTest` komutunu kullanarak test sınıfını çalıştırın.

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için [LICENSE](LICENSE) dosyasını inceleyebilirsiniz.

![image](https://github.com/esmanur-karatas/javaAlgorithmExamples/assets/83882274/17253df1-e2b0-4c32-a200-fe8012924364)
