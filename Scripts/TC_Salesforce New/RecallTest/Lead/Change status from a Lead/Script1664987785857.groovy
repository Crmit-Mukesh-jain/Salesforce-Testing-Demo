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

WebUI.enhancedClick(findTestObject('Object Repository/OR_Salesforce New/Page_Home  Salesforce/span_Leads'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/span_Action_slds-checkbox--faux'))

WebUI.click(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/div_Change Status'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('OR_Salesforce New/Lead/Page_Recently Viewed  Leads  Salesforce/a_Open - Not Contacted'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Salesforce New/Page_Recently Viewed  Leads  Salesforce/span_Status was updated for 1 lead'), 
    'Status was updated for 1 lead.', FailureHandling.OPTIONAL)

