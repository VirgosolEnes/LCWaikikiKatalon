Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Sepete ürün ekleme ve sipariş verme adımlarının kontrolü
    * Anasayfanın açıldığı doğrulanır
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
