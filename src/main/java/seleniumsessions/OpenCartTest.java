package seleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/");
		
		String actTile = brUtil.getPageTItle();
		if(actTile.equals("Your Store")) {
			System.out.println("Title is correct... Pass");
		}else {
			System.out.println("Title is incorrect... Fail");
		}
		
		String actUrl = brUtil.getPageURL();
		if(actUrl.contains("opencart")) {
			System.out.println("Url is correct... Pass");
		}
		
		//brUtil.quitBrowser();

	}

}
