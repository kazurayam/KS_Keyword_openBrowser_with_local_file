package ks.should.have.such.builtin

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Keyword {
	
	static void openBrowserWithFile(String filePath) {
		File f = new File(filePath)
		assert f.exists()
		URL url = f.toURI().toURL()
		WebUI.openBrowser(url.toExternalForm())
	}
}
