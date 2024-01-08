package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	
		private WebDriver driver;
		private JavascriptExecutor js;
		
		
		public JavaScriptUtil(WebDriver driver) {
			this.driver = driver;
			js = (JavascriptExecutor)this.driver;
		}
		
		public String getTitleByJS() {
			return js.executeScript("return document.title").toString();
		}
		
		public String getURLByJS() {
			return js.executeScript("return document.URL").toString();
		}
		
		public void generateJSAlert(String mesg) {
			js.executeScript("alert('"+mesg+"')");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.switchTo().alert().accept();
		}
		
		public void generateJSConfirm(String mesg) {
			js.executeScript("confirm('"+mesg+"')");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		public void confirmJSPrompt(String mesg, String value) {
			js.executeScript("prompt('"+mesg+"')");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(value);
			alert.accept();
		}
		
		public void goBackWithJS() {
			js.executeScript("history.go(-1)");
		}
		
		public void goForwardWithJS() {
			js.executeScript("history.go(1)");
		}
		
		public void pageRefreshWithJS() {
			js.executeScript("history.go(0)");
		}
		
		public void getPageInnerText() {
			js.executeScript("return document.documentElement.innerText").toString();
		}
		
		public void scrollMiddlePageDown() {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight/2));");
		}
		
		public void scrollPageDown(String height) {
			js.executeScript("window.scrollTo(0,'"+height+"');");
		}
		
		public void scrollPageDown() {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
		public void scrollPageUp() {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
		public void scrollView(WebElement element) {
			js.executeScript("arguments[0].scrollIntoView(true);",element);
		}
		
		public void zoomChromeEdgeSafari(String zoomPercentage) {
			String zoom ="document.body.style.zoom = '"+zoomPercentage+"%'";
				js.executeScript(zoom);
		}
		
		public void zoomFireFox(String zoomPercentage) {
			String zoom = "document.body.style.MozTransform='scales("+zoomPercentage+")'";
			js.executeScript(zoom);
		}
		
		public void drawBroder(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'", element);	
		}
		
		public void flash(WebElement element){
			String bgColor = element.getCssValue("backgroundColor");
			for(int i=0; i<10; i++) {
				changeColor("rgb|(0,200)",element);
				changeColor(bgColor,element);
			}
		}
		
		private void changeColor(String color, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void clickElementByJS(WebElement element) {
			js.executeScript("arguments[0].click", element);
		}
		
		public void sendKeysUsingWithId(String id, String value) {
			js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
		}


	

}
