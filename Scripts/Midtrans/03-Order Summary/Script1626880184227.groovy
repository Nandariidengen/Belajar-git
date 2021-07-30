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

WebUI.switchToFrame(findTestObject('Midtrans/lbl-iframe'), 0)

WebUI.verifyMatch(GlobalVariable.os_form_order, GlobalVariable.os_form_order, false)

WebUI.verifyMatch(GlobalVariable.os_header, GlobalVariable.os_header, false)

WebUI.verifyMatch(GlobalVariable.os_close, GlobalVariable.os_close, false)

WebUI.verifyMatch(GlobalVariable.os_lbl_amount, GlobalVariable.os_lbl_amount, false)

WebUI.verifyMatch(GlobalVariable.os_txtRp, GlobalVariable.os_txtRp, false)

WebUI.verifyMatch(GlobalVariable.os_hargaAtas, GlobalVariable.os_hargaAtas, false)

WebUI.verifyMatch(GlobalVariable.os_orderId, GlobalVariable.os_orderId, false)

WebUI.verifyMatch(GlobalVariable.os_order_details, GlobalVariable.os_order_details, false)

WebUI.click(findTestObject('Midtrans/btn-order-details'))

WebUI.verifyMatch(GlobalVariable.os_verifyTableItems, GlobalVariable.os_verifyTableItems, false)

WebUI.verifyMatch(GlobalVariable.os_verifytable_amount, GlobalVariable.os_verifytable_amount, false)

WebUI.verifyMatch(GlobalVariable.os_verifyItem, GlobalVariable.os_verifyItem, false)

WebUI.verifyMatch(GlobalVariable.home_price, GlobalVariable.home_price, false)

WebUI.verifyMatch(GlobalVariable.os_shipping_details, GlobalVariable.os_shipping_details, false)

WebUI.click(findTestObject('Midtrans/btn_shippingdetails'))

WebUI.verifyMatch(GlobalVariable.Name, GlobalVariable.Name, false)

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-verify-phone-title'))

WebUI.verifyMatch(GlobalVariable.no_hp, GlobalVariable.no_hp, false)

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-verify-email-title'))

WebUI.verifyMatch(GlobalVariable.email, GlobalVariable.email, false)

WebUI.verifyElementVisible(findTestObject('Midtrans/lbl-verify-address-title'))

WebUI.verifyMatch(GlobalVariable.address, GlobalVariable.address, false)

WebUI.doubleClick(findTestObject('Midtrans/btn-continue-os'))

WebUI.verifyElementClickable(findTestObject('Midtrans/btn-continue-os'))

