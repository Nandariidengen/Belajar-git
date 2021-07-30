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

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-paynow-amount-title'))

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-paynow-price'))

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-paynow-order-id'))

WebUI.clearText(findTestObject('Midtrans/txt_input-card-number'))

WebUI.setText(findTestObject('Midtrans/txt_input-card-number'), GlobalVariable.credit_card)

WebUI.verifyElementVisible(findTestObject('Midtrans/txt_input-card-number'))

WebUI.clearText(findTestObject('Midtrans/txt_input-expire-date'))

WebUI.setText(findTestObject('Midtrans/txt_input-expire-date'), GlobalVariable.expire_date)

WebUI.verifyElementVisible(findTestObject('Midtrans/txt_input-expire-date'))

WebUI.clearText(findTestObject('Midtrans/txt_input-cvv-paynow'))

WebUI.setText(findTestObject('Midtrans/txt_input-cvv-paynow'), GlobalVariable.cvv)

WebUI.verifyElementVisible(findTestObject('Midtrans/txt_input-cvv-paynow'))

WebUI.verifyMatch(GlobalVariable.pn_payment, GlobalVariable.pn_payment, false)

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-paynow-verify-promo'))

WebUI.check(findTestObject('Midtrans/check-promo-10persen'))

WebUI.verifyElementChecked(findTestObject('Midtrans/check-promo-10persen'), 0)

WebUI.verifyMatch(GlobalVariable.email, GlobalVariable.email, false)

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-pn-nohp'))

WebUI.verifyElementClickable(findTestObject('Midtrans/btn-paynow'))

WebUI.click(findTestObject('Midtrans/btn-paynow'))

WebUI.callTestCase(findTestCase('Midtrans/06-Issuing Bank'), [:], FailureHandling.STOP_ON_FAILURE)

