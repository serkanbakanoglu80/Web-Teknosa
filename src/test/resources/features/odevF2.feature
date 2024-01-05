@addproduct @all
Feature: Urunlerin sepete eklenmesi

  Scenario: Urunlerin sepete eklenmesi
    Given Bildirimler acilir Cerezler kabul edilir
    And Arama kutusuna Kulaklık yazilir ve enter tusuna basilir
    And Alt Kategorilerden “Bluetooth Kulaklık” seçilir
    And En Çok Satanlar filtresi tıklanır
    And Ilk sayfadaki birinci ürün tıklanır
    And Sepete Ekle tıklanır
    And Alışverişe devam et tıklanır
    And Onceki sayfaya geri dönülür
    And Ilk sayfadaki sonuncu ürün tıklanır
    And Sepete Ekle tıklanır
    And Sepetime Git e tıklanır
    And En ucuzunun adedi artırılır
    And Alışverişi Tamamla tıklanır
    And Üye Olmadan Devam Et butonuna tıklanarak
    And e-posta adresi girilir



