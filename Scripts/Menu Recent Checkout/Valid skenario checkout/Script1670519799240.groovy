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

Mobile.startExistingApplication('com.solodroid.solomerce', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Checkout/buttonImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/buttonImageView'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/buttonAddToCart'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/buttonAddToCart'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout/setTextQty'), '1', 5)

Mobile.waitForElementPresent(findTestObject('Checkout/setTextQty'), 3)

Mobile.verifyElementText(findTestObject('Checkout/setTextQty'), '1')

Mobile.verifyElementExist(findTestObject('Checkout/buttonAdd'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/buttonAdd'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/buttonTextView'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/buttonCheckout'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/buttonCheckout'), 0)

Mobile.setText(findTestObject('Coba Checkout/android.widget.EditText - baek yijin'), 'andrean', 0)

Mobile.setText(findTestObject('Coba Checkout/android.widget.EditText - 089765004126 (1)'), '08909870909', 0)

Mobile.setText(findTestObject('Coba Checkout/android.widget.EditText - jalan embong malang no.12, surabaya'), 'Jalan Proklamasi No. 12, Jakarta Pusat', 
    0)

Mobile.tap(findTestObject('Object Repository/Checkout/buttonProcessCheckout'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/buttonProcessCheckout'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/buttonYes'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/buttonYes'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/buttonOK'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/buttonOK'), 0)

Mobile.closeApplication()

