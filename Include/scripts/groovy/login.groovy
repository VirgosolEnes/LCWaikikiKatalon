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



class login {

	@When("Kullanıcı adı alanına (.*) yazılır")
	def kullaniciAdiGirilir(String kullaniciAdi) {
		WebUI.callTestCase(findTestCase("Test Cases/common/login/Kullanıcı Adı Girilir"), ["KullaniciAdi":kullaniciAdi],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Şifre alanına (.*) yazılır")
	def sifreGirilir(String sifre) {
		WebUI.callTestCase(findTestCase("Test Cases/common/login/Şifre Girilir"), ["Sifre":sifre],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Giriş Yap butonuna tıklanır")
	def girisYapButonunaTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/login/Giriş Yap butonuna tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Üye Olmadan Sipariş alanının geldiği doğrulanır")
	def uyeOlmadanSiparisAlanininGeldigiDogrulanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/login/Üye Olmadan Sipariş alanının geldiği doğrulanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Üye Olmadan Sipariş alanına (.*) girilir")
	def uyeOlmadanSiparisAlanininaDegerGirilir(String eposta) {
		WebUI.callTestCase(findTestCase("Test Cases/common/login/Üye Olmadan Sipariş alanına eposta girilir"), ["Eposta":eposta],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Kullanım ve Gizlilik Sözleşmesi checkboxına tıklanır")
	def kullanimveGizlilikSozlesmesineTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/login/Kullanım ve Gizlilik Sözleşmesi checkboxına tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Üye Olmadan Devam Et butonuna tıklanır")
	def uyeOlmadanDevamEtButonunaTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/login/Üye Olmadan Devam Et butonuna tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}
}