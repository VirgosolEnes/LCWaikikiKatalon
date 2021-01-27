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



class hesabim {
	@When("Hesabım üzerine gelinir")
	def hesabimUzerineGelinir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/hesabım/Hesabım üzerine gelinir"), [:],FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Hesabım seçeneklerinden (.*) seçilir")
	def hesabimUzerineGelinir(String secenek) {
		WebUI.callTestCase(findTestCase("Test Cases/common/hesabım/Hesabım seçeneklerinden seçim yapılır"), ["Secenek":secenek],FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Hesabım Kullanıcı adı alanına (.*) yazılır")
	def hesabimkullaniciAdiGirilir(String kullaniciAdi) {
		WebUI.callTestCase(findTestCase("Test Cases/common/hesabım/Kullanıcı Adı Girilir"), ["KullaniciAdi":kullaniciAdi],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Hesabım Şifre alanına (.*) yazılır")
	def hesabimsifreGirilir(String sifre) {
		WebUI.callTestCase(findTestCase("Test Cases/common/hesabım/Şifre Girilir"), ["Sifre":sifre],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Hesabım Giriş Yap butonuna tıklanır")
	def hesabimgirisYapButonunaTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/hesabım/Giriş Yap butonuna tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}
	
	
	@When("Hesabım hata mesajı (.*) içerdiği kontrol edilir")
	def hataMesajiKontrol(String Hata) {
		WebUI.callTestCase(findTestCase("Test Cases/common/hesabım/Hata Mesajı Kontrolü"), ["Hata":Hata],FailureHandling.STOP_ON_FAILURE)
	}
}