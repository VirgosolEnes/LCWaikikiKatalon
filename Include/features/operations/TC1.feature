@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Hemen Gel Al! mağazalarının listelenmesinin kontrolü
    * Anasayfanın açıldığı doğrulanır
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
