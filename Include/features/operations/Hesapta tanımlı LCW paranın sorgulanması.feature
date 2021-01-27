Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Hesapta tanımlı LCW paranın sorgulanması
    * Anasayfanın açıldığı doğrulanır
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
