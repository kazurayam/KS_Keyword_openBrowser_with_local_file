import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * A proposed solution to the question 
 * 
 * https://forum.katalon.com/t/how-to-find-the-total-number-of-rows-in-a-nested-table-using-xpath/62783/
 * 
 * @authro kazurayam
 */

CustomKeywords."ks.should.have.such.builtin.Keyword.openBrowserWithFile"("tmp/Events.mhtml")

WebUI.switchToFrame(byXPath("//iframe[@id='PopDiv']"), 10)

WebUI.verifyElementPresent(byXPath("//table[@id='mlist']"), 10)

List<WebElement> tableRows = WebUI.findWebElements(byXPath("//table[@id='mlist']/tbody/tr"), 10) 

assert tableRows != null

WebUI.comment("number of rows of <table id='mlist'> : " + tableRows.size())

WebUI.closeBrowser()

TestObject byXPath(String xpath) {
	TestObject tObj = new TestObject(xpath)
	tObj.addProperty("xpath", ConditionType.EQUALS, xpath)
	return tObj
}
