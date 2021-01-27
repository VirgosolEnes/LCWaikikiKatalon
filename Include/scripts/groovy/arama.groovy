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



class arama {
	@When("Ürünlerin listelendiği doğrulanır")
	def urunlerinListelendigiDogrulanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Ürünlerin listelendiği doğrulanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("(.*). sıradaki ürüne tıklanır")
	def siradakiUruneTikla(String sira) {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Sıralamaya göre ürüne tıklanır"), ["Sira":sira],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Classic bannerına tıklanır")
	def classiceTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Classic e tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}


	@When("Filtre alanına tıklanır")
	def filtreyeTiklanır() {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Filtreye Tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Filtreleme seçeneklerinin çıktığı kontrol edilir")
	def filtrelemeSecenelerininCiktigiDogrulanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Filtreleme Seceneklerinin çıktığı doğrulanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Filtreleme seçeneklerinden (.*) seçilir")
	def filtreSecimYapilir(String filtre) {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Filtre Seçeneklerinden Seçim Yapılır"), ["Filtre":filtre],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Kategorilerden (.*) değeri seçilir")
	def kategoriSecimYapilir(String kategori) {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Kategori Seçilir"), ["Kategori":kategori],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ürünlerden (.*). sıradaki ürünün adında (.*) olduğu kontrol edilir")
	def urununAdindaVarMi(String sira,String ad) {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Siralamaya göre ürün adı"), ["Sira":sira,"Ad":ad],FailureHandling.STOP_ON_FAILURE)
	}

	@When("(.*). sıradaki ürünün kalp ikonuna tıklanır")
	def siradakiUrununFavoriyeTikla(String sira) {
		WebUI.callTestCase(findTestCase("Test Cases/common/arama/Sıralamaya göre favoriye tıklanır"), ["Sira":sira],FailureHandling.STOP_ON_FAILURE)
	}
}