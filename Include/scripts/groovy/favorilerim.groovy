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



class favorilerim {
	@When("Favorilerimdeki ürün sayısının (.*) olduğu doğrulanır")
	def favorileirmdekiUrunSayisiDogrulanir(String sepet) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Favorilerim/Favorilerim ürün sayısı kontrol edilir"), ["Sepet":sepet],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Favorilerim ikonuna tıklanır")
	def favorilerimIconunaTiklanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Favorilerim/Favorilerime tıklanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Favorilerimdeki ürün sepete eklenir")
	def favorilerimdekiUrunSepeteEklenir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Favorilerim/Sepete Eklenir"), [:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("Beden popupının geldiği doğrulanır")
	def bedenPopupininGeldigiDogrulanir() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Favorilerim/Beden Doğrulanır"), [:],FailureHandling.STOP_ON_FAILURE)
	}
	@When("Beden popupından (.*) değeri seçilir")
	def bedenPopupisecimYapilirr(String beden) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Favorilerim/Beden Seçilir"), ["Beden":beden],FailureHandling.STOP_ON_FAILURE)
	}
}