# Kalıtım (Inheritance)
Kalıtım, programlama ortamında da gerçek hayattaki tanımına benzer bir işi gerçekleştirir. Bir sınıfın başka bir sınıftan kalıtım yapması demek, kalıtımı yapan sınıfın diğer sınıftaki nitelik ve davranışlarını kendisine alması demektir. Kalıtımı yapan sınıfa alt sınıf, kendisinden kalıtım yapılan sınıfa ata sınıf dersek, ata sınıfta tanımlı olan herşeyin alt sınıf için de tanımlı olduğunu söyleyebiliriz.

Eğer bir A sınıfın B sınıfından kalıtım yapması isteniyorsa, aşağıda ki şekilde tanımlanır.
```java
    public class A extends B { /**/ }
```
Kalıtım Türleri
Tek Yönlü Kalıtım (Single Inheritance)
Bir sınıfın başka bir sınıfı genişlettiği alt ve ata sınıf ilişkisini ifade eder.


![Bu örnekte B sınıfı A sınıfını miras alır.](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/inheritance/figures/kl1.png)

#### Bu örnekte B sınıfı A sınıfını miras alır.

## Çoklu Kalıtım (Multiple Inheritance)
Bir sınıfın birden fazla sınıfı miras almasını ifade eder; bu, bir alt sınıfın iki ata sınıfa sahip olduğu anlamına gelir.

#### Not : Java çoklu kalıtımı desteklemez. (Interface kullanılır)

![](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/inheritance/figures/kl2.png)

## Çok Seviyeli Kalıtım (Multilevel Inheritance)
Bir sınıfa ait alt sınıfın başka sınıfları genişletmesine denir.

Bu örnekte , C sınıfı B sınıfını miras alır, B sınıfı ise A sınıfını miras alır. C sınıfı dolaylı yoldan A sınıfınıda miras almış olur.

## Hiyerarşik Kalıtım (Hierarchical Inheritance)
Birden fazla sınıfın aynı sınıfı genişlettiği bir alt ve üst sınıf ilişkisini ifade eder.

![](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/inheritance/figures/kl4.png)

Bu örnekte : B, C ve D sınıfları aynı A sınıfını genişletir.

## Hibrit Kalıtım (Hybrid Inheritance)
Programda birden fazla kalıtım türünün kombinasyonuna denir. Örneğin, A ve B sınıfı, C sınıfını genişletir ve başka bir D sınıfı, A sınıfını genişletir, bu bir hibrit kalıtım örneğidir, çünkü bu, tek yönlü ve hiyerarşik kalıtımın bir birleşimidir.

![](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/inheritance/figures/kl5.jpeg)

## Kalıtım'da Constructor Zinciri ve Super Anahtar Sözcüğü
Bir sınıfa ait nesne oluşturulurken, o sınıfın bir kurucusunun işletildiğini, kurucunun çalışması tamamlandıktan sonra bellekte artık bir nesnenin oluştuğunu biliyoruz. Kurucuları da nesneleri ilk oluşturuldukları anda anlamlı durumlara taşıyabilmek için kullanıyoruz. Bu durumda, eğer nesnesi oluşturulacak sınıf başka bir sınıfın alt sınıfıysa, önce ataya ait içnesnesinin oluşturulması ve bu nesnenin niteliklerinin ilk değerlerinin verilmesi gerektiğini söyleyebiliriz.

İçiçe nesnelerin oluşabilmesi için nesnelerin içten dışa doğru oluşması gerekir. İç-nesnenin oluşabilmesi için, nesnesi oluşturulacak sınıfa ait kurucu işletilmeye başladığı zaman ilk iş olarak ata sınıfa ait kurucu çağrılır. Eğer ata sınıf da başka bir sınıfın alt sınıfıysa, bu kez o sınıfın kurucusu çağrılır. Kurucu zinciri alt sınıftan ata sınıfa doğru bu şekilde ilerler. En üstte, kalıtım ağacının tepesindeki sınıfın kurucusunun çalışması sonlandıktan sonra sırası ile alt sınıfların kurucularının çalışması sonlanacaktır. Böylece içiçe nesneler sıra ile oluşturularak en son en dıştaki nesne oluşturulmuş olur ve kurucu zinciri tamamlanır.

