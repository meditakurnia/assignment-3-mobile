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

Mobile.startExistingApplication('com.solodroid.solomerce')

Mobile.verifyElementExist(findTestObject('Update Profil/buttonTextViewProfile'), 0)

Mobile.tap(findTestObject('Object Repository/Update Profil/buttonTextViewProfile'), 0)

Mobile.verifyElementExist(findTestObject('Update Profil/buttonEdit'), 0)

Mobile.tap(findTestObject('Object Repository/Update Profil/buttonEdit'), 0)

Mobile.tap(findTestObject('Object Repository/Update Profil/relatifLayout1'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Update Profil/placeholderName'), 3)

Mobile.setText(findTestObject('Object Repository/Update Profil/buttonEditText'), 'baek yijin', 0)

Mobile.verifyElementExist(findTestObject('Update Profil/buttonOK'), 0)

Mobile.tap(findTestObject('Object Repository/Update Profil/buttonOK'), 0)

Mobile.tap(findTestObject('Object Repository/Update Profil/relatifLayout2'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Update Profil/placeholderEmail'), 3)

Mobile.setText(findTestObject('Update Profil/buttonEditText'), 'yijina@gmail.com', 0)

Mobile.verifyElementExist(findTestObject('Update Profil/buttonOK'), 0)

Mobile.tap(findTestObject('Update Profil/buttonOK'), 0)

Mobile.closeApplication()

