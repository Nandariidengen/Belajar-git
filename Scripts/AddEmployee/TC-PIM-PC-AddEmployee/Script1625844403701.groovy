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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

String middleName = faker.name().firstName()

String lastName = faker.name().lastName()

String username = faker.name().username()

WebUI.click(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/btn_PIM'))

WebUI.click(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/btn_AddEmployee'))

WebUI.setText(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_FirstName'), GlobalVariable.firstName)

WebUI.setText(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_MiddleName'), middleName)

WebUI.setText(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_LastName'), lastName)

WebUI.setText(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_EmployeeId'), '')

WebUI.uploadFile(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/Photo'), GlobalVariable.upload_profile)

Succes = WebUI.getText(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/Photo'))

WebUI.check(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/Check'))

WebUI.verifyElementChecked(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/Check'), 10)

WebUI.setText(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_Username'), username)

WebUI.setEncryptedText(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_password'), 'pM01ONatqE+cX1noMF1NoQ==')

WebUI.setEncryptedText(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_ConfirmPass'), 'pM01ONatqE+cX1noMF1NoQ==')

WebUI.selectOptionByValue(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/dpd_Status'), 'Enabled', false)

WebUI.click(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/btn_Save'))

WebUI.verifyMatch(GlobalVariable.actual, GlobalVariable.expected, false)

WebUI.verifyElementAttributeValue(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_VerifyFN'), 'id', 'personal_txtEmpFirstName', 
    10)

WebUI.verifyElementAttributeValue(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_VerifyMName'), 'id', 'personal_txtEmpMiddleName', 
    10)

WebUI.verifyElementAttributeValue(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_VerifyLName'), 'id', 'personal_txtEmpLastName', 
    10)

WebUI.verifyElementVisible(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_VerifyProfilePicture'))

WebUI.verifyElementAttributeValue(findTestObject('Orange-HRM/OrangeHRM-PIM-AddEmployee/txt_VerifyEmployeeId'), 'id', 'personal_txtEmployeeId', 
    10)

