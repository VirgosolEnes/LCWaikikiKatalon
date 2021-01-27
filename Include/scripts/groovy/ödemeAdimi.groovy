import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ödemeAdimi {
	@When("Adres Bilgileri Alıcı Adı ve Soyadı olarak (.*) girilir")
	def adresBilgileriAdiSoyadiGirilir(String adveSoyad) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Adres Bilgileri Alıcı Adı ve Soyadı girilir"), ["AdveSoyad":adveSoyad],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Adres Bilgileri İl olarak (.*) girilir")
	def adresBilgileriIlGirilir(String il) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Adres Bilgileri İl girilir"), ["İl":il],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Adres Bilgileri İlçe olarak (.*) girilir")
	def adresBilgileriIlceGirilir(String ilçe) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Adres Bilgileri İlçe girilir"), ["İlçe":ilçe],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Adres Bilgileri Mahalle olarak (.*) girilir")
	def adresBilgileriMahalleGirilir(String mahalle) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Adres Bilgileri Mahalle girilir"), ["Mahalle":mahalle],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Adres Bilgileri Adres olarak (.*) girilir")
	def adresBilgileriAdresGirilir(String adres) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Adres Bilgileri Adres girilir"), ["Adres":adres],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Adres Bilgileri Telefon olarak (.*) girilir")
	def adresBilgileriTelefonGirilir(String telefon) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Adres Bilgileri Telefon girilir"), ["Telefon":telefon],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Adres Bilgileri Adres Başlığı olarak (.*) girilir")
	def adresBilgileriAdresBasligiGirilir(String adresBasligi) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Adres Bilgileri Adres Başlığı girilir"), ["AdresBaşlığı":adresBasligi],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Devam Et butonuna tıklanır")
	def adresBilgileriDevamEtButonunaTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Devam butonuna tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ödeme Seçenekleri alanının açıldığı doğrulanır")
	def odemeSecenekleriAlanininAcildigiDogrulanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Ödeme Seçenekleri alanının açıldığı doğrulanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ödeme Seçenekleri Ad Soyad olarak (.*) girilir")
	def odemeSecenekleriAdSoyadGirilir(String adSoyad) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Ödeme Seçenekleri Ad Soyad girilir"), ["AdSoyad":adSoyad],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ödeme Seçenekleri Kart No olarak (.*) girilir")
	def odemeSecenekleriKartNoGirilir(String kart) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Ödeme Seçenekleri Kart No girilir"), ["Kart":kart],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ödeme Seçenekleri Ay olarak (.*) girilir")
	def odemeSecenekleriAyGirilir(String ay) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Ödeme Seçenekleri Ay olarak girilir"), ["Ay":ay],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ödeme Seçenekleri Yıl olarak (.*) girilir")
	def odemeSecenekleriYilGirilir(String yıl) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Ödeme Seçenekleri Yıl olarak girilir"), ["Yıl":yıl],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ödeme Seçenekleri CVV olarak (.*) girilir")
	def odemeSecenekleriCVVGirilir(String cvv) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Ödeme Seçenekleri CVV olarak girilir"), ["CVV":cvv],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ödeme Seçenekleri Ödeme Bilgilendirme Formunun geldiği doğrulanır")
	def odemeBilgilendirmeFormununGeldigiDogrulanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Ödeme Bilgilendirme Formunun geldiği kontrol edilir"), [:],FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Ödeme Seçenekleri Ödeme Bilgilendirme Formunun checkoxına tıklanır")
	def odemeBilgilendirmeFormununCheckboxinaTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Ödeme Bilgilendirme Formunun checkoxına tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Siparişi Tamamla butonuna tıklanır")
	def siparisiTamamlaButonunaTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Siparişi Tamamla butonuna tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Ödeme Gerçekleşiyor popupının çıktığı kontrol edilir")
	def odemeGerceklesiyorPopupi() {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Popup Kontrol Edilir"), [:],FailureHandling.STOP_ON_FAILURE)
	}
	@When("Uyarı mesajının (.*) içerdiği kontrol edilir")
	def uyarıMesajiKontrol(String uyari) {
		WebUI.callTestCase(findTestCase("Test Cases/common/ödemeAdimi/Uyari Mesaj Kontrol"), ["Uyari":uyari],FailureHandling.STOP_ON_FAILURE)
	}
	
}