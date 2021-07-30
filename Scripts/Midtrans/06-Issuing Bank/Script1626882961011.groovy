import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('Midtrans/lbl-iframe-issuing-bank'), 5)

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-ib-header'))

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-ib-text'))

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-ib-time'))

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-ib-verify-merchant'))

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-ib-verify-amount'))

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-ib-verify-transaction-time'))

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-ib-verify-cc'))

WebUI.verifyMatch(GlobalVariable.credit_card, GlobalVariable.credit_card, false)

WebUI.click(findTestObject('Midtrans/txt_password'))

WebUI.setText(findTestObject('Midtrans/txt_password'), GlobalVariable.password)

WebUI.verifyElementClickable(findTestObject('Midtrans/txt_password'))

WebUI.click(findTestObject('Midtrans/btn-ib-ok'))

