@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    * Anasayfanın açıldığı doğrulanır

  @tag1
  Scenario Outline: Hemen Gel Al! mağazalarının listelenmesinin kontrolü
    * Hemen Gel-Al bannerına tıklanır
    * Hemen Gelsin alt bannerının açıldığı doğrulanır
    * Hemen Gel Al alt bannerının açıldığı doğrulanır
    * Hemen Gel Al alt bannerına tıklanır
    * Hemen Gel Al sayfasının açıldığı doğrulanır
    * Hemen Gel Al İl dropdownundan <il> değeri seçilir
    * Hemen Gel Al İlçe dropdownundan <ilçe> değeri seçilir
    * Hemen Gel Al mağazaların listelendiği kontrol edilir

    Examples: 
      | il       | ilçe   |
      | İstanbul | Pendik |

  @tag1
  Scenario Outline: Sepete ürün ekleme ve sipariş verme adımlarının kontrolü
    * Arama alanına tıklanır
    * Sık Arananların listelendiği görülür
    * Arama alanından <arama> değeri aranır
    * Ürünlerin listelendiği doğrulanır
    * <sira>. sıradaki ürüne tıklanır
    * Ürün Detay sayfasının açıldığı kontrol edilir
    * Sepete Ekle butonuna tıklanır
    * Sepetteki ürün sayısının 1 olduğu doğrulanır
    * Sepetim ikonuna tıklanır
    * Sepet Detaylarının geldiği doğrulanır
    * Ödeme Adımına Geç butonuna tıklanır
    * Üye Olmadan Sipariş alanının geldiği doğrulanır
    * Üye Olmadan Sipariş alanına <eposta> girilir
    * Kullanım ve Gizlilik Sözleşmesi checkboxına tıklanır
    * Üye Olmadan Devam Et butonuna tıklanır
    * Adres Bilgileri Alıcı Adı ve Soyadı olarak <adSoyad> girilir
    * Adres Bilgileri İl olarak <il> girilir
    * Adres Bilgileri İlçe olarak <ilçe> girilir
    * Adres Bilgileri Mahalle olarak <mahalle> girilir
    * Adres Bilgileri Adres olarak <adres> girilir
    * Adres Bilgileri Telefon olarak <telefon> girilir
    * Adres Bilgileri Adres Başlığı olarak <adresBasligi> girilir
    * Devam Et butonuna tıklanır
    * Ödeme Seçenekleri alanının açıldığı doğrulanır
    * Ödeme Seçenekleri Ad Soyad olarak <adSoyad> girilir
    * Ödeme Seçenekleri Kart No olarak <kart> girilir
    * Ödeme Seçenekleri Ödeme Bilgilendirme Formunun geldiği doğrulanır
    * Ödeme Seçenekleri Ay olarak <ay> girilir
    * Ödeme Seçenekleri Yıl olarak <yil> girilir
    * Ödeme Seçenekleri CVV olarak <cvv> girilir
    * Ödeme Seçenekleri Ödeme Bilgilendirme Formunun checkoxına tıklanır
    * Siparişi Tamamla butonuna tıklanır
    * Ödeme Gerçekleşiyor popupının çıktığı kontrol edilir
    * Uyarı mesajının Geçersiz kart bilgileri. Girmiş olduğunuz kart numarasını kontrol ediniz içerdiği kontrol edilir

    Examples: 
      | arama  | sira | sepettekiUrunSayisi | eposta                  | adSoyad        | il       | ilçe    | mahalle     | adres                                                                    | telefon    | adresBasligi | kart             | ay | yil  | cvv |
      | Paspas |    4 |                   1 | deniz.uzun@virgosol.com | Test Otomasyon | İstanbul | Maltepe | Cevizli Mh. | Ritim İstanbul Sit. No:46 A1 Ticari Blok No:376 Maltepe, İSTANBUL, 34846 | 5323209576 | Virgosol     | 5400560099999999 | 12 | 2025 | 456 |

  @tag1
  Scenario Outline: Kategori sorgulaması yapılması ve filtreleme özelliğinin kontrolü
    * Menüden KADIN alanı seçilir
    * Classic bannerına tıklanır
    * Filtre alanına tıklanır
    * Filtreleme seçeneklerinin çıktığı kontrol edilir
    * Filtreleme seçeneklerinden Kategori seçilir
    * Kategorilerden Yağmurluk  değeri seçilir
    * Ürünlerden 1. sıradaki ürünün adında Yağmurluk olduğu kontrol edilir

    Examples: 
      | kategori  |
      | Yağmurluk |

  @tag1
  Scenario Outline: Favoriye eklenen ürünün sepete eklenmesi
    * Menüden OUTLET alanı seçilir
    * 1. sıradaki ürünün kalp ikonuna tıklanır
    * Favorilerimdeki ürün sayısının 1 olduğu doğrulanır
    * Favorilerim ikonuna tıklanır
    * Anladım butonuna tıklanır
    * Ürünlerin listelendiği doğrulanır
    * Favorilerimdeki ürün sepete eklenir
    * Beden popupının geldiği doğrulanır
    * Beden popupından <beden> değeri seçilir
    * Sepetteki ürün sayısının 2 olduğu doğrulanır
    * Sepetim ikonuna tıklanır
    * Sepet Detaylarının geldiği doğrulanır

    Examples: 
      | beden  |
      | 1-3 Ay |

  @tag1
  Scenario Outline: Hemen Gel Al! mağazalarının listelenmesinin kontrol
    * Giriş Yap a tıklanır
    * Kullanıcı adı alanına <kullanıcıAdi> yazılır
    * Şifre alanına <şifre> yazılır
    * Giriş Yap butonuna tıklanır
    * Anasayfanın açıldığı doğrulanır
    * Hesabım üzerine gelinir
    * Hesabım seçeneklerinden LCW Para seçilir
    * Hesabım Kullanıcı adı alanına <kullanıcıAdi> yazılır
    * Hesabım Şifre alanına <şifre> yazılır
    * Hesabım Giriş Yap butonuna tıklanır
    * Hesabım hata mesajı LCW Para Bulunmamaktadır içerdiği kontrol edilir

    Examples: 
      | kullanıcıAdi         | şifre    |
      | deniz.cnky@gmail.com | ta_12345 |