## Super Kullanımı
Eğer ata sınıfta varsayılan kurucu yoksa ve programcı alt sınıftaki kurucunun içinde ata sınıfın hangi kurucusunun çağrılacağını belirtmezse derleme hatası alınacaktır. Çünkü derleyici aksi belirtilmedikçe ata sınıfın varsayılan kurucusunu çağıran super() kodunu üretecektir. Ata sınıfın hangi kurucusunun çağrılacağı, super anahtar sözcüğü ile birlikte verilen parametrelere göre belirlenir. Nasıl ki new işleci ile birlikte kullandığımız parametreler hangi kurucunun çağrılacağını belirliyorsa, super anahtar sözcüğü ile birlikte kullanılan parametreler de aynı şekilde ata sınıfın hangi kurucusunun işletileceğini belirler.

[Kaynak](https://academy.patika.dev/tr/courses/java-102/inheritance)

# Metot Overriding (Metod Ezme)


Aynı isimde farklı parametre listesi (sayı, tür ya da sıraları farklı olan parametreler) ile birden fazla yöntem kodlanmasını Yöntemlerin Aşırı Yüklenmesi ( Method Overloading) olarak adlandırmıştık.



Aşırı yükleme, bir sınıfın içine ata sınıflarındaki protected ya da public tanımlanmış yöntemlerle aynı isimde ve farklı parametre listesine sahip yeni yöntemler yazılarak da gerçekleştirilebilir. Çünkü bu sınıf ata sınıfındaki yöntemleri kalıtımla alacaktır.



Yöntem Geçersiz Kılma ise bir alt sınıfın içine doğrudan ya da dolaylı ata sınıflarından gelen bir (ya da daha fazla) yöntemin aynısının (aynı yöntem adı ve aynı parametre listesi) kodlanmasına verilen addır.



Yöntem geçersiz kılma ile ilgili genelde şuna benzer sorular sorulur: “ata sınıftan zaten alınan yöntemin aynısını alt sınıfta neden tekrar kodlarım?”, “kalıtım kodun yeniden kullanılabilirliğini arttırırken, benim alt sınıfa aynı yöntem(ler)i yeniden kodlamam çelişkili değil mi?”.



Yöntem geçersiz kılma ile ilgili olarak bir noktanın gözden kaçırılmaması gerekir: alt sınıfa kodlanan yöntem, ata sınıftaki yöntemle aynı ad ve parametre listesine sahiptir, ancak ata sınıftaki yöntemle aynı kodları içermemelidir! Zaten alt sınıfa ata sınıftaki yöntemin tamamen aynısını kodlamak elbette çelişkili, hatta saçma ve anlamsız olacaktır.



Geçersiz kılmanın neden gerekli olduğunu anlayabilmek için öncelikle kalıtım ağacında aşağıya doğru inildikçe daha özel sınıflara, yukarıya doğru çıkıldıkça daha genel sınıflara ulaşıldığını hatırlamamız gerekir. Ata sınıfta tanımlanan bir yöntem, o sınıfın genelleştirdiği bütün alt sınıfların ortak özelliklerine göre çalışan bir yöntem olacaktır. Alt sınıflara inildikçe sınıflar özelleştiği için, ata sınıftaki yöntem alt sınıf için fazla genel ve dolayısıyla yetersiz kalabilir. Bu durumda alt sınıf, kendi özelliklerine bağlı olarak daha özel bir gerçekleştirim yapacaktır.



Bazen bu gerçekleştirim ata sınıftakini kullanıp üzerine birşeyler ekleyecek, bazen de tamamen farklı olacak şekilde kodlanabilir. Eğer alt sınıftaki gerçekleştirim ata sınıftaki yöntemi kullanacak ve üzerine birşeyler ekleyecekse, super anahtar sözcüğü atadaki yöntemi çağırmak üzere kullanılabilir. this anahtar sözcüğünün içinde bulunulan nesneye referans olması gibi, super anahtar sözcüğü de ata sınıfa ait iç nesneye referanstır.

[Kaynak](https://academy.patika.dev/tr/courses/java-102/method-overriding)

# Çok Biçimlilik (Polymorphism)
Çok biçimlilik aynı görevin veya işin farklı yollarla yapılabilmesini ifade eder. Nesne, aynı davranışı farklı formlar ve görünüşler ile yerine getirebilir.

Bunu yapabilmek için iki yöntem vardır.

Overriding in Java (Ezme)
Overloading in Java (Aşırı yükleme)
Polymorphism Özellikleri
### Örnek:
```java
class Hayvan{
    private String isim;
    public Hayvan(String isim) {
    this.isim = isim;     }

	public String getIsim() { 
		return isim;     }

	public void setIsim(String isim) { 
		this.isim = isim;     }
	public String konus(){ 
		return "Hayvan Konuşuyor...";     }
    }
    
class Kedi extends Hayvan{
    public Kedi(String isim) {
    super(isim);     }
    
    @Override
    public String konus() {
    return this.getIsim() + " Miyavlıyor...";     }
    }
    
class Kopek extends Hayvan {
    public Kopek(String isim) {
    super(isim);     }
    @Override
    public String konus() {
    return this.getIsim() + " Havlıyor...";     }
    }
    
class At extends Hayvan {
    public At(String isim) {
    super(isim);     }
    
    @Override
    public String konus() {
    return this.getIsim() + " Kişniyor...";     }
    }
    
public class Main {
    public static void konustur(Hayvan hayvan){         
    System.out.println(hayvan.konus());
    }
    
    public static void main(String[] args){
    // İlk Gösterim
    Hayvan hayvan = new Hayvan("Hiper");
    System.out.println(hayvan.konus());
    Hayvan hayvan1 = new Kedi("Hiper");
    System.out.println(hayvan1.konus());
    Hayvan hayvan2 = new Kopek("Hiper");
    System.out.println(hayvan2.konus());
    Hayvan hayvan3 = new At("Hiper");
    System.out.println(hayvan3.konus());
    
    //Fonksiyon kullanarak gösterim
    konustur(new Kedi("Nasip"));
    konustur(new Kopek("Karabaş"));
    konustur(new At("Bold-Pilot"));
    }
}
```

## instanceof - polymorphism ilişkisi
Obje vereceğiz objenin hangi sınıftan olduğuna bakacağız
Kedi sınıfı aynı zamanda Hayvan sınıfından miras alıyor. Bu yüzden superclass'la kıyaslanırsa inheritance olduğu için true döner.
Bütün classlar objeden türüyor.(Object class)
Polymorphism kullanmazsak bütün nesneleri instanceof ile kontrol etmemiz gerekir.
Yeni bir sınıf üretirsek ve Hayvan sınıfından miras alırsa yine kontrol etmemiz gerekecek ama polymorphism bu iş yükünü azaltıyor.
### Örnek II:
```java
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "Hayvan Konuşuyor...";
    }
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavlıyor...";
    }
}

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havlıyor...";
    }
}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kişniyor...";
    }
}

public class Main {

    public static void konustur(Object object){

        if (object instanceof Kopek){
            Kopek kopekTest = (Kopek)object;
            System.out.println(kopekTest.konus());
        }
        else if(object instanceof Kedi){
            Kedi kediTest = (Kedi)object;
            System.out.println(kediTest.konus());
        }
        else if (object instanceof At){
            At atTest = (At)object;
            System.out.println(atTest.konus());
        }
        else if (object instanceof Hayvan){
            Hayvan hayvanTest = (Hayvan)object;
            System.out.println(hayvanTest.konus());
        }
    }

    public static void main(String[] args){

        // Temel Gösterim
        Kedi kedi = new Kedi("Nasip");

        if (kedi instanceof Kedi){
            System.out.println("Bu nesne Kedi sınıfından");
        }

        if (kedi instanceof Hayvan){
            System.out.println("Bu nesne Hayvan sınıfından");
        }

        //Fonksiyon ile gösterim

        Kedi kedii = new Kedi("Nasip");
        Kopek kopek = new Kopek("Zizu");
        At at = new At("BoldPilot");
        Hayvan hayvan = new Hayvan("Turunç");

        konustur(kedii);
        konustur(kopek);
        konustur(at);
        konustur(hayvan);
    }
}
```
Yukarıdaki Örnek II Polymorphism'in gerçek faydasını tam olarak ortaya çıkartıyor. Daha fazla hata yapma ihitmali, daha fazla kod ve daha fazla manuel kontrol. Sonuç olarak, polymorphism kullanmak kod temizliği ve güvenliği açısından verimli bir özellik.

[Kaynak](https://academy.patika.dev/tr/courses/java-102/polimorphism)

# Soyutlama (Abstraction)
Nesne yönelimli programlamada Soyutlama (Abstraction) ilkesi, eğer bir sınıf için nesne üretmek mantıksız geliyorsa o sınıf soyutlanabilir.Alt sınıfların ortak özelliklerini ve işlevlerini taşıyan ancak henüz bir nesnesi olmayan bir üst sınıf oluşturmak istenirse bir soyut (abstract) üst sınıf oluşturulur.

Soyutlama, bir sınıfa veya metoda temel görevlerin tanımlanması, detayların ise tanımlanmaması demektir. Temel olarak bir soruna ait çözüme giderken kullanılacak yöntemlerin, ilk etapta daha genel basit ve soyut bir tanımını yapmaktır.

"abstract" Anahtar Kelimesi ve Soyut Sınıf Kavramı (Abstract Class)

Soyutlama kavramı sınıfın içindeki iç işleyişi dışarıdan izole etmek, yani gizlemektir. Örneğin: bilgisayarı kullanırken çoğu kullanıcı bilgisayarın iç işleyişinden haberi olmaz. Hafızanın işlemciyle haberleşmesi, işlemler arası senkronizasyon, klavyeden girilen değerlerin ekrana yansıması gibi birçok işlemin detayı kullanıcılardan gizlenmiş durumdadır. Kullanıcılar sadece bu fonksiyonları veya işlevleri bir arayüz vasıtasıyla çağırıp kullanmaktadır. İç detaylarına müdahale etmemektedir.

Aynı şekilde Java'da sınıflarımızı tasarlarken bazı fonksiyonların ve işlevlerin sadece sınıf içinde kalması, dış dünyada bu sınıftan nesneleri kullanan kişilerin bu iç fonksiyonları bilemelerine gerek yoktur. Örneğin: KDV tutarını hesaplayan fonksiyonun sınıf içinde kullandığı birçok başka fonksiyon olabilir. Bu fonksiyonların sınıf dışına açılmasının bir anlamı yoktur. Sadece miktarı verip o miktara göre KDV tutarını hesaplayacak bir dış fonksiyon yeterlidir. Yazılım dünyasında bu nedenle soyutlama kavramı yazılım tasarımında önemli bir kavramdır. Soyutlama yapabilmek için "abstract" anahtar kelimesi, "interface" gibi yapılar bizlere yardımcı olmaktadır.

Soyutlama için Java'da iki yöntem mevcuttur:

"interface" tanımlamak
"abstract" sınıf tanımlamak

## Soyut Sınıf (Abstract Class)
"abstract" anahtar kelimesi ile tanımlanan sınıflardır. Sınıfın içinde soyut ("abstract") metotlar veya normal fonksiyonlar tanımlanabilir. Soyut sınıflardan "new" anahtar kelimesi ile bir nesne oluşturulamaz.

### Soyut Sınıf Özellikleri:

"abstract" anahtar kelimesi ile tanımlanmış olması gerekiyor.
Soyut veya soyut olmayan fonksiyonlar tanımlanabilir.
Soyut sınıflardan "new" anahtar kelimesi ile nesne oluşturulamaz.
Kurucu metodu ve static fonksiyonlar tanımlanabilir.
"final" kelimesi ile tanımlanmış fonksiyonları içerebilir. Bu final fonksiyonlar alt sınıflarda ezilemezler (override).
```java
// abstract sınıf örneği public abstract class Doping {
protected double price; protected double[] taxes;
public double[] getTaxes() { return taxes; 	}

public void setTaxes(double[] taxes) { this.taxes = taxes; 	}

public double getPrice() { return price; 	}

public void setPrice(double price) { this.price = price; 	}

// soyut metot örneği public abstract double calculate(); }
``
Yukarıda soyut bir sınıf tanımladık. "abstract" kelimesi ile sınıf tanımladık, ayrıca sınıfın içinde "calculate" isimli "abstract" metot tanımladık. Aynı zamanda soyut olmayan metotlar da tanımladık. Senaryomuzda bir e-ticaret sisteminde "Doping" tipinde ek ürünler olduğunu düşünelim. İlan tarihini güncelleyen bir doping çeşidimiz olsun, bir de üst sırada çıkmanızı sağlayan bir doping olsun. Bu iki alt sınıfta "Doping" isimli sınıftan kalıtım alarak belli özellikleri kendilerine alsınlar. Fakat, her dopingin ücret hesaplama yöntemi birbirinden farklı olabilir. Ayrıca, her dopingin mutlaka fiyat hesaplama fonksiyonu olmalıdır.

Yukarıdaki durumda "abstract" sınıf tanımlayıp diğer doping çeşitleri bu ATA sınıftan kalıtım alacaklardır. "calculate" isimli "abstract" metodu, "metod ezme" (overriding) yöntemiyle ezip metodun içini kendilerine göre dolduracaklardır. Alt sınıflardaki diğer özellikler soyutlama tekniğiyle dış dünyadan gizlenecektir. Dış dünyadan dopingi kullanmak isteyen baka bir sınıf veya kod parçası doping nesnesi üzerindeki "calculate" fonksiyonunu çağırıp fiyatı hesaplacaktır. Diğer iç hesaplama ve çalışma detaylarını bilmeyecektir.
```java
public class TopOfListDoping extends Doping {
public TopOfListDoping(double price) { super.setPrice(price); 	}

// "Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor. // "TopOfList" isimli doping tipinde vergiler olmadığı için komisyon oranı eklenip ücret hesaplanıyor. Fakat, başka doping çeşitlerinde hesaplama farklı olabilir. @Override public double calculate() {
return super.getPrice() + super.getPrice() * 0.35; 	}
}

public class UptodateDoping extends Doping {
public UptodateDoping(double price, double[] taxes) { super.setPrice(price); super.setTaxes(taxes); 	}

// "Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor. // "UptodateDoping" isimli doping tipinde vergiler fiyata dahil olduğu için komisyon oranı eklenip ve vergiler hesaplanıp ücret belirleniyor. // Görüldüğü gibi her doping çeşidinin fiyat hesaplama yöntemleri birbirinden farklıdır. Soyutlama ile sınıflara ait iç çalışma detayları gizlenmmiş oluyor. // Doping tiplerinde sadece "calculate" isimli fonksiyonu dış dünyaya açtık. Diğer tüm fonksiyonlar ve özellikler sınıf içinde kaldı. @Override public double calculate() { 		
return calculateTaxes() + commisionRate(); 	}

private double calculateTaxes() { 		
double totalTaxValue = 0; for(int i=0; i < super.getTaxes().length; i++) { totalTaxValue += super.getTaxes()[i]; 		}
return totalTaxValue; 	}

private double commisionRate() { return super.getPrice() * 0.2; 	}
}
```
"Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor. "UptodateDoping" isimli doping tipinde vergiler fiayta dahil olduğu için komisyon oranı eklenip ve vergiler hesaplanıp ücret belirleniyor. Görüldüğü gibi her doping çeşidinin fiyat hesaplama yöntemleri birbirinden farklıdır. Soyutlama ile sınıflara ait iç çalışma detayları gizlenmiş oluyor. Doping tiplerinde sadece "calculate" isimli fonksiyonu dış dünyaya açtık. Diğer tüm fonksiyonlar ve özellikler sınıf içinde kaldı.

[Kaynak](https://academy.patika.dev/tr/courses/java-102/abstraction)