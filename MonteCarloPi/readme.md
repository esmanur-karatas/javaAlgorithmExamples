# Monte Carlo Pi Tahmini
Bu Java programı, Monte Carlo yöntemini kullanarak π (pi) sayısını tahmin eder.

## Nasıl Çalışır?

-Kullanıcıdan nokta sayısı (n) alınır.

-n adet rastgele nokta oluşturulur ve bu noktalar (x, y) düzleminde birbirinden bağımsız olarak dağıtılır.

-Oluşturulan her nokta için, x ve y koordinatlarının karesi toplamı hesaplanır.

-Bu toplam, birim çemberin içinde (x^2 + y^2 <= 1) mi, dışında mı olduğuna bakılır.

-Birim çemberin içindeki nokta sayısı (numberInCircle) sayılır.

-Pi sayısı, numberInCircle ile toplam nokta sayısı (n) arasındaki oran olarak tahmin edilir.

-Programın tahmini Pi değeri ve gerçek Pi değeri karşılaştırılır.

-Tahminin doğruluğunu ölçmek için işlem süresi (milisaniye cinsinden) hesaplanır ve kullanıcıya sunulur.

## Kullanım

-Programı çalıştırın.

-Program, nokta sayısını (n) girmenizi isteyecektir.

-Birim çemberin içindeki nokta sayısı arttıkça, tahminin doğruluğu artacaktır.

## Örnek

![image](https://github.com/esmanur-karatas/javaAlgorithmExamples/assets/83882274/c7f8c7e5-3b6f-4391-b048-c3adc425c776)
