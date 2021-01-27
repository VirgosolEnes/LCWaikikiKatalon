Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Favoriye eklenen ürünün sepete eklenmesi
    * Anasayfanın açıldığı doğrulanır
    * Menüden OUTLET alanı seçilir
    * 1. sıradaki ürünün kalp ikonuna tıklanır
    * Favorilerimdeki ürün sayısının 1 olduğu doğrulanır
    * Favorilerim ikonuna tıklanır
    * Anladım butonuna tıklanır
    * Ürünlerin listelendiği doğrulanır
    * Favorilerimdeki ürün sepete eklenir
    * Beden popupının geldiği doğrulanır
    * Beden popupından <beden> değeri seçilir
    * Sepetim ikonuna tıklanır
    * Sepet Detaylarının geldiği doğrulanır

    Examples: 
      | beden  |
      | 1-3 Ay |
