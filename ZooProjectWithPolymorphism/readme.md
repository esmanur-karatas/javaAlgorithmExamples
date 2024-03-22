# Polimorfizm ile Hayvanat Bahçesi Projesi
Bu proje, nesne yönelimli programlamada polimorfizm kavramını gösteren basit bir hayvanat bahçesi simülasyonunu içerir.


## Giriş 
Bu projede, Java kullanarak basit bir hayvanat bahçesi simülasyon programı oluşturduk. Odak noktası, polimorfizm kavramıdır; farklı sınıfların nesnelerinin bir üst sınıfın nesneleri gibi işlenmesini sağlar. Bu projede üç ana sınıf bulunmaktadır: Animals, Cat ve Dog.

## Proje Yapısı
.

├── src

│   ├── ZooProjectWithPolymorphism.java

│   ├── Animals.java

│   ├── Cat.java

│   └── Dog.java

└── README.md

-ZooProjectWithPolymorphism.java: main metodu içeren ana sınıf.

-Animals.java: Genel hayvanları temsil eden üst sınıf.

-Cat.java: Kedileri temsil eden alt sınıf.

-Dog.java: Köpekleri temsil eden alt sınıf.

-README.md: Projeyi açıklayan belgelendirme dosyası.

## Açıklama
Animals Sınıfı (Animals.java): Bu sınıf, hayvanların sesini temsil eden voice() adında bir statik metodu tanımlar.

Cat Sınıfı (Cat.java): Bu sınıf kedileri temsil eder.
catVoice() adında bir metod içerir; bu metod, bir Animals örneği oluşturur ve onun voice() metodunu çağırarak kedinin sesini ("MİYAV MİYAV!") yazdırır.

Dog Sınıfı (Dog.java): Bu sınıf köpekleri temsil eder.
dog() adında bir metod içerir; bu metod, bir Animals örneği oluşturur ve onun voice() metodunu çağırarak köpeğin sesini ("HAV HAV!") yazdırır.

## Kullanım <a name="kullanim"></a>

-Programı çalıştırmak için:

-Tüm Java dosyalarını derleyin.

-ZooProjectWithPolymorphism sınıfını çalıştırın.

## Örnek 


![image](https://github.com/esmanur-karatas/javaAlgorithmExamples/assets/83882274/07241204-b966-4683-972c-9cbdba79874e)



## Katkıda Bulunma 
Katkılarınızı bekliyoruz! Herhangi bir sorun bulursanız veya projeyi geliştirmek isterseniz, çekme isteği açmaktan çekinmeyin.


