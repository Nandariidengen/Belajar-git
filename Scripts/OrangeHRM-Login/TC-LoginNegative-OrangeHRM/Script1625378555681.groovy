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

def data = findTestData('OrangeHRM/Login Negative TC')

//1 = ngambil data dari baris 1
//rowLogin <= data berarti akan melakukan perulangan dari data 1 sampai data <= data yg ada di excel
for (def rowLogin = 1; rowLogin <= data.getRowNumbers(); rowLogin++) {
    WebUI.setText(findTestObject('Orange-HRM/OrangeHRM-Login/username'), data.getValue('Username', rowLogin))

    WebUI.setText(findTestObject('Orange-HRM/OrangeHRM-Login/password'), data.getValue('Password', rowLogin))

    WebUI.click(findTestObject('Orange-HRM/OrangeHRM-Login/abutton'))

    def actualResult = WebUI.getText(findTestObject('Orange-HRM/OrangeHRM-Login/TxtErrorMessage'))

    WebUI.verifyMatch(actualResult, data.getValue('Expected Result', rowLogin), false)

    WebUI.closeBrowser()
}

