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

Mobile.startApplication('mobileApp/mst-qa-0.0.1.apk', false)

Mobile.delay(3)

Mobile.tap(findTestObject('Addtodo/android.widget.TextView - Add Todo'), 0)

Mobile.delay(3)

Mobile.setText(findTestObject('Addtodo/android.widget.EditText - Input Name'), 'MST QA Test', 0)

Mobile.delay(3)

Mobile.tapAndHold(findTestObject('Addtodo/android.widget.ImageView'), 0, 0)

Mobile.delay(3)

Mobile.doubleTap(findTestObject('Addtodo/android.widget.TextView - Primary'), 0)

Mobile.delay(3)

Mobile.setText(findTestObject('Addtodo/android.widget.EditText - Input Description'), 'Testing', 0)

Mobile.tap(findTestObject('Addtodo/android.widget.Button'), 0)

Mobile.delay(3)

