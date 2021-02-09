Feature: Http Methodların kontrolü
  Get,Post,Delete kontrolü

  @tag1
  Scenario Outline: Http Methodların kontrolü
    * ListUsers methodunda first name alanında <firstname> adının geldiği kontrol edilir
    * Create methodunda adını <name> olarak oluştur
    * Delete methodu çalıştırılır

    Examples: 
      | firstname | name     |
      | Lindsay   | Virgosol |
