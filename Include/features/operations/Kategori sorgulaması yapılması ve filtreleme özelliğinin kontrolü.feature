Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Kategori sorgulaması yapılması ve filtreleme özelliğinin kontrolü
    * Anasayfanın açıldığı doğrulanır
    * Sepetim ikonuna tıklanır
    * Ürünler silinir
    * Favorilerim ikonuna tıklanır
    * Ürünler silinir
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
